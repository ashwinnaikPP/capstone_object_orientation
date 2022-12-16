package com.ultralesson.capstone.shoppingcart;

import java.util.List;
import java.util.Scanner;

public class CartProduct {

    private final List<Cart> shoppingCart;

    public CartProduct(List<Cart> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
    Cart cart = new Cart();
    WalletAmount walletAmount = new WalletAmount();
    ProductOffer productOffer = new ProductOffer();
    float amount;

    private int quantityOfProduct() {
        Scanner scanner = new Scanner(System.in);
        cart.setQuantity(scanner.nextInt());
        return cart.getQuantity();
    }

    public void productApple() {
        for (Cart cart1 : shoppingCart) {
            if (cart1.getProduct() == "Apple") {
                amount = cart1.getAmount();
                calculateAmount(quantityOfProduct());
            }
        }
    }

    public void productMilk() {
        for (Cart cart1 : shoppingCart) {
            if (cart1.getProduct() == "Milk") {
                amount = cart1.getAmount();
                calculateAmount(quantityOfProduct());
                productOffer.offerOnMilk(cart.getQuantity());
            }
        }
    }

    public void productPaper() {
        for (Cart cart1 : shoppingCart) {
            if (cart1.getProduct() == "News Paper") {
                amount = cart1.getAmount();
                calculateAmount(quantityOfProduct());
            }
        }
    }

    private void calculateAmount(int quantity) {
        float total = quantity * amount;
        System.out.println("The amount of the product is: " + total);
        if(total >= 100) {
            total = walletAmount.isDiscountApplicable(total);
        }
        walletAmount.remainingAmount(total);
    }
}