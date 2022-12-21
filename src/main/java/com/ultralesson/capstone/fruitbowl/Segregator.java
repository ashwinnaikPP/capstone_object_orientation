package com.ultralesson.capstone.fruitbowl;

import java.util.List;

public class Segregator {

    private Bowl mixedBowl;
    private final MultiLayerBowl segregatedBowl;

    public Segregator(Bowl mixedBowl, MultiLayerBowl emptyLayerBowl) {
        this.mixedBowl = mixedBowl;
        this.segregatedBowl = emptyLayerBowl;
    }




    public MultiLayerBowl segregateByColor() {

        // Logic of segregation by color
        for (Fruit fruit : mixedBowl.returnFruits()) {

        }
        System.out.println("mix " +mixedBowl);

        return segregatedBowl;
    }

    public MultiLayerBowl segregateByName() {

        // Logic of segregation by name
        return segregatedBowl;
    }

    public MultiLayerBowl segregateByType() {

        // Logic of segregation by type
        return segregatedBowl;
    }

}
