package com.ultralesson.capstone.fruitbowl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class MultiLayerBowl {

    private final List<Bowl>  bowls = new ArrayList<>();

    public MultiLayerBowl() {
       this(3);
    }

    public MultiLayerBowl(int levels) {
        IntStream.range(0, levels)
                .forEach(level -> bowls.add(new Bowl()));
    }

    public void printFirstLayer(List<String> firstLayer){
        System.out.println("Fruits in 1st Layer are: " + firstLayer);
    }

    public void printSecondLayer(List<String> secondLayer){
        System.out.println("Fruits in 2nd Layer are: " + secondLayer);
    }

    public void printThirdLayer(List<String> thirdLayer){
        System.out.println("Fruits in 3rd Layer are: " + thirdLayer);
    }
}