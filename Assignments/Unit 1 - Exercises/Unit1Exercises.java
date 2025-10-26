public class Unit1Exercises {

    public static String helloName(String name) {
        return "Hello " + name + "!";
    }

    public static String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2, 4);
    }

    public static String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    public static String comboString(String a, String b) {
        if (a.length() > b.length()) {
            return b + a + b;
        } else {
            return a + b + a;
        }
    }

    public static String left2(String str) {
        return str.substring(2, str.length()) + str.substring(0, 2);
    }

    public static String middleThree(String str) {
        double middle = str.length() / 2;
        return str.substring((int) (middle - 0.5), (int) (middle + 2.5));
    }

    public static String withoutEnd2(String str) {
        if (str.length() <= 2) {
            return "";
        }
        return str.substring(1, str.length() - 1);
    }

    public static String stringEnds(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n, str.length());
    }

    public static boolean hasBad(String str) {
        if (str.substring(0, 3).equals("bad")) {
            return true;
        } else if (str.substring(1, 4).equals("bad")) {
            return true;
        } else {
            return false;
        }
    }

    public static int countVowels(String input) {
        int vowels = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.substring(i, i + 1).equals("a") 
                || input.substring(i, i + 1).equals("e") 
                || input.substring(i, i + 1).equals("i") 
                || input.substring(i, i + 1).equals("o") 
                || input.substring(i, i + 1).equals("u") 
                || input.substring(i, i + 1).equals("A") 
                || input.substring(i, i + 1).equals("E") 
                || input.substring(i, i + 1).equals("I") 
                || input.substring(i, i + 1).equals("O") 
                || input.substring(i, i + 1).equals("U")) {
                vowels++;
            }
        }
        return vowels;
    }

    public static int countCode(String str) {
        int code = 0;
        if (str.length() < 4) {
            return code;
        }
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 2).equals("co") && str.substring(i + 3, i + 4).equals("e")) {
                code++;
            }
        }
        return code;
    }

}