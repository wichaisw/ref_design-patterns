package behavioral.chainofresponsibility;

public class CustomerInfoCheckoutHandler extends CheckoutHandler{

    @Override
    public void handleCheckout() {
        // if information is registered
        System.out.println("Adding extra info to checkout of the customer");

        if(nextHandler != null){
            nextHandler.handleCheckout();
        }
    }
}
