package structural.adapter.rectangle;

public class Client {
    public static void main(String[] args) {
        NonScalableRectangle nonScalableRectangle = new NonScalableRectangle();
        ScalableRectangleAdapter adapter = new ScalableRectangleAdapter(nonScalableRectangle);

        adapter.scale(5);

        // NonScalableRectangle can't use this, because it doesn't implement Rectangle
        myMethod(adapter);

    }

    public static void myMethod(Rectangle r) {
        System.out.println("do something");
    }
}
