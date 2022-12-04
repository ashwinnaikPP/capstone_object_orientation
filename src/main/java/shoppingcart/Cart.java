package shoppingcart;

import java.util.List;

public class Cart {
    private String Product;
    private int Amount;
    private int Quantity;

    public Cart(String product, int amount) {
        Product = product;
        Amount = amount;
    }

    public Cart() {

    }

    public int getAmount() {
        return Amount;
    }

    public int getQuantity() {
        return Quantity;
    }

    public String getProduct() {
        return Product;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "Product='" + Product + '\'' +
                ", Amount=" + Amount +
                ", Quantity=" + Quantity +
                '}';
    }
}
