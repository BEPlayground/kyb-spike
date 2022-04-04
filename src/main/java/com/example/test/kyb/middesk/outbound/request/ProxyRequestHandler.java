package com.example.test.kyb.middesk.outbound.request;

import com.example.test.kyb.middesk.outbound.request.daos.MiddeskBusinessDAO;
import com.example.test.kyb.middesk.outbound.request.services.CreateMiddeskBusiness;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;

public class ProxyRequestHandler {
    public static String requestWithJson = "{\n" +
            " \"name\":\"Middesk3\", \n" +
            " \"tin\":\"123410000\", \n" +
            "\"website\":\"https://www.middesk.com\", \n" +
            "\"addresses\":[ \n" +
            " { \n " +
            "\"address_line1\":\"2180 Bryant St\", \n" +
            "\"address_line2\":\"Unit 210\", \n" +
            "\"city\":\"san francisco\", \n" +
            "\"state\":\"CA\", \n" +
            "\"postal_code\":94110 \n" +
            "}\n" +
            "]\n" +
            "}\n";

    public static void main(String[] args) throws IOException {
        final CreateMiddeskBusiness createMiddeskBusiness = new CreateMiddeskBusiness(new MiddeskBusinessDAO());

        CloseableHttpClient httpclient = HttpClients.createDefault();

        createMiddeskBusiness.apply(httpclient, requestWithJson);

        // Poll the endpoint to get the data of the business when it's done
    }
}
