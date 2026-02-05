public class MatrixFun {
    // instance variables
    private int[][] matrix;

    // constructors
    MatrixFun(int numberOfRows, int numberOfCols) {
        if (numberOfRows <= 0 || numberOfCols <= 0) {
            throw new IllegalArgumentException("Dimensions must be positive.");
        }
        matrix = new int[numberOfRows][numberOfCols];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = Utils.generateRandomNumber(0, 10);
            }
        }
    }

    MatrixFun(int[][] starterMatrix) {
        matrix = starterMatrix;
    }

    MatrixFun() {
        this(3, 3);
    }

    // getters
    public int[][] getMatrix() {
        return matrix;
    }

    // setters
    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    // methods
    public String toString() {
        String equalsLine = "";
        for (int i = 0; i < (matrix.length + matrix.length - 1); i++) {
            equalsLine = equalsLine + "=";
        }

        String nums = "";
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                nums += String.valueOf(matrix[row][col]) + " ";
            }
            nums += "\n";
        }

        return equalsLine + "\n" + nums + equalsLine;
    }

    public boolean equals(MatrixFun other) {
        return this.toString().equals(other.toString());
    }

    public boolean equals(int[][] other) {
        if (matrix.length != other.length || matrix[0].length != other[0].length) {
            return false;
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] != other[row][col]) {
                    return false;
                }
            }
        }

        return true;
    }

    public void replaceAll(int oldValue, int newValue) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == oldValue) {
                    matrix[row][col] = newValue;
                }
            }
        }
    }

    public void swapRow(int rowA, int rowB) {
        if (rowA < 0 || rowB < 0) {
            throw new IllegalArgumentException("Index of row(s) must not be negative.");
        } else if (rowA >= matrix.length || rowB >= matrix.length) {
            throw new IllegalArgumentException("Index of row(s) must be in bounds.");
        }
        int[] rowaNums = matrix[rowA];
        int[] rowbNums = matrix[rowB];

        for (int row = 0; row < matrix.length; row++) {
            if (row == rowA) {
                matrix[row] = rowbNums;
            } else if (row == rowB) {
                matrix[row] = rowaNums;
            }
        }
    }
}
