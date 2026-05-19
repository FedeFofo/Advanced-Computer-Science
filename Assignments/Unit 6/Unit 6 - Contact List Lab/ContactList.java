import java.util.AbstractList;
import java.util.ArrayList;

public class ContactList extends AbstractList {

    // instance variable
    private ArrayList<String> contactList;

    // constructor
    public ContactList() {
        contactList = new ArrayList<String>();
    }

    // methods

    /**
     * Returns the index where name should be inserted to keep the list alphabetized. Uses
     * sequential search with compareTo().
     */
    private int findInsertLocation(String name) {
        for (int i = 0; i < contactList.size(); i++) {
            if (name.compareTo(contactList.get(i)) <= 0) {
                return i;
            }
        }
        // name belongs at end
        return contactList.size();
    }

    /**
     * Adds a name to the contact list in alphabetical order. Prevents duplicate names. Returns true
     * if added, false otherwise.
     */
    public boolean add(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null.");
        }

        if (name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }

        System.out.println("+ Adding " + name);

        for (int i = 0; i < contactList.size(); i++) {
            if (name.compareTo(contactList.get(i)) == 0) {
                return false;
            }
        }

        int location = findInsertLocation(name);
        contactList.add(location, name);
        return true;
    }

    /**
     * Adds a list of names to the contact list.
     */
    public void add(ArrayList<String> names) {
        if (names == null) {
            throw new IllegalArgumentException("Names list cannot be null.");
        }

        for (String name : names) {
            add(name);
        }
    }

    /**
     * Removes a name from the contact list. If the name doesn't exist, the list is unchanged.
     * Returns true if removed, false otherwise.
     */
    public boolean remove(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null.");
        }

        if (name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }

        System.out.println("- Removing " + name);

        for (int i = 0; i < contactList.size(); i++) {
            if (name.compareTo(contactList.get(i)) == 0) {
                contactList.remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     * Removes a list of names from the contact list.
     */
    public void remove(ArrayList<String> names) {
        if (names == null) {
            throw new IllegalArgumentException("Names list cannot be null.");
        }

        for (String name : names) {
            remove(name);
        }
    }

    /** Returns a String containing all of the names in the list */
    public String toString() {
        return "Contact List: " + contactList.toString();
    }

    /** Returns the name at the specified index */
    public String get(int index) {
        return contactList.get(index);
    }

    /** Returns the number of names in the contact list */
    public int size() {
        return contactList.size();
    }

    /** Removes all names from the contact list */
    public void clear() {
        System.out.println("Clearing the contact list");
        contactList.clear();
    }

}
