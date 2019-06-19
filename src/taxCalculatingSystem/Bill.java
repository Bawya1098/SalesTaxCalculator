package taxCalculatingSystem;

import java.util.ArrayList;
import java.util.List;

public class Bill {
    List<Item> items = new ArrayList<>();

    public void displayItemsName(List<Item> items) {
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }
}
