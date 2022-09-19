package ua.com.javarush.akhrianin.natureGame;


import ua.com.javarush.akhrianin.natureGame.island.GameProperties;
import ua.com.javarush.akhrianin.natureGame.island.Island;
import ua.com.javarush.akhrianin.natureGame.island.LifeInitializer;
import ua.com.javarush.akhrianin.natureGame.npc.Animal;
import ua.com.javarush.akhrianin.natureGame.npc.BasicNpc;

import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Island island = new Island();
        GameProperties gameProperties = new GameProperties();
        LifeInitializer lifeInitializer = new LifeInitializer();

        for (int islandLength = 0; islandLength < GameProperties.ISLAND_LENGTH; islandLength++) {
            for (int islandHeight = 0; islandHeight < GameProperties.ISLAND_HEIGHT; islandHeight++) {
                island.getIsland()[islandLength][islandHeight] = lifeInitializer.lifeInitializer();
            }
        }

        for (int dayCounter = 0; dayCounter < GameProperties.ISLAND_DAY_CYCLE; dayCounter++) {
            for (int islandLength = 0; islandLength < GameProperties.ISLAND_LENGTH; islandLength++) {
                for (int islandHeight = 0; islandHeight < GameProperties.ISLAND_HEIGHT; islandHeight++) {

                    int random = ThreadLocalRandom.current().nextInt(1, 3);

                    switch (random) {
                        case 1 -> animalFeeder(island, gameProperties, islandLength, islandHeight);
                        case 2 -> animalMover(island, islandLength, islandHeight);
                        case 3 -> animalMultiplier(island, lifeInitializer, islandLength, islandHeight);
                    }

                    deadNpcRemover(island, islandLength, islandHeight);

                    locationStatistic(island, islandLength, islandHeight);
                }
            }
            System.out.println("Day " + dayCounter);
        }
    }

    private static void deadNpcRemover(Island island, int islandLength, int islandHeight) {

        island.getIsland()[islandLength][islandHeight].removeIf(npc -> !npc.isAlive());
        var list = island.getIsland()[islandLength][islandHeight].stream()
                .filter(BasicNpc::canEat)
                .map(basicNpc -> (Animal) basicNpc)
                .filter(animal -> animal.getSatiety() < 0)
                .toList();
        island.getIsland()[islandLength][islandHeight].removeAll(list);
    }

    private static void locationStatistic(Island island, int islandLength, int islandHeight) {
        Map<String, Long> frequencyMap = island.getIsland()[islandLength][islandHeight].stream()
                .map(BasicNpc::getName)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.print("Location: x" + islandLength + " y" + islandHeight);

        for (Map.Entry<String, Long> entry : frequencyMap.entrySet()) {
            System.out.print("|" + entry.getKey() + ": " + entry.getValue());

        }
        System.out.println();
    }

    private static void animalMultiplier(Island island, LifeInitializer lifeInitializer, int islandLength, int islandHeight) {
        var cell = island.getIsland()[islandLength][islandHeight];
        var cellSize = cell.size();


        for (int fatherIndex = 0; fatherIndex < cellSize; fatherIndex++) {
            BasicNpc animal1 = cell.get(fatherIndex);
            if (animal1.canEat()) {
                Animal father = (Animal) animal1;
                if (!father.getHasMultiplied()) {
                    father.setHasMultiplied(true);
                    for (int motherIndex = 0; motherIndex < cellSize; motherIndex++) {
                        BasicNpc animal2 = cell.get(motherIndex);
                        if (animal2.canEat()) {
                            Animal mother = (Animal) animal2;
                            if (mother.getName().equals(father.getName()) && !mother.getHasMultiplied()) {
                                mother.setHasMultiplied(true);
                                mother.setSatiety(mother.getSatiety() - island.satietyReduction(mother));
                                father.setSatiety(father.getSatiety() - island.satietyReduction(father));
                                cell.add(lifeInitializer.childProducer(father.getName()));
                                break;
                            }
                        }
                    }
                }
            }
        }
    }

    private static void animalFeeder(Island island, GameProperties gameProperties, int islandLength, int islandHeight) {
        for (BasicNpc eater : island.getIsland()[islandLength][islandHeight]) {

            if (eater.canEat() && eater.isAlive()) {

                Animal animalEater = (Animal) eater;

                var animalEatingChance = gameProperties.getGlobalEatingChance().get(animalEater.getName());

                for (BasicNpc victim : island.getIsland()[islandLength][islandHeight]) {

                    if (victim.isAlive() && animalEatingChance.containsKey(victim.getName())) {
                        int random = ThreadLocalRandom.current().nextInt(1, 100);
                        if (random <= animalEatingChance.get(victim.getName())) {
                            victim.setAlive(false);
                            animalEater.setSatiety(animalEater.getSatiety() + victim.getWeight());
                            if (animalEater.getMaxSatiety() < animalEater.getSatiety()) {
                                animalEater.setSatiety(animalEater.getMaxSatiety());
                            }
                        }
                        break;
                    }
                }
            }
        }
    }

    private static void animalMover(Island island, int islandLength, int islandHeight) {
        int animalListSize = island.getIsland()[islandLength][islandHeight].size();

        for (int animalIndex = 0; animalIndex < animalListSize; animalIndex++) {

            if (island.getIsland()[islandLength][islandHeight].get(animalIndex).canEat()) {
                Animal animal = (Animal) island.getIsland()[islandLength][islandHeight].get(animalIndex);
                int random = ThreadLocalRandom.current().nextInt(1, 4);

                switch (random) {
                    case 1 -> {
                        if (islandLength + animal.getSpeed() < GameProperties.ISLAND_LENGTH &&
                                island.validateMaxCount
                                        (island.getIsland()[islandLength + animal.getSpeed()][islandHeight], animal)) {

                            animal.setSatiety(animal.getSatiety() - island.satietyReduction(animal));

                            island.getIsland()[islandLength + animal.getSpeed()][islandHeight]
                                    .add(island.getIsland()[islandLength][islandHeight].get(animalIndex));


                            island.getIsland()[islandLength][islandHeight].remove(animalIndex);
                            animalListSize--;
                        }
                    }
                    case 2 -> {
                        if (islandLength - animal.getSpeed() >= 0 &&
                                island.validateMaxCount
                                        (island.getIsland()[islandLength - animal.getSpeed()][islandHeight], animal)) {

                            animal.setSatiety(animal.getSatiety() - island.satietyReduction(animal));

                            island.getIsland()[islandLength - animal.getSpeed()][islandHeight]
                                    .add(island.getIsland()[islandLength][islandHeight].get(animalIndex));

                            island.getIsland()[islandLength][islandHeight].remove(animalIndex);
                            animalListSize--;
                        }
                    }
                    case 3 -> {
                        if (islandHeight + animal.getSpeed() < GameProperties.ISLAND_HEIGHT &&
                                island.validateMaxCount
                                        (island.getIsland()[islandLength][islandHeight + animal.getSpeed()], animal)) {

                            animal.setSatiety(animal.getSatiety() - island.satietyReduction(animal));

                            island.getIsland()[islandLength][islandHeight + animal.getSpeed()]
                                    .add(island.getIsland()[islandLength][islandHeight].get(animalIndex));

                            island.getIsland()[islandLength][islandHeight].remove(animalIndex);
                            animalListSize--;
                        }
                    }
                    case 4 -> {
                        if (islandHeight - animal.getSpeed() >= 0 &&
                                island.validateMaxCount
                                        (island.getIsland()[islandLength][islandHeight - animal.getSpeed()], animal)) {

                            animal.setSatiety(animal.getSatiety() - island.satietyReduction(animal));

                            island.getIsland()[islandLength][islandHeight - animal.getSpeed()]
                                    .add(island.getIsland()[islandLength][islandHeight].get(animalIndex));

                            island.getIsland()[islandLength][islandHeight].remove(animalIndex);
                            animalListSize--;
                        }
                    }
                }
            }
        }
    }

}

