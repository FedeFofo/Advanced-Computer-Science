import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Circle extends Shape {
    // instance variables
    private int radius;

    // constructors
    public Circle(int xCoord, int yCoord, int radius) {
        super(xCoord, yCoord);
        this.radius = radius;
    }

    public Circle(int radius) {
        this(0, 0, radius);
    }

    // methods
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    public String toString() {
        return super.toString() + "\nIt is a circle with a radius of " + radius + ". Its area is " + getArea() + ".";
    }

    public void draw(Graphics g) {
        // Initialize a Graphics 2D object
        Graphics2D g2D = (Graphics2D) g;

        // Set the color of the circle
        g2D.setPaint(Color.cyan);

        // Draw the circle using the fillOval method
        g2D.fillOval(xCoord, yCoord, radius, radius);

        // Set the color of the circle
        g2D.setPaint(Color.blue);

        // Change the stroke width
        g2D.setStroke(new BasicStroke(5));

        // draw the circle using the drawOval method
        g2D.drawOval(xCoord, yCoord, radius, radius);
    }

}
