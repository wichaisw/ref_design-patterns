package behavioral.state.vendingmachine;

// context
public class VendingMachine {
    private State idleState;
    private State hasOneDollarState;
    private State outOfStockState;

    private State currentState;
    private int count;

    // state:
    //   Idle, HasOneDollar, OutOfStock
    public VendingMachine(int count) {
        idleState = new IdleState();
        hasOneDollarState = new HasOneDollarState();
        outOfStockState = new OutOfStockState();

        if(count > 0) {
            currentState = idleState;
            this.count = count;
        } else {
            currentState = outOfStockState;
            this.count = 0;
        }
    }

    protected void setState(State state) {
        this.currentState = state;
    }

    // handle user events (triggers): insertDollar, ejectMoney, dispense
//    public void insertDollar() {
//        if(currentState == State.Idle) {
//            currentState = State.HasOneDollar;
//        } else if(currentState == State.HasOneDollar) {
//            doReturnMoney();
//            currentState = State.Idle;
//        } else if(currentState == State.OutOfStock) {
//            doReturnMoney();
//        }
//    }

    public void insertDollar() {
        currentState.insertDollar(this);
    }

    public void ejectMoney() {
        currentState.ejectMoney(this);
    }

    public void dispense() {
        currentState.dispense(this);
    }


    protected void doReturnMoney() {
        System.out.println("return one dollar");
    }

    protected void doReleaseProduct() {
        System.out.println("release product");
    }

    protected State getHasOneDollarState() {
        return hasOneDollarState;
    }

    protected State getOutOfStockState() {
        return outOfStockState;
    }

    protected State getIdleState() {
        return idleState;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
