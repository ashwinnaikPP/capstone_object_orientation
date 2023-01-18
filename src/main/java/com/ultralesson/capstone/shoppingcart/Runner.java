package com.ultralesson.capstone.shoppingcart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Apple", 50));
        productList.add(new Product("Milk", 25));
        productList.add(new Product("News Paper", 5));

        Cart cartProduct = new Cart(productList);

        System.out.println("Enter the product you wish to buy: Apple / Milk / Paper");

        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();

        switch (product) {
            case "Apple" -> {
                System.out.println("Please enter the numbers of KG you want to buy: ");
                cartProduct.productApple();
            }
            case "Milk" -> {
                System.out.println("Please enter the numbers of liters you want to buy:");
                cartProduct.productMilk();
            }
            case "Paper" -> {
                System.out.println("Please enter the numbers of quantity you want to buy: ");
                cartProduct.productPaper();
            }
            default -> System.out.println("Invalid Choice!");
        }
    }
}
