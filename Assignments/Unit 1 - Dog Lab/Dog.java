public class Dog {
    // instance variables
    private String name;
    private String ownerName;
    private int age;
    private int dogId;
    private char dogChar;
    private String dogTag;
    private boolean stillInFacility;

    // constructors
    public Dog(String name, String ownerName, int age, int dogId) {
        this.name = name;
        this.ownerName = ownerName;
        this.age = age;
        this.dogId = dogId;
        dogChar = generateDogChar(this.dogId);
        dogTag = generateDogTag();
        stillInFacility = true;
    }

    public Dog() {
        name = "Ozzie";
        ownerName = "James";
        age = 5;
        dogId = 384;
        dogChar = generateDogChar(dogId);
        dogTag = generateDogTag();
        stillInFacility = true;
    }

    // getters
    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getAge() {
        return age;
    }

    public int getDogId() {
        return dogId;
    }

    public char getDogChar() {
        return dogChar;
    }

    public String getDogTag() {
        return dogTag;
    }

    public boolean isStillInFacility() {
        return stillInFacility;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDogId(int dogId) {
        this.dogId = dogId;
    }

    public void setDogChar(char dogChar) {
        this.dogChar = dogChar;
    }

    public void setDogTag(String dogTag) {
        this.dogTag = dogTag;
    }

    public void setStillInFacility(boolean stillInFacility) {
        this.stillInFacility = stillInFacility;
    }

    // methods
    public String toString() {
        if (stillInFacility) {
            return name + " is a good dog. They are " + age + " year(s) old and belong to " + ownerName + ". They are currently in our facility. For employee use only: dogTag is " + dogTag + ".";
        } else {
            return name + " is a good dog. They are " + age + " year(s) old and belong to " + ownerName + ". They are not currently in our facility. For employee use only: dogTag is " + dogTag + ".";
        }
    }

    public boolean equals(Dog other) {
        return name.equals(other.name) && ownerName.equals(other.ownerName) && age == other.age && dogId == other.dogId && dogChar == other.dogChar && dogTag.equals(other.dogTag) && stillInFacility == other.stillInFacility;
    }

    public String generateDogTag() {
        return "" + dogId + dogChar + "";
    }

    public static char generateDogChar(int dogId) {
        int firstDigit = dogId % 10;
        int secondDigit = (dogId / 10) % 10;
        int thirdDigit = (dogId / 100) % 10;
        return (char) ((firstDigit + secondDigit + thirdDigit) % 10 + 'F');
    }

    public static String pickup(Dog dog, String personName) {
        if (dog.getOwnerName() == personName) {
            dog.setStillInFacility(false);
            return dog.getName() + " has been picked up by their owner " + dog.getOwnerName() + ".";
        } else {
            return dog.getName() + " cannot be picked up. Their owner is " + dog.getOwnerName() + ", and the person who came to collect them is " + personName + ".";
        }
    }

    public static void checkIn(Dog dog, String personName) {
        dog.setStillInFacility(true);
        dog.setOwnerName(personName);
    }
}