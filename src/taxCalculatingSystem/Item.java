package taxCalculatingSystem;

public class Item {
    private String name;
    private int quantity;
    private double price;

    Item(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return name;
    }
}
