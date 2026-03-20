public class Giraffe extends Animal {
    // instance variables
    private int height;
    private int numOfSpots;

    // constructors
    Giraffe(int height, int numOfSpots) {
        super("Giraffe", "Artiodactyla", "Giraffidae", "Giraffa", "Giraffa giraffa", "Savanna");
        this.height = height;
        this.numOfSpots = numOfSpots;
    }

    Giraffe() {
        this(16, 200);
    }

    // getters
    public int getHeight() {
        return height;
    }

    public int getNumOfSpots() {
        return numOfSpots;
    }

    // setters
    public void setHeight(int height) {
        this.height = height;
    }

    public void setNumOfSpots(int numOfSpots) {
        this.numOfSpots = numOfSpots;
    }

    // inherited methods (animal superclass)
    @Override
    // returns a fact at the index, out of 5 total facts
    public String getFact(int index) {
        String[] facts = new String[] {
                "Despite having necks that can reach up to 8 feet long, giraffes have the same number of neck vertebrae as humans (7). Each individual vertebra can be over 11 inches long.",
                "A giraffe's tongue can be up to 20 inches long and blue/purple/black in color, with the pigment acting as a natural sunscreen as they spend all day reaching for leaves.",
                "To get blood all the way up to their brains, giraffes have double the blood pressure of humans, and they have massive hearts weighing up to 25 pounds. They even have specialized valves in their neck to prevent blood from rushing too quickly to their head when they bend down to drink.",
                "Giraffes have some of the lowest sleep requirements of any mammal, typically needing only 5 to 30 minutes of sleep in a 24-hour period. They often take these in quick one- or two-minute power naps while standing up.",
                "Female giraffes give birth while standing up, meaning a newborn calf's first experience is a 5- to 6-foot drop to the ground, and they can usually stand up and walk within an hour of being born."
        };
        return facts[index];
    }

    @Override
    // returns a random fact (out of 5) of the animal
    public String getFact() {
        String[] facts = new String[] {
                "Despite having necks that can reach up to 8 feet long, giraffes have the same number of neck vertebrae as humans (7). Each individual vertebra can be over 11 inches long.",
                "A giraffe's tongue can be up to 20 inches long and blue/purple/black in color, with the pigment acting as a natural sunscreen as they spend all day reaching for leaves.",
                "To get blood all the way up to their brains, giraffes have double the blood pressure of humans, and they have massive hearts weighing up to 25 pounds. They even have specialized valves in their neck to prevent blood from rushing too quickly to their head when they bend down to drink.",
                "Giraffes have some of the lowest sleep requirements of any mammal, typically needing only 5 to 30 minutes of sleep in a 24-hour period. They often take these in quick one- or two-minute power naps while standing up.",
                "Female giraffes give birth while standing up, meaning a newborn calf's first experience is a 5- to 6-foot drop to the ground, and they can usually stand up and walk within an hour of being born."
        };
        return facts[Utils.generateRandomNumber(0, 4)];
    }

    // Basic Behaviors - BE CREATIVE

    // prints out the sound the animal makes
    @Override
    public void makeSound() {
        System.out.println("hmmmmMMMMMmmmm...");
    }

    // prints out the sound the animal makes when it eats
    @Override
    public void eat() {
        System.out.println("*chomp* *crunch*  *snap*");
    }

    // prints out the sound the animal makes when it moves
    @Override
    public void move() {
        System.out.println("thump, thump, thud...");
    }

    // descriptive text versions of the basic behaviors, for displaying in a GUI
    public String getSoundDescription() {
        return "Giraffes make low-frequency humming sounds at night to stay in contanct with the herd.";
    }

    public String getEatDescription() {
        return "Giraffes spend up to 75% of the day crunching away on woody branches and thick leaves.";
    }

    public String getMoveDescription() {
        return "Giraffes are heavy animals with large hooves, moving both legs on one side of their body at the same time.";
    }
}
