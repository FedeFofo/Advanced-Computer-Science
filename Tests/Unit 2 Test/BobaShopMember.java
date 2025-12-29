public class BobaShopMember {
    // instance variables
    private String name;
    private boolean[] loyaltyCredits;
    
    // constructors
    BobaShopMember(String name) {
        this.name = name;
        this.loyaltyCredits = new boolean[10];
    }

    // getters
    public String getName() {
        return name;
    }

    public boolean[] getLoyaltyCredits() {
        return loyaltyCredits;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setLoyaltyCredits(boolean[] loyaltyCredits) {
        this.loyaltyCredits = loyaltyCredits;
    }
    
    // methods
    public void grantLoyaltyCredit() {
        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (!loyaltyCredits[i]) {
                loyaltyCredits[i] = true;
                return;
            }
        }
    }

    public int countLoyaltyCredits() {
        int credits = 0;
        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (loyaltyCredits[i]) {
                credits++;
            }
        }
        return credits;
    }

    public String determineMembershipStatus() {
        int totalCredits = countLoyaltyCredits();
        if (totalCredits >= 6) {
            return "Gold Member";
        } else if (totalCredits >= 3 && totalCredits <= 5) {
            return "Silver Member";
        } else {
            return "Plus Member";
        }
    }

    public String loyaltyHistory() {
        String[] stringLoyaltyCredits = new String[loyaltyCredits.length];
        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (loyaltyCredits[i]) {
                stringLoyaltyCredits[i] = "X";
            } else {
                stringLoyaltyCredits[i] = "-";
            }
        }
        return "Loyalty History: " + Utils.printStringArray(stringLoyaltyCredits);
    }

    public String toString() {
        return name + " (" + determineMembershipStatus() + "), " + loyaltyHistory();
    }

    public boolean equals(BobaShopMember other) {
        return name.equals(other.getName()) && loyaltyCredits == other.loyaltyCredits;
    }
}