package creational.prototype;

public class Client {
    public static void main(String[] args) {
        Video video = new Video();
        video.setUrl("http://test-video.com");

        GraphicTool videoTool = new GraphicTool(video);
        Graphic graphicVideo = videoTool.createGraphic();

        System.out.println(graphicVideo.getUrl());

        // ----------------------------------------------------------

        Image image = new Image();
        image.setUrl("http://test-image.com");

        GraphicTool imageTool = new GraphicTool(image);
        Graphic graphicImage = imageTool.createGraphic();

        image.setUrl("http://test-image2.com");

        GraphicTool imageTool2 = new GraphicTool(image);
        Graphic graphicImage2 = imageTool2.createGraphic();

        System.out.println(graphicImage.getUrl());
        System.out.println(graphicImage2.getUrl());

    }
}
