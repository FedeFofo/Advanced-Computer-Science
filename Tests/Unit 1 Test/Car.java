public class Car {
    // instance variables
    private String model;
    private String ownerName;
    private String username;
    private int cleanlinessLevel;
    private boolean needsOilChange;

    // constructors
    Car(String model, String ownerName, int cleanlinessLevel) {
        this.model = model;
        this.ownerName = AutoUtils.fixName(ownerName);
        username = AutoUtils.generateUsername(ownerName);
        cleanlinessLevel = AutoUtils.validateCleanlinessLevel(cleanlinessLevel);
        needsOilChange = false;
    }

    Car() {
        model = "Ford Model T";
        ownerName = "Henry Ford";
        username = AutoUtils.generateUsername(ownerName);
        cleanlinessLevel = 10;
        needsOilChange = false;
    }

    // getters
    public String getModel() {
        return model;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getUsername() {
        return username;
    }

    public int getCleanlinessLevel() {
        return cleanlinessLevel;
    }

    public boolean isNeedsOilChange() {
        return needsOilChange;
    }

    // setters
    public void setModel(String model) {
        this.model = model;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = AutoUtils.fixName(ownerName);
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setCleanlinessLevel(int cleanlinessLevel) {
        this.cleanlinessLevel = AutoUtils.validateCleanlinessLevel(cleanlinessLevel);
    }

    public void setNeedsOilChange(boolean needsOilChange) {
        this.needsOilChange = needsOilChange;
    }

    // methods
    public String toString() {
        String line1 = "== ABOUT CAR ==\n";
        String line2 = "Model: " + getModel() + "\n";
        String line3 = "Owner: " + getOwnerName() + "\n";
        String line4 = "Username: " + getUsername() + "\n";
        String line5 = "Cleanliness Level: " + getCleanlinessLevel() + "\n";
        String line6;
        if (isNeedsOilChange()) {
            line6 = "Does car need oil change? Yes\n";
        } else {
            line6 = "Does car need oil change? No\n";
        }
        return line1 + line2 + line3 + line4 + line5 + line6;
    }

    public boolean equals(Car other) {
        return model.equals(other.getModel()) && ownerName.equals(other.getOwnerName()) 
            && username.equals(other.getUsername()) 
            && cleanlinessLevel == other.getCleanlinessLevel() 
            && needsOilChange == other.isNeedsOilChange();
    }
}