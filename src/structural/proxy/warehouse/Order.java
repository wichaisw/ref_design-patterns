package structural.proxy.warehouse;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Item> itemList;

    public Order() {
        this.itemList = new ArrayList<>();
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void addItem(Item item) {
        itemList.add(item);
    }
}
