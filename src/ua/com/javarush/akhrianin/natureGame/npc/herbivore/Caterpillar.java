package ua.com.javarush.akhrianin.natureGame.npc.herbivore;

import ua.com.javarush.akhrianin.natureGame.island.GameProperties;
import ua.com.javarush.akhrianin.natureGame.npc.Animal;

public class Caterpillar extends Animal {
    public Caterpillar() {
        super(0.01, 0, 0, true, false, 0, true, GameProperties.CATERPILLAR_MAX_COUNT, "caterpillar");
    }

    @Override
    public String toString() {
        return "Caterpillar{}";
    }

}
