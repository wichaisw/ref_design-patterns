package creational.factorymethod;

public class Client {

    public static void main(String[] args) {

        KnifeStore store = new BudgetKnifeStore();

        BudgetSteakKnife knife = (BudgetSteakKnife) store.orderKnife("steak");

        knife.helloBudgetKnife();
        knife.cutSteak();
    }
}
