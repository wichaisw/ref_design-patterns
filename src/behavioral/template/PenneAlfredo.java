package behavioral.template;

public class PenneAlfredo extends PastaDish {

    @Override
    protected void addPasta() {
        System.out.println("Add penne");
    }

    @Override
    protected void addSauce() {
        System.out.println("Add chicken");
    }

    @Override
    protected void addProtein() {
        System.out.println("Add Alfredo sauce");
    }

    @Override
    protected void addGarnish() {
        System.out.println("Add parsley");
    }
}
