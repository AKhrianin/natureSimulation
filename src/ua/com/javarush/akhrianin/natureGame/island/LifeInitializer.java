package ua.com.javarush.akhrianin.natureGame.island;

import ua.com.javarush.akhrianin.natureGame.npc.Animal;
import ua.com.javarush.akhrianin.natureGame.npc.BasicNpc;
import ua.com.javarush.akhrianin.natureGame.npc.carnivore.*;
import ua.com.javarush.akhrianin.natureGame.npc.herb.Herb;
import ua.com.javarush.akhrianin.natureGame.npc.herbivore.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class LifeInitializer {

    public List<BasicNpc> lifeInitializer() {
        List<BasicNpc> list = new ArrayList<>();
        for (int i = 0; i < ThreadLocalRandom.current().nextInt(1, GameProperties.HERB_MAX_COUNT); i++) {
            list.add(new Herb());
        }
        for (int i = 0; i < ThreadLocalRandom.current().nextInt(1, GameProperties.SHEEP_MAX_COUNT); i++) {
            list.add(new Sheep());
        }
        for (int i = 0; i < ThreadLocalRandom.current().nextInt(1, GameProperties.BEAR_MAX_COUNT); i++) {
            list.add(new Bear());
        }
        for (int i = 0; i < ThreadLocalRandom.current().nextInt(1, GameProperties.BOA_MAX_COUNT); i++) {
            list.add(new Boa());
        }
        for (int i = 0; i < ThreadLocalRandom.current().nextInt(1, GameProperties.EAGLE_MAX_COUNT); i++) {
            list.add(new Eagle());
        }
        for (int i = 0; i < ThreadLocalRandom.current().nextInt(1, GameProperties.FOX_MAX_COUNT); i++) {
            list.add(new Fox());
        }
        for (int i = 0; i < ThreadLocalRandom.current().nextInt(1, GameProperties.WOLF_MAX_COUNT); i++) {
            list.add(new Wolf());
        }
        for (int i = 0; i < ThreadLocalRandom.current().nextInt(1, GameProperties.BOAR_MAX_COUNT); i++) {
            list.add(new Boar());
        }
        for (int i = 0; i < ThreadLocalRandom.current().nextInt(1, GameProperties.BUFFALO_MAX_COUNT); i++) {
            list.add(new Buffalo());
        }
        for (int i = 0; i < ThreadLocalRandom.current().nextInt(1, GameProperties.CATERPILLAR_MAX_COUNT); i++) {
            list.add(new Caterpillar());
        }
        for (int i = 0; i < ThreadLocalRandom.current().nextInt(1, GameProperties.DEER_MAX_COUNT); i++) {
            list.add(new Deer());
        }
        for (int i = 0; i < ThreadLocalRandom.current().nextInt(1, GameProperties.DUCK_MAX_COUNT); i++) {
            list.add(new Duck());
        }
        for (int i = 0; i < ThreadLocalRandom.current().nextInt(1, GameProperties.GOAT_MAX_COUNT); i++) {
            list.add(new Goat());
        }
        for (int i = 0; i < ThreadLocalRandom.current().nextInt(1, GameProperties.HORSE_MAX_COUNT); i++) {
            list.add(new Horse());
        }
        for (int i = 0; i < ThreadLocalRandom.current().nextInt(1, GameProperties.MOUSE_MAX_COUNT); i++) {
            list.add(new Mouse());
        }
        for (int i = 0; i < ThreadLocalRandom.current().nextInt(1, GameProperties.RABBIT_MAX_COUNT); i++) {
            list.add(new Rabbit());
        }
        for (int i = 0; i < ThreadLocalRandom.current().nextInt(1, GameProperties.SHEEP_MAX_COUNT); i++) {
            list.add(new Sheep());
        }

        Collections.shuffle(list);

        return list;
    }

    public BasicNpc childProducer(String name) {

        Animal animal = null;

        switch (name) {
            case "bear" -> animal = new Bear();
            case "boa" -> animal = new Boa();
            case "eagle" -> animal = new Eagle();
            case "fox" -> animal = new Fox();
            case "wolf" -> animal = new Wolf();
            case "boar" -> animal = new Boar();
            case "buffalo" -> animal = new Buffalo();
            case "caterpillar" -> animal = new Caterpillar();
            case "deer" -> animal = new Deer();
            case "duck" -> animal = new Duck();
            case "goat" -> animal = new Goat();
            case "horse" -> animal = new Horse();
            case "mouse" -> animal = new Mouse();
            case "rabbit" -> animal = new Rabbit();
            case "sheep" -> animal = new Sheep();
        }
        return animal;
    }
}
