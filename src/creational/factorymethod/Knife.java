package creational.factorymethod;

public abstract class Knife {

    void sharpen(String knifeType) {
        System.out.printf("sharpen %s knife%n", knifeType);
    };
    void polish(String knifeType) {
        System.out.printf("polishing %s knife%n", knifeType);
    };
}
