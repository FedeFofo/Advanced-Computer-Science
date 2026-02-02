public class StudentTester {
    public static void main(String[] args) {
        Student jane = new Student("Jane", 11); // created using two-parameter constructor
        Student john = new Student("John", 11); // created using two-parameter constructor
        Student tony = new Student("Tony"); // created using one-parameter constructor
        Student anna = new Student("Anna"); // created using one-parameter constructor

        System.out.println(jane.toString()); // prints jane's details
        System.out.println(john.toString()); // prints john's details
        System.out.println(tony.toString()); // prints tony's details
        System.out.println(anna.toString()); // prints anna's details

        jane.setGrade(12); // jane matriculates to 12th grade
        john.setGrade(12); // john matriculates to 12th grade
        tony.setGrade(11); // tony matriculates to 11th grade
        anna.setGrade(11); // anna matriculates to 11th grade

        System.out.println(jane.toString()); // prints jane's updated details
        System.out.println(john.toString()); // prints john's updated details
        System.out.println(tony.toString()); // prints tony's updated details
        System.out.println(anna.toString()); // prints anna's updated details

        System.out.println("Are Jane and Tony equal? " + jane.equals(tony)); // outputs false
        System.out.println("Are John and Anna equal? " + john.equals(anna)); // outputs false

    }
}
