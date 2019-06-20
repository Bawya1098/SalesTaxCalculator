package taxCalculatingSystem;

public class Item {
    private String name;
    private int quantity;
    private double price;
    private double taxCost;

    Item(String name, int quantity, double price, double salesTax) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.taxCost = calculateTax(salesTax);
    }

    @Override
    public String toString() {
        return " Item Name :" + name + "\n"
                + "quantity :" + quantity + "\n"
                + "price : " + price + "\n"
                + "taxCost : " + taxCost;
    }

    private double calculateTax(double salesTax) {
        taxCost = price * salesTax;
        return taxCost;
    }
}
