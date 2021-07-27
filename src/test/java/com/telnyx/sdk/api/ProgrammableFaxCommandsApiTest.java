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
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.GetFaxResponse;
import com.telnyx.sdk.model.ListFaxesResponse;
import java.time.OffsetDateTime;
import com.telnyx.sdk.model.RefreshFaxResponse;
import com.telnyx.sdk.model.SendFaxRequest;
import com.telnyx.sdk.model.SendFaxResponse;
import java.util.UUID;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertNotNull;

/**
 * API tests for ProgrammableFaxCommandsApi
 */
public class ProgrammableFaxCommandsApiTest {

    private final ProgrammableFaxCommandsApi api = new ProgrammableFaxCommandsApi();

    @Before
    public void setup() {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath(TestConfiguration.MOCK_SERVER_URL);

        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken(TestConfiguration.API_KEY);
    }

    /**
     * Delete a fax
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFaxTest() throws ApiException {
        //UUID id = null;
        //api.deleteFax(id);
        // TODO: test validations
    }

    /**
     * View a list of faxes
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listFaxesTest() throws ApiException {
        //OffsetDateTime filterCreatedAtGte = null;
        //OffsetDateTime filterCreatedAtGt = null;
        //OffsetDateTime filterCreatedAtLte = null;
        //OffsetDateTime filterCreatedAtLt = null;
        //String filterDirectionEq = null;
        //String filterFromEq = null;
        //Integer pageSize = null;
        //Integer pageNumber = null;
        //ListFaxesResponse response = api.listFaxes(filterCreatedAtGte, filterCreatedAtGt, filterCreatedAtLte, filterCreatedAtLt, filterDirectionEq, filterFromEq, pageSize, pageNumber);
        // TODO: test validations
    }

    /**
     * Refresh a fax
     *
     * This endpoint refreshes the media_url expiration for inbound faxes
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void refreshFaxTest() throws ApiException {
        //UUID id = null;
        //RefreshFaxResponse response = api.refreshFax(id);
        // TODO: test validations
    }

    /**
     * Send a fax
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendFaxTest() throws ApiException {
        //SendFaxRequest sendFaxRequest = null;
        //SendFaxResponse response = api.sendFax(sendFaxRequest);
        // TODO: test validations
    }

    /**
     * View a fax
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void viewFaxTest() throws ApiException {
        //UUID id = null;
        //GetFaxResponse response = api.viewFax(id);
        // TODO: test validations
    }

}
