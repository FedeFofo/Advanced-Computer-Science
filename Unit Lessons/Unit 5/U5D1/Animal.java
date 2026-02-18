public abstract class Animal {
    
    // common instance variables
    private double age;
    private boolean hungry;
    private String name;
    private double weight;

    // getters
    public double getAge() {
        return age;
    }

    public boolean isHungry() {
        return hungry;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    // setters
    public void setAge(double age) {
        this.age = age;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // commmon abstract methods
    public abstract void feed();
    
    public abstract String toString();

}
