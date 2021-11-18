package structural.decorator;

// decorator class
// handle the aggregation of the concrete decorator classes
public abstract class WebPageDecorator implements WebPage {
    // contain only one instance of WebPage
    // each type of webpage is responsible for its own behavior
    // recursively invoke the next WebPage on the stack to execute the behavior
    protected WebPage page;

    // link different subtype of WebPage together in the stack
    // the order matters, the BasicWebPage must be the first one on the stack
    public WebPageDecorator(WebPage webPage) {
        this.page = webPage;
    }

    @Override
    public void display() {
        this.page.display();
    }
}
