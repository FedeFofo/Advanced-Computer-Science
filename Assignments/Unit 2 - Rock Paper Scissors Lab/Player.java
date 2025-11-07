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
        // TODO: validate choice
        this.choice = choice;
    }

    // methods
    public String toString() {
        return name + " chose " + choice + ".";
    }
}
