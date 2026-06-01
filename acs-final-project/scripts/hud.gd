extends CanvasLayer

@onready var score_label: Label = %ScoreLabel
@onready var health_label: Label = %HealthLabel

func _ready() -> void:
	ScoreManager.score_changed.connect(_on_score_changed)
	_on_score_changed(ScoreManager.score)

func bind_to_player(player: Node) -> void:
	player.health_changed.connect(_on_health_changed)
	_on_health_changed(player.health)

func _on_score_changed(new_score: int) -> void:
	score_label.text = "Score: %d" % new_score

func _on_health_changed(new_health: int) -> void:
	health_label.text = "Health: %d" % new_health
