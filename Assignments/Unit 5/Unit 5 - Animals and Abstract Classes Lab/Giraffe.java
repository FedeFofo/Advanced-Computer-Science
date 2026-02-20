public class Giraffe extends Animal {
    private int height;
    private int numOfSpots;

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

    // methods
    public void feed() {
        if (hunger < 8) {
            System.out.println(getName() + " has been fed!");
        } else {
            System.out.println(getName() + " is already full!");
        }
    }

    public String toString() {
        return getName() + " is " + getAge() + " years old, and is " + height
                + "ft tall.\nFood status:\n\tHunger level: " + getHunger() + "\n\tWeight (lbs): " + getWeight()
                + "\nA fun fact about " + getName() + " is that they have " + numOfSpots + " spots.";
    }
}
