package ua.com.javarush.akhrianin.natureGame.npc.herbivore;

import ua.com.javarush.akhrianin.natureGame.island.GameProperties;
import ua.com.javarush.akhrianin.natureGame.npc.Animal;

public class Buffalo extends Animal {
    public Buffalo() {
        super(700, 100, 3, true, false, 100, true, GameProperties.BUFFALO_MAX_COUNT, "buffalo");
    }

    @Override
    public String toString() {
        return "Buffalo{}";
    }

}
