package ua.com.javarush.akhrianin.natureGame.npc.herbivore;

import ua.com.javarush.akhrianin.natureGame.island.GameProperties;
import ua.com.javarush.akhrianin.natureGame.npc.Animal;

public class Goat extends Animal {
    public Goat() {
        super(60, 10, 3, true, false, 10, true, GameProperties.GOAT_MAX_COUNT,"goat");
    }

    @Override
    public String toString() {
        return "Goat{}";
    }

}
