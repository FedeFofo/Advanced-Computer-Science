public class ArrayDemo {
    public static void main(String[] args) {

        // Pokemon
        // you can have a team of 6, index is max of 5

        // Pokemon[] team = new Pokemon[6];
        // {0, 1, 2, 3, 4, 5} ordered set (not a list, Boyan)

        // team[3] = new Pokemon("Charizard");
        // {0, 1, 2, "Charizard", 4, 5}

        // this code created a list of size 6, so the max index is 5

        // Pokemon[] box = new Pokemon[30];

        // Pokemon[] box2 = new Pokemon[1000];

        int[] myFavoriteNumbers = new int[4];
        // "my favorite numbers sub 0"
        myFavoriteNumbers[0] = 3;
        myFavoriteNumbers[1] = 21;
        myFavoriteNumbers[2] = 6;
        myFavoriteNumbers[3] = 11;

        // {3, 21, 6, 11}

        System.out.println(myFavoriteNumbers[3] + "\n");

        // print out the entire list using a for loop

        for (int i = 0; i < myFavoriteNumbers.length; i++) {
            System.out.println(myFavoriteNumbers[i]);
        }

        // what if i actually have 5 favorite numbers?

        // list sizes are immutable <- can't change it without creating a new object
        // Strings are a list (array) of characters! They are also immutable
        // "hello" -> {'h', 'e', 'l', 'l', 'o'}

        // String[] beatles = new String[4];
        // beatles[0] = "John Lennon";
        // beatles[1] = "Paul McCartney";

        // String[] beatles = {"John Lennon", "Paul McCartney", "Ringo Starr", "George Harrison"};
        String[] beatles = {"John Lennon", "Paul McCartney", null, "George Harrison"};

        // challenge: update the beatles list to include you as the secret fifth beatle

        // String[] beatles2 = new String[5];
        for (int i = 0; i < beatles.length; i++) {
            // beatles2[i] = beatles[i];
            if (beatles[i] != null) {
                System.out.println(beatles[i].length());
            }
            System.out.println("This element is null");
        }
        // beatles2[4] = "James Esser";

        // System.out.println(args.length);

        int[] number = new int[3];
        // {0, 0, 0}

        boolean[] trust = new boolean[3];
        // {false, false, false}

        String[] list = new String[3];
        // {null, null, null}

        // Pokemon[] team = new Pokemon[3];
        // {null, null, null}
    }
}