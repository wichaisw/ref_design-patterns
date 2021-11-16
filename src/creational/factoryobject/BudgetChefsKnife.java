package creational.factoryobject;

public class BudgetChefsKnife extends ChefsKnife{

    @Override
    public void sharpen() {
        System.out.println("sharpen budget chefs knife");
    }

    @Override
    public void polish() {
        System.out.println("polish budget chefs knife");
    }
}
