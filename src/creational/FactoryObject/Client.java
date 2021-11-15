package creational.FactoryObject;

public class Client {

    public static void main(String[] args) {

        KnifeStore store = new KnifeStore(new KnifeFactory());

        Knife knife = store.orderKnife("chefs");
    }
}
