package com.ultralesson.capstone.shoppingcart;

public class Offer {
    public void offerOnMilk(int liters) {
        if(liters >= 2) {
            int freeMilk = liters/2;
            System.out.println("For "+liters+ " liters of milk, you will get " +freeMilk+ " liters of free milk!!!");
        } else {
            System.out.println("There is a offer on Milk - Buy 2 liters of milk and get 1 free.");
        }
    }
}
