package ua.com.javarush.akhrianin.natureGame.npc.herbivore;

import ua.com.javarush.akhrianin.natureGame.island.GameProperties;
import ua.com.javarush.akhrianin.natureGame.npc.Animal;

public class Duck extends Animal {
    public Duck() {
        super(1, 0.15, 4, true, false, 0.15, true, GameProperties.DUCK_MAX_COUNT, "duck");
    }

    @Override
    public String toString() {
        return "Duck{}";
    }

}
