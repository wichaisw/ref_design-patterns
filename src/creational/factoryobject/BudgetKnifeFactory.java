package creational.factoryobject;

public class BudgetKnifeFactory extends KnifeFactory {

    @Override
    public Knife createKnife(String knifeType) {
        Knife knife = null;

        // create Knife object
        if(knifeType.equals("steak")) {
            knife = new SteakKnife();
        } else if(knifeType.equals(("chefs"))) {
            knife = new BudgetChefsKnife();
        }

        return knife;
    }
}
