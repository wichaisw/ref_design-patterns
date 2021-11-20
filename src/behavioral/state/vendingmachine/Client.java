package behavioral.state.vendingmachine;

public class Client {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(0);

        vendingMachine.insertDollar();
        vendingMachine.dispense();

    }
}
