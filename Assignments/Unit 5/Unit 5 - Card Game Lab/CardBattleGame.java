import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
 * CardBattleGame — the main game loop (students implement).
 *
 * USEFUL METHODS YOU'LL NEED:
 *
 *   Card methods:
 *     card.applySelfOnPlay()              -> applies shield/bonusDamage from the card's ability
 *     card.getAbility().pingDamageOnPlay() -> how much ping damage this ability deals
 *     card.getAbility().cyclesOnPlay()     -> whether the card cycles to the bottom of the deck
 *     card.computeDamageAgainst(defender)  -> calculates damage with type multipliers
 *     card.takeDamage(amount)             -> reduces shield first, then health
 *     card.isDefeated()                   -> true if health <= 0
 *     card.getType()                      -> returns CardType (uses polymorphism!)
 *
 *   PlayerState methods:
 *     state.getDeck()                     -> returns the player's ArrayList<Card>
 *     state.getActive() / setActive(card) -> the currently active card (or null)
 *     state.hasAnythingLeft()             -> true if active card or cards remain in deck
 *     state.getPendingDamage() / setPendingDamage(int)
 *                                         -> stored Ripple damage for next drawn card
 */
public class CardBattleGame {
    // Must print:
    // == CARD CLASH ==
    // Starting: Player/Bot
    // Winner: Player/Bot
    public static String playGame(ArrayList<Card> playerDeck, ArrayList<Card> botDeck, Random rng) {
        System.out.println("== CARD CLASH ==");

        PlayerState player = new PlayerState("Player", playerDeck);
        PlayerState bot = new PlayerState("Bot", botDeck);

        int coinFlip = rng.nextInt(2);

        PlayerState first;
        PlayerState second;

        if (coinFlip % 2 == 0) {
            first = player;
            second = bot;
        } else {
            first = bot;
            second = player;
        }

        System.out.println("Starting: " + first.getName());

        while (player.hasAnythingLeft() && bot.hasAnythingLeft()) {
            drawAndPlayIfNeeded(first, second);
            attackOnce(first, second);

            if (!second.hasAnythingLeft()) {
                break;
            } else if (!first.hasAnythingLeft()) {
                break;
            }

            drawAndPlayIfNeeded(second, first);
            attackOnce(second, first);

            if (!first.hasAnythingLeft()) {
                break;
            } else if (!second.hasAnythingLeft()) {
                break;
            }
        }

        PlayerState winner;

        if (first.hasAnythingLeft()) {
            winner = first;
        } else {
            winner = second;
        }

        System.out.println("Winner: " + winner.getName());

        return winner.getName();
    }

    // ----- helpers you may implement or use -----

    // Draw top card if no active, apply on-play effects via card.applySelfOnPlay()
    public static void drawAndPlayIfNeeded(PlayerState self, PlayerState other) {
        if (self.getActive() != null || self.getDeck().isEmpty()) {
            return;
        }

        Card drawn = self.getDeck().remove(0);
        self.setActive(drawn);

        drawn.applySelfOnPlay();

        if (self.getPendingDamage() > 0) {
            drawn.takeDamage(self.getPendingDamage());
            self.setPendingDamage(0);

            if (drawn.isDefeated()) {
                self.setActive(null);
                return;
            }
        }

        int ping = drawn.getAbility().pingDamageOnPlay();
        if (ping > 0) {
            if (other.getActive() != null) {
                other.getActive().takeDamage(ping);

                if (other.getActive().isDefeated()) {
                    other.setActive(null);
                }
            } else {
                other.setPendingDamage(other.getPendingDamage() + ping);
            }
        }

        if (drawn.getAbility().cyclesOnPlay()) {
            self.setActive(null);
            self.getDeck().add(drawn);
        }
    }

    // One attack (self active attacks other active if both exist)
    public static void attackOnce(PlayerState attacker, PlayerState defender) {
        if (attacker.getActive() == null || defender.getActive() == null) {
            return;
        }

        Card attackCard = attacker.getActive();
        Card defendCard = defender.getActive();

        int damage = attackCard.computeDamageAgainst(defendCard);
        defendCard.takeDamage(damage);

        if (defendCard.isDefeated()) {
            defender.setActive(null);
        }
    }

    // Optional local run (not graded)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Card> player = DeckValidator.buildDefaultDeck();
        ArrayList<Card> bot = DeckBuilderBot.buildBotDeck();

        if (!DeckValidator.isValidDeck(player)) {
            System.out.println("Player deck invalid!");
            return;
        }

        playGame(player, bot, new Random());
    }
}
