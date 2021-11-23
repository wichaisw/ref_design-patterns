package behavioral.observer;

public class Subscriber implements Observer {

    @Override
    public void update() {
        System.out.println("get blog change");
    }

    public static void main(String[] args) {
        Blog blog = new Blog();
        Subscriber subscriber = new Subscriber();
        Subscriber subscriber2 = new Subscriber();

        blog.registerObserver(subscriber);
        blog.registerObserver(subscriber2);
        blog.notifyObserver();
    }
}
