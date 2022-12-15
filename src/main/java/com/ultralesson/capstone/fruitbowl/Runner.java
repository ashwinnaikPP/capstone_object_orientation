package com.ultralesson.capstone.fruitbowl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        // Arrange or data setup
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("Apple", "Red", "Sweet", "Large"));
        fruits.add(new Fruit("Pomegranate", "Red", "Sweet", "Large"));
        fruits.add(new Fruit("Orange", "Orange", "Sour", "Medium"));
        fruits.add(new Fruit("Mosumbi", "Green", "Sour", "Medium"));
        fruits.add(new Fruit("Black Grapes", "Black", "Normal", "Small"));
        fruits.add(new Fruit("Green Grapes", "Green", "Normal", "Small"));
        fruits.add(new Fruit("Banana", "Yellow", "Normal", "Medium"));
        fruits.add(new Fruit("Strawberry", "Red", "Sweet", "Small"));


        Bowl bowl = new Bowl(fruits);


        MultiLayerBowl multiLayerBowl = new MultiLayerBowl(); // 3 layered bowl


        Segregator segregator = new Segregator(bowl, multiLayerBowl);
        multiLayerBowl = segregator.segregateByColor();

        //Assertions
        // Check if all the fruits in the bowl are of same color

        multiLayerBowl = segregator.segregateByName();

    }
}
