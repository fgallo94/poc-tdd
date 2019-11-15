package discount;

import lombok.Getter;

public class Item {
    @Getter
    private final String name;
    @Getter
    private final int quantity;
    private final double unitPrice;

    public Item(String name, int quantity, double unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getName() {
        return this.name;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public double getTotalPrice() {
        return this.unitPrice * this.quantity;
    }
}
