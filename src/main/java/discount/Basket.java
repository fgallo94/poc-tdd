package discount;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    @Getter
    private double amount;
    private List<Item> itemList;

    public Basket(List<Item> itemsList) {
        this.itemList = itemsList;
        sumItems();
    }

    private void sumItems() {
        for (Item item : itemList) {
            amount += item.getTotalPrice();
        }
    }

    public void substract(double amount) {
        this.amount -= amount;
    }

    public int getQuantityOfItems() {
        int quantity = 0;
        for (Item item : itemList) {
            quantity += item.getQuantity();
        }
        return quantity;
    }

    public boolean has(String product) {
        for (Item item : itemList) {
            if (item.getName()
                    .equals(product)) {
                return true;
            }
        }
        return false;
    }

    public static class BasketBuilder {

        private List<Item> itemList;

        public BasketBuilder() {
            itemList = new ArrayList<Item>();
        }

        public BasketBuilder withItem(String itemName, int itemPrice) {
            itemList.add(new Item(itemName, 1, itemPrice));
            return this;
        }

        public Basket build() {
            return new Basket(itemList);
        }
    }
}
