public class MatrixFunTester {
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 3}, {4, 5, 6}, {7, 8, 1}};
        MatrixFun newMatrix = new MatrixFun(matrix);

        System.out.println("\n\t// Testing toString");
        System.out.println(newMatrix.toString());

        int[][] matrix2 = {{1, 1, 3}, {4, 5, 6}, {7, 8, 1}};
        MatrixFun newMatrix2 = new MatrixFun(matrix2);

        System.out.println("\n\t// Testing equals(MatrixFun)");
        System.out.println("Expected output:\t\ttrue");
        System.out.println("Actual output:\t\t\t" + newMatrix.equals(newMatrix2));

        System.out.println("\n\t// Testing equals(int[][])");
        System.out.println("Expected output:\t\ttrue");
        System.out.println("Actual output:\t\t\t" + newMatrix.equals(matrix2));

        System.out.println("\n\t// Testing replaceAll");
        newMatrix.replaceAll(1, 9);
        System.out.println(newMatrix.toString());

        System.out.println("\n\t// Testing swapRow");
        newMatrix2.swapRow(0, 1);
        System.out.println(newMatrix2.toString());
    }
}