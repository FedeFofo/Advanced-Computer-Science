public class Alligator extends Animal {
    private int numOfTeeth;

    // getters
    public int getNumOfTeeth() {
        return numOfTeeth;
    }

    // setters
    public void setNumOfTeeth(int numOfTeeth) {
        this.numOfTeeth = numOfTeeth;
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
        return getName() + " is " + getAge() + " years old."
                + "\nFood status:\n\tHunger level: " + getHunger() + "\n\tWeight (lbs): " + getWeight()
                + "\nA fun fact about " + getName() + " is that they have " + numOfTeeth + " teeth.";
    }
}