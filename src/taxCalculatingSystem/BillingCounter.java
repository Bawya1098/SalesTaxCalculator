package taxCalculatingSystem;

import java.util.List;
import java.util.Scanner;

public class BillingCounter {
    private Scanner scan = new Scanner(System.in);
    private static final double tax = 0.15;

    public static void main(String[] args) {
        BillingCounter counter = new BillingCounter();
        Bill bill = new Bill();
        System.out.println("Enter Number of Items: ");
        int noOfItems = counter.scan.nextInt();
        counter.scan.nextLine();
        List<Item> items = counter.addItem(bill, noOfItems);
        counter.calculateTax(items);
        bill.displayItemsName(items);
    }

    private void calculateTax(List<Item> items) {
        for (Item item : items) {
            double price = item.getPrice();
            double itemTax = price * BillingCounter.tax;
            item.setTax(itemTax);
        }
    }

    private List<Item> addItem(Bill bill, int noOfItems) {
        for (int index = 0; index < noOfItems; index++) {
            String[] strings = scan.nextLine().split(" ");
            int quantity = Integer.parseInt(strings[0]);
            String itemName = strings[1];
            double price = Double.parseDouble(strings[3]);
            Item item = new Item(itemName, quantity, price);
            bill.items.add(item);
        }
        return bill.items;
    }
}
