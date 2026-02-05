public class SkyView {
    // instance variables
    private double[][] view;

    // constructors
    SkyView(int numberOfRows, int numberOfCols, double[] scanned) {
        if (scanned.length > numberOfRows * numberOfCols) {
            throw new IllegalArgumentException("2D array needs to be able to accomodate"
                    + "all elements of the 1D array--dimensions too small.");
        }

        double[][] view = new double[numberOfRows][numberOfCols];
        int scannedIndex = 0;
        for (int row = 0; row < numberOfRows; row++) {
            if (row % 2 == 0) {
                for (int col = 0; col < numberOfCols; col++) {
                    view[row][col] = scanned[scannedIndex];
                    scannedIndex++;
                }
            } else {
                for (int col = numberOfCols - 1; col >= 0; col--) {
                    view[row][col] = scanned[scannedIndex];
                    scannedIndex++;
                }
            }
        }

        this.view = view;
    }

    // getters
    public double[][] getView() {
        return view;
    }

    // setters
    public void setView(double[][] view) {
        this.view = view;
    }

    // methods
    public String toString() {
        String toString = "";
        for (int row = 0; row < view.length; row++) {
            for (int col = 0; col < view[row].length; col++) {
                toString += view[row][col] + " ";
            }
            toString += "\n";
        }
        return toString;
    }

    public boolean equals(SkyView other) {
        if (view.length != other.getView().length || view[0].length != other.getView()[0].length) {
            return false;
        }

        for (int row = 0; row < view.length; row++) {
            for (int col = 0; col < view[row].length; col++) {
                if (view[row][col] != other.getView()[row][col]) {
                    return false;
                }
            }
        }

        return true;
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol) {
        if (startRow > view.length - 1 || startRow < 0) {
            throw new IllegalArgumentException("startRow needs to be a valid index.");
        } else if (endRow > view.length - 1 || endRow < 0) {
            throw new IllegalArgumentException("endRow needs to be a valid index.");
        } else if (startCol > view[0].length - 1 || startCol < 0) {
            throw new IllegalArgumentException("startCol needs to be a valid index.");
        } else if (endCol > view[0].length - 1 || endCol < 0) {
            throw new IllegalArgumentException("endCol needs to be a valid index.");
        } else if (startRow > endRow) {
            throw new IllegalArgumentException("startRow must be less tha endRow.");
        } else if (startCol > endCol) {
            throw new IllegalArgumentException("startCol must be less tha endCol.");
        }

        double sum = 0;
        double count = 0;

        for (int row = startRow; row <= endRow; row++) {
            for (int col = startCol; col <= endCol; col++) {
                sum += view[row][col];
                count++;
            }
        }

        return sum / count;
    }
}