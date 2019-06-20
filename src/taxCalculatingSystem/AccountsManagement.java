package taxCalculatingSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountsManagement {
    private List<Item> items = new ArrayList<>();
    private static final double totalTax = 0.15;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        AccountsManagement management = new AccountsManagement();
        System.out.println("Enter Number of Items: ");
        int noOfItems = scan.nextInt();
        scan.nextLine();
        List<Item> items = management.addItem(scan, noOfItems);
        management.displayItemsName(items);
    }

    private List<Item> addItem(Scanner scan, int noOfItems) {
        for (int index = 0; index < noOfItems; index++) {
            String[] strings = scan.nextLine().split(" ");
            int quantity = Integer.parseInt(strings[0]);
            String itemName = strings[1];
            double price = Double.parseDouble(strings[3]);
            Item item = new Item(itemName, quantity, price,AccountsManagement.totalTax);
            items.add(item);
        }
        return items;
    }

    private void displayItemsName(List<Item> items) {
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }



}
