package creational.FactoryObject;

public class SteakKnife implements Knife {

    @Override
    public void sharpen() {
        System.out.println("sharpen steakKnife");
    }

    @Override
    public void polish() {
        System.out.println("polish steakKnife");
    }
}
