package creational.FactoryObject;

public class ChefsKnife implements Knife {

    @Override
    public void sharpen() {
        System.out.println("sharpen chefsKnife");
    }

    @Override
    public void polish() {
        System.out.println("polish chefsKnife");
    }
}
