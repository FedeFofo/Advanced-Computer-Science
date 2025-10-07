public class PawesomeUtils {
    // methods
    public static String generateDogTag(int dogId, char dogChar) {
        return "" + dogId + dogChar + "";
    }

    public static int validateDogId(int dogId) {
        if (dogId >= 100 && dogId <= 999) {
            return dogId;
        } else {
            return (int)(Math.random() * 899 + 100);
        }
    }

    public static boolean validateDogTag(Dog dog) {
        int dogId = dog.getDogId();
        dogId = validateDogId(dogId);
        char dogChar = (Dog.generateDogChar(dogId));
        String newDogTag = dogId + dogChar + "";
        if (newDogTag.equals(dog.getDogTag())) {
            return true;
        } else {
            return false;
        }
    }
}
