// a class for all of the battle engine functions
// this class will be used to validate the type, element, weakness, health, and attack of the
// monsters
// there's also methods that will be used to calculate the damage and the health of the monsters
// and apply the type advantage multipliers

import java.util.ArrayList;

public class BattleEngine {

    // checks if the monster stats are valid
    // the total combined stats of the monster should not exceed 250
    public static boolean validateStats(Monster monster) {
        if (monster == null) {
            throw new IllegalArgumentException("Monster cannot be null.");
        }

        if (monster.getHealth() < 0 || monster.getAttack() < 0 || monster.getDefense() < 0 || monster.getSpeed() < 0) {
            return false;
        }
        return (monster.getHealth() + monster.getAttack() + monster.getDefense() + monster.getSpeed()) <= 250;
    }

    // checks if the monster element is valid
    // the only valid types allowed are "Fire", "Water", "Earth", and "Air"
    public static boolean validateElement(Monster monster) {
        if (monster == null) {
            throw new IllegalArgumentException("Monster cannot be null.");
        }

        if (monster.getElement() == ElementType.FIRE) {
            return true;
        } else if (monster.getElement() == ElementType.WATER) {
            return true;
        } else if (monster.getElement() == ElementType.EARTH) {
            return true;
        } else if (monster.getElement() == ElementType.AIR) {
            return true;
        }

        monster.setElement(ElementType.FIRE);
        return false;
    }

    // checks if stats are invalid
    // fixes them so they are valid, however you choose
    public static void correctStats(Monster monster) {
        if (monster == null) {
            throw new IllegalArgumentException("Monster cannot be null.");
        }

        if (monster.getHealth() < 0) {
            monster.setHealth(0);
        }
        if (monster.getAttack() < 0) {
            monster.setAttack(0);
        }
        if (monster.getDefense() < 0) {
            monster.setDefense(0);
        }
        if (monster.getSpeed() < 0) {
            monster.setSpeed(0);
        }

        if (validateStats(monster) == false) {
            monster.setHealth(100);
            monster.setAttack(50);
            monster.setDefense(50);
            monster.setSpeed(50);
        }

        if (validateElement(monster) == false) {
            monster.setElement(ElementType.FIRE);
        }
    }

    // each monster takes turn attacking the other until a monster's hp reaches 0.
    // It returns the
    // winning monster.
    public static Monster startBattle(Monster monster1, Monster monster2) {

        boolean monster1Invalid = !validateStats(monster1) || !validateElement(monster1);
        boolean monster2Invalid = !validateStats(monster2) || !validateElement(monster2);

        if (monster1Invalid && monster2Invalid) {
            return null;
        } else if (monster1Invalid) {
            return monster2;
        } else if (monster2Invalid) {
            return monster1;
        }

        int first = 0;

        if (monster1.getSpeed() > monster2.getSpeed()) {
            first = 1;
        } else {
            first = 2;
        }

        while (monster1.getHealth() > 0 && monster2.getHealth() > 0) {
            if (first == 1) {
                monster1.attack(monster2);
                displayStatus(monster1, monster2);
                monster2.attack(monster1);
                displayStatus(monster2, monster1);
            } else {
                monster2.attack(monster1);
                displayStatus(monster2, monster1);
                monster1.attack(monster2);
                displayStatus(monster1, monster2);
            }
        }

        if (monster1.getHealth() <= 0) {
            System.out.println(monster2.getName() + " wins!");
            monster2.victoryNoise();
            return monster2;
        } else if (monster2.getHealth() <= 0) {
            System.out.println(monster1.getName() + " wins!");
            monster1.victoryNoise();
            return monster1;
        }
        return null;
    }

    public static Monster battleEveryone(ArrayList<Monster> monsters) {
        Utils.checkNull(monsters);

        if (monsters.isEmpty()) {
            throw new IllegalArgumentException("Monsters list cannot be empty.");
        }

        int[] originalHealths = new int[monsters.size()];
        for (int i = 0; i < monsters.size(); i++) {
            originalHealths[i] = monsters.get(i).getHealth();
        }

        Monster winner = monsters.get(0);
        int winnerOriginalHealth = originalHealths[0];

        for (int i = 1; i < monsters.size(); i++) {
            winner.setHealth(winnerOriginalHealth);

            Monster challenger = monsters.get(i);
            winner = startBattle(winner, challenger);

            if (winner == null) {
                return null;
            }

            for (int j = 0; j < monsters.size(); j++) {
                if (winner.equals(monsters.get(j))) {
                    winnerOriginalHealth = originalHealths[j];
                    break;
                }
            }
        }

        return winner;
    }

    // method prints out the current health of each monster.
    public static void displayStatus(Monster monster, Monster opponent) {
        if (monster == null || opponent == null) {
            throw new IllegalArgumentException("Monster cannot be null.");
        }

        System.out.println(monster.getName() + ": " + monster.getHealth() + " health vs " + opponent.getName() + ": "
                + opponent.getHealth() + " health");
    }

}
