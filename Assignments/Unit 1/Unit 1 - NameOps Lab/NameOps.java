public class NameOps {
    public static String printMethodCall(String method, String name) {
        return method + "(\"" + name + "\"): ";
    }

    public static String whoIsAwesome(String name) {
        return name + " is awesome!";
    }

    public static int indexOfFirstSpace(String name) {
        return name.indexOf(" ");
    }

    public static int indexOfSecondSpace(String name) {
        String shortenedName = name.substring(indexOfFirstSpace(name) + 1);
        if (shortenedName.indexOf(" ") == -1) {
            return -1;
        } else {
            return shortenedName.indexOf(" ") + indexOfFirstSpace(name) + 1;
        }
    }

    public static String findFirstName(String name) {
        if (indexOfFirstSpace(name) == -1) {
            return name;
        } else {
            return name.substring(0, indexOfFirstSpace(name));
        }
    }
    
    public static String findLastName(String name) {
        if (indexOfSecondSpace(name) == -1) {
            if (indexOfFirstSpace(name) == -1) {
                return "";
            } else {
                return name.substring(indexOfFirstSpace(name) + 1);
            }
        } else {
            return name.substring(indexOfSecondSpace(name) + 1);
        }
    }

    public static String findMiddleName(String name) {
        if (indexOfSecondSpace(name) == -1) {
            return "";
        } else {
            return name.substring(indexOfFirstSpace(name) + 1, indexOfSecondSpace(name));
        }
    }

    public static String generateLastFirstMidInitial(String name) {
        if (findMiddleName(name).equals("")) {
            if (findLastName(name).equals("")) {
                return findLastName(name);
            }
            return findLastName(name) + ", " + findFirstName(name);
        }
        return findLastName(name) + ", " + findFirstName(name) + " " + findMiddleName(name).charAt(0) + ".";
    }
}
