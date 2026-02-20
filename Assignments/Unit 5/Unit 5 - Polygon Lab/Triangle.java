public class Triangle extends Polygon {
    // instance variables
    private double base;
    private double height;

    // constructors
    Triangle(double base, double height) {
        super(3);
        this.base = base;
        this.height = height;
    }

    Triangle() {
        this(3, 4);
    }

    // getters
    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    // setters
    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // methods
    public double getArea() {
        return 0.5 * base * height;
    }

    public String toString() {
        return super.toString() + "\nIt is a triangle with a base of " + base + " and height of " + height
                + ". Its area is " + getArea() + ".";
    
    }
}
