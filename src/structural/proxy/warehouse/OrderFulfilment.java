package structural.proxy.warehouse;

import java.util.List;

// Proxy class, has list of warehouse that can delegate customer order to,
// depending on whether or not that subject can fulfil the order
public class OrderFulfilment implements IOrder {
    private List<Warehouse> warehouses;

    public OrderFulfilment(List<Warehouse> warehouses) {
        this.warehouses = warehouses;
    }

    @Override
    public void fulfilOrder(Order order) {
        // For each item in a customer order, check each warehouse to see if its is in stock.
        // If it is then create a new Order for that warehouse. Else check the next warehouse.
        for(Item item: order.getItemList()) {
            for(Warehouse warehouse : warehouses) {
                if(warehouse.currentInventory(item) > 1) {
                    // Send all the Orders to the warehouse(s) after finish iterating over all the item in the original Order.
                    Order fulfilableOrder = new Order();
                    fulfilableOrder.addItem(item);
                    warehouse.fulfilOrder(fulfilableOrder);
                }
            }
        }

    }
}
