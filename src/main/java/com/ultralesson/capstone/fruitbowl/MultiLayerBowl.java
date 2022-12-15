package com.ultralesson.capstone.fruitbowl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class MultiLayerBowl {

    private List<Bowl>  bowls = new ArrayList<>();
    private int levels = 3;

    public MultiLayerBowl() {
       this(3);
    }

    public MultiLayerBowl(int levels) {
        IntStream.range(0, levels)
                .forEach(level -> bowls.add(new Bowl()));
    }


    public void multiLayer(String fruit) {
        System.out.println(fruit);
    }

    public void printFirstLayer(){
        System.out.println("Fruits in 1st layer are: ");
    }

    public void printSecondLayer(){
        System.out.println('\n' + "Fruits in 2nd layer are: ");
    }

    public void printThirdLayer(){
        System.out.println('\n' +"Fruits in 3rd layer are: ");
    }
}