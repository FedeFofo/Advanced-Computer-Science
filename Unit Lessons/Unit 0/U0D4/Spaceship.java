// camelCase -> a way to write variable names, and it's a standard
// thefoxjumpedoverthelazydog
// vs
// theFoxJumpedOverTheLazyDog
// keep the first letter lowercase if it's a variable name
// otherwise keep it capital for class names

// 
//
public class Spaceship {

    // instance variables
    private String description;
    private int passengerCount;
    private double fuelLevel;
    private boolean shieldsActive;

    // constructors
    public Spaceship(String inputDescription, int inputPassengerCount, double inputFuelLevel, boolean inputShieldsActive) {
        description = inputDescription;
        passengerCount = inputPassengerCount;
        fuelLevel = inputFuelLevel;
        shieldsActive = inputShieldsActive;
    }

    // methods
    // getters (aka accessors)
    public String getDescription() {
        return description;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public boolean getShieldsActive() {
        return shieldsActive;
    }

    // setters (these methods are void)
    public void setDescription(String input) {
        description = input;
    }

    public void setPassengerCount(int input) {
        passengerCount = input;
    }

    public void setFuelLevel(double input) {
        fuelLevel = input;
    }

    public void setShieldsActive(boolean input) {
        shieldsActive = input;
    }

    // challenge: use 3 setters to update the values of 3 different instance variables, make sure to print before and after the update

}