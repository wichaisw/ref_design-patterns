package behavioral.state.vendingmachine;

public class HasOneDollarState implements State {
    @Override
    public void insertDollar(VendingMachine vendingMachine) {
        System.out.println("dollar inserted");

        vendingMachine.setState(
            vendingMachine.getHasOneDollarState()
        );
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
        System.out.println("releasing product");

        if(vendingMachine.getCount() > 1) {
            vendingMachine.doReleaseProduct();
            vendingMachine.setCount(vendingMachine.getCount() - 1);
            vendingMachine.setState(
                vendingMachine.getIdleState()
            );
        } else {
            vendingMachine.doReleaseProduct();
            vendingMachine.setState(
                vendingMachine.getOutOfStockState()
            );
        }
    }
}
