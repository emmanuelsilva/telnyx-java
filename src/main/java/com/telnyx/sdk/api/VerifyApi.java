package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreateVerificationRequestCall;
import com.telnyx.sdk.model.CreateVerificationRequestFlashcall;
import com.telnyx.sdk.model.CreateVerificationRequestPSD2;
import com.telnyx.sdk.model.CreateVerificationRequestSMS;
import com.telnyx.sdk.model.CreateVerificationRequestWhatsapp;
import com.telnyx.sdk.model.CreateVerificationResponse;
import com.telnyx.sdk.model.CreateVerifyProfileRequest;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.ListVerificationsResponse;
import com.telnyx.sdk.model.ListVerifyProfilesResponse;
import com.telnyx.sdk.model.RetrieveVerificationResponse;
import java.util.UUID;
import com.telnyx.sdk.model.UpdateVerifyProfileRequest;
import com.telnyx.sdk.model.VerifyProfileResponseDataWrapper;
import com.telnyx.sdk.model.VerifyVerificationCodeRequest;
import com.telnyx.sdk.model.VerifyVerificationCodeResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VerifyApi {
  private ApiClient apiClient;

  public VerifyApi() {
    this(Configuration.getDefaultApiClient());
  }

  public VerifyApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Trigger a Call verification
   * 
   * @param createVerificationRequestCall  (required)
   * @return CreateVerificationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected verifications response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateVerificationResponse createVerificationCall(CreateVerificationRequestCall createVerificationRequestCall) throws ApiException {
    return createVerificationCallWithHttpInfo(createVerificationRequestCall).getData();
  }

  /**
   * Trigger a Call verification
   * 
   * @param createVerificationRequestCall  (required)
   * @return ApiResponse&lt;CreateVerificationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected verifications response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateVerificationResponse> createVerificationCallWithHttpInfo(CreateVerificationRequestCall createVerificationRequestCall) throws ApiException {
    Object localVarPostBody = createVerificationRequestCall;
    
    // verify the required parameter 'createVerificationRequestCall' is set
    if (createVerificationRequestCall == null) {
      throw new ApiException(400, "Missing the required parameter 'createVerificationRequestCall' when calling createVerificationCall");
    }
    
    // create path and map variables
    String localVarPath = "/verifications/call";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<CreateVerificationResponse> localVarReturnType = new GenericType<CreateVerificationResponse>() {};

    return apiClient.invokeAPI("VerifyApi.createVerificationCall", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Trigger a Flash call verification
   * 
   * @param createVerificationRequestFlashcall  (required)
   * @return CreateVerificationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected verifications response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateVerificationResponse createVerificationFlashcall(CreateVerificationRequestFlashcall createVerificationRequestFlashcall) throws ApiException {
    return createVerificationFlashcallWithHttpInfo(createVerificationRequestFlashcall).getData();
  }

  /**
   * Trigger a Flash call verification
   * 
   * @param createVerificationRequestFlashcall  (required)
   * @return ApiResponse&lt;CreateVerificationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected verifications response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateVerificationResponse> createVerificationFlashcallWithHttpInfo(CreateVerificationRequestFlashcall createVerificationRequestFlashcall) throws ApiException {
    Object localVarPostBody = createVerificationRequestFlashcall;
    
    // verify the required parameter 'createVerificationRequestFlashcall' is set
    if (createVerificationRequestFlashcall == null) {
      throw new ApiException(400, "Missing the required parameter 'createVerificationRequestFlashcall' when calling createVerificationFlashcall");
    }
    
    // create path and map variables
    String localVarPath = "/verifications/flashcall";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<CreateVerificationResponse> localVarReturnType = new GenericType<CreateVerificationResponse>() {};

    return apiClient.invokeAPI("VerifyApi.createVerificationFlashcall", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Trigger a PSD2 verification
   * 
   * @param createVerificationRequestPSD2  (required)
   * @return CreateVerificationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected verifications response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateVerificationResponse createVerificationPSD2(CreateVerificationRequestPSD2 createVerificationRequestPSD2) throws ApiException {
    return createVerificationPSD2WithHttpInfo(createVerificationRequestPSD2).getData();
  }

  /**
   * Trigger a PSD2 verification
   * 
   * @param createVerificationRequestPSD2  (required)
   * @return ApiResponse&lt;CreateVerificationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected verifications response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateVerificationResponse> createVerificationPSD2WithHttpInfo(CreateVerificationRequestPSD2 createVerificationRequestPSD2) throws ApiException {
    Object localVarPostBody = createVerificationRequestPSD2;
    
    // verify the required parameter 'createVerificationRequestPSD2' is set
    if (createVerificationRequestPSD2 == null) {
      throw new ApiException(400, "Missing the required parameter 'createVerificationRequestPSD2' when calling createVerificationPSD2");
    }
    
    // create path and map variables
    String localVarPath = "/verifications/psd2";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<CreateVerificationResponse> localVarReturnType = new GenericType<CreateVerificationResponse>() {};

    return apiClient.invokeAPI("VerifyApi.createVerificationPSD2", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Trigger a SMS verification
   * 
   * @param createVerificationRequestSMS  (required)
   * @return CreateVerificationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected verifications response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateVerificationResponse createVerificationSMS(CreateVerificationRequestSMS createVerificationRequestSMS) throws ApiException {
    return createVerificationSMSWithHttpInfo(createVerificationRequestSMS).getData();
  }

  /**
   * Trigger a SMS verification
   * 
   * @param createVerificationRequestSMS  (required)
   * @return ApiResponse&lt;CreateVerificationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected verifications response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateVerificationResponse> createVerificationSMSWithHttpInfo(CreateVerificationRequestSMS createVerificationRequestSMS) throws ApiException {
    Object localVarPostBody = createVerificationRequestSMS;
    
    // verify the required parameter 'createVerificationRequestSMS' is set
    if (createVerificationRequestSMS == null) {
      throw new ApiException(400, "Missing the required parameter 'createVerificationRequestSMS' when calling createVerificationSMS");
    }
    
    // create path and map variables
    String localVarPath = "/verifications/sms";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<CreateVerificationResponse> localVarReturnType = new GenericType<CreateVerificationResponse>() {};

    return apiClient.invokeAPI("VerifyApi.createVerificationSMS", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Trigger a Whatsapp verification
   * 
   * @param createVerificationRequestWhatsapp  (required)
   * @return CreateVerificationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected verifications response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateVerificationResponse createVerificationWhatsapp(CreateVerificationRequestWhatsapp createVerificationRequestWhatsapp) throws ApiException {
    return createVerificationWhatsappWithHttpInfo(createVerificationRequestWhatsapp).getData();
  }

  /**
   * Trigger a Whatsapp verification
   * 
   * @param createVerificationRequestWhatsapp  (required)
   * @return ApiResponse&lt;CreateVerificationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected verifications response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateVerificationResponse> createVerificationWhatsappWithHttpInfo(CreateVerificationRequestWhatsapp createVerificationRequestWhatsapp) throws ApiException {
    Object localVarPostBody = createVerificationRequestWhatsapp;
    
    // verify the required parameter 'createVerificationRequestWhatsapp' is set
    if (createVerificationRequestWhatsapp == null) {
      throw new ApiException(400, "Missing the required parameter 'createVerificationRequestWhatsapp' when calling createVerificationWhatsapp");
    }
    
    // create path and map variables
    String localVarPath = "/verifications/whatsapp";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<CreateVerificationResponse> localVarReturnType = new GenericType<CreateVerificationResponse>() {};

    return apiClient.invokeAPI("VerifyApi.createVerificationWhatsapp", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create a Verify profile
   * Creates a new Verify profile to associate verifications with.
   * @param createVerifyProfileRequest  (required)
   * @return VerifyProfileResponseDataWrapper
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected Verify profile response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public VerifyProfileResponseDataWrapper createVerifyProfile(CreateVerifyProfileRequest createVerifyProfileRequest) throws ApiException {
    return createVerifyProfileWithHttpInfo(createVerifyProfileRequest).getData();
  }

  /**
   * Create a Verify profile
   * Creates a new Verify profile to associate verifications with.
   * @param createVerifyProfileRequest  (required)
   * @return ApiResponse&lt;VerifyProfileResponseDataWrapper&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected Verify profile response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<VerifyProfileResponseDataWrapper> createVerifyProfileWithHttpInfo(CreateVerifyProfileRequest createVerifyProfileRequest) throws ApiException {
    Object localVarPostBody = createVerifyProfileRequest;
    
    // verify the required parameter 'createVerifyProfileRequest' is set
    if (createVerifyProfileRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createVerifyProfileRequest' when calling createVerifyProfile");
    }
    
    // create path and map variables
    String localVarPath = "/verify_profiles";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<VerifyProfileResponseDataWrapper> localVarReturnType = new GenericType<VerifyProfileResponseDataWrapper>() {};

    return apiClient.invokeAPI("VerifyApi.createVerifyProfile", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete a Verify profile
   * 
   * @param verifyProfileId The identifier of the Verify profile to delete. (required)
   * @return VerifyProfileResponseDataWrapper
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected Verify profile response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public VerifyProfileResponseDataWrapper deleteVerifyProfile(UUID verifyProfileId) throws ApiException {
    return deleteVerifyProfileWithHttpInfo(verifyProfileId).getData();
  }

  /**
   * Delete a Verify profile
   * 
   * @param verifyProfileId The identifier of the Verify profile to delete. (required)
   * @return ApiResponse&lt;VerifyProfileResponseDataWrapper&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected Verify profile response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<VerifyProfileResponseDataWrapper> deleteVerifyProfileWithHttpInfo(UUID verifyProfileId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'verifyProfileId' is set
    if (verifyProfileId == null) {
      throw new ApiException(400, "Missing the required parameter 'verifyProfileId' when calling deleteVerifyProfile");
    }
    
    // create path and map variables
    String localVarPath = "/verify_profiles/{verify_profile_id}"
      .replaceAll("\\{" + "verify_profile_id" + "\\}", apiClient.escapeString(verifyProfileId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<VerifyProfileResponseDataWrapper> localVarReturnType = new GenericType<VerifyProfileResponseDataWrapper>() {};

    return apiClient.invokeAPI("VerifyApi.deleteVerifyProfile", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List verifications by phone number
   * 
   * @param phoneNumber The phone number associated with the verifications to retrieve. (required)
   * @return ListVerificationsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected verifications response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ListVerificationsResponse listVerifications(String phoneNumber) throws ApiException {
    return listVerificationsWithHttpInfo(phoneNumber).getData();
  }

  /**
   * List verifications by phone number
   * 
   * @param phoneNumber The phone number associated with the verifications to retrieve. (required)
   * @return ApiResponse&lt;ListVerificationsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected verifications response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListVerificationsResponse> listVerificationsWithHttpInfo(String phoneNumber) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'phoneNumber' is set
    if (phoneNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'phoneNumber' when calling listVerifications");
    }
    
    // create path and map variables
    String localVarPath = "/verifications/by_phone_number/{phone_number}"
      .replaceAll("\\{" + "phone_number" + "\\}", apiClient.escapeString(phoneNumber.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListVerificationsResponse> localVarReturnType = new GenericType<ListVerificationsResponse>() {};

    return apiClient.invokeAPI("VerifyApi.listVerifications", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

private ApiResponse<ListVerifyProfilesResponse> listVerifyProfilesWithHttpInfo(String filterName, Integer pageSize, Integer pageNumber) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/verify_profiles";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[name]", filterName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListVerifyProfilesResponse> localVarReturnType = new GenericType<ListVerifyProfilesResponse>() {};

    return apiClient.invokeAPI("VerifyApi.listVerifyProfiles", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistVerifyProfilesRequest {
    private String filterName;
    private Integer pageSize;
    private Integer pageNumber;

    private APIlistVerifyProfilesRequest() {
    }

    /**
     * Set filterName
     * @param filterName  (optional)
     * @return APIlistVerifyProfilesRequest
     */
    public APIlistVerifyProfilesRequest filterName(String filterName) {
      this.filterName = filterName;
      return this;
    }

    /**
     * Set pageSize
     * @param pageSize  (optional, default to 25)
     * @return APIlistVerifyProfilesRequest
     */
    public APIlistVerifyProfilesRequest pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber
     * @param pageNumber  (optional, default to 1)
     * @return APIlistVerifyProfilesRequest
     */
    public APIlistVerifyProfilesRequest pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Execute listVerifyProfiles request
     * @return ListVerifyProfilesResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Expected Verify profile response to a valid request. </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListVerifyProfilesResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listVerifyProfiles request with HTTP info returned
     * @return ApiResponse&lt;ListVerifyProfilesResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Expected Verify profile response to a valid request. </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListVerifyProfilesResponse> executeWithHttpInfo() throws ApiException {
      return listVerifyProfilesWithHttpInfo(filterName, pageSize, pageNumber);
    }
  }

  /**
   * List all Verify profiles
   * Gets a paginated list of Verify profiles.
   * @return listVerifyProfilesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistVerifyProfilesRequest listVerifyProfiles() throws ApiException {
    return new APIlistVerifyProfilesRequest();
  }
  /**
   * Retrieve a verification
   * 
   * @param verificationId The identifier of the verification to retrieve. (required)
   * @return RetrieveVerificationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected verifications response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public RetrieveVerificationResponse retrieveVerification(UUID verificationId) throws ApiException {
    return retrieveVerificationWithHttpInfo(verificationId).getData();
  }

  /**
   * Retrieve a verification
   * 
   * @param verificationId The identifier of the verification to retrieve. (required)
   * @return ApiResponse&lt;RetrieveVerificationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected verifications response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RetrieveVerificationResponse> retrieveVerificationWithHttpInfo(UUID verificationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'verificationId' is set
    if (verificationId == null) {
      throw new ApiException(400, "Missing the required parameter 'verificationId' when calling retrieveVerification");
    }
    
    // create path and map variables
    String localVarPath = "/verifications/{verification_id}"
      .replaceAll("\\{" + "verification_id" + "\\}", apiClient.escapeString(verificationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<RetrieveVerificationResponse> localVarReturnType = new GenericType<RetrieveVerificationResponse>() {};

    return apiClient.invokeAPI("VerifyApi.retrieveVerification", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a Verify profile
   * Gets a single Verify profile.
   * @param verifyProfileId The identifier of the Verify profile to retrieve. (required)
   * @return VerifyProfileResponseDataWrapper
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected Verify profile response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public VerifyProfileResponseDataWrapper retrieveVerifyProfile(UUID verifyProfileId) throws ApiException {
    return retrieveVerifyProfileWithHttpInfo(verifyProfileId).getData();
  }

  /**
   * Retrieve a Verify profile
   * Gets a single Verify profile.
   * @param verifyProfileId The identifier of the Verify profile to retrieve. (required)
   * @return ApiResponse&lt;VerifyProfileResponseDataWrapper&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected Verify profile response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<VerifyProfileResponseDataWrapper> retrieveVerifyProfileWithHttpInfo(UUID verifyProfileId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'verifyProfileId' is set
    if (verifyProfileId == null) {
      throw new ApiException(400, "Missing the required parameter 'verifyProfileId' when calling retrieveVerifyProfile");
    }
    
    // create path and map variables
    String localVarPath = "/verify_profiles/{verify_profile_id}"
      .replaceAll("\\{" + "verify_profile_id" + "\\}", apiClient.escapeString(verifyProfileId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<VerifyProfileResponseDataWrapper> localVarReturnType = new GenericType<VerifyProfileResponseDataWrapper>() {};

    return apiClient.invokeAPI("VerifyApi.retrieveVerifyProfile", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update a Verify profile
   * 
   * @param verifyProfileId The identifier of the Verify profile to update. (required)
   * @param updateVerifyProfileRequest  (required)
   * @return VerifyProfileResponseDataWrapper
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected Verify profile response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public VerifyProfileResponseDataWrapper updateVerifyProfile(UUID verifyProfileId, UpdateVerifyProfileRequest updateVerifyProfileRequest) throws ApiException {
    return updateVerifyProfileWithHttpInfo(verifyProfileId, updateVerifyProfileRequest).getData();
  }

  /**
   * Update a Verify profile
   * 
   * @param verifyProfileId The identifier of the Verify profile to update. (required)
   * @param updateVerifyProfileRequest  (required)
   * @return ApiResponse&lt;VerifyProfileResponseDataWrapper&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected Verify profile response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<VerifyProfileResponseDataWrapper> updateVerifyProfileWithHttpInfo(UUID verifyProfileId, UpdateVerifyProfileRequest updateVerifyProfileRequest) throws ApiException {
    Object localVarPostBody = updateVerifyProfileRequest;
    
    // verify the required parameter 'verifyProfileId' is set
    if (verifyProfileId == null) {
      throw new ApiException(400, "Missing the required parameter 'verifyProfileId' when calling updateVerifyProfile");
    }
    
    // verify the required parameter 'updateVerifyProfileRequest' is set
    if (updateVerifyProfileRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateVerifyProfileRequest' when calling updateVerifyProfile");
    }
    
    // create path and map variables
    String localVarPath = "/verify_profiles/{verify_profile_id}"
      .replaceAll("\\{" + "verify_profile_id" + "\\}", apiClient.escapeString(verifyProfileId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<VerifyProfileResponseDataWrapper> localVarReturnType = new GenericType<VerifyProfileResponseDataWrapper>() {};

    return apiClient.invokeAPI("VerifyApi.updateVerifyProfile", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Submit a verification code. Deprecation notice: &#x60;verify_profile_id&#39; is now a mandatory field. The sunset date for this change is 2022-04-02 00:00:00.
   * 
   * @param phoneNumber The phone number associated with the verification code being verified. (required)
   * @param verifyVerificationCodeRequest  (required)
   * @return VerifyVerificationCodeResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected verify response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public VerifyVerificationCodeResponse verifyVerificationCode(String phoneNumber, VerifyVerificationCodeRequest verifyVerificationCodeRequest) throws ApiException {
    return verifyVerificationCodeWithHttpInfo(phoneNumber, verifyVerificationCodeRequest).getData();
  }

  /**
   * Submit a verification code. Deprecation notice: &#x60;verify_profile_id&#39; is now a mandatory field. The sunset date for this change is 2022-04-02 00:00:00.
   * 
   * @param phoneNumber The phone number associated with the verification code being verified. (required)
   * @param verifyVerificationCodeRequest  (required)
   * @return ApiResponse&lt;VerifyVerificationCodeResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected verify response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<VerifyVerificationCodeResponse> verifyVerificationCodeWithHttpInfo(String phoneNumber, VerifyVerificationCodeRequest verifyVerificationCodeRequest) throws ApiException {
    Object localVarPostBody = verifyVerificationCodeRequest;
    
    // verify the required parameter 'phoneNumber' is set
    if (phoneNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'phoneNumber' when calling verifyVerificationCode");
    }
    
    // verify the required parameter 'verifyVerificationCodeRequest' is set
    if (verifyVerificationCodeRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'verifyVerificationCodeRequest' when calling verifyVerificationCode");
    }
    
    // create path and map variables
    String localVarPath = "/verifications/by_phone_number/{phone_number}/actions/verify"
      .replaceAll("\\{" + "phone_number" + "\\}", apiClient.escapeString(phoneNumber.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<VerifyVerificationCodeResponse> localVarReturnType = new GenericType<VerifyVerificationCodeResponse>() {};

    return apiClient.invokeAPI("VerifyApi.verifyVerificationCode", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
