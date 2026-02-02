public class TriangleLoopsTester {
    public static void main(String[] args) {
        System.out.println("\n..::Testing createLetterTriangleUp::..\n");
        System.out.println(TriangleLoops.createLetterTriangleUp(3, 'A'));
        // should output:
        // A
        // AA
        // AAA
        System.out.println(TriangleLoops.createLetterTriangleUp(5, 'B'));
        // should output:
        // B
        // BB
        // BBB
        // BBBB
        // BBBBB
        System.out.println(TriangleLoops.createLetterTriangleUp(-2, 'C'));
        // shouldn't output anything

        System.out.println("..::Testing createLetterTriangleDown::..\n");
        System.out.println(TriangleLoops.createLetterTriangleDown(3, 'A') + "\n");
        // should output:
        // AAA
        // AA
        // A
        System.out.println(TriangleLoops.createLetterTriangleDown(5, 'B'));
        // should output:
        // BBBBB
        // BBBB
        // BBB
        // BB
        // B
        System.out.println(TriangleLoops.createLetterTriangleDown(-2, 'C'));

        System.out.println("..::Testing createNumbersTriangle::..");
        System.out.println(TriangleLoops.createNumbersTriangle(4));
        // should output:
        // 1 
        // 2 2 
        // 3 3 3 
        // 4 4 4 4 
        System.out.println(TriangleLoops.createNumbersTriangle(7));
        // should output:
        // 1 
        // 2 2 
        // 3 3 3 
        // 4 4 4 4
        // 5 5 5 5 5 
        // 6 6 6 6 6 6 
        // 7 7 7 7 7 7 7  
        System.out.println(TriangleLoops.createNumbersTriangle(-3));
        // shouldn't output anything

        System.out.println("..::Testing createAlphabetTriangle::.." + "\n");
        System.out.println(TriangleLoops.createAlphabetTriangle(5) + "\n");
        // should output:
        //     A
        //    ABA
        //   ABCBA
        //  ABCDCBA
        // ABCDEDCBA
        System.out.println(TriangleLoops.createAlphabetTriangle(2));
        // should output:
        //  A
        // ABA
        System.out.println(TriangleLoops.createAlphabetTriangle(-4));
    }
}
