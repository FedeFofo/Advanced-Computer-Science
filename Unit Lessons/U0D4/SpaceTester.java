public class SpaceTester {
    public static void main(String[] args) {
        // 1. instantaniate a spaceshup object
        Spaceship ship = new Spaceship("silver", 25, 85.5, true);
        // the new keyword creates a new instance of the class (aka an object)

        // 2. invoke a method
        String shipDescription = ship.getDescription();
        int shipPassengerCount = ship.getPassengerCount();
        double fuelLevel = ship.getFuelLevel();
        boolean shieldsActive = ship.getShieldsActive();

        System.out.println("Before updating values:");
        System.out.println(shipDescription);
        System.out.println(shipPassengerCount);
        System.out.println(fuelLevel);
        System.out.println(shieldsActive);

        // 3. manipulate the data

        ship.setDescription("red");
        ship.setPassengerCount(30);
        ship.setFuelLevel(70.0);
        ship.setShieldsActive(false);

        System.out.println("After updating values:");
        System.out.println(ship.getDescription());
        System.out.println(ship.getPassengerCount());
        System.out.println(ship.getFuelLevel());
        System.out.println(ship.getShieldsActive());
    }
}
