public class LineTester {
    public static void main(String[] args) {
        Point p1 = new Point(2, 7);
        Point p2 = new Point(1, 4);
        Point p3 = new Point(11, 18);
        Point p4 = new Point(4, 13);
        
        Line pointLine = new Line(p1, p2);

        System.out.println("---------------------------------");
        System.out.println(" Calculating slope of pointLine: ");
        System.out.println("---------------------------------");

        System.out.println("\tCoordinates of pointLine: (" + p1.getX() + ", " 
            + p1.getY() + "), (" + p2.getX() + ", " + p2.getY() + ")");
        System.out.println("Expected output:\t\t\t\t3.0");
        System.out.println("Actual output using calculateSlope():\t\t" 
            + pointLine.calculateSlope());
        System.out.println("Actual output using calculateSlopeFromPoints():\t" 
            + pointLine.calculateSlopeFromPoints());
        System.out.println("Do slopes match?\t\t\t\t" 
            + (pointLine.calculateSlope() == pointLine.calculateSlopeFromPoints()));

        System.out.println("-----------------------------");
        System.out.println(" Testing isCoordinateOnLine: ");
        System.out.println("-----------------------------");

        System.out.println("\tpointLine.isCoordinateOnLine(p1)");
        System.out.println("Expected output:\ttrue");
        System.out.println("Actual output:\t\t" + pointLine.isCoordinateOnLine(p1));

        System.out.println("\tpointLine.isCoordinateOnLine(p2)");
        System.out.println("Expected output:\ttrue");
        System.out.println("Actual output:\t\t" + pointLine.isCoordinateOnLine(p2));

        System.out.println("\tpointLine.isCoordinateOnLine(p3)");
        System.out.println("Expected output:\tfalse");
        System.out.println("Actual output:\t\t" + pointLine.isCoordinateOnLine(p3));

        System.out.println("\tpointLine.isCoordinateOnLine(p4)");
        System.out.println("Expected output:\ttrue");
        System.out.println("Actual output:\t\t" + pointLine.isCoordinateOnLine(p4));
    }
}
