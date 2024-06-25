package models.collections;
import models.Die;

public class Dice {
    private Die[] dice;

    public Dice() {
        dice = new Die[2];
        dice[0] = new Die();
        dice[1] = new Die();
    }

    public void rollAll() {
        for (Die die : dice) {
            die.roll();
        }
    }

    public int getTotal() {
        int total = 0;
        for (Die die : dice) {
            total += die.getFaceValue();
        }
        return total;
    }
}
