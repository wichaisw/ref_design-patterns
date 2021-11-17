package structural.adapter.webservice;

public class Program {
    public static void main(String[] args) {
        String webHost = "Host: https://google.com\n\r";
        WebService service = new WebService(webHost);
        WebAdapter adapter = new WebAdapter();
        adapter.connect(service);

        // client doesn't need to know about WebService
        // the adaptee(WebService) is hidden from the client by the adapter class
        WebClient client = new WebClient(adapter);
        client.doWork();

        // in most case WebService might be third-library which we can't change it type so we have to use adapter
    }
}
