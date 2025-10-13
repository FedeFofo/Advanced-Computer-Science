public class PawesomeUtils {
    // methods
    public static String generateDogTag(int dogId, char dogChar) {
        return "" + dogId + dogChar + "";
    }

    public static char generateDogChar(int dogId) {
        int firstDigit = dogId % 10;
        int secondDigit = (dogId / 10) % 10;
        int thirdDigit = (dogId / 100) % 10;
        return (char) ((firstDigit + secondDigit + thirdDigit) % 10 + 'F');
    }

    public static int validateDogId(int dogId) {
        if (dogId >= 100 && dogId <= 999) {
            return dogId;
        } else {
            return (int) (Math.random() * 899 + 100);
        }
    }

    public static String pickup(Dog dog, String personName) {
        if (dog.getOwnerName().equals(personName)) {
            dog.setStillInFacility(false);
            return dog.getName() + " has been picked up by their owner " + dog.getOwnerName() + ".";
        } else {
            return dog.getName() + " cannot be picked up. Their owner is " + dog.getOwnerName() 
                + ", and the person who came to collect them is " + personName + ".";
        }
    }

    public static void checkIn(Dog dog, String personName) {
        if (validateDogTag(dog)) {
            dog.setStillInFacility(true);
            dog.setOwnerName(personName);
            System.out.println(dog.getName() + " has been successfully checked in.");
        } else {
            System.out.println("This is a countefeit dog, and is"  
                + "not permitted in Pawesome Daycare!");
        }
    }

    public static boolean validateDogTag(Dog dog) {
        int dogId = dog.getDogId();
        char dogChar = (generateDogChar(dogId));
        String newDogTag = "" + dogId + dogChar + "";
        return newDogTag.equals(dog.getDogTag());
    }

    public static int convertAgeToHumanAge(Dog dog) {
        if (dog.getAge() == 1) {
            return 15;
        } else if (dog.getAge() == 2) {
            return 24;
        } else {
            return 24 + ((dog.getAge() - 2) * 5);
        }
    }

    public static int convertAgeToDogYears(int humanYears) {
        if (humanYears <= 15) {
            return 1;
        } else if (humanYears > 15 && humanYears <= 24) {
            return 2;
        } else {
            return ((humanYears - 24) / 5) + 2;
        }
    }
}
