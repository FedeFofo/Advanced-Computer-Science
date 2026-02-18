import java.util.ArrayList;
import java.util.Arrays;

public class ShelterTester {
    public static void main(String[] args) {
        // some good dogs
        Dog dog1 = new Dog("Fido", 3);
        Dog dog2 = new Dog("Spot", 4);
        Dog dog3 = new Dog("Rex", 2);
        Dog dog4 = new Dog("Fido", 4);

        // taking the good dogs, and putting them in a list
        ArrayList<Dog> goodDogs = new ArrayList<Dog>(Arrays.asList(dog1, dog2, dog3, dog4));

        // creating a shelter
        Shelter shelter = new Shelter();

        // setting the shelter's kennels to a 3x3 array of dogs, note that some kennels
        // are empty
        Dog[][] starterKennels = new Dog[][] { { dog1, null, null }, { null, dog2, null },
            { dog3, null, dog4 } };
        shelter.setKennels(starterKennels);

        // extra dogs for you to use
        Dog dog5 = new Dog("Growlithe", 5);
        Dog dog6 = new Dog("Inu", 2);
        Dog dog7 = new Dog("Cerberus", 3);

        // method that displays the shelter's current status
        shelter.displayStatus();

        // to-do: it is recommended that you test the following methods before you
        // submit your code:

        // add an animal to the shelter at a specific location
        // then display the shelter's status
        // add(Dog animal, int row, int col)

        System.out.println();
        shelter.add(dog5, 0, 2);
        shelter.displayStatus();

        // add an animal to the shelter at the first available location
        // then display the shelter's status
        // add(Dog animal)

        System.out.println();
        shelter.add(dog6);
        shelter.displayStatus();

        // add a list of animals to the shelter at the first available location
        // then display the shelter's status
        // add(ArrayList<Dog> animals)

        System.out.println();
        Dog dog8 = new Dog("Ozzie", 6);
        ArrayList<Dog> newDogs = new ArrayList<Dog>(Arrays.asList(dog7, dog8));
        shelter.add(newDogs);
        shelter.displayStatus();

        // remove an animal from the shelter at a specific location
        // then display the shelter's status
        // adopt(int row, int col)

        System.out.println();
        shelter.adopt(0, 2);
        shelter.displayStatus();

        // search the kennel for animals with a specific name
        // then print the list
        // System.out.println(shelter.search("Fido"));

        System.out.println();
        ArrayList<Dog> inus = shelter.search("Inu");
        System.out.println(inus);

        // search the kennel for animals with a specific age
        // then print the list
        // System.out.println(shelter.search(4));

        System.out.println();
        ArrayList<Dog> threeYearOlds = shelter.search(3);
        System.out.println(threeYearOlds);

        // failures:

        // invalid row in add() needs to throw IllegalArgumentException

        System.out.println();
        Dog dog9 = new Dog("Molly", 14);

        try {
            shelter.add(dog9, -3, 1);
        } catch (Exception e) {
            System.out.println(e);
        }

        // invalid coordinates in adopt() needs to throw IllegalArgumentException

        System.out.println();
        try {
            shelter.adopt(-3, -3);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
