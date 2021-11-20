package behavioral.state.vendingmachine;

public class OutOfStockState implements State {

    @Override
    public void insertDollar(VendingMachine vendingMachine) {
        System.out.println("product is out of stock");

        vendingMachine.doReturnMoney();
    }

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        System.out.println("returning money");

        vendingMachine.doReturnMoney();
        vendingMachine.setState(
                vendingMachine.getIdleState()
        );
    }

    @Override
    public void dispense(VendingMachine vendingMachine) {
        System.out.println("out of stock");
        return;
    }
}
