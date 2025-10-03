public class DogTester {
    public static void main(String[] args) {
        // Creating objects + printing initial values
        Dog mochi = new Dog("Mochi", "Miro", 4, 224);
        System.out.println(mochi.toString()); // outputs Mochi's info
        Dog ozzie = new Dog();
        System.out.println(ozzie.toString()); // outputs Ozzie's info
        Dog joseph = new Dog("Joseph", "Amanda", 12, 784);
        System.out.println(joseph.toString()); // outputs Joseph's info

        // Updating values + printing updated values
        System.out.println();
        System.out.println("Updating values...");
        System.out.println();

        mochi.setAge(5);
        System.out.println(mochi.toString());
        ozzie.setStillInFacility(false);
        System.out.println(ozzie.toString());
        joseph.setOwnerName("Jessica");
        System.out.println(joseph.toString());
        System.out.println();

        // Testing methods
        Dog spot = new Dog("Spot", "John", 8, 123);
        System.out.println("Spot's dogChar: " + spot.generateDogChar()); // should output 'L'
        System.out.println("Spot's dogTag:" + spot.generateDogTag()); // should output "123L"
        System.out.println(spot.toString());
        System.out.println();

        Dog rufus = new Dog("Rufus", "Mary", 4, 693);
        System.out.println("Rufus' dogChar: " + rufus.generateDogChar()); // should output 'N'
        System.out.println("Rufus' dogTag: " + rufus.generateDogTag()); // should output "693N"
        System.out.println(rufus.toString());
        System.out.println();

        System.out.println("Is Spot equal to Rufus? " + spot.equals(rufus)); // should output "false"

        // Changing stillInFacility
        System.out.println();
        System.out.println("Releasing Spot from the facility...");
        spot.setStillInFacility(false);
        System.out.println();
        System.out.println(spot.toString()); // should reflect that he is no longer in the facility
    }
}