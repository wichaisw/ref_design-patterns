package creational.factorymethod;

public class BudgetKnifeStore extends KnifeStore {

    // up to any subclass of KnifeStore to define this method
    // each subclass muse define their own createKnife method
    protected Knife createKnife(String knifeType) {
        if(knifeType.equals("steak")) {
            return new BudgetSteakKnife();
        } else if(knifeType.equals(("chefs"))) {
            return new BudgetChefsKnife();
        } else return null;
    }
}
