package structural.adapter.webservice;

// Adaptee
public class WebService {

    public WebService(String webHost) {

    }

    public String request(Object request) {
        return "json result";
    }
}
