# IpRangesApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accessIPRangeCreate**](IpRangesApi.md#accessIPRangeCreate) | **POST** /access_ip_ranges | Create new Access IP Range
[**accessIPRangeList**](IpRangesApi.md#accessIPRangeList) | **GET** /access_ip_ranges | List all Access IP Ranges
[**accessIpRangesAccessIpRangeIdDelete**](IpRangesApi.md#accessIpRangesAccessIpRangeIdDelete) | **DELETE** /access_ip_ranges/{access_ip_range_id} | Delete access IP ranges



## accessIPRangeCreate

> AccessIPRangeResponseSchema accessIPRangeCreate(accessIPRangePOST)

Create new Access IP Range

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.IpRangesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        IpRangesApi apiInstance = new IpRangesApi(defaultClient);
        AccessIPRangePOST accessIPRangePOST = new AccessIPRangePOST(); // AccessIPRangePOST | 
        try {
            AccessIPRangeResponseSchema result = apiInstance.accessIPRangeCreate(accessIPRangePOST);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpRangesApi#accessIPRangeCreate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessIPRangePOST** | [**AccessIPRangePOST**](AccessIPRangePOST.md)|  |

### Return type

[**AccessIPRangeResponseSchema**](AccessIPRangeResponseSchema.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## accessIPRangeList

> AccessIPRangeListResponseSchema accessIPRangeList(filterCidrBlock, filterCidrBlockStartswith, filterCidrBlockEndswith, filterCidrBlockContains, filterStatus, filterCreatedAtGt, filterCreatedAtLt, pageNumber, pageSize)

List all Access IP Ranges

### Example

```java
import java.time.OffsetDateTime;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.IpRangesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        IpRangesApi apiInstance = new IpRangesApi(defaultClient);
        String filterCidrBlock = "filterCidrBlock_example"; // String | 
        String filterCidrBlockStartswith = "filterCidrBlockStartswith_example"; // String | 
        String filterCidrBlockEndswith = "filterCidrBlockEndswith_example"; // String | 
        String filterCidrBlockContains = "filterCidrBlockContains_example"; // String | 
        CloudflareSyncStatus filterStatus = CloudflareSyncStatus.fromValue("pending"); // CloudflareSyncStatus | 
        OffsetDateTime filterCreatedAtGt = OffsetDateTime.now(); // OffsetDateTime | 
        OffsetDateTime filterCreatedAtLt = OffsetDateTime.now(); // OffsetDateTime | 
        Integer pageNumber = 1; // Integer | 
        Integer pageSize = 20; // Integer | 
        try {
            AccessIPRangeListResponseSchema result = apiInstance.accessIPRangeList(filterCidrBlock, filterCidrBlockStartswith, filterCidrBlockEndswith, filterCidrBlockContains, filterStatus, filterCreatedAtGt, filterCreatedAtLt, pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpRangesApi#accessIPRangeList");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterCidrBlock** | **String**|  | [optional]
 **filterCidrBlockStartswith** | **String**|  | [optional]
 **filterCidrBlockEndswith** | **String**|  | [optional]
 **filterCidrBlockContains** | **String**|  | [optional]
 **filterStatus** | **CloudflareSyncStatus**|  | [optional] [enum: pending, added]
 **filterCreatedAtGt** | **OffsetDateTime**|  | [optional]
 **filterCreatedAtLt** | **OffsetDateTime**|  | [optional]
 **pageNumber** | **Integer**|  | [optional] [default to 1]
 **pageSize** | **Integer**|  | [optional] [default to 20]

### Return type

[**AccessIPRangeListResponseSchema**](AccessIPRangeListResponseSchema.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## accessIpRangesAccessIpRangeIdDelete

> AccessIPRangeResponseSchema accessIpRangesAccessIpRangeIdDelete(accessIpRangeId)

Delete access IP ranges

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.IpRangesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        IpRangesApi apiInstance = new IpRangesApi(defaultClient);
        String accessIpRangeId = "accessIpRangeId_example"; // String | 
        try {
            AccessIPRangeResponseSchema result = apiInstance.accessIpRangesAccessIpRangeIdDelete(accessIpRangeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpRangesApi#accessIpRangesAccessIpRangeIdDelete");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessIpRangeId** | **String**|  |

### Return type

[**AccessIPRangeResponseSchema**](AccessIPRangeResponseSchema.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

