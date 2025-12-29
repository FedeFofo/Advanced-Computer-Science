public class BobaShopTester {
    public static void main(String[] args) {
        BobaShop bubbles = new BobaShop("Bubbles", 4);
        BobaShopMember james = new BobaShopMember("James");
        bubbles.registerMember(james);
        james.grantLoyaltyCredit();
        BobaShopMember amanda = new BobaShopMember("Amanda");
        bubbles.registerMember(amanda);
        amanda.grantLoyaltyCredit();
        amanda.grantLoyaltyCredit();
        BobaShopMember owen = new BobaShopMember("Owen");
        bubbles.registerMember(owen);
        owen.grantLoyaltyCredit();
        owen.grantLoyaltyCredit();
        owen.grantLoyaltyCredit();
        BobaShopMember lucy = new BobaShopMember("Lucy");
        bubbles.registerMember(lucy);

        System.out.println(bubbles.toString());

        System.out.println(bubbles.deleteMember(amanda));

        System.out.println(bubbles.toString());
    }
}
