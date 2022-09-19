package ua.com.javarush.akhrianin.natureGame.npc.herbivore;

import ua.com.javarush.akhrianin.natureGame.island.GameProperties;
import ua.com.javarush.akhrianin.natureGame.npc.Animal;

public class Deer extends Animal {
    public Deer() {
        super(300, 50, 4, true, false, 50, true, GameProperties.DEER_MAX_COUNT, "deer");
    }

    @Override
    public String toString() {
        return "Deer{}";
    }

}
