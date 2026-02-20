public class Square extends Rectangle {
    // constructors
    Square(double sideLength) {
        super(sideLength, sideLength);
    }

    Square() {
        super(4, 4);
    }

    // methods
    public String toString() {
        return super.toString() + "\nIt is also a square.";
    }
}
