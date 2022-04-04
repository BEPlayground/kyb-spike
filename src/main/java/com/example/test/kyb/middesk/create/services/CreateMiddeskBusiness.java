package com.example.test.kyb.middesk.create.services;

import com.example.test.kyb.middesk.create.daos.CreateMiddeskBusinessDAO;
import com.example.test.kyb.middesk.create.responsePayload.Root;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

import static org.apache.http.HttpHeaders.AUTHORIZATION;
import static org.apache.http.HttpHeaders.CONTENT_TYPE;
import static org.apache.http.entity.ContentType.APPLICATION_FORM_URLENCODED;

public class CreateMiddeskBusiness {
    final String URL = "https://api-sandbox.middesk.com/v1/businesses";
    final String APPLICATION_CONTENT_TYPE = "application/json;charset=UTF-8";
    final String API_KEY = "Bearer mk_test_ab588fa6c5bc924cf9e49ca1";

    final private CreateMiddeskBusinessDAO middeskBusinessDAO;

    public CreateMiddeskBusiness(CreateMiddeskBusinessDAO middeskBusinessDAO) {
        this.middeskBusinessDAO = middeskBusinessDAO;
    }

    public void apply(CloseableHttpClient httpClient, String requestInJson) throws IOException {

        // prep the json data for the request
        StringEntity entity = new StringEntity(requestInJson, APPLICATION_FORM_URLENCODED);

        // create request
        HttpPost httpPost = new HttpPost(URL);
        httpPost.setEntity(entity);
        httpPost.setHeader(CONTENT_TYPE, APPLICATION_CONTENT_TYPE);
        httpPost.setHeader(AUTHORIZATION, API_KEY);

        // kick off request
        CloseableHttpResponse responseFromMiddeskAPI = httpClient.execute(httpPost);
        String data = EntityUtils.toString(responseFromMiddeskAPI.getEntity());
        EntityUtils.consume(responseFromMiddeskAPI.getEntity());

        // handle response
        Root root = new ObjectMapper().readValue(data, Root.class);

        // persist
        middeskBusinessDAO.apply(root);
    }
}
