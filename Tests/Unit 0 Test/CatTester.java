public class CatTester {
    public static void main(String[] args) {
        Cat myCat = new Cat("Betsy", "Tabby"); 
        // 12. Added "new" in front of the constructor to create a new cat
        Cat otherCat = new Cat("Tiger Beast", "Tabby");
        // 13. Added "new" in front of the constructor to create a new cat
        System.out.println(myCat.toString());
        System.out.println("My Cat's Name: " + myCat.getName()); 
        // 14. Printed string instead of just writing it in the middle of the tester
        System.out.println("Are the cat's equal? " + myCat.equals(otherCat));
        // 15. Printed string instead of just writing it in the middle of the tester
        System.out.println("Is my cat hungry? " + myCat.getIsHungry());
        // 16. Updated python-like "print" method to proper sout method

        String firstName = "Tiger";
        String lastName = "Beast";
        // 17. Updated declaration to use only one equals sign
        String name = firstName + " " + lastName;

        System.out.println("Changing the cat's name...");
        myCat.setName(name);
        System.out.println("The two cat's are the same now: " + myCat.equals(otherCat));

    }

}