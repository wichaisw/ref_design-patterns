package creational.prototype;

public class Image extends  Graphic{

    private String url;

    @Override
    public Graphic clone() {
        Image clone = new Image();
        clone.setUrl(this.url);

        return clone;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String getUrl() {
        return url;
    }
}
