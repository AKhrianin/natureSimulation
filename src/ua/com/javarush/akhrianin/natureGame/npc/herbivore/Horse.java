package ua.com.javarush.akhrianin.natureGame.npc.herbivore;

import ua.com.javarush.akhrianin.natureGame.island.GameProperties;
import ua.com.javarush.akhrianin.natureGame.npc.Animal;

public class Horse extends Animal {
    public Horse() {
        super(400, 60, 4, true, false, 60, true, GameProperties.HORSE_MAX_COUNT,"horse");
    }

    @Override
    public String toString() {
        return "Horse{}";
    }

}
