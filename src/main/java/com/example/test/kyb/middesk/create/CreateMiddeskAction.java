package com.example.test.kyb.middesk.create;

import com.example.test.kyb.middesk.create.daos.CreateMiddeskBusinessDAO;
import com.example.test.kyb.middesk.create.services.CreateMiddeskBusiness;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;

public class CreateMiddeskAction {
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
        new CreateMiddeskBusiness(new CreateMiddeskBusinessDAO()).apply(HttpClients.createDefault(), requestWithJson);

    }
}
