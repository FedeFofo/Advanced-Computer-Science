public class TriangleLoops {
    public static void main(String[] args) {
        // to-do: create a separate tester class
        // to-do: invoke each method at least 2 times in the tester class

        // for example:
        System.out.println(createLetterTriangleUp(3, 'A'));
        System.out.println(createLetterTriangleUp(15, 'B'));

        System.out.println(TriangleLoops.createLetterTriangleDown(3, 'A'));
        System.out.println(TriangleLoops.createLetterTriangleDown(5, 'B'));

        System.out.println(TriangleLoops.createNumbersTriangle(4));

    }

    public static String createLetterTriangleUp(int numberOfRows, char letter) {
        String triangle = "";
        for (int i = 0; i <= numberOfRows; i++) {
            for (int j = i; j != 0; j -= 1) {
                triangle += letter;
            }
            triangle += "\n";
        }
        return triangle;
    }

    public static String createLetterTriangleDown(int numberOfRows, char letter) {
        String triangle = "";
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = i; j < numberOfRows; j++) {
                triangle += letter;
            }
            triangle += "\n";
        }
        return triangle;
    }

    public static String createNumbersTriangle(int numberOfRows) {
        String triangle = "";
        for (int i = 0; i <= numberOfRows; i++) {
            for (int j = i; j != 0; j -= 1) {
                triangle += i + " ";
            }
            triangle += "\n";
        }
        return triangle;
    }

    // to-do: implement createAlphabetTriangle
    public static String createAlphabetTriangle(int numberOfRows) {
        String triangle = "";
        return triangle;
    }

}