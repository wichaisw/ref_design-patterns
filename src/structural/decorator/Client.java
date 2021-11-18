package structural.decorator;

public class Client {

    public static void main(String[] args) {
        WebPage myPage = new BasicWebPage();
        myPage = new AuthenticatedWebPage(myPage);
        myPage = new AuthorizedWebPage(myPage);
        // each page stacked on top of each other
        // with decorator pattern, class which has behavior of both authenticated and authorized is not needed
        myPage.display();

    }
}
