package creational.singleton;

public class Client {

    public static void main(String[] args) {
        // maintenance logic is handled internally
        // each only have one instance at runtime.
        Preferences.getInstance().helloSingleton();

    }
}
