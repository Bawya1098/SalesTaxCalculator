package taxCalculatingSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BillingCounter {
    private List<Item> items = new ArrayList<>();
    private static final double tax = 0.15;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BillingCounter counter = new BillingCounter();
        System.out.println("Enter Number of Items: ");
        int noOfItems = scan.nextInt();
        scan.nextLine();
        List<Item> items = counter.addItem(scan, noOfItems);
        counter.calculateTax(items);
        counter.displayItemsName(items);
    }

    private List<Item> addItem(Scanner scan, int noOfItems) {
        for (int index = 0; index < noOfItems; index++) {
            String[] strings = scan.nextLine().split(" ");
            int quantity = Integer.parseInt(strings[0]);
            String itemName = strings[1];
            double price = Double.parseDouble(strings[3]);
            Item item = new Item(itemName, quantity, price);
            items.add(item);
        }
        return items;
    }

    private void calculateTax(List<Item> items) {
        for (Item item : items) {
            double price = getItemPrice();
            double itemTax = price * BillingCounter.tax;
            item.setTax(itemTax);
        }
    }

    private void displayItemsName(List<Item> items) {
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }

    private double getItemPrice() {
        double price = 0.0;
        for (Item item : items) {
            price = item.getPrice();
        }
        return price;
    }

}
