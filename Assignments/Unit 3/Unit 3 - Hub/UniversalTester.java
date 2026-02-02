public class UniversalTester {
    public static void main(String[] args) {
        testAssignmentExceptions();

        testStudentExceptions();

        testHubExceptions();
    }

    public static void testAssignmentExceptions() {
        System.out.println("-------------------------------");
        System.out.println(" Testing Assignment Exceptions ");
        System.out.println("-------------------------------\n");

        // Test Case 1: Null Title
        System.out.println("\t// Test Case 1: Null Title");
        try {
            Assignment a = new Assignment(null, "hello");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the title was null, as intended.\n");
        }

        // Test Case 2: Empty Title
        System.out.println("\t// Test Case 2: Empty Title");
        try {
            Assignment a = new Assignment("", "hello");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the title was empty, as intended.\n");
        }

        // Test Case 3: Title Too Long
        System.out.println("\t// Test Case 3: Title Too Long");
        try {
            String title =
                    "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
            Assignment a = new Assignment(title, "hello");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the title was too long, as intended.\n");
        }

        // Test Case 4: Null Description
        System.out.println("\t// Test Case 4: Null Description");
        try {
            Assignment a = new Assignment("Hello", null);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the description was null, as intended.\n");
        }

        // Test Case 5: Empty Description
        System.out.println("\t// Test Case 5: Empty Description");
        try {
            Assignment a = new Assignment("Hello", "");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the description was empty, as intended.\n");
        }

        // Test Case 6: Description Too Long
        System.out.println("\t// Test Case 6: Description Too Long");
        try {
            String description = "a".repeat(10000);
            Assignment a = new Assignment("Hello", description);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the description was too long, as intended.\n");
        }
    }

    public static void testStudentExceptions() {
        System.out.println("----------------------------");
        System.out.println(" Testing Student Exceptions ");
        System.out.println("----------------------------\n");

        // Test Case 1: Null Name
        System.out.println("\t// Test Case 1: Null Name");
        try {
            Student s = new Student(null, "password123", "test@email.com");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the name was null, as intended.\n");
        }

        // Test Case 2: Empty Name
        System.out.println("\t// Test Case 2: Empty Name");
        try {
            Student s = new Student("", "password123", "test@email.com");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the name was empty, as intended.\n");
        }

        // Test Case 3: Name Contains '@'
        System.out.println("\t// Test Case 3: Name Contains '@'");
        try {
            Student s = new Student("user@name", "password123", "test@email.com");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the name contained '@', as intended.\n");
        }

        // Test Case 4: Null Password
        System.out.println("\t// Test Case 4: Null Password");
        try {
            Student s = new Student("ValidName", null, "test@email.com");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the password was null, as intended.\n");
        }

        // Test Case 5: Empty Password
        System.out.println("\t// Test Case 5: Empty Password");
        try {
            Student s = new Student("ValidName", "", "test@email.com");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the password was empty, as intended.\n");
        }

        // Test Case 6: Null Email
        System.out.println("\t// Test Case 6: Null Email");
        try {
            Student s = new Student("ValidName", "password123", null);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the email was null, as intended\n");
        }

        // Test Case 7: Invalid Email (No '@')
        System.out.println("\t// Test Case 7: Invalid Email (No '@')");
        try {
            Student s = new Student("ValidName", "password123", "invalidemail.com");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the email was invalid (no '@'), as intended.\n");
        }

        // Test Case 8: Invalid Email (No '.')
        System.out.println("\t// Test Case 8: Invalid Email (No '.')");
        try {
            Student s = new Student("ValidName", "password123", "invalid@emailcom");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the email was invalid (no '.'), as intended.\n");
        }

        // Test Case 9: Duplicate Name
        System.out.println("\t// Test Case 9: Duplicate Name");
        try {
            Student s1 = new Student("Alice", "password123", "alice@email.com");
            Student s2 = new Student("Alice", "password456", "alice2@email.com");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the name was duplicated, as intended.\n");
        }

        // Reset for next tests
        Student.NAME_COUNT = 0;
        Student.NAMES_IN_USE = new String[10];

        // Test Case 10: changeName With Null
        System.out.println("\t// Test Case 10: changeName With Null");
        try {
            Student s = new Student("Bob", "password123", "bob@email.com");
            s.changeName(null);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the name was changed to null, as intended.\n");
        }

        // Reset for next test
        Student.NAME_COUNT = 0;
        Student.NAMES_IN_USE = new String[10];

        // Test Case 11: changeName With '@'
        System.out.println("\t// Test Case 11: changeName With '@");
        try {
            Student s = new Student("Charlie", "password123", "charlie@email.com");
            s.changeName("Charlie@New");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the name was changed to something with '@', as intended.\n");
        }

        // Reset for next test
        Student.NAME_COUNT = 0;
        Student.NAMES_IN_USE = new String[10];

        // Test Case 12: changeName to Existing Name
        System.out.println("\t// Test Case 12: changeName to Existing Name");
        try {
            Student s1 = new Student("Dave", "password123", "dave@email.com");
            Student s2 = new Student("Eve", "password456", "eve@email.com");
            s2.changeName("Dave");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the name was changed to an existing name, as intended.\n");
        }

        // Reset for next test
        Student.NAME_COUNT = 0;
        Student.NAMES_IN_USE = new String[10];

        // Test Case 13: Submit Assignment With Null Title
        System.out.println("\t// Test Case 13: Submit Assignment With Null Title");
        try {
            Student s = new Student("Frank", "password123", "frank@email.com");
            s.submitAssignment(null, "Valid description");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the assignment was submitted with a null title, as intended.\n");
        }

        // Reset for next test
        Student.NAME_COUNT = 0;
        Student.NAMES_IN_USE = new String[10];

        // Test Case 14: Submit Assignment With Empty Description
        System.out.println("\t// Test Case 14: Submit Assignment With Empty Description");
        try {
            Student s = new Student("Grace", "password123", "grace@email.com");
            s.submitAssignment("Valid Title", "");
        } catch (IllegalArgumentException e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the assignment was submitted with an empty description, as intended.\n");
        }

        // Reset for next test
        Student.NAME_COUNT = 0;
        Student.NAMES_IN_USE = new String[10];

        // Test Case 15: Assignment Limit Reached
        System.out.println("\t// Test Case 15: Assignment Limit Reached");
        try {
            Student s = new Student("Henry", "password123", "henry@email.com");
            // Submit 5 assignments (the limit)
            for (int i = 0; i < 5; i++) {
                s.submitAssignment("Assignment " + i, "Description " + i);
            }
            // Try to submit one more
            s.submitAssignment("Assignment 6", "This should fail");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the assignment limit was reached, as intended.\n");
        }

        // Reset for next test
        Student.NAME_COUNT = 0;
        Student.NAMES_IN_USE = new String[10];
    }

    public static void testHubExceptions() {
        System.out.println("------------------------");
        System.out.println(" Testing Hub Exceptions ");
        System.out.println("------------------------\n");

        Hub hub = new Hub();

        // Test Case 1: registerStudent With Null Name
        System.out.println("\t// Test Case 1: registerStudent With Null Name");
        try {
            hub.registerStudent(null, "password123", "test@email.com");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the name was null, as intended.\n");
        }

        // Test Case 2: registerStudent With Empty Name
        System.out.println("\t// Test Case 2: registerStudent With Empty Name");
        try {
            hub.registerStudent("", "password123", "test@email.com");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the name was empty, as intended.\n");
        }

        // Test Case 3: registerStudent With Null Password
        System.out.println("\t// Test Case 3: registerStudent With Null Password");
        try {
            hub.registerStudent("ValidName", null, "test@email.com");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the password was null, as intended.\n");
        }

        // Test Case 4: registerStudent With Empty Password
        System.out.println("\t// Test Case 4: registerStudent With Empty Password");
        try {
            hub.registerStudent("ValidName", "", "test@email.com");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the password was empty, as intended.\n");
        }

        // Test Case 5: registerStudent With Null Email
        System.out.println("\t// Test Case 5: registerStudent With Null Email");
        try {
            hub.registerStudent("ValidName", "password123", null);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the email was null, as intended.\n");
        }

        // Test Case 6: registerStudent With Invalid Email
        System.out.println("\t// Test Case 6: registerStudent With Invalid Email");
        try {
            hub.registerStudent("ValidName", "password123", "invalidemail");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the email was invalid, as intended.\n");
        }

        // Test Case 7: registerStudent With '@' in Name
        System.out.println("\t// Test Case 7: registerStudent With '@' in Name");
        try {
            hub.registerStudent("Invalid@Name", "password123", "test@email.com");
        } catch (Exception e) {
            System.out.println(e);
            System.out
                    .println("The method threw an exception when the name had '@', as intended.\n");
        }

        // Test Case 8: registerStudent With Duplicate Name
        System.out.println("\t// Test Case 8: registerStudent With Duplicate Name");
        try {
            hub.registerStudent("Alice", "password123", "alice@email.com");
            hub.registerStudent("Alice", "password456", "alice2@email.com");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the name was duplicated, as intended.\n");
        }

        // Create new hub for login tests
        Student.NAME_COUNT = 0;
        Student.NAMES_IN_USE = new String[10];
        hub = new Hub();

        // Test Case 9: loginStudent With Null Username
        System.out.println("\t// Test Case 9: loginStudent With Null Username");
        try {
            hub.loginStudent(null, "password123");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the username was null, as intended.\n");
        }

        // Test Case 10: loginStudent With Empty Username
        System.out.println("\t// Test Case 10: loginStudent With Empty Username");
        try {
            hub.loginStudent("", "password123");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the username was empty, as intended.\n");
        }

        // Test Case 11: loginStudent With Null Password
        System.out.println("\t// Test Case 11: loginStudent With Null Password");
        try {
            hub.loginStudent("ValidUsername", null);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the password was null, as intended.\n");
        }

        // Test Case 12: loginStudent With Non-Existent Student
        System.out.println("\t// Test Case 12: loginStudent With Non-Existent Student");
        try {
            hub.loginStudent("NonExistent", "password123");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the student was non-existent, as intended.\n");
        }

        // Test Case 13: loginStudent With Wrong Password
        System.out.println("\t// Test Case 13: loginStudent With Wrong Password");
        try {
            hub.registerStudent("Bob", "correctPassword", "bob@email.com");
            hub.loginStudent("Bob", "wrongPassword");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the password was wrong, as intended.\n");
        }
    }
}

