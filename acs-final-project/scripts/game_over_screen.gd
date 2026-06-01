extends Control

@onready var score_label: Label = $CenterContainer/VBoxContainer/ScoreLabel
@onready var select_sfx: AudioStreamPlayer2D = $SelectSFX

func _ready() -> void:
	MusicManager.stop()
	
	$CenterContainer/VBoxContainer/RetryButton.pressed.connect(_on_retry_pressed)
	$CenterContainer/VBoxContainer/MenuButton.pressed.connect(_on_menu_pressed)
	score_label.text = "Final Score: " + str(ScoreManager.score)

func _on_retry_pressed() -> void:
	select_sfx.play()
	await select_sfx.finished
	ScoreManager.reset()
	GameState.change_to(GameState.State.PLAYING)
	get_tree().change_scene_to_file("res://scenes/level1.tscn")

func _on_menu_pressed() -> void:
	select_sfx.play()
	await select_sfx.finished
	ScoreManager.reset()
	GameState.change_to(GameState.State.MENU)
	get_tree().change_scene_to_file("res://scenes/main.tscn")
