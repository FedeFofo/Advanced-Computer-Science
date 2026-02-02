public class Unit1ExercisesTester {
    public static void main(String[] args) {
        System.out.println("--------------------");
        System.out.println(" Testing helloName: ");
        System.out.println("--------------------");
        System.out.println("\thelloName(\"Bob\")");
        System.out.println("Expected output:\tHello Bob!");
        System.out.println("Actual output:\t\t" + Unit1Exercises.helloName("Bob") + "\n");
        System.out.println("\thelloName(\"Alice\")");
        System.out.println("Expected output:\tHello Alice!");
        System.out.println("Actual output:\t\t" + Unit1Exercises.helloName("Alice") + "\n");
        System.out.println("\thelloName(\"X\")");
        System.out.println("Expected output:\tHello X!");
        System.out.println("Actual output:\t\t" + Unit1Exercises.helloName("X") + "\n");

        System.out.println("----------------------");
        System.out.println(" Testing makeOutWord: ");
        System.out.println("----------------------");
        System.out.println("\tmakeOutWord(\"<<>>\", \"Yay\")");
        System.out.println("Expected output:\t<<Yay>>");
        System.out.println("Actual output:\t\t" + Unit1Exercises.makeOutWord("<<>>", "Yay") + "\n");
        System.out.println("\tmakeOutWord(\"<<>>\", \"WooHoo\")");
        System.out.println("Expected output:\t<<WooHoo>>");
        System.out.println("Actual output:\t\t" 
            + Unit1Exercises.makeOutWord("<<>>", "WooHoo") + "\n");
        System.out.println("\tmakeOutWord(\"[[]]\", \"word\")");
        System.out.println("Expected output:\t[[word]]");
        System.out.println("Actual output:\t\t" 
            + Unit1Exercises.makeOutWord("[[]]", "word") + "\n");

        System.out.println("---------------------");
        System.out.println(" Testing withoutEnd: ");
        System.out.println("---------------------");
        System.out.println("\twithoutEnd(\"Hello\")");
        System.out.println("Expected output:\tell");
        System.out.println("Actual output:\t\t" + Unit1Exercises.withoutEnd("Hello") + "\n");
        System.out.println("\twithoutEnd(\"java\")");
        System.out.println("Expected output:\tav");
        System.out.println("Actual output:\t\t" + Unit1Exercises.withoutEnd("java") + "\n");
        System.out.println("\twithoutEnd(\"coding\")");
        System.out.println("Expected output:\todin");
        System.out.println("Actual output:\t\t" + Unit1Exercises.withoutEnd("coding") + "\n");

        System.out.println("----------------------");
        System.out.println(" Testing comboString: ");
        System.out.println("----------------------");
        System.out.println("\tcomboString(\"Hello\", \"hi\")");
        System.out.println("Expected output:\thiHellohi");
        System.out.println("Actual output:\t\t" + Unit1Exercises.comboString("Hello", "hi") + "\n");
        System.out.println("\tcomboString(\"hi\", \"Hello\")");
        System.out.println("Expected output:\thiHellohi");
        System.out.println("Actual output:\t\t" + Unit1Exercises.comboString("hi", "Hello") + "\n");
        System.out.println("\tcomboString(\"aaa\", \"b\")");
        System.out.println("Expected output:\tbaaab");
        System.out.println("Actual output:\t\t" + Unit1Exercises.comboString("aaa", "b") + "\n");

        System.out.println("----------------");
        System.out.println(" Testing left2: ");
        System.out.println("----------------");
        System.out.println("\tleft2(\"Hello\")");
        System.out.println("Expected output:\tlloHe");
        System.out.println("Actual output:\t\t" + Unit1Exercises.left2("Hello") + "\n");
        System.out.println("\tleft2(\"java\")");
        System.out.println("Expected output:\tvaja");
        System.out.println("Actual output:\t\t" + Unit1Exercises.left2("java") + "\n");
        System.out.println("\tleft2(\"Hi\")");
        System.out.println("Expected output:\tHi");
        System.out.println("Actual output:\t\t" + Unit1Exercises.left2("Hi") + "\n");

        System.out.println("----------------------");
        System.out.println(" Testing middleThree: ");
        System.out.println("----------------------");
        System.out.println("\tmiddleThree(\"Candy\")");
        System.out.println("Expected output:\tand");
        System.out.println("Actual output:\t\t" + Unit1Exercises.middleThree("Candy") + "\n");
        System.out.println("\tmiddleThree(\"and\")");
        System.out.println("Expected output:\tand");
        System.out.println("Actual output:\t\t" + Unit1Exercises.middleThree("and") + "\n");
        System.out.println("\tmiddleThree(\"solving\")");
        System.out.println("Expected output:\tlvi");
        System.out.println("Actual output:\t\t" + Unit1Exercises.middleThree("solving") + "\n");

        System.out.println("----------------------");
        System.out.println(" Testing withoutEnd2: ");
        System.out.println("----------------------");
        System.out.println("\twithoutEnd2(\"Hello\")");
        System.out.println("Expected output:\tell");
        System.out.println("Actual output:\t\t" + Unit1Exercises.withoutEnd2("Hello") + "\n");
        System.out.println("\twithoutEnd2(\"abc\")");
        System.out.println("Expected output:\tb");
        System.out.println("Actual output:\t\t" + Unit1Exercises.withoutEnd2("abc") + "\n");
        System.out.println("\twithoutEnd2(\"ab\")");
        System.out.println("Expected output:\t");
        System.out.println("Actual output:\t\t" + Unit1Exercises.withoutEnd2("ab") + "\n");

        System.out.println("---------------------");
        System.out.println(" Testing stringEnds: ");
        System.out.println("---------------------");
        System.out.println("\tstringEnds(\"Hello\", 2)");
        System.out.println("Expected output:\tHelo");
        System.out.println("Actual output:\t\t" + Unit1Exercises.stringEnds("Hello", 2) + "\n");
        System.out.println("\tstringEnds(\"Chocolate\", 3)");
        System.out.println("Expected output:\tChoate");
        System.out.println("Actual output:\t\t" + Unit1Exercises.stringEnds("Chocolate", 3) + "\n");
        System.out.println("\tstringEnds(\"Chocolate\", 1)");
        System.out.println("Expected output:\tCe");
        System.out.println("Actual output:\t\t" + Unit1Exercises.stringEnds("Chocolate", 1) + "\n");

        System.out.println("-----------------");
        System.out.println(" Testing hasBad: ");
        System.out.println("-----------------");
        System.out.println("\thasBad(\"badxxx\")");
        System.out.println("Expected output:\ttrue");
        System.out.println("Actual output:\t\t" + Unit1Exercises.hasBad("badxx") + "\n");
        System.out.println("\thasBad(\"xbadxx\")");
        System.out.println("Expected output:\ttrue");
        System.out.println("Actual output:\t\t" + Unit1Exercises.hasBad("xbadxx") + "\n");
        System.out.println("\thasBad(\"xxbadxxx\")");
        System.out.println("Expected output:\tfalse");
        System.out.println("Actual output:\t\t" + Unit1Exercises.hasBad("xxbadxx") + "\n");

        System.out.println("----------------------");
        System.out.println(" Testing countVowels: ");
        System.out.println("----------------------");
        System.out.println("\tcountVowels(\"Hello\")");
        System.out.println("Expected output:\t2");
        System.out.println("Actual output:\t\t" + Unit1Exercises.countVowels("Hello") + "\n");
        System.out.println("\tcountVowels(\"abc\")");
        System.out.println("Expected output:\t1");
        System.out.println("Actual output:\t\t" + Unit1Exercises.countVowels("abc") + "\n");
        System.out.println("\tcountVowels(\"\")");
        System.out.println("Expected output:\t0");
        System.out.println("Actual output:\t\t" + Unit1Exercises.countVowels("") + "\n");

        System.out.println("--------------------");
        System.out.println(" Testing countCode: ");
        System.out.println("--------------------");
        System.out.println("\tcountCode(\"aaacodebbb\")");
        System.out.println("Expected output:\t1");
        System.out.println("Actual output:\t\t" + Unit1Exercises.countCode("aaacodebbb") + "\n");
        System.out.println("\tcountCode(\"codexxcode\")");
        System.out.println("Expected output:\t2");
        System.out.println("Actual output:\t\t" + Unit1Exercises.countCode("codexxcode") + "\n");
        System.out.println("\tcountCode(\"cozexxcope\")");
        System.out.println("Expected output:\t2");
        System.out.println("Actual output:\t\t" + Unit1Exercises.countCode("cozexxcope") + "\n");
    }
}
