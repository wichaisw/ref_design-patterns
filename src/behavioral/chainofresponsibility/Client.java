package behavioral.chainofresponsibility;

public class Client {

    public static void main(String[] args) {
        PaymentCheckoutHandler handler = new PaymentCheckoutHandler();
        CustomerInfoCheckoutHandler customerInfoCheckoutHandler = new CustomerInfoCheckoutHandler();

        handler.setNextHandler(customerInfoCheckoutHandler);
        handler.handleCheckout();

    }
}
