package com.ultralesson.capstone.fruitbowl;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        // Arrange or data setup
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("Apple", "Red", "Sweet", "Large"));
        fruits.add(new Fruit("Pomegranate", "Red", "Sweet", "Large"));
        fruits.add(new Fruit("Strawberry", "Red", "Sweet", "Small"));
        fruits.add(new Fruit("Orange", "Green", "Sour", "Medium"));
        fruits.add(new Fruit("Mosumbi", "Green", "Sour", "Medium"));
        fruits.add(new Fruit("Green Grapes", "Green", "Normal", "Small"));
        fruits.add(new Fruit("Mango", "Yellow", "Normal", "Small"));
        fruits.add(new Fruit("Banana", "Yellow", "Normal", "Medium"));


        Bowl bowl = new Bowl(fruits);

        MultiLayerBowl layerBowl = new MultiLayerBowl(); // 3layered bowl

        Segregator segregator = new Segregator(bowl, layerBowl);

        segregator.segregateByColor();
        segregator.segregateBySize();
        segregator.segregateByType();


    }
}
