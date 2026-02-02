// Solution: Unit 0 Exercises
public class Unit0Exercises {


    public static void main(String[] args) {
        Unit0Exercises obj = new Unit0Exercises();
        System.out.println();

        // testing sleepIn() method

        // sleepIn(false, false) -> true
        System.out.println(obj.sleepIn(false, false));
        System.out.println(obj.sleepIn(true, false));
        // sleepIn(true, false) -> false
        System.out.println(obj.sleepIn(true, false));
        // sleepIn(false, true) -> true
        System.out.println(obj.sleepIn(false, true));


        // testing diff21() method

        // diff21(19) -> 2
        System.out.println(obj.diff21(19));
        // diff21(10) -> 11
        System.out.println(obj.diff21(10));
        // diff21(21) -> 0
        System.out.println(obj.diff21(21));

        // testing flooringCalculator() method

        // flooringCalculator(500, 2.5) -> 1250.0
        System.out.println(obj.flooringCalculator(500, 2.5));
        // flooringCalculator(0, 3.0) -> 0.0
        System.out.println(obj.flooringCalculator(0, 3.0));
        // flooringCalculator(100, -1.5) -> 0.0
        System.out.println(obj.flooringCalculator(100, -1.5));


    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday == false || vacation == true) {
            return true;
        } else {
            return false;
        }
    }

    public int diff21(int n) {
        int diff = 21 - n;
        if (n > 21) {
            diff *= -2;
            return diff;
        } else {
            return diff;
        }
    }

    public double flooringCalculator(int sqft, double pricePerSqft) {
        if (sqft <= 0 || pricePerSqft <= 0) {
            return 0.0;
        } else {
            return sqft * pricePerSqft;
        }
    }

}
