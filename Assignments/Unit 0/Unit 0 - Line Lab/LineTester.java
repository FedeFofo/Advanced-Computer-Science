public class LineTester {
    public static void main(String[] args) {
        // Testing Line 1
        Line line1 = new Line(5, 4, -17);

        System.out.println(line1.toString());

        double slope1 = line1.calculateSlope(); 
        System.out.println("Slope: " + slope1); // output should be -1.25

        boolean onLine1 = line1.isCoordinateOnLine(5, -2); 
        System.out.println("Is (5, -2) on the line? " + onLine1);
        // output should be true, as 5(5) + 4(-2) + (-17) = 0

        // Testing Line 2
        Line line2 = new Line(-25, 40, 30);

        System.out.println(line2.toString());

        double slope2 = line2.calculateSlope(); 
        System.out.println("Slope: " + slope2); // output should be 0.625

        boolean onLine2 = line2.isCoordinateOnLine(5, -2);
        System.out.println("Is (5, -2) on the line? " + onLine2);
        // output should be false, as -25(5) + 40(-2) + 30 != 0

        // Testing Line 3
        Line line3 = new Line(0, 6, 15);

        System.out.println(line3.toString());

        double slope3 = line3.calculateSlope();
        System.out.println("Slope: " + slope3); // output should be +/- 0.0

        boolean onLine3 = line3.isCoordinateOnLine(4, -2);
        System.out.println("Is (4, -2) on the line? " + onLine3);
        // output should be false, as 0(4) + 6(-2) + 15 != 0

        // Testing Line 4
        Line line4 = new Line(20, 0, -20);

        System.out.println(line4.toString());

        double slope4 = line4.calculateSlope();
        System.out.println("Slope: " + slope4); // output should be +/- infinity

        boolean onLine4 = line4.isCoordinateOnLine(1, 0);
        System.out.println("Is (1, 0) on the line? " + onLine4);
        // output should be true, as 20(1) + 0(0) + (-20) = 0
    }
}
