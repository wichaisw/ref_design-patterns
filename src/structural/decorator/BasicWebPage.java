package structural.decorator;

// Base concrete component
public class BasicWebPage implements WebPage {

    private String html = "index.html";
    private String styleSheet = "styles.css";
    private String scripts = "scripts.js";

    @Override
    public void display() {
        // renders the HTML to the stylesheet, and run any embedded script
        System.out.println("Basic web page");
    }
}
