package ua.com.javarush.akhrianin.natureGame.npc.carnivore;

import ua.com.javarush.akhrianin.natureGame.island.GameProperties;
import ua.com.javarush.akhrianin.natureGame.npc.Animal;

public class Bear extends Animal {

    public Bear() {
        super(500, 80, 2, true, false, 80, true, GameProperties.BEAR_MAX_COUNT, "bear");
    }

    @Override
    public String toString() {
        return "\uD83D\uDC3B";
    }
}
