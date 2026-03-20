public class Dragon extends Monster {
    // constructors
    public Dragon(String name, int health, int attack, int defense, int speed, String attackNameOne, String attackNameTwo,
            ElementType attackElementOne, ElementType attackElementTwo) {
        super(name, ElementType.fromString("f"), health, attack, defense, speed, attackNameOne, attackNameTwo,
                attackElementOne, attackElementTwo);
    }

    public Dragon() {
        this("Danny the Dragon", 70, 50, 20, 110, "Fire Fury", "Deathly Roar", ElementType.fromString("f"), ElementType.fromString("a"));
    }

    // inherited methods
    public String victoryNoise() {
        return "Rooaarr!";
    }
}
