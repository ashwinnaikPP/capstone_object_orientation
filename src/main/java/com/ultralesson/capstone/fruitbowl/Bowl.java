package com.ultralesson.capstone.fruitbowl;

import java.util.ArrayList;
import java.util.List;

public class Bowl {

    private String fruit;
    private String color;
    private String type;
    private String size;

    private List<Fruit> fruits = new ArrayList<>();

    public Bowl() {
        this.fruits = new ArrayList<>();
    }

    public Bowl(List<Fruit> fruits) {
        this.fruits = fruits;
    }

    public Bowl(Fruit fruit) {
        fruits.add(fruit);
    }


    public void add(Fruit fruit) {
        fruits.add(fruit);
    }


    public void remove(Fruit fruit) {
        fruits.remove(fruit);
    }

    public List<Fruit> returnFruits() {
        return fruits;
    }


    @Override
    public String toString() {
        return "Bowl{" +
                "fruit='" + fruit + '\'' +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
