public class Cat {
    // instance variables
    private String name;
    private String ownerName;
    private int moodLevel;
    private String catId;
    private char catChar;
    private boolean isHungry;

    // constructors
    Cat(String name, String ownerName, int moodLevel, String catId) {
        this.name = name;
        this.ownerName = ownerName;
        this.moodLevel = PurrfectUtils.validateMoodLevel(moodLevel);
        this.catId = PurrfectUtils.validateCatId(catId);
        this.catChar = PurrfectUtils.generateCatChar(this.catId);
        this.isHungry = true;
    }

    Cat() {
        name = "Garfield";
        ownerName = "Jon Arbuckle";
        moodLevel = 0;
        catId = "2009";
        catChar = PurrfectUtils.generateCatChar(catId);
        isHungry = true;
    }

    // getters
    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getMoodLevel() {
        return moodLevel;
    }

    public String getCatId() {
        return catId;
    }

    public char getCatChar() {
        return catChar;
    }

    public boolean isHungry() {
        return isHungry;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setMoodLevel(int moodLevel) {
        this.moodLevel = PurrfectUtils.validateMoodLevel(moodLevel);
    }

    public void setCatId(String catId) {
        this.catId = PurrfectUtils.validateCatId(catId);
        this.catChar = PurrfectUtils.generateCatChar(catId);
    }

    public void setCatChar(char catChar) {
        this.catChar = catChar;
    }

    public void setHungry(boolean isHungry) {
        this.isHungry = isHungry;
    }

    // methods
    public String generateCatTag() {
        return catId + catChar;
    }

    public String toString() {
        String firstLine = "== ABOUT " + name.toUpperCase() + " ==\n";
        String secondLine = name + " is a cat.\n";
        String thirdLine = "Their tag is " + generateCatTag() + ".\n";
        String fourthLine = PurrfectUtils.determineCatMood(this);
        return firstLine + secondLine + thirdLine + fourthLine;
    }

    public boolean equals(Cat other) {
        return name.equals(other.name) && ownerName.equals(other.ownerName) 
            && moodLevel == other.moodLevel 
            && generateCatTag().equals(other.generateCatTag()) && isHungry == other.isHungry;
    }
}
