package shoppingcart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        List<Cart> shoppingCart = new ArrayList<>();
        shoppingCart.add(new Cart("Apple", 50));
        shoppingCart.add(new Cart("Milk", 25));
        shoppingCart.add(new Cart("News Paper", 5));

        CartProduct cartProduct = new CartProduct(shoppingCart);

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
