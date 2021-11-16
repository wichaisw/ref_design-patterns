package creational.factoryobject;

public class Client {

    public static void main(String[] args) {

        KnifeStore store = new KnifeStore(new KnifeFactory());

        Knife knife = store.orderKnife("chefs");

        store = new KnifeStore(new BudgetKnifeFactory());

        BudgetChefsKnife budgetChefsknife = (BudgetChefsKnife) store.orderKnife("chefs");
    }
}
