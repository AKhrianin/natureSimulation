package ua.com.javarush.akhrianin.natureGame.island;

import java.util.HashMap;
import java.util.Map;

public class GameProperties {

    public static final int ISLAND_LENGTH = 10;
    public static final int ISLAND_HEIGHT = 10;
    public static final int ISLAND_DAY_CYCLE = 50;

    public static final Double SATIETY_REDUCTION_COEFFICIENT = 0.25;

    public static final int HERB_MAX_COUNT = 200;
    public static final int WOLF_MAX_COUNT = 30;
    public static final int BOA_MAX_COUNT = 30;
    public static final int FOX_MAX_COUNT = 30;
    public static final int BEAR_MAX_COUNT = 5;
    public static final int EAGLE_MAX_COUNT = 20;
    public static final int HORSE_MAX_COUNT = 20;
    public static final int DEER_MAX_COUNT = 20;
    public static final int RABBIT_MAX_COUNT = 150;
    public static final int MOUSE_MAX_COUNT = 20;
    public static final int GOAT_MAX_COUNT = 140;
    public static final int SHEEP_MAX_COUNT = 140;
    public static final int BOAR_MAX_COUNT = 50;
    public static final int BUFFALO_MAX_COUNT = 10;
    public static final int DUCK_MAX_COUNT = 200;
    public static final int CATERPILLAR_MAX_COUNT = 1000;

    private Map<String, Integer> setEatingChance(int wolf, int boa, int fox, int bear, int eagle,
                                                                    int horse, int deer, int rabbit, int mouse, int goat,
                                                                    int sheep, int boar, int buffalo, int duck,
                                                                    int caterpillar, int herb) {

        Map<String, Integer> map = new HashMap<>();

        map.put("wolf", wolf);
        map.put("boa", boa);
        map.put("fox", fox);
        map.put("bear", bear);
        map.put("eagle", eagle);
        map.put("horse", horse);
        map.put("deer", deer);
        map.put("rabbit", rabbit);
        map.put("mouse", mouse);
        map.put("goat", goat);
        map.put("sheep", sheep);
        map.put("boar", boar);
        map.put("buffalo", buffalo);
        map.put("duck", duck);
        map.put("caterpillar", caterpillar);
        map.put("herb", herb);

        return map;
    }

    private Map<String, Integer> getBearEatingChance() {

        return setEatingChance(0,80,0,0,0,40,80,80,90,70,70,
                50,20,10,0,0);
    }

    private Map<String, Integer> getBoaEatingChance() {

        return setEatingChance(0,0,15,0,0,0,0,20,40,0,0,
                0,0,60,40,0);
    }

    private Map<String, Integer> getEagleEatingChance() {

        return setEatingChance(0,0,10,0,0,0,0,90,90,0,0,
                0,0,80,0,0);
    }

    private Map<String, Integer> getFoxEatingChance() {

        return setEatingChance(0, 0, 0, 0, 0, 0,0, 70, 90, 0,
                0, 0, 0, 60, 40, 0);

    }

    private Map<String, Integer> getWolfEatingChance() {

        return setEatingChance(0, 0, 0, 0, 0, 10,15, 60, 80, 60,
                70, 15, 10, 40, 0, 0);

    }

    private Map<String, Integer> getHorseEatingChance() {

        return setEatingChance(0, 0, 0, 0, 0, 0,0, 0, 0, 0,
                0, 0, 0, 0, 0, 100);

    }

    private Map<String, Integer> getDeerEatingChance() {

        return setEatingChance(0, 0, 0, 0, 0, 0,0, 0, 0, 0,
                0, 0, 0, 0, 0, 100);

    }

    private Map<String, Integer> getRabbitEatingChance() {

        return setEatingChance(0, 0, 0, 0, 0, 0,0, 0, 0, 0,
                0, 0, 0, 0, 0, 100);

    }

    private Map<String, Integer> getMouseEatingChance() {

        return setEatingChance(0, 0, 0, 0, 0, 0,0, 0, 0, 0,
                0, 0, 0, 0, 90, 100);

    }

    private Map<String, Integer> getGoatEatingChance() {

        return setEatingChance(0, 0, 0, 0, 0, 0,0, 0, 0, 0,
                0, 0, 0, 0, 0, 100);

    }

    private Map<String, Integer> getSheepEatingChance() {

        return setEatingChance(0, 0, 0, 0, 0, 0,0, 0, 0, 0,
                0, 0, 0, 0, 0, 100);

    }

    private Map<String, Integer> getBoarEatingChance() {

        return setEatingChance(0, 0, 0, 0, 0, 0,0, 0, 50, 0,
                0, 0, 0, 0, 90, 100);

    }

    private Map<String, Integer> getBuffaloEatingChance() {

        return setEatingChance(0, 0, 0, 0, 0, 0,0, 0, 0, 0,
                0, 0, 0, 0, 0, 100);

    }

    private Map<String, Integer> getDuckEatingChance() {

        return setEatingChance(0, 0, 0, 0, 0, 0,0, 0, 0, 0,
                0, 0, 0, 0, 90, 100);

    }

    private Map<String, Integer> getCaterpillarEatingChance() {

        return setEatingChance(0, 0, 0, 0, 0, 0,0, 0, 0, 0,
                0, 0, 0, 0, 0, 100);

    }

    public Map<String, Map<String, Integer>> getGlobalEatingChance() {
        Map<String, Map<String, Integer>> globalEatingChance = new HashMap<>();

        globalEatingChance.put("bear", getBearEatingChance());
        globalEatingChance.put("boa", getBoaEatingChance());
        globalEatingChance.put("eagle", getEagleEatingChance());
        globalEatingChance.put("fox", getFoxEatingChance());
        globalEatingChance.put("wolf", getWolfEatingChance());
        globalEatingChance.put("horse", getHorseEatingChance());
        globalEatingChance.put("deer", getDeerEatingChance());
        globalEatingChance.put("rabbit", getRabbitEatingChance());
        globalEatingChance.put("mouse", getMouseEatingChance());
        globalEatingChance.put("goat", getGoatEatingChance());
        globalEatingChance.put("sheep", getSheepEatingChance());
        globalEatingChance.put("boar", getBoarEatingChance());
        globalEatingChance.put("buffalo", getBuffaloEatingChance());
        globalEatingChance.put("duck", getDuckEatingChance());
        globalEatingChance.put("caterpillar", getCaterpillarEatingChance());

        return globalEatingChance;
    }

}
