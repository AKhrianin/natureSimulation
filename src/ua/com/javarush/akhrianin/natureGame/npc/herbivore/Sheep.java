package ua.com.javarush.akhrianin.natureGame.npc.herbivore;

import ua.com.javarush.akhrianin.natureGame.island.GameProperties;
import ua.com.javarush.akhrianin.natureGame.npc.Animal;

public class Sheep extends Animal {
    public Sheep() {
        super(70, 15, 3, true, false, 15, true, GameProperties.SHEEP_MAX_COUNT, "sheep");
    }

    @Override
    public String toString() {
        return "Sheep{}";
    }

}
