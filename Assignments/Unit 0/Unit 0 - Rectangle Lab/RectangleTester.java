public class RectangleTester {
    public static void main(String[] args) {
        Rectangle john = new Rectangle(60, 80);
        Rectangle jane = new Rectangle(20, 140);

        System.out.println(john.toString());
        System.out.println(jane.toString());

        john.setLength(50);
        john.setWidth(70);
        jane.setLength(10);
        jane.setWidth(130);

        System.out.println(john.toString());
        System.out.println(jane.toString());

        if (john.equals(jane)) {
            System.out.println("The rectangles are equal.");
        } else {
            System.out.println("The rectangles are not equal.");
        }

        System.out.println("John's diagonal is " + john.calculateDiagonal());
        System.out.println("Jane's diagonal is " + jane.calculateDiagonal());
    }
}
