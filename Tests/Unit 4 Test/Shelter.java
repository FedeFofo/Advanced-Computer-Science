import java.util.ArrayList;

public class Shelter {
    // instance variables
    private Dog[][] kennels;

    // constructors
    public Shelter(int rows, int cols) {
        if (rows <= 0 || cols <= 0) {
            throw new IllegalArgumentException("Rows and cols cannot be less "
                    + "than or equal to zero.");
        }
        kennels = new Dog[rows][cols];
    }

    /* initializes kennels as a 3x3 2D array */
    public Shelter() {
        kennels = new Dog[3][3];
    }

    // getters and setters
    public Dog[][] getKennels() {
        return kennels;
    }

    public void setKennels(Dog[][] kennels) {
        this.kennels = kennels;
    }

    // methods

    /*
     * prints out the 2D array 'kennels', displaying the dog's info if the kennel is
     * occupied, or
     * 'empty' if the kennel is empty
     */
    public void displayStatus() {
        for (Dog[] row : kennels) {
            for (Dog animal : row) {
                if (animal != null) {
                    System.out.print(animal);
                } else {
                    System.out.print("[Empty]");
                }
            }
            System.out.println();
        }
    }

    public void add(Dog animal) {
        if (animal == null) {
            throw new IllegalArgumentException("The dog being added cannot be null.");
        }
        for (int row = 0; row < kennels.length; row++) {
            for (int col = 0; col < kennels[row].length; col++) {
                if (kennels[row][col] == null) {
                    kennels[row][col] = animal;
                    return;
                }
            }
        }
        System.out.println("No empty kennels.");
    }

    public void add(Dog animal, int row, int col) {
        if (animal == null) {
            throw new IllegalArgumentException("The dog being added cannot be null.");
        }

        if (row < 0 || col < 0) {
            throw new IllegalArgumentException("The indexes must be valid and positive.");
        } else if (row >= kennels.length || col >= kennels[row].length) {
            throw new IllegalArgumentException("The indexes must be valid.");
        }

        if (kennels[row][col] == null) {
            kennels[row][col] = animal;
        } else {
            add(animal);
        }
    }

    public void add(ArrayList<Dog> animals) {
        if (animals == null) {
            throw new IllegalArgumentException("The list of dogs being added cannot be null.");
        }
        for (Dog animal : animals) {
            add(animal);
        }
    }

    public Dog adopt(int row, int col) {
        if (row < 0 || col < 0) {
            throw new IllegalArgumentException("The indexes must be valid and positive.");
        } else if (row >= kennels.length || col >= kennels[row].length) {
            throw new IllegalArgumentException("The indexes must be valid.");
        }

        if (kennels[row][col] == null) {
            throw new IllegalArgumentException("There is no dog at these coordinates.");
        }

        Dog adopted = kennels[row][col];
        kennels[row][col] = null;

        return adopted;

    }

    public ArrayList<Dog> search(String name) {
        if (name == null) {
            throw new IllegalArgumentException("The name being searched for cannot be null.");
        }

        ArrayList<Dog> matches = new ArrayList<Dog>();

        for (int row = 0; row < kennels.length; row++) {
            for (int col = 0; col < kennels[row].length; col++) {
                if (kennels[row][col] == null) {
                    continue;
                } else if (kennels[row][col].getName().equals(name)) {
                    matches.add(kennels[row][col]);
                }
            }
        }

        return matches;
    }

    public ArrayList<Dog> search(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("The age being searched for cannot be negative.");
        }

        ArrayList<Dog> matches = new ArrayList<Dog>();

        for (int row = 0; row < kennels.length; row++) {
            for (int col = 0; col < kennels[row].length; col++) {
                if (kennels[row][col] == null) {
                    continue;
                } else if (kennels[row][col].getAge() == age) {
                    matches.add(kennels[row][col]);
                }
            }
        }

        return matches;
    }
}
