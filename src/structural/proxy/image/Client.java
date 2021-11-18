package structural.proxy.image;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        ImageProxy image = new ImageProxy("test image");
        ImageProxy image2 = new ImageProxy("second image");

        List<Image> images = new ArrayList<Image>();
        images.add(image);
        images.add(image2);

        Application application = new Application(images);

        System.out.println("Application setup");

        application.draw();

    }
}
