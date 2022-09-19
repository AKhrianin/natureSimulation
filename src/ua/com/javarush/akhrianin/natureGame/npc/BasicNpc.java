package ua.com.javarush.akhrianin.natureGame.npc;

public class BasicNpc {

    protected boolean isAlive;
    protected double weight;
    protected boolean canEat;
    protected int maxCount;
    protected String name;

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public double getWeight() {
        return weight;
    }

    public boolean canEat() {
        return canEat;
    }

    public int getMaxCount() {
        return maxCount;
    }

    public String getName() {
        return name;
    }

    public BasicNpc(boolean isAlive, double weight, boolean canEat, int maxCount, String name) {
        this.isAlive = isAlive;
        this.weight = weight;
        this.canEat = canEat;
        this.maxCount = maxCount;
        this.name = name;
    }
}

