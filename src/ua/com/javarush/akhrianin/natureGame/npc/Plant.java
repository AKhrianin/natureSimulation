package ua.com.javarush.akhrianin.natureGame.npc;

public abstract class Plant extends BasicNpc {

    protected Plant(boolean isAlive, double weight, boolean canEat, int maxCount, String name) {
        super(isAlive, weight, canEat, maxCount, name);
    }
}
