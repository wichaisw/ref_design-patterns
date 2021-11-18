package structural.proxy.warehouse;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse("warehouse 1");
        warehouse.addToStock("456", 8);


        Item item1 = new Item("123");
        Item item2 = new Item("456");
        Order myOrder = new Order();
        myOrder.addItem(item1);
        myOrder.addItem(item2);

        List<Warehouse> warehouseList = new ArrayList<Warehouse>();
        warehouseList.add(warehouse);
        OrderFulfilment orderFulfilment = new OrderFulfilment(warehouseList);
        orderFulfilment.fulfilOrder(myOrder);

    }
}
