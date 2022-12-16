package com.ultralesson.capstone.shoppingcart;

public class ProductOffer {
    public void offerOnMilk(int liters) {
        if(liters >= 2) {
            System.out.println("You have got 1 liter milk for free!!!");
        } else {
            System.out.println("There is a offer on Milk - Buy 2 liters of milk and get 1 free.");
        }
    }
}
