package com.example.test.kyb.middesk.outbound.request;

import com.example.test.kyb.middesk.outbound.request.daos.MiddeskBusinessDAO;
import com.example.test.kyb.middesk.outbound.request.services.CreateMiddeskBusiness;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class MiddeskRequestorTest {
    public static String JSON = "{\n" +
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

    private CreateMiddeskBusiness setup() {
        return new CreateMiddeskBusiness(new MiddeskBusinessDAO());

    }

    @Test
    public void test_something_something() throws IOException {
        // Arrange
        final CreateMiddeskBusiness target = setup();
        CloseableHttpClient httpclient = HttpClients.createDefault();

        // Act
        target.apply(httpclient, JSON);

        // Assert
        //@TODO: We need to assert that we persisted.
    }

}