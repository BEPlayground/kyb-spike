package com.example.test.kyb.middesk.inbound;

import java.io.IOException;

public class MiddeskLifecycleWebhook {

    public static void main(String[] args) {
        // Receive payload
        //@TODO: Verify payload with sha
        //@TODO: Parse data
        // we have an event, with an id
        // {type: 'business.created', id: 'the id of the business we can use to lookup'}
        //@TODO: Now that we have business ID, let's make another fetch request to Middesk to get the business
        //@TODO: Update existing business with the full business
    }
}
