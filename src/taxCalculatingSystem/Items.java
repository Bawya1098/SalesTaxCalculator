package taxCalculatingSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Items {
    private List<Item> items = new ArrayList<>();

    List<Item> addItem(Scanner scan, int noOfItems) {
        for (int i = 1; i <= noOfItems; i++) {
            String[] strings = scan.nextLine().split(" ");
            int quantity = Integer.parseInt(strings[0]);
            String itemName = strings[1];
            double price = Double.parseDouble(strings[3]);
            Item item = new Item(itemName, quantity, price);
            items.add(item);
        }
        return items;
    }

    public void displayItemsName() {
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }

    public void calculateTax(List<String> exemptedItems, double tax) {
        for (Item item : items) {
            boolean ret = item.isExemptedItem(exemptedItems);
            if (ret)
                item.setTaxCost(0);
            else {
                double taxCost = item.calculateTax(tax);
                item.setTaxCost(taxCost);
            }
        }
    }
}
