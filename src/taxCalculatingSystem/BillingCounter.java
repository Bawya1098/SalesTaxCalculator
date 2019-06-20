package taxCalculatingSystem;

import java.util.List;
import java.util.Scanner;

public class BillingCounter {
    private static final double tax = 0.15;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BillingCounter counter = new BillingCounter();
        Bill bill = new Bill();
        System.out.println("Enter Number of Items: ");
        int noOfItems = scan.nextInt();
        scan.nextLine();
        List<Item> items = bill.addItem(scan, noOfItems);
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

}
