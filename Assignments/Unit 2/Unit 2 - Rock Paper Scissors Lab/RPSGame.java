import java.util.Scanner;

public class RPSGame {
    // instance variables
    private Player player;
    private NPC opponent;

    // constructors
    RPSGame(Player player, NPC opponent) {
        this.player = player;
        this.opponent = opponent;
    }

    // methods
    public void start() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your first name?");
        String playerName = keyboard.next();
        String playerChoice = null;
        int i = 0;
        while (validateChoice(playerChoice) != true) {
            System.out.println("What is your choice? (rock/paper/scissors)");
            playerChoice = keyboard.next();
            i++;
            if (validateChoice(playerChoice) == true) {
                setPlayerValues(playerName, playerChoice);
            } else if (i >= 3) {
                System.out.println("Max number of invalid choices submitted. Assigning a random choice...");
                playerChoice = generateRandomChoice();
                setPlayerValues(playerName, playerChoice);
            }
        }
    }

    public void setPlayerValues(String name, String choice) {
        this.player.setName(name);
        this.player.setChoice(choice);
    }

    public boolean didPlayerWin() {
        if (player.getChoice().equals(opponent.getChoice())) {
            return false;
        } else if ((player.getChoice().equals("rock") && opponent.getChoice().equals("paper")) 
            || (player.getChoice().equals("paper") && opponent.getChoice().equals("scissors")) 
            || (player.getChoice().equals("scissors") && opponent.getChoice().equals("rock"))) {
            return false;
        } else {
            return true;
        }
    }

    public String toString() {
        if (didPlayerWin() == true) {
            return player.getName() + " won!\nCongratulations!";
        } else {
            return "Opponent won!\nBetter luck next time!";
        }
    }

    public String displayResults() {
        return "== GAME RESULTS ==\n" + player.getName() + " chose " + player.getChoice() + ".\nOpponent chose " + opponent.getChoice() + ".\n" + toString();
    }

    public static boolean validateChoice(String choice) {
        return (choice != null) && (choice.equals("rock") || choice.equals("paper") || choice.equals("scissors"));
    } 

    public static String generateRandomChoice() {
        int choiceNumber = (int)(Math.random() * 3);
        if (choiceNumber == 0) {
            return "rock";
        } else if (choiceNumber == 1) {
            return "paper";
        } else {
            return "scissors";
        }
    }
}
