package ua.com.javarush.akhrianin.natureGame.island;


import ua.com.javarush.akhrianin.natureGame.npc.Animal;
import ua.com.javarush.akhrianin.natureGame.npc.BasicNpc;

import java.util.ArrayList;
import java.util.List;

public class Island {

    private final List<BasicNpc>[][] island = new ArrayList[GameProperties.ISLAND_LENGTH][GameProperties.ISLAND_HEIGHT];

    public List<BasicNpc>[][] getIsland() {
        return island;
    }

    public Boolean validateMaxCount(List<BasicNpc> list, Animal animal) {
        return list.stream().filter(x -> x.getName().equals(animal.getName())).count() < animal.getMaxCount();
    }

    public Double satietyReduction (Animal animal){

        return animal.getMaxSatiety()*GameProperties.SATIETY_REDUCTION_COEFFICIENT;
    }
}
