public class Customer {
    // instance variables
    private String name;
    private String address;
    private int rewardPoints;

    // constructors
    public Customer(String name, String address, int rewardPoints) {
        this.name = name;
        this.address = address;
        this.rewardPoints = rewardPoints;
    }

    // getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    // methods
    public String toString() {
        return "Customer Name: " + name + ", Address: " + address + ", Reward Points: " + rewardPoints;
    }

    public boolean equals(Customer other) {
        return name.equals(other.name) && address.equals(other.address) && rewardPoints == other.rewardPoints;
    }

    public void boostPoints(double percentage) {
        int result = (int) (rewardPoints + ((rewardPoints * percentage) / 100));
        rewardPoints = result;
    }
}
