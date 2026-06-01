extends Area2D

@onready var coin_sfx: AudioStreamPlayer2D = $CoinSFX

func _ready() -> void:
	body_entered.connect(_on_body_entered)
	
func _on_body_entered(body: Node) -> void:
	if body.is_in_group("player"):
		ScoreManager.add(50)
		print("Player picked up a pickup!")
		coin_sfx.play()
		await coin_sfx.finished
		queue_free()
