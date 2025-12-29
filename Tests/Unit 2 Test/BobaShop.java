public class BobaShop {
    // instance variables
    private String shopName;
    private BobaShopMember[] registeredMembers;

    // constructors
    BobaShop(String shopName, BobaShopMember[] registeredMembers) {
        this.shopName = shopName;
        this.registeredMembers = registeredMembers;
    }

    BobaShop(String shopName, int initialCapacity) {
        this.shopName = shopName;
        this.registeredMembers = new BobaShopMember[initialCapacity];
    }

    // getters
    public String getShopName() {
        return shopName;
    }

    public BobaShopMember[] getRegisteredMembers() {
        return registeredMembers;
    }

    // setters
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public void setRegisteredMembers(BobaShopMember[] registeredMembers) {
        this.registeredMembers = registeredMembers;
    }

    // methods
    public boolean isFull() {
        for (int i = 0; i < registeredMembers.length; i++) {
            if (registeredMembers[i] == null) {
                return false;
            }
        }
        return true;
    }

    public void increaseCapacity() {
        BobaShopMember[] doubledArray = new BobaShopMember[registeredMembers.length * 2];
        for (int i = 0; i < registeredMembers.length; i++) {
            doubledArray[i] = registeredMembers[i];
        }
        registeredMembers = doubledArray;
    }

    public void registerMember(BobaShopMember member) {
        if (isFull()) {
            increaseCapacity();
        }
        for (int i = 0; i < registeredMembers.length; i++) {
            if (registeredMembers[i] == null) {
                registeredMembers[i] = member;
                return;
            }
        }
    }

    public String toString() {
        String toString = "== " + shopName + " Members ==\n";
        for (int i = 0; i < registeredMembers.length; i++) {
            if (registeredMembers[i] == null) {
                continue;
            }
            toString += (i + 1) + ".) " + registeredMembers[i].toString() + "\n";
        }
        return toString;
    }

    public boolean deleteMember(BobaShopMember member) {
        for (int i = 0; i < registeredMembers.length; i++) {
            if (registeredMembers[i].equals(member)) {
                registeredMembers[i] = null;
                return true;
            }
        }
        return false;
    }
    
}
