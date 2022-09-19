package ua.com.javarush.akhrianin.natureGame.npc.herb;

import ua.com.javarush.akhrianin.natureGame.island.GameProperties;
import ua.com.javarush.akhrianin.natureGame.npc.BasicNpc;

public class Herb extends BasicNpc {

    public Herb() {
        super(true, 1, false, GameProperties.HERB_MAX_COUNT, "herb");
    }

    @Override
    public String toString() {
        return "Herb{}";
    }
}
