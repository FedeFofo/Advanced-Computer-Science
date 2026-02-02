public class Bank {
    // instance variables
    private int numberOfLoanOfficers;
    private int numberOfTellers;

    // constructors
    public Bank(int numberOfLoanOfficers, int numberOfTellers) {
        this.numberOfLoanOfficers = numberOfLoanOfficers;
        this.numberOfTellers = numberOfTellers;
    }

    // getters
    public int getNumberOfLoanOfficers() {
        return numberOfLoanOfficers;
    }
    
    public int getNumberOfTellers() {
        return numberOfTellers;
    }

    // setters
    public void setNumberOfLoanOfficers(int numberOfLoanOfficers) {
        this.numberOfLoanOfficers = numberOfLoanOfficers;
    }

    public void setNumberOfTellers(int numberOfTellers) {
        this.numberOfTellers = numberOfTellers;
    }

    // methods
    public int computeTotalEmployees() {
        return numberOfLoanOfficers + numberOfTellers;
    }

    public String toString() {
        return "This bank has " + numberOfLoanOfficers + " loan officers and " 
            + numberOfTellers + " tellers.";
    }

    public boolean equals(Bank other) {
        return this.numberOfLoanOfficers == other.numberOfLoanOfficers 
            && this.numberOfTellers == other.numberOfTellers;
    }

    public void hireMembers(int numberToHire, boolean isLoanOfficer) {
        if (isLoanOfficer) {
            numberOfLoanOfficers += numberToHire;
        } else {
            numberOfTellers += numberToHire;
        }
    }
}
