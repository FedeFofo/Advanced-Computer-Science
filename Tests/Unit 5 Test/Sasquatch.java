public class Sasquatch extends Monster {
    // constructors
    public Sasquatch(String name, int health, int attack, int defense, int speed, String attackNameOne, String attackNameTwo,
            ElementType attackElementOne, ElementType attackElementTwo) {
        super(name, ElementType.fromString("e"), health, attack, defense, speed, attackNameOne, attackNameTwo,
                attackElementOne, attackElementTwo);
    }

    public Sasquatch() {
        this("Sammy the Sasquatch", 110, 50, 50, 40, "Super Stomp", "Bad Breath", ElementType.fromString("e"), ElementType.fromString("a"));
    }

    // inherited methods
    public String victoryNoise() {
        return "Hoot hoot!";
    }
}
