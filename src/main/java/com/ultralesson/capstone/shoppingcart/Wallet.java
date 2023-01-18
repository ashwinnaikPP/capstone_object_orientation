package com.ultralesson.capstone.shoppingcart;

public class Wallet {
    static float WALLET_AMOUNT = 1000;

    public float addAmountToWallet(int amount) {
        WALLET_AMOUNT += amount;
        return WALLET_AMOUNT;
    }

    public void remainingAmount(float amount) {
        WALLET_AMOUNT = WALLET_AMOUNT - amount;
    }

    public float isDiscountApplicable(float amount) {
        float discountedAmount = (amount*(5.0f/100.0f));
        float finalAmount = amount - discountedAmount;
        System.out.println("Discount of the product is: " +discountedAmount);
        System.out.println("Amount with discount is: " +finalAmount);
        return finalAmount;
    }
}
