public class Alligator extends Animal {
    // instance variables
    private int numOfTeeth;
    private int numOfScales;

    // constructors
    Alligator(int numOfTeeth, int numOfScales) {
        super("Alligator", "Crocodilia", "Alligatoridae", "Alligator", "A. mississippiensis", "Swamp");
        this.numOfTeeth = numOfTeeth;
        this.numOfScales = numOfScales;
    }

    Alligator() {
        super("Alligator", "Crocodilia", "Alligatoridae", "Alligator", "A. mississippiensis", "Swamp");
        this.numOfTeeth = 80;
        this.numOfScales = 100;
    }

    // inherited methods
    @Override
    // returns a fact at the index, out of 5 total facts
    public String getFact(int index) {
        String[] facts = new String[] {
                "The temperature of an alligator's nest determines its gender.",
                "Alligators can use up to 3,000 teeth in a single lifetime.",
                "Alligators can survive being frozen, sticking their snouts into the air to breathe while their body is suspended.",
                "Alligators are the loudest reptiles, sometimes reacing 90 decibels.",
                "Alligators use tools to hunt, like using twigs to lure birds during nesting season."
        };
        return facts[index];
    }

    @Override
    // returns a random fact (out of 5) of the animal
    public String getFact() {
        String[] facts = new String[] {
                "The temperature of an alligator's nest determines its gender.",
                "Alligators can use up to 3,000 teeth in a single lifetime.",
                "Alligators can survive being frozen, sticking their snouts into the air to breathe while their body is suspended.",
                "Alligators are the loudest reptiles, sometimes reacing 90 decibels.",
                "Alligators use tools to hunt, like using twigs to lure birds during nesting season."
        };
        return facts[Utils.generateRandomNumber(0, 4)];
    }

    // Basic Behaviors - BE CREATIVE

    // prints out the sound the animal makes
    @Override
    public void makeSound() {
        System.out.println("grrrrRRRRRRrrrrr...");
    }

    // prints out the sound the animal makes when it eats
    @Override
    public void eat() {
        System.out.println("*crunch* *crunch* ... *burp*");
    }

    // prints out the sound the animal makes when it moves
    @Override
    public void move() {
        // TODO Auto-generated method stub
        
    }
}