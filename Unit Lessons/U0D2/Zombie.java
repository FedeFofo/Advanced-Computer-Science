public class Zombie {
    // instance variables (attributes)
    // green
    String skinColor = "Green";

    // rot and dead
    boolean isDead = true;

    // humans eaten count
    int humansEaten = 0;

    // main
    public static void main(String[] args) {
        Zombie phillip = new Zombie();

        System.out.println(phillip.growl());
        System.out.println("Phillip has eaten " + phillip.humansEaten() + " humans.");

        Zombie brian = new Zombie();

        System.out.println(brian.growl());
        System.out.println("Brian has eaten " + brian.humansEaten() + " humans.");
    }

    // methods (behaviors)
    // walk with arms out
    // eat brains
    // growl
    public String growl() {
        return "grrrsssaaaajlhhhh...";
    }

    // Challenge: make a new method that returns the number of humans eaten
    public int humansEaten() {
        return humansEaten;
    }
}
