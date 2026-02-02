public class Student {
    // instance variables
    private String name;
    private String id;
    private int grade;

    // constructors
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.id = generateId();
    }

    public Student(String name) {
        this.name = name;
        this.grade = 10;
        this.id = generateId();
    }

    // getters
    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public String getId() {
        return id;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setId(String id) {
        this.id = id;
    }

    // methods
    public String toString() {
        return name + " is a " + grade + "th grade student. Their id number is " + id + ".";
    }
    
    public boolean equals(Student other) {
        return name.equals(other.name) && grade == other.grade && id.equals(other.id);
    }

    public String generateId() {
        int digitOne = (int) (Math.random() * 8) + 1;
        int digitTwo = (int) (Math.random() * 8) + 1;
        int digitThree = (int) (Math.random() * 8) + 1;
        int digitFour = (int) (Math.random() * 10);
        int digitFive = (int) (Math.random() * 10);
        int digitSix = (int) (Math.random() * 10);
        int digitSeven = (int) (Math.random() * 10);
        String idNumber = "" + digitOne + digitTwo + digitThree 
            + "-" + digitFour + digitFive + digitSix + digitSeven;
        return idNumber;
    }
}