package creational.factorymethod;

public abstract class KnifeStore {
    public Knife orderKnife(String knifeType) {
        Knife knife;

        // creating a knife is a method in this class instead of Factory class
        // or having multiple Factory class, then we can select it here
        knife = createKnife(knifeType);

        knife.sharpen(knifeType);
        knife.polish(knifeType);

        return knife;
    }

    protected abstract Knife createKnife(String knifeType);
}
