package ua.com.javarush.akhrianin.natureGame.npc.carnivore;

import ua.com.javarush.akhrianin.natureGame.island.GameProperties;
import ua.com.javarush.akhrianin.natureGame.npc.Animal;

public class Boa extends Animal {

    public Boa() {
        super(15, 3, 1, true, false, 3, true, GameProperties.BOA_MAX_COUNT, "boa");
    }

    @Override
    public String toString() {
        return "Boa{}";
    }

}
