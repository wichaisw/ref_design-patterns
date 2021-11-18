package structural.proxy.image;

public class ImageProxy extends Image {

    private Image image;

    public ImageProxy(String url) {
        super();
        this.url = url;
    }

    @Override
    public void draw() {
        // prevent loading every image before using it
        if(image == null) {
            image = new Image(this.url);
        }

        image.draw();
    }
}
