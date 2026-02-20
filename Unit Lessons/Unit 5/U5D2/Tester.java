import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        Dog dog = new Dog();

        System.out.println(dog.toString());

        Rottweiler rottweiler = new Rottweiler();
        System.out.println(rottweiler.toString());

        Havanese havanese = new Havanese();

        GoldenRetriever goldenRetriever = new GoldenRetriever();

        ArrayList<Dog> list = new ArrayList<>();
        list.add(rottweiler);
        list.add(havanese);
        list.add(goldenRetriever);
        list.get(1).havaneseThings();
        }
}
