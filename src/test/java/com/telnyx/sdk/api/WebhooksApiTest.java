/*
 * Telnyx API
 * SIP trunking, SMS, MMS, Call Control and Telephony Data Services.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: support@telnyx.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.telnyx.sdk.api;

import com.telnyx.sdk.*;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.ListWebhookDeliveriesResponse;
import com.telnyx.sdk.model.RetrieveWebhookDelivery;
import java.util.UUID;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WebhooksApi
 */
public class WebhooksApiTest {

    private final WebhooksApi api = new WebhooksApi();

    /**
     * List webhook deliveries
     *
     * Lists webhook_deliveries for the authenticated user
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWebhookDeliveriesTest() throws ApiException {
        //String filterStatusEq = null;
        //String filterWebhookContains = null;
        //String filterAttemptsContains = null;
        //String filterStartedAtGte = null;
        //String filterStartedAtLte = null;
        //String filterFinishedAtGte = null;
        //String filterFinishedAtLte = null;
        //Integer pageNumber = null;
        //Integer pageSize = null;
        //ListWebhookDeliveriesResponse response = api.getWebhookDeliveries(filterStatusEq, filterWebhookContains, filterAttemptsContains, filterStartedAtGte, filterStartedAtLte, filterFinishedAtGte, filterFinishedAtLte, pageNumber, pageSize);
        // TODO: test validations
    }

    /**
     * Find webhook_delivery details by ID
     *
     * Provides webhook_delivery debug data, such as timestamps, delivery status and attempts.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWebhookDeliveryTest() throws ApiException {
        //UUID id = null;
        //RetrieveWebhookDelivery response = api.getWebhookDelivery(id);
        // TODO: test validations
    }

}
