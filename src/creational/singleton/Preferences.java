package creational.singleton;

public class Preferences {

    // holder of the single instance for the singleton class
    // null if no instance is instantiated
    private static Preferences uniqueInstance = null;

    // No other class can instantiate a singleton
    // if you need to have singleton subclass, use protected instead
    private Preferences() {

    }

    // use synchronized to allow only one instance when using multiple threads
    private synchronized static void createInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new Preferences();
        }
    }

    // lazy constructor: object is not created until it's needed
    public static Preferences getInstance() {
        if(uniqueInstance == null) {
            createInstance();
        }
        return uniqueInstance;
    }

    public static void helloSingleton() {
        System.out.println("Hello from singleton.");
    }
}

