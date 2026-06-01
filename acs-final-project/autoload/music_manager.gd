extends Node

@onready var music_player: AudioStreamPlayer = $Music

func play():
	if not music_player.playing:
		music_player.play()

func stop():
	music_player.stop()
