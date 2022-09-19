package ua.com.javarush.akhrianin.natureGame.npc.carnivore;

import ua.com.javarush.akhrianin.natureGame.island.GameProperties;
import ua.com.javarush.akhrianin.natureGame.npc.Animal;

public class Fox extends Animal {

    public Fox() {
        super(8, 2, 2, true, false, 2, true, GameProperties.FOX_MAX_COUNT, "fox");
    }

    @Override
    public String toString() {
        return "Fox{}";
    }

}
