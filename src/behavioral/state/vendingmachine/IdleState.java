package behavioral.state.vendingmachine;

public class IdleState implements State {

    @Override
    public void insertDollar(VendingMachine vendingMachine) {
        System.out.println("dollar inserted");

        vendingMachine.setState(
            vendingMachine.getHasOneDollarState()
        );
    }

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        System.out.println("not money to return");
    }

    @Override
    public void dispense(VendingMachine vendingMachine) {
        System.out.println("payment required");
    }
}
