public class NPC {
    // instance variables
    private String choice;

    // constructors
    NPC() {
        choice = RPSGame.generateRandomChoice(); // TODO: implement method
    }

    // getters
    public String getChoice() {
        return choice;
    }

    // setters
    public void setChoice(String choice) {
        choice = choice.toLowerCase();
        // TODO: validate choice
        this.choice = choice;
    }

    // methods
    public String toString() {
        return "Opponent chose " + choice;
    }
}
