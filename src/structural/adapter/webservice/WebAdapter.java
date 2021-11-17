package structural.adapter.webservice;

import com.google.gson.Gson;

// Adapter
public class WebAdapter implements WebRequester {
    private WebService service;

    public void connect(WebService currentService) {
        this.service = currentService;
    }

    @Override
    public int request(Object request) {
        String result = this.toJson(request);
        String response = service.request(result);

        if(response != null) {
            return 200;
        }
        return 500;
    }

    private String toJson(Object input) {
        Gson gson = new Gson();
        return gson.toJson(input);
    }
}
