package behavioral.template;

// need to be an abstract class
public abstract class PastaDish {

    // final method cannot be overridden by subclasses
    public final void makeRecipe() {
        boilWater();
        addPasta();
        cookPasta();
        drainAndPlate();
        addSauce();
        addProtein();
        addGarnish();
    }

    protected abstract void addPasta();
    protected abstract void addSauce();
    protected abstract void addProtein();
    protected abstract void addGarnish();

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void cookPasta() {
        System.out.println("Cooking pasta");
    }

    private void drainAndPlate() {
        System.out.println("Draining and plating");
    }
}
