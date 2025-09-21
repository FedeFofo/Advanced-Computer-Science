public class Line {
    // instance variables
    int a;
    int b;
    int c;

    // constructors
    Line(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // getters
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    // setters
    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    // methods
    public double calculateSlope() {
        double a = this.a;
        double b = this.b;
        double slope = (-1 * a) / b;
        return slope;
    }

    public boolean isCoordinateOnLine(int x, int y) {
        int result = (a * x) + (b * y) + c;
        return result == 0;
    }

    public String toString() {
        return "Equation: " + a + "x + " + b + "y + " + c + " = 0";
    }

    public boolean equals(Line other) {
        return a == other.a && b == other.b && c == other.c;
    }
}