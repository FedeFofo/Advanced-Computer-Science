public class CatTester {
    public static void main(String[] args) {
        // creating a new cat object
        Cat donald = new Cat("Donald", "Vladimir", 10, "3246");
        System.out.println(donald.toString());

        // updating values
        System.out.println("\nUpdating values...\n");
        donald.setOwnerName("Elon");
        donald.setMoodLevel(2);
        donald.setCatId("7689");

        System.out.println(donald.toString());

        // creating an identical cat object
        System.out.println("\nCreating an identical cat...\n");
        Cat newDonald = new Cat("Donald", "Elon", 2, "7689");
        System.out.println("Are the cats equal?");
        System.out.println("Expected value:\t\ttrue");
        System.out.println("Actual value:\t\t" + donald.equals(newDonald) + "\n");

        // testing bootUp()
        System.out.println("Booting up newDonald...\n");
        PurrfectUtils.bootUp(newDonald);

        // testing pet()
        System.out.println("\nTrying to pet donald...\n");
        PurrfectUtils.pet(donald);

        // testing trimClaws()
        System.out.println("\nTrying to trim donald's claws 4 times...\n");

        for (int i = 0; i < 4; i++) {
            PurrfectUtils.trimClaws(donald);
        }

        // testing cleanLitterBox()
        System.out.println("\nTrying to clean donald's litter box...\n");
        PurrfectUtils.cleanLitterBox(donald);

        // testing feed()
        System.out.println("\nTrying to feed donald..\n");
        PurrfectUtils.feed(donald);

        System.out.println("\n" + PurrfectUtils.generateCatChar("1234"));
    }
}
