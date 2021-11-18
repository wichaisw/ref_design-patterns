package structural.proxy.warehouse;

import java.util.Hashtable;

// The real subject class, responsible for actually processing and fulfiling the order
public class Warehouse implements IOrder {
    private Hashtable<String, Integer> stock;
    private String address;

    public Warehouse(String address) {
        this.stock = new Hashtable<String, Integer>();
        this.address = address;
    }

    public int currentInventory(Item item) {
        if(stock.containsKey(item.sku)) {
            return stock.get(item.sku).intValue();
        }

        return 0;
    }

    @Override
    public void fulfilOrder(Order order) {
        System.out.println("process and deliver: ");
        for(Item item : order.getItemList()) {
            // process the order for shipment and delivery
            this.stock.replace(item.sku, this.stock.get(item.sku) - 1);
            System.out.println("remained: " + item.sku + ": " + (this.stock.get(item.sku)));
        }
    }

    public Hashtable<String, Integer> getStock() {
        return stock;
    }

    public void addToStock(String sku, int amount) {
        this.stock.put(sku, amount);
    }
}
