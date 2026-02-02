public class Robot {
    // instance variables
    private int[] hallway;
    private int position; // the robot's current position
    private boolean isFacingRight; // true if the robot is facing right

    // constructors
    public Robot(int[] hallwayToClean, int startingPosition) {
        this.hallway = validateHallway(hallwayToClean);
        this.position = validatePosition(startingPosition, hallwayToClean);
        this.isFacingRight = true;
    }

    // getters
    public int[] getHallway() {
        return hallway;
    }

    public int getPosition() {
        return position;
    }

    public boolean isFacingRight() {
        return isFacingRight;
    }

    // setters
    public void setHallway(int[] hallway) {
        this.hallway = validateHallway(hallway);
    }

    public void setPosition(int position) {
        this.position = validatePosition(position, hallway);
    }

    public void setFacingRight(boolean isFacingRight) {
        this.isFacingRight = isFacingRight;
    }

    // methods
    public void displayState() {
        System.out.println("Current state:");
        String hallwayString = "";
        for (int i = 0; i < hallway.length; i++) {
            hallwayString += hallway[i] + " ";
        }
        System.out.println(hallwayString);
        String robot = "";
        if (isFacingRight) {
            robot = ">";
        } else {
            robot = "<";
        }
        String robotPosition = "";
        for (int i = 0; i <= position; i++) {
            robotPosition += "  ";
        }
        System.out.println(robotPosition + robot);
    }

    public boolean isRobotBlockedByWall() {
        return (isFacingRight && position == hallway.length - 1) || (!isFacingRight && position == 0);
    }

    public void move() {
        if (hallway[position] > 1) {
            hallway[position] -= 1;
        } else if (hallway[position] == 1 && !isRobotBlockedByWall()) {
            hallway[position] -= 1;
            if (isFacingRight) {
                position += 1;
            } else {
                position -= 1;
            }
        } else if (hallway[position] == 1 && isRobotBlockedByWall()) {
            hallway[position] -= 1;
            setFacingRight(!isFacingRight);
        } else {
            if (isRobotBlockedByWall()) {
                setFacingRight(!isFacingRight);
            } else {
                if (isFacingRight) {
                    position += 1;
                } else {
                    position -= 1;
                }
            }
        }
    }

    public boolean hallIsClear() {
        for (int i = 0; i < hallway.length; i++) {
            if (hallway[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public int clearHall() {
        displayState();
        int count = 0;
        while (!hallIsClear()) {
            move();
            count += 1;
        }
        return count;
    }

    public static int[] validateHallway(int[] hallway) {
        for (int i = 0; i < hallway.length; i++) {
            if (hallway[i] < 0) {
                hallway[i] = 0;
            }
        }
        return hallway;
    }

    public static int validatePosition(int position, int[] hallway) {
        if (position < 0) {
            return 0;
        } else if (position >= hallway.length) {
            return hallway.length - 1;
        }
        return position;
    }
}
