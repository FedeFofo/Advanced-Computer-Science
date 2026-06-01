extends CanvasLayer

@onready var select_sfx: AudioStreamPlayer2D = $SelectSFX

func _ready() -> void:
	visible = false
	$CenterContainer/VBoxContainer/ResumeButton.pressed.connect(_on_resume_pressed)

func _input(event: InputEvent) -> void:
	if event.is_action_pressed("pause"):
		if GameState.current == GameState.State.PLAYING:
			visible = true
			GameState.change_to(GameState.State.PAUSED)
		elif GameState.current == GameState.State.PAUSED:
			_resume()

func _on_resume_pressed() -> void:
	select_sfx.play()
	await select_sfx.finished
	_resume()

func _resume() -> void:
	visible = false
	GameState.change_to(GameState.State.PLAYING)
