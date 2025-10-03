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
        System.out.println("Spot's dogChar: " + Dog.generateDogChar(spot.getDogId())); // should output 'L'
        System.out.println("Spot's dogTag:" + spot.generateDogTag()); // should output "123L"
        System.out.println(spot.toString());
        System.out.println();

        Dog rufus = new Dog("Rufus", "Mary", 4, 693);
        System.out.println("Rufus' dogChar: " + Dog.generateDogChar(rufus.getDogId())); // should output 'N'
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
        System.out.println();

        // Testing static generateDogChar() method
        System.out.println(Dog.generateDogChar(832)); // should output 'I'
        System.out.println(Dog.generateDogChar(264)); // should output 'H'
        System.out.println(Dog.generateDogChar(743)); // should output 'J'
        System.out.println();

        // Testing static pickup() method
        Dog johnny = new Dog("Johnny", "Robert", 7, 971);
        System.out.println(Dog.pickup(johnny, "John"));
        System.out.println("Is Johnny still in the facility? " + johnny.isStillInFacility()); // should output true
        System.out.println(Dog.pickup(johnny, "Robert"));
        System.out.println("Is Johnny still in the facility? " + johnny.isStillInFacility()); // should output false
        System.out.println();

        // Testing static checkIn() method
        Dog morgan = new Dog("Morgan", "Stanley", 15, 382);
        morgan.setStillInFacility(false);
        System.out.println("Checking Morgan into the facility...");
        Dog.checkIn(morgan, "Stanley");
        System.out.println("Is Morgan in the facility? " + morgan.isStillInFacility()); // should output true
        System.out.println("What is Morgan's owner's name? " + morgan.getOwnerName()); // should output "Stanley"

    }
}