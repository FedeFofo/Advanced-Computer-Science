public class RPSGameTester {
    public static void main(String[] args) {
        int oppWins = 0;
        int playerWins = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("\nRound " + (i + 1));
            Player player = new Player();
            NPC npc = new NPC();
            RPSGame game = new RPSGame(player, npc);
            game.start();
            System.out.println("\n" + game.displayResults());
            if (game.didPlayerWin()) {
                playerWins++;
            } else {
                oppWins++;
            }
        }
        System.out.println("\n== FINAL RESULTS ==\nPlayer's wins:\t\t" + playerWins + "\nOpponent's wins:\t" + oppWins);
        if (oppWins > playerWins) {
            System.out.println("\nso... OPPONENT WINS\nBetter luck next time!\n");
        } else {
            System.out.println("\nso... PLAYER WINS\nCongratulations!\n");
        }

    }
}
