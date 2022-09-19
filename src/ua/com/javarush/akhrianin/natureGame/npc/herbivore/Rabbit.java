package ua.com.javarush.akhrianin.natureGame.npc.herbivore;

import ua.com.javarush.akhrianin.natureGame.island.GameProperties;
import ua.com.javarush.akhrianin.natureGame.npc.Animal;

public class Rabbit extends Animal {
    public Rabbit() {
        super(2, 0.45, 2, true, false, 0.45, true, GameProperties.RABBIT_MAX_COUNT, "rabbit");
    }

    @Override
    public String toString() {
        return "Rabbit{}";
    }

}
