package com.example.test.kyb.middesk.webhook;

import com.example.test.kyb.middesk.webhook.daos.CreateMiddeskBusinessReportDAO;
import com.example.test.kyb.middesk.webhook.services.FetchMiddeskBusinessById;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;

public class MiddeskLifecycleWebhook {
    final static FetchMiddeskBusinessById fetchMiddeskBusinessById
            = new FetchMiddeskBusinessById(new CreateMiddeskBusinessReportDAO());

    public static void main(String[] args) throws IOException {
        //@TODO: Receive payload

        verify();

        fetchMiddeskBusinessById.apply(HttpClients.createDefault(), parseIdFromRequest());
    }

    private static void verify() {
        //@TODO: Verify payload with sha, like they do with python example.
    }

    private static String parseIdFromRequest() {
        //@TODO: { ..., data: object: { id: "6a473f53-e8a4-4302-94aa-2e8b13d85839" } }
        return "6a473f53-e8a4-4302-94aa-2e8b13d85839";
    }

}
