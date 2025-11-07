public class AutoUtils {
    // methods
    public static int validateCleanlinessLevel(int cleanlinessLevel) {
        if (cleanlinessLevel < 0) {
            return 0;
        } else if (cleanlinessLevel > 10) {
            return 10;
        } else {
            return cleanlinessLevel;
        }
    }

    public static String generateUsername(String name) {
        name = fixName(name);
        int space = name.indexOf(" ");
        String firstName = name.substring(0, space);
        firstName = firstName.toLowerCase();
        String lastName = "";
        lastName = name.substring(space + 1, name.length());
        lastName = lastName.toLowerCase();
        int random = (int) (Math.random() * 100 + 1950);
        return "@" + firstName + "_" + lastName + "_" + random;
    }

    public static void cleanCar(Car car) {
        car.setCleanlinessLevel(car.getCleanlinessLevel() + 2);
    }

    public static String fixName(String name) {
        String firstName = "";
        String lastName = "";
        // for (int i = 0; i < name.length(); i++) {
        //     if (name.charAt(0) == ' ') {
        //         name = name.substring(1, name.length());
        //     } else {
        //         i = name.length();
        //     }
        // }
        name = name.trim();
        int space = name.indexOf(' ');
        firstName = name.substring(0, space);
        name = name.substring(space, name.length());
        // for (int i = 0; i < name.length(); i++) {
        //     if (name.charAt(0) == ' ') {
        //         name = name.substring(1, name.length());
        //     } else {
        //         i = name.length();
        //     }
        // }
        name = name.trim();
        lastName = name;
        return firstName + " " + lastName;
    }


}
