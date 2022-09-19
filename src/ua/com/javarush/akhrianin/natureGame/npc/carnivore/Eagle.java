package ua.com.javarush.akhrianin.natureGame.npc.carnivore;

import ua.com.javarush.akhrianin.natureGame.island.GameProperties;
import ua.com.javarush.akhrianin.natureGame.npc.Animal;

public class Eagle extends Animal {

    public Eagle() {
        super(6, 1, 3, true, false, 1, true, GameProperties.EAGLE_MAX_COUNT, "eagle");
    }

    @Override
    public String toString() {
        return "Eagle{}";
    }

}
