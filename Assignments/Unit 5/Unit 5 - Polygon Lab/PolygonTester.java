public class PolygonTester {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(6, 7);
        System.out.println(rectangle.toString());

        System.out.println();

        Square square = new Square(5);
        System.out.println(square.toString());

        System.out.println();

        Triangle triangle = new Triangle(4, 7);
        System.out.println(triangle.toString());
    }
}
