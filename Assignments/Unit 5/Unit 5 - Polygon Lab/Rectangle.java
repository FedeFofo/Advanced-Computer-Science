public class Rectangle extends Polygon {
    // instance variables
    private double length;
    private double width;

    // constructors
    Rectangle(double length, double width) {
        super(4);
        this.length = length;
        this.width = width;
    }

    Rectangle() {
        this(4, 3);
    }

    // getters
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    // setters
    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // methods
    public double getArea() {
        return length * width;
    }

    public String toString() {
        return super.toString() + "\nIt is a rectangle with a length of " + length + " and width of " + width
                + ". Its area is " + getArea() + ".";
    }
}