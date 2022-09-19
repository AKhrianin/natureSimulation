package ua.com.javarush.akhrianin.natureGame.npc.carnivore;

import ua.com.javarush.akhrianin.natureGame.island.GameProperties;
import ua.com.javarush.akhrianin.natureGame.npc.Animal;

public class Wolf extends Animal {

    public Wolf() {
        super(50, 8, 3, true, false, 8, true, GameProperties.WOLF_MAX_COUNT, "wolf");
    }

    @Override
    public String toString() {
        return "Wolf{}";
    }

}
