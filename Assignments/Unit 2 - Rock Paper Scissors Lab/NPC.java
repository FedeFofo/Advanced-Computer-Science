public class NPC {
    // instance variables
    private String choice;

    // constructors
    NPC() {
        choice = RPSGame.generateRandomChoice();
    }

    // getters
    public String getChoice() {
        return choice;
    }

    // setters
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
        return "Opponent chose " + choice + ".";
    }
}
