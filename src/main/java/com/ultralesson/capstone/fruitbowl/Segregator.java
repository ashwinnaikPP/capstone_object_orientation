package com.ultralesson.capstone.fruitbowl;

import java.util.ArrayList;
import java.util.List;

public class Segregator {

    private final Bowl mixedBowl;
    private final MultiLayerBowl segregatedBowl;

    List<String> fruitsInFirstLayer = new ArrayList<>();
    List<String> fruitsInSecondLayer = new ArrayList<>();
    List<String> fruitsInThirdLayer = new ArrayList<>();

    public Segregator(Bowl mixedBowl, MultiLayerBowl emptyLayerBowl) {
        this.mixedBowl = mixedBowl;
        this.segregatedBowl = emptyLayerBowl;
    }

    public void segregateByColor() {
        // Logic of segregation by color
        System.out.println("Fruits segregated by Color: ");
        for (Fruit fruit : mixedBowl.returnFruits()) {
            switch (fruit.getColor()) {
                case "Red" -> fruitsInFirstLayer.add(fruit.getName());
                case "Yellow" -> fruitsInSecondLayer.add(fruit.getName());
                case "Green" -> fruitsInThirdLayer.add(fruit.getName());
            }
        }
        printMultiLayerBowl();
    }

    public void segregateBySize() {
        // Logic of segregation by name
        System.out.println('\n' +"Fruits segregated by Size: ");
        clearFruitsArrayList();
        for (Fruit fruit : mixedBowl.returnFruits()) {
            switch (fruit.getSize()) {
                case "Large" -> fruitsInFirstLayer.add(fruit.getName());
                case "Medium" -> fruitsInSecondLayer.add(fruit.getName());
                case "Small" -> fruitsInThirdLayer.add(fruit.getName());
            }
        }
        printMultiLayerBowl();
    }

    public void segregateByType() {
        // Logic of segregation by type
        System.out.println('\n' +"Fruits segregated by Type: ");
        clearFruitsArrayList();
        for (Fruit fruit : mixedBowl.returnFruits()) {
            switch (fruit.getType()) {
                case "Sweet" -> fruitsInFirstLayer.add(fruit.getName());
                case "Normal" -> fruitsInSecondLayer.add(fruit.getName());
                case "Sour" -> fruitsInThirdLayer.add(fruit.getName());
            }
        }
        printMultiLayerBowl();
    }

    private void printMultiLayerBowl() {
        segregatedBowl.printFirstLayer(fruitsInFirstLayer);
        segregatedBowl.printSecondLayer(fruitsInSecondLayer);
        segregatedBowl.printThirdLayer(fruitsInThirdLayer);
    }

    private void clearFruitsArrayList() {
        fruitsInFirstLayer.clear();
        fruitsInSecondLayer.clear();
        fruitsInThirdLayer.clear();
    }
}

