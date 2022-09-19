package ua.com.javarush.akhrianin.natureGame.npc.herbivore;

import ua.com.javarush.akhrianin.natureGame.island.GameProperties;
import ua.com.javarush.akhrianin.natureGame.npc.Animal;

public class Mouse extends Animal {
    public Mouse() {
        super(0.05, 0.01, 1, true, false, 0.01, true, GameProperties.MOUSE_MAX_COUNT, "mouse");
    }

    @Override
    public String toString() {
        return "Mouse{}";
    }

}
