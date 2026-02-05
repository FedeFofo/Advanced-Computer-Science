public class SkyViewTester {
    public static void main(String[] args) {
        double[] scanned = {0.3, 0.7, 0.8, 0.4, 1.4, 1.1, 0.2, 0.5, 0.1, 1.6, 0.6, 0.9};
        SkyView skyData = new SkyView(4, 3, scanned);

        System.out.println("\n\t// Testing toString");
        System.out.println(skyData.toString());

        double[] scanned2 = {0.3, 0.7, 0.8, 0.4, 1.4, 1.1, 0.2, 0.5, 0.1, 1.6, 0.6, 0.9};
        SkyView skyData2 = new SkyView(4, 3, scanned2);

        System.out.println("\n\t// Testing equals");
        System.out.println("Expected output:\t\ttrue");
        System.out.println("Actual output:\t\t\t" + skyData.equals(skyData2));

        System.out.println("\n\t// Testing getAverage");
        System.out.println("Expected output:\t\t0.8");
        System.out.println("Actual output:\t\t\t" + skyData.getAverage(1, 2, 0, 1));
    }
}
