package taxCalculatingSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bill {
    List<Item> items = new ArrayList<>();

    public void displayItemsName(List<Item> items) {
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }

    public List<Item> addItem(Scanner scan, int noOfItems) {
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
}
