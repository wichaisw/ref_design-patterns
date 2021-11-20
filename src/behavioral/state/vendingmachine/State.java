package behavioral.state.vendingmachine;

public interface State {

    void insertDollar(VendingMachine vendingMachine);
    void ejectMoney(VendingMachine vendingMachine);
    void dispense(VendingMachine vendingMachine);

    // all potential vending machine state as singletons
//    public final static State Idle = new State();
//    public final static State HasOneDollar = new State();
//    public final static State OutOfStock = new State();
}
