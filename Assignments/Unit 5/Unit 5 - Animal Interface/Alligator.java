public class Alligator extends Animal implements Predator, Swimmable {
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
        this(80, 100);
    }

    // getters
    public int getNumOfTeeth() {
        return numOfTeeth;
    }

    public int getNumOfScales() {
        return numOfScales;
    }

    // setters
    public void setNumOfTeeth(int numOfTeeth) {
        this.numOfTeeth = numOfTeeth;
    }

    public void setNumOfScales(int numOfScales) {
        this.numOfScales = numOfScales;
    }

    // inherited methods (animal superclass)
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
        System.out.println("hisssssssss...");
    }

    // descriptive text versions of the basic behaviors, for displaying in a GUI
    public String getSoundDescription() {
        return "Alligators hiss when warning, and otherwise make a loud, rumbling growl.";
    }

    public String getEatDescription() {
        return "The strong jaws and teeth of an alligator are capable of crunching nearly anything.";
    }

    public String getMoveDescription() {
        return "Alligators make loud bellowing noises when moving in water to establish territory and attract mates, with the vibrations causing the water to appear \"boiling\".";
    }

    // inherited methods (predator interface)

    // Basic Characteristics of Predators

    @Override
    // returns the primary type of prey this predator hunts
    public String getPrimaryPrey() {
        return "Fish";
    }

    @Override
    // returns the typical size of prey in kilograms
    public double getAveragePreyMass() {
        return 2.5;
    }

    // Basic Behaviors - BE CREATIVE

    @Override
    // prints out how the animal stalks its prey
    public void stalkPrey() {
        System.out.println(
                "An alligator typically utilizes stealthy tactics, remaining nearly submerged and motionless at the water's edge.");
    }

    @Override
    // prints out how the animal attacks its prey
    public void attackPrey() {
        System.out.println(
                "An alligator typically utilizes  ambush tactics, surprising and seizing prey with a powerful, rapid sideways strike of its jaws.");
    }

    @Override
    // prints out how the animal eats its prey
    public void eatPrey() {
        System.out.println(
                "An alligator swallows small prey whole but uses a powerful \"death roll\" to tear larger animals into manageable, bite-sized chunks, and its stomach acid can dissolve turtle shells and bones.");
    }

    // inherited methods (swimmable interface)

    // Basic Characteristics of swimming animals

    @Override
    // returns the typical swimming speed of the animal in km/h
    public double getSwimSpeed() {
        return 11.5;
    }

    @Override
    // returns the typical depth the animal swims at in meters
    public double getPreferredDepth() {
        return 0.75;
    }

    // Basic Behaviors - BE CREATIVE

    @Override
    // prints out how the animal enters the water
    public void enterWater() {
        System.out.println("An alligator typically slides or belly-crawls smoothly from the bank into the water.");
    }

    @Override
    // prints out how the animal swims
    public void swim() {
        System.out.println(
                "An alligator swims by undulating its powerful tail from side to side while tucking its limbs against its body.");
    }

    @Override
    // prints out how the animal leaves the water
    public void exitWater() {
        System.out.println(
                "An alligator crawls or walks onto the shore using its powerful legs to push its body out of the water.");
    }
}