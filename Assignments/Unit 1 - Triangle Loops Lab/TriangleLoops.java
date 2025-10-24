public class TriangleLoops {
    public static String createLetterTriangleUp(int numberOfRows, char letter) {
        String triangle = "";
        for (int i = 1; i <= numberOfRows; i++) {
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

    public static String createAlphabetTriangle(int numberOfRows) {
        String triangle = "";
        if (numberOfRows > 26) {
            numberOfRows = 26;
        }
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = numberOfRows - i - 1; j > 0; j--) {
                triangle += " ";
            }
            for (int k = 0; k <= i; k++) {
                // ascending letters
                // 65 = 'A'
                char newLetter = (char) (65 + k);
                triangle += newLetter;
            }
            for (int l = i - 1; l >= 0; l--) {
                // descending letters
                char newLetter = (char) (65 + l);
                triangle += newLetter;
            }
            triangle += "\n";
        }
        return triangle;
    }

}