public class Alligator {
    // instance variables
    private String name;
    private int age;
    private int numberOfTeeth;
    private boolean aggressive;
    private boolean hungry;

    // constructors
    public Alligator(String name, int age, int numberOfTeeth, boolean aggressive, boolean hungry) {
        this.name = name;
        this.age = age;
        this.numberOfTeeth = numberOfTeeth;
        this.aggressive = aggressive;
        this.hungry = hungry;
    }

    public Alligator(String name, int age) {
        this(name, age, 80, false, false);
    }

    public Alligator() {
        this("Joe", 30, 80, false, false);
    }

    // getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getNumberOfTeeth() {
        return numberOfTeeth;
    }

    public boolean isAggressive() {
        return aggressive;
    }

    public boolean isHungry() {
        return hungry;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNumberOfTeeth(int numberOfTeeth) {
        this.numberOfTeeth = numberOfTeeth;
    }

    public void setAggressive(boolean aggressive) {
        this.aggressive = aggressive;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    // methods
    public void feed() {
        if (isHungry()) {
            System.out.println(name + " has been fed!");
        } else {
            System.out.println(name + " is already full!");
        }
    }

    

}
