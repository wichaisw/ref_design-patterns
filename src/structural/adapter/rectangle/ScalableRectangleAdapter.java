package structural.adapter.rectangle;

// Adapter
public class ScalableRectangleAdapter implements Rectangle {
    NonScalableRectangle rectangle;

    public ScalableRectangleAdapter(NonScalableRectangle nonScalableRectangle) {
        this.rectangle = nonScalableRectangle;
    }

    @Override
    public void scale(float factor) {
        rectangle.setHeight(factor * rectangle.getHeight());
        rectangle.setWidth(factor * rectangle.getWidth());
    }

    @Override
    public float area() {
        return rectangle.area;
    }

    @Override
    public float circumference() {
        return 0;
    }
}
