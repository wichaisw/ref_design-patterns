package structural.decorator;

public class AuthorizedWebPage extends WebPageDecorator {

    public AuthorizedWebPage(WebPage decoratedPage) {
        super(decoratedPage);
    }

    public void authorizedUser() {
        System.out.println("Authorizing user");
    }

    @Override
    public void display() {
        // recursively call the display() behavior
        // the call to super.display() will cause the next web page in the stack to execute its version of display() until you get to the BasicWebPage
        // BasicWebPage, the base concrete class, does not aggregate any other class so it execute its display() bahavior
        // link the call of this play all the way to bottom, and bubble the execution back up
        super.display(); // AuthenticatedWebPage.display()
        this.authorizedUser();
    }
}
