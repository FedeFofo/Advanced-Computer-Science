public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int newLength, int newWidth) {
        length = newLength;
        width = newWidth; 
    }

    public Rectangle() {
        length = 50;
        width = 100;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int input) {
        length = input; 
    }

    public void setWidth(int input) {
        width = input;
    }

    public String toString() {
        String description = "This rectangle has a length of " + length + " and a width of " 
            + width + " . Its area is 15.";
        return description;
    }

    public boolean equals(Rectangle other) {
        if (length == other.length && width == other.width) {
            return true;
        } else {
            return false;
        }
    }

    public int calculateArea() {
        int area = length * width;
        return area;
    }

    public int calculatePerimeter() {
        int perimeter = 2 * width + 2 * length;
        return perimeter;
    }

    public double calculateDiagonal() {
        int lengthSquared = length * length;
        int widthSquared = width * width;
        double diagonal = Math.sqrt((lengthSquared + widthSquared));
        return diagonal;
    }
}