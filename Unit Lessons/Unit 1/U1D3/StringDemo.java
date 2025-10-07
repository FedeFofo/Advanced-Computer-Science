public class StringDemo {

    // in the AP only use these methods from this class

    public static void main(String[] args) {
        // Strings are objects
        String fullName = "James Esser";
        String fullName2 = "James Esser";

        System.out.println(fullName == fullName2); // true

        fullName2 = "James Joseph Esser";
        String fullName3 = new String("James Esser");

        // fullName3 += ":)";

        // STRINGS ARE IMMUTABLE (they can't change!)
        // Any change immediately creates a new string object
        // If a string doesn't have any aliases pointing to it, it gets garbage collected

        // Dog dog1 = new Dog();
        // Dog dog2 = new Dog();

        System.out.println(fullName == fullName3); // false
        System.out.println(fullName.equals(fullName3)); // true

        // methods
        // charAt() -> returns the char value at index
        // "James Esser"
        System.out.println(fullName.charAt(3)); // e

        // indexOf() -> returns the index of a char value
        System.out.println(fullName.indexOf("e")); // 3

        // "James Joseph Esser"
        System.out.println(fullName2.indexOf("J")); // 0 (returns first one)

        // substring() -> returns a piece of a string given a starting and ending index

        // "James Joseph Esser"
        int firstSpace = fullName2.indexOf(" "); // finds the index of the first space

        String middleLastName = fullName2.substring(firstSpace); // creates a substring starting at the first space to the end

        // " Joseph Esser"
        System.out.println(middleLastName.indexOf("J")); // find index of J (returns 1)

        // "Joseph"
        String middleName = fullName2.substring(6, 13);
        // substring(inclusive, exclusive)

        System.out.println(middleName.indexOf("z")); // -1 (this is useful)

        // compareTo() -> returns a number depending on the order
        String string1 = "abc";
        String string2 = "abd";

        // String def = "def";

        System.out.println(string2.compareTo(string1));
        // returns negative if abc is "before" abd
        // returns positive if abc is "after" abd
        // returns 0 if strings are equal
        // basically, returns very first nonzero difference
    }
}