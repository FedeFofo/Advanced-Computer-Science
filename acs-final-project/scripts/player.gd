class_name Player
extends CharacterBody2D

@export var speed: float = 220.0
@export var jump_velocity: float = -420.0
@export var bullet_scene: PackedScene
@export var max_health: int = 3

@onready var sprite: AnimatedSprite2D = $AnimatedSprite2D
@onready var muzzle: Marker2D = $Muzzle
@onready var jump_sfx: AudioStreamPlayer2D = $JumpSFX
@onready var hurt_sfx: AudioStreamPlayer2D = $HurtSFX
@onready var die_sfx: AudioStreamPlayer2D = $DieSFX
@onready var shoot_sfx: AudioStreamPlayer2D = $ShootSFX

var score: int = 0
var facing: int = 1
var health: int = max_health
var invincible: bool = false

func _ready() -> void:
	add_to_group("player")
	died.connect(_on_player_died)

func _physics_process(delta: float) -> void:
	if not is_on_floor():
		velocity += get_gravity() * delta

	if Input.is_action_just_pressed("jump") and is_on_floor():
		velocity.y = jump_velocity
		jump_sfx.play()

	var dir := Input.get_axis("move_left", "move_right")
	velocity.x = dir * speed
	if dir != 0.0:
		facing = int(sign(dir))
		sprite.flip_h = facing < 0
		muzzle.position.x = abs(muzzle.position.x) * facing

	if Input.is_action_just_pressed("shoot"):
		_shoot()

	move_and_slide()
	
	if not is_on_floor():
		sprite.play("jumping")
	elif dir != 0.0:
		sprite.play("walking")
	else:
		sprite.play("idle")

func _shoot() -> void:
	shoot_sfx.play()
	if bullet_scene == null: return
	var b: Node = bullet_scene.instantiate()
	b.global_position = muzzle.global_position
	b.direction = facing
	get_tree().current_scene.add_child(b)

signal died
signal health_changed(new_health: int)

func take_damage(amount: int) -> void:
	if invincible: return
	health -= amount
	health_changed.emit(health)
	hurt_sfx.play()
	if health <= 0:
		died.emit()
		return
	invincible = true
	await get_tree().create_timer(1.0).timeout
	if is_instance_valid(self):
		invincible = false

func _on_kill_zone_body_entered(body: Node) -> void:
	if body.is_in_group("player"):
		take_damage(health)

func _on_player_died() -> void:
	die_sfx.play()
	await die_sfx.finished
	get_tree().change_scene_to_file("res://scenes/game_over_screen.tscn")
