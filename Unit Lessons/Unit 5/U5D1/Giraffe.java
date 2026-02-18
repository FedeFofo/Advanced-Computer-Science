public class Giraffe extends Animal {
    // instance variables
    private String name;
    private double age;
    private int height;
    private int numOfSpots;
    private boolean hungry;
    private double weight;

    // constructors
    public Giraffe(String name, double age, int height, int numOfSpots, boolean hungry,
            double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.numOfSpots = numOfSpots;
        this.hungry = hungry;
        this.weight = weight;
    }

    public Giraffe(String name, double age) {
        this(name, age, 16, 200, false, 2000);
    }

    public Giraffe() {
        this("Daniel", 15, 16, 200, false, 2000);
    }

    // getters
    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getNumOfSpots() {
        return numOfSpots;
    }

    public boolean isHungry() {
        return hungry;
    }

    public double getWeight() {
        return weight;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setNumOfSpots(int numOfSpots) {
        this.numOfSpots = numOfSpots;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // methods
    public void feed() {
        if (isHungry()) {
            System.out.println(name + " has been fed!");
        } else {
            System.out.println(name + " is already full!");
        }
    }

    public boolean equals(Giraffe other) {
        return name.equals(other.getName()) && age == other.getAge() && height == other.getHeight()
                && numOfSpots == other.getNumOfSpots() && hungry == other.isHungry();
    }

    public String toString() {
        return name + " is " + age + " years old, and is " + height
                + "ft tall.\nFood status:\n\tHunger? " + hungry + "\n\tWeight (lbs): " + weight
                + "\nA fun fact about " + name + " is that they have " + numOfSpots + " spots.";
    }
}
