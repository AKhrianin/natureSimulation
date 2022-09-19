package ua.com.javarush.akhrianin.natureGame.npc;

public abstract class Animal extends BasicNpc {
    private final double maxSatiety;
    private final int speed;
    private boolean hasMultiplied;
    private double satiety;

    public Animal(double weight, double maxSatiety, int speed, boolean isAlive, boolean hasMultiplied, double satiety, boolean canEat, int maxCount, String name) {
        super(isAlive, weight, canEat, maxCount, name);
        this.maxSatiety = maxSatiety;
        this.speed = speed;
        this.hasMultiplied = hasMultiplied;
        this.satiety = satiety;
    }

    public double getMaxSatiety() {
        return maxSatiety;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean getHasMultiplied() {
        return hasMultiplied;
    }

    public void setHasMultiplied(boolean hasMultiplied) {
        this.hasMultiplied = hasMultiplied;
    }

    public double getSatiety() {
        return satiety;
    }

    public void setSatiety(double satiety) {
        this.satiety = satiety;
    }

}
