// arrays -> objects that represent a list of elements
// the size of an array cannot be changed once initialized (size is immutable)
// if i want to expand the array, i'd have to create an entirely new array and copy the old values
// arrays do not have methods!

// ArrayList class
// expandable list and has methods!
// must import the class before use

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();
        // ArrayLists reserve 10 empty slots in your memory

        // names[1] = "Lopez" equivalent:
        names.add("Daniel");
        names.add("Matthew");
        names.add("Morgan");
        names.add("Ava");
        names.add("Crystal");
        names.add("Isabelle");
        names.add("Jason");
        names.add("Ryan");
        names.add("Zayra");
        names.add("Boyan");
        // reserves 15 slots in memory (expands 1.5 times)
        // 10 -> 15 -> 23 -> 35
        names.add("Henry");
        names.add("James");
        names.add("Owen");

        System.out.println(names);
        System.out.println(names.size());

        System.out.println(names.get(4));

        // drawback on arraylists is that we cannot use them with primitive data types!!
        // but we can wrap the integer in the Integer wrapper class

        ArrayList<Integer> myFavNumbers = new ArrayList<Integer>();
        myFavNumbers.add(7); // [7]
        myFavNumbers.add(3); // [7, 3]
        myFavNumbers.add(21); // [7, 3, 21]

        myFavNumbers.add(1, 20); // index, value -> [7, 20, 3, 21]

        System.out.println(myFavNumbers.set(1, 10)); // [7, 10, 3, 21]
        // set -> returns the value that was replaced! (like pop)

        System.out.println(myFavNumbers.remove(1)); // [7, 3, 21]
        // remove -> returns the value that was removed

        System.out.println(myFavNumbers.get(2));

        myFavNumbers.add(myFavNumbers.set(1, 20)); // [7, 50, 21, 3]

        System.out.println(myFavNumbers);
 
    }
}