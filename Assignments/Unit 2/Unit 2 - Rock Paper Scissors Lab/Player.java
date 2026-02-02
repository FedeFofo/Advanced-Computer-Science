public class Player {
    // instance variables
    private String name;
    private String choice;

    // constructors
    Player() {
        name = null;
        choice = null;
    }

    // getters
    public String getName() {
        return name;
    }

    public String getChoice() {
        return choice;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setChoice(String choice) {
        choice = choice.toLowerCase();
        if (choice.equals("rock") || choice.equals("paper") || choice.equals("scissors")) {
            this.choice = choice;
        } else {
            this.choice = RPSGame.generateRandomChoice();
        }
    }

    // methods
    public String toString() {
        return name + " chose " + choice + ".";
    }
}
