package shoppingcart;

public class WalletAmount {
    static float WALLET_AMOUNT = 1000;

    public void remainingAmount(float amount) {
        WALLET_AMOUNT = WALLET_AMOUNT - amount;
        System.out.println("Amount has been deducted from your e-wallet");
        System.out.println("Remaining amount in e-wallet is: " +WALLET_AMOUNT);
    }

    public float isDiscountApplicable(float amount) {
        float discountedAmount = (amount*(5.0f/100.0f));
        float finalAmount = amount - discountedAmount;
        System.out.println("Discount of the product is: " +discountedAmount);
        System.out.println("Amount after discount is: " +finalAmount);
        return finalAmount;
    }
}
