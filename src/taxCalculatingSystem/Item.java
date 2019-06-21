package taxCalculatingSystem;

import java.util.List;

public class Item {
    private String name;
    private int quantity;
    private double price;
    private double taxCost;

    Item(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return " Item Name :" + name + "\n"
                + "quantity :" + quantity + "\n"
                + "price : " + price + "\n"
                + "taxCost : " + taxCost;
    }

    public double calculateTax(double salesTax) {
        taxCost = price * salesTax;
        return taxCost;
    }

    public void setTaxCost(double taxCost) {
        this.taxCost = taxCost;
    }

    public Boolean isExemptedItem(List<String> exemptedItems) {
        boolean result = false;
        if (exemptedItems.contains(name)) {
            result = true;
        }
        return result;
    }

}
