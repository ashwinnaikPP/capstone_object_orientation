package fruitbowl;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<SingleBowl> fruits = new ArrayList<>();
        fruits.add(new SingleBowl("Apple", "Red", "Sweet", "Large"));
        fruits.add(new SingleBowl("Pomegranate", "Red", "Sweet", "Large"));
        fruits.add(new SingleBowl("Orange", "Orange", "Sour", "Medium"));
        fruits.add(new SingleBowl("Mosumbi", "Green", "Sour", "Medium"));
        fruits.add(new SingleBowl("Black Grapes", "Black", "Normal", "Small"));
        fruits.add(new SingleBowl("Green Grapes", "Green", "Normal", "Small"));
        fruits.add(new SingleBowl("Banana", "Yellow", "Normal", "Medium"));
        fruits.add(new SingleBowl("Strawberry", "Red", "Sweet", "Small"));

        FruitQuery fruitQuery = new FruitQuery(fruits);
        fruitQuery.findFruitsByColor();
        fruitQuery.findFruitsByType();
        fruitQuery.findFruitsBySize();
    }
}
