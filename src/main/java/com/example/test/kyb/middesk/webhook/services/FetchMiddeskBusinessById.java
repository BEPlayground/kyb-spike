package com.example.test.kyb.middesk.webhook.services;

import com.example.test.kyb.middesk.webhook.daos.CreateMiddeskBusinessReportDAO;
import com.example.test.kyb.middesk.webhook.responsePayload.Root;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

import static org.apache.http.HttpHeaders.AUTHORIZATION;
import static org.apache.http.HttpHeaders.CONTENT_TYPE;

public class FetchMiddeskBusinessById {
    final String APPLICATION_CONTENT_TYPE = "application/json;charset=UTF-8";
    final String API_KEY = "Bearer mk_test_ab588fa6c5bc924cf9e49ca1";

    final private CreateMiddeskBusinessReportDAO middeskBusinessDAO;

    public FetchMiddeskBusinessById(CreateMiddeskBusinessReportDAO middeskBusinessDAO) {
        this.middeskBusinessDAO = middeskBusinessDAO;
    }

    public void apply(CloseableHttpClient httpClient, String businessId) throws IOException {
        final String url = String.format("https://api-sandbox.middesk.com/v1/businesses/%s", businessId);

        // create request
        HttpGet httpGet = new HttpGet(url);
        httpGet.setHeader(CONTENT_TYPE, APPLICATION_CONTENT_TYPE);
        httpGet.setHeader(AUTHORIZATION, API_KEY);

        // kick off request
        CloseableHttpResponse responseFromMiddeskAPI = httpClient.execute(httpGet);
        String data = EntityUtils.toString(responseFromMiddeskAPI.getEntity());
        EntityUtils.consume(responseFromMiddeskAPI.getEntity());

        // handle response
        Root root = new ObjectMapper().readValue(data, Root.class);

        // persist
        middeskBusinessDAO.apply(root);
    }
}