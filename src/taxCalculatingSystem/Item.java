package taxCalculatingSystem;

import java.util.List;

public class Item {
    private String name;
    private int quantity;
    private double price;
    private double taxCost;
    private double cost;

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
                + "taxCost : " + taxCost + "\n"
                + "Cost : " + cost;
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

    public double calculatecost() {
        return (price + taxCost) * quantity;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
