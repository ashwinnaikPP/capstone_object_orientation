package fruitbowl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        System.out.println("Enter 1 to segregate fruits by Color." +'\n' + "Enter 2 to segregate fruits by Type."
        +'\n' + "Enter 3 to segregate fruits by Size.");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number) {
            case 1 -> fruitQuery.findFruitsByColor();
            case 2 -> fruitQuery.findFruitsByType();
            case 3 -> fruitQuery.findFruitsBySize();
            default -> System.out.println("Invalid Choice!");
        }
    }
}
