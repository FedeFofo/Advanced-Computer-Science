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
        dogChar = generateDogChar();
        dogTag = generateDogTag();
        stillInFacility = true;
    }

    public Dog() {
        name = "Ozzie";
        ownerName = "James";
        age = 5;
        dogId = 384;
        dogChar = generateDogChar();
        dogTag = generateDogTag():
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
        return dogId + dogChar + "";
    }

    public char generateDogChar() {
        int firstDigit = dogId % 10;
        int secondDigit = (dogId / 10) % 10;
        int thirdDigit = (dogID / 10) % 10;
    }
}