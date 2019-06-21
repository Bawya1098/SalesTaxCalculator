package taxCalculatingSystem;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AccountsManagement {
    private List<String> exemptedItems = Arrays.asList("book", "Doll", "medicine", "chocolate");
    private static double tax = 0.15;

    public static void main(String[] args) {
        AccountsManagement management = new AccountsManagement();
        Scanner scan = new Scanner(System.in);
        Items items = new Items();
        System.out.println("Enter Number of Items: ");
        int noOfItems = Integer.parseInt(scan.nextLine());
        items.addItem(scan, noOfItems);
        items.calculateTax(management.exemptedItems, tax);
        items.displayItemsName();
    }
}

