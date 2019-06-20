package taxCalculatingSystem;

public class Item {
    private String name;
    private int quantity;
    private double price;
    private double tax;

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
                + "tax : " + tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getPrice() {
        return price;
    }
}
