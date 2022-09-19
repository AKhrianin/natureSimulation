package ua.com.javarush.akhrianin.natureGame.npc.herbivore;

import ua.com.javarush.akhrianin.natureGame.island.GameProperties;
import ua.com.javarush.akhrianin.natureGame.npc.Animal;

public class Boar extends Animal {
    public Boar() {
        super(400, 50, 2, true, false, 50, true, GameProperties.BOAR_MAX_COUNT, "boar");
    }

    @Override
    public String toString() {
        return "Boar{}";
    }

}
