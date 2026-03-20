import java.util.ArrayList;
import java.util.Scanner;

/*
 * DeckValidator — deck validation and building (students implement).
 *
 * USEFUL METHODS FOR YOUR IMPLEMENTATIONS:
 *
 *   card.hasAbility()           -> true if the card has a real ability (not NONE)
 *   card.getAbility()           -> returns the Ability interface reference
 *   card.getAbility().getId()   -> returns "BASTION", "RIPPLE", "CLEAVE", or "NONE"
 *   card.getType()              -> returns the CardType enum (GRANITE, PARCHMENT, BLADE)
 *   card.getStrength()          -> returns the card's strength stat
 *   card.getHealth()            -> returns the card's health stat
 *
 *   CardType.fromText("granite")       -> returns CardType.GRANITE
 *   AbilityLibrary.fromText("bastion") -> returns the BastionAbility instance
 *
 *   createCard("name", type, str, hp, ability) -> creates the right subclass
 *       (Granite, Parchment, or Blade) based on the CardType
 */
public class DeckValidator {

    // ----------------------------
    // CHECKERS (students implement)
    // ----------------------------

    // Rule: no more than 3 total ability cards in the deck.
    // HINT: loop through the deck, use card.hasAbility() to count how many
    // cards have a real ability, and return true if the count is <= 3.
    public static boolean checkNoMoreThanThreeAbilityCards(ArrayList<Card> deck) {
        int abilities = 0;
        for (Card card : deck) {
            if (card.hasAbility()) {
                abilities++;
            }
        }
        return abilities <= 3;
    }

    // Rule: no duplicate abilities in the deck (max one BASTION, one RIPPLE, one
    // CLEAVE).
    // HINT: loop through the deck, use card.getAbility().getId() to get
    // each ability's name, and check for duplicates.
    public static boolean checkNoDuplicateAbilities(ArrayList<Card> deck) {
        int bastion = 0;
        int ripple = 0;
        int cleave = 0;
        for (Card card : deck) {
            if (card.getAbility().getId().equals("BASTION")) {
                bastion++;
            } else if (card.getAbility().getId().equals("RIPPLE")) {
                ripple++;
            } else if (card.getAbility().getId().equals("CLEAVE")) {
                cleave++;
            }
        }
        return bastion <= 1 && ripple <= 1 && cleave <= 1;
    }

    // Rule: strength and health must be 1..5, and strength + health <= 6.
    // HINT: loop through the deck, use card.getStrength() and card.getHealth().
    public static boolean checkStatsInRange(ArrayList<Card> deck) {
        for (Card card : deck) {
            int strength = card.getStrength();
            int health = card.getHealth();
            if (strength < 1 || strength > 5) {
                return false;
            } else if (health < 1 || health > 5) {
                return false;
            }
            if (strength + health > 6) {
                return false;
            }
        }
        return true;
    }

    // Returns true only if the deck is fully valid:
    // - deck has exactly 5 cards
    // - AND all checks above return true
    public static boolean isValidDeck(ArrayList<Card> deck) {
        return deck.size() == 5 && checkNoMoreThanThreeAbilityCards(deck) && checkNoDuplicateAbilities(deck) && checkStatsInRange(deck);
    }

    // ----------------------------
    // DECK BUILDERS (students implement)
    // ----------------------------

    // Must create 5 cards, all 3/3, no abilities (use AbilityLibrary.NONE).
    // Use the Granite, Parchment, and Blade subclasses directly,
    // or use the createCard() helper below.
    public static ArrayList<Card> buildDefaultDeck() {
        ArrayList<Card> deck = new ArrayList<Card>();
        deck.add(createCard("Boulder", CardType.fromText("g"), 3, 3, AbilityLibrary.NONE));
        deck.add(createCard("Scroll", CardType.fromText("p"), 3, 3, AbilityLibrary.NONE));
        deck.add(createCard("Knife", CardType.fromText("b"), 3, 3, AbilityLibrary.NONE));
        deck.add(createCard("Stalactite", CardType.fromText("g"), 3, 3, AbilityLibrary.NONE));
        deck.add(createCard("Papyrus", CardType.fromText("p"), 3, 3, AbilityLibrary.NONE));
        return deck;
    }

    // Prompts the user 5 times using Scanner and validates inputs.
    // Required prompt order per card:
    // 1. name (String)
    // 2. type (granite / parchment / blade) -> use CardType.fromText()
    // 3. strength (int)
    // 4. health (int)
    // 5. ability (bastion / ripple / cleave / none) -> use
    // AbilityLibrary.fromText()
    //
    // Then use createCard() to build the right subclass from the parsed type.
    public static ArrayList<Card> buildUserDeck(Scanner sc) {
        ArrayList<Card> deck = new ArrayList<Card>();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the deck builder!");
        for (int i = 0; i < 5; i++) {
            System.out.println("Please choose a name for card " + (i + 1) + ": ");
            String name = keyboard.next();

            System.out.println("Please choose a card type ([g]ranite/[p]archment/[b]lade): ");
            String type = keyboard.next();

            System.out.println("Note: the health + strength stats must not exceed a sum of 6");

            System.out.println("Please choose a strength level (1-5): ");
            int strength = keyboard.nextInt();

            System.out.println("Please choose a health level (1-5): ");
            int health = keyboard.nextInt();

            if ((strength + health) > 6) {
                boolean valid = false;
                while (!valid) {
                    System.out.println("Invalid strength/health levels. Please try again, keeping in mind that the sum of these values must not exceed 6.");
                    System.out.println("Please choose a strength level (1-5): ");
                    strength = keyboard.nextInt();
                    System.out.println("Please choose a health level (1-5): ");
                    health = keyboard.nextInt();
                    if ((strength + health) <= 6) {
                        valid = true;
                    }
                }
            }

            System.out.println("Please choose an ability ([b]astion/[r]ipple/[c]leave/leave blank for none)");
            String ability = keyboard.next();

            deck.add(createCard(name, CardType.fromText(type), strength, health, AbilityLibrary.fromText(ability)));
        }
        keyboard.close();

        return deck;
    }

    // ----------------------------
    // Helper: create a Card subclass from a CardType
    // ----------------------------

    // This is a FACTORY METHOD — it decides which subclass to instantiate
    // based on the CardType enum value. The caller doesn't need to know
    // about the specific subclasses; they just pass in the type and get
    // back a Card reference.
    public static Card createCard(String name, CardType type, int strength, int health, Ability ability) {
        switch (type) {
            case GRANITE:
                return new CardGranite(name, strength, health, ability);
            case PARCHMENT:
                return new CardParchment(name, strength, health, ability);
            case BLADE:
                return new CardBlade(name, strength, health, ability);
            default:
                return null;
        }
    }

    // ----------------------------
    // Optional helpers you may use
    // ----------------------------

    public static boolean isYes(String s) {
        if (s == null)
            return false;
        s = s.trim().toLowerCase();
        return s.equals("y") || s.equals("yes");
    }
}
