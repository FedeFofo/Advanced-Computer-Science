public class CarTester {
    public static void main(String[] args) {
        System.out.println("Testing Car class\n");
        Car testCar = new Car("Tesla", "      Elon  Musk     ", -4);
        System.out.println(testCar.toString());

        Car testCar2 = new Car("Tesla", "      Elon  Musk     ", -4);
        testCar2.setUsername(testCar.getUsername());
        System.out.println("Does testCar = testCar2?");
        System.out.println("Expected output:\ttrue");
        System.out.println("Actual output:\t\t" + testCar.equals(testCar2));

        System.out.println();
        Car testCar3 = new Car("Tesler", "      Donald Trump     ", -4);
        testCar3.setUsername(testCar.getUsername());
        System.out.println("Does testCar = testCar3?");
        System.out.println("Expected output:\tfalse");
        System.out.println("Actual output:\t\t" + testCar.equals(testCar3));

        System.out.println(AutoUtils.validateCleanlinessLevel(58)); // expected output: 10
        System.out.println(AutoUtils.generateUsername("James Esser")); // expected output: "@james_esser_RANDNUM"
        System.out.println(AutoUtils.fixName("         Maomao     Apothecary")); // expected output: "Maomao Apothecary"
        AutoUtils.cleanCar(testCar);
        System.out.println();
        System.out.println("Cleaned testCar");
        System.out.println("testCar cleanliness level: " + testCar.getCleanlinessLevel());
    }
}
