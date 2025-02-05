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


package com.telnyx.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * PhoneNumberDetailed
 */
@JsonPropertyOrder({
  PhoneNumberDetailed.JSON_PROPERTY_ID,
  PhoneNumberDetailed.JSON_PROPERTY_RECORD_TYPE,
  PhoneNumberDetailed.JSON_PROPERTY_PHONE_NUMBER,
  PhoneNumberDetailed.JSON_PROPERTY_STATUS,
  PhoneNumberDetailed.JSON_PROPERTY_TAGS,
  PhoneNumberDetailed.JSON_PROPERTY_EXTERNAL_PIN,
  PhoneNumberDetailed.JSON_PROPERTY_CONNECTION_NAME,
  PhoneNumberDetailed.JSON_PROPERTY_CONNECTION_ID,
  PhoneNumberDetailed.JSON_PROPERTY_CUSTOMER_REFERENCE,
  PhoneNumberDetailed.JSON_PROPERTY_MESSAGING_PROFILE_ID,
  PhoneNumberDetailed.JSON_PROPERTY_MESSAGING_PROFILE_NAME,
  PhoneNumberDetailed.JSON_PROPERTY_BILLING_GROUP_ID,
  PhoneNumberDetailed.JSON_PROPERTY_EMERGENCY_ENABLED,
  PhoneNumberDetailed.JSON_PROPERTY_EMERGENCY_ADDRESS_ID,
  PhoneNumberDetailed.JSON_PROPERTY_CALL_FORWARDING_ENABLED,
  PhoneNumberDetailed.JSON_PROPERTY_CNAM_LISTING_ENABLED,
  PhoneNumberDetailed.JSON_PROPERTY_CALLER_ID_NAME_ENABLED,
  PhoneNumberDetailed.JSON_PROPERTY_CALL_RECORDING_ENABLED,
  PhoneNumberDetailed.JSON_PROPERTY_T38_FAX_GATEWAY_ENABLED,
  PhoneNumberDetailed.JSON_PROPERTY_PURCHASED_AT,
  PhoneNumberDetailed.JSON_PROPERTY_CREATED_AT,
  PhoneNumberDetailed.JSON_PROPERTY_NUMBER_LEVEL_ROUTING,
  PhoneNumberDetailed.JSON_PROPERTY_PHONE_NUMBER_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PhoneNumberDetailed {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public static final String JSON_PROPERTY_PHONE_NUMBER = "phone_number";
  private String phoneNumber;

  /**
   * The phone number&#39;s current status.
   */
  public enum StatusEnum {
    PURCHASE_PENDING("purchase-pending"),
    
    PURCHASE_FAILED("purchase-failed"),
    
    PORT_PENDING("port-pending"),
    
    PORT_FAILED("port-failed"),
    
    ACTIVE("active"),
    
    DELETED("deleted"),
    
    EMERGENCY_ONLY("emergency-only"),
    
    PORTED_OUT("ported-out"),
    
    PORT_OUT_PENDING("port-out-pending");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_EXTERNAL_PIN = "external_pin";
  private String externalPin;

  public static final String JSON_PROPERTY_CONNECTION_NAME = "connection_name";
  private String connectionName;

  public static final String JSON_PROPERTY_CONNECTION_ID = "connection_id";
  private String connectionId;

  public static final String JSON_PROPERTY_CUSTOMER_REFERENCE = "customer_reference";
  private String customerReference;

  public static final String JSON_PROPERTY_MESSAGING_PROFILE_ID = "messaging_profile_id";
  private String messagingProfileId;

  public static final String JSON_PROPERTY_MESSAGING_PROFILE_NAME = "messaging_profile_name";
  private String messagingProfileName;

  public static final String JSON_PROPERTY_BILLING_GROUP_ID = "billing_group_id";
  private String billingGroupId;

  public static final String JSON_PROPERTY_EMERGENCY_ENABLED = "emergency_enabled";
  private Boolean emergencyEnabled;

  public static final String JSON_PROPERTY_EMERGENCY_ADDRESS_ID = "emergency_address_id";
  private String emergencyAddressId;

  public static final String JSON_PROPERTY_CALL_FORWARDING_ENABLED = "call_forwarding_enabled";
  private Boolean callForwardingEnabled = true;

  public static final String JSON_PROPERTY_CNAM_LISTING_ENABLED = "cnam_listing_enabled";
  private Boolean cnamListingEnabled;

  public static final String JSON_PROPERTY_CALLER_ID_NAME_ENABLED = "caller_id_name_enabled";
  private Boolean callerIdNameEnabled;

  public static final String JSON_PROPERTY_CALL_RECORDING_ENABLED = "call_recording_enabled";
  private Boolean callRecordingEnabled;

  public static final String JSON_PROPERTY_T38_FAX_GATEWAY_ENABLED = "t38_fax_gateway_enabled";
  private Boolean t38FaxGatewayEnabled;

  public static final String JSON_PROPERTY_PURCHASED_AT = "purchased_at";
  private String purchasedAt;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  /**
   * Specifies whether the number can have overrides to the routing settings on itself (enabled) or if it uses the associated connection for all routing settings (disabled). Defaults to disabled or the value set on your user profile in default_number_routing_setting. There are performance advantages to using disabled and setting all routing information at the connection level.
   */
  public enum NumberLevelRoutingEnum {
    ENABLED("enabled"),
    
    DISABLED("disabled");

    private String value;

    NumberLevelRoutingEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NumberLevelRoutingEnum fromValue(String value) {
      for (NumberLevelRoutingEnum b : NumberLevelRoutingEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_NUMBER_LEVEL_ROUTING = "number_level_routing";
  private NumberLevelRoutingEnum numberLevelRouting = NumberLevelRoutingEnum.DISABLED;

  /**
   * The phone number&#39;s type.
   */
  public enum PhoneNumberTypeEnum {
    LOCAL("local"),
    
    TOLL_FREE("toll_free"),
    
    MOBILE("mobile"),
    
    NATIONAL("national"),
    
    SHARED_COST("shared_cost"),
    
    LANDLINE("landline");

    private String value;

    PhoneNumberTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PhoneNumberTypeEnum fromValue(String value) {
      for (PhoneNumberTypeEnum b : PhoneNumberTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PHONE_NUMBER_TYPE = "phone_number_type";
  private PhoneNumberTypeEnum phoneNumberType;

  public PhoneNumberDetailed() { 
  }

  @JsonCreator
  public PhoneNumberDetailed(
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE) String recordType, 
    @JsonProperty(JSON_PROPERTY_PHONE_NUMBER) String phoneNumber, 
    @JsonProperty(JSON_PROPERTY_STATUS) StatusEnum status, 
    @JsonProperty(JSON_PROPERTY_CONNECTION_NAME) String connectionName, 
    @JsonProperty(JSON_PROPERTY_EMERGENCY_ENABLED) Boolean emergencyEnabled, 
    @JsonProperty(JSON_PROPERTY_EMERGENCY_ADDRESS_ID) String emergencyAddressId, 
    @JsonProperty(JSON_PROPERTY_CALL_FORWARDING_ENABLED) Boolean callForwardingEnabled, 
    @JsonProperty(JSON_PROPERTY_CNAM_LISTING_ENABLED) Boolean cnamListingEnabled, 
    @JsonProperty(JSON_PROPERTY_CALLER_ID_NAME_ENABLED) Boolean callerIdNameEnabled, 
    @JsonProperty(JSON_PROPERTY_CALL_RECORDING_ENABLED) Boolean callRecordingEnabled, 
    @JsonProperty(JSON_PROPERTY_T38_FAX_GATEWAY_ENABLED) Boolean t38FaxGatewayEnabled, 
    @JsonProperty(JSON_PROPERTY_PURCHASED_AT) String purchasedAt, 
    @JsonProperty(JSON_PROPERTY_CREATED_AT) String createdAt, 
    @JsonProperty(JSON_PROPERTY_PHONE_NUMBER_TYPE) PhoneNumberTypeEnum phoneNumberType
  ) {
    this();
    this.recordType = recordType;
    this.phoneNumber = phoneNumber;
    this.status = status;
    this.connectionName = connectionName;
    this.emergencyEnabled = emergencyEnabled;
    this.emergencyAddressId = emergencyAddressId;
    this.callForwardingEnabled = callForwardingEnabled;
    this.cnamListingEnabled = cnamListingEnabled;
    this.callerIdNameEnabled = callerIdNameEnabled;
    this.callRecordingEnabled = callRecordingEnabled;
    this.t38FaxGatewayEnabled = t38FaxGatewayEnabled;
    this.purchasedAt = purchasedAt;
    this.createdAt = createdAt;
    this.phoneNumberType = phoneNumberType;
  }

  public PhoneNumberDetailed id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Uniquely identifies the resource.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1293384261075731499", value = "Uniquely identifies the resource.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


   /**
   * Identifies the type of the resource.
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "phone_number", value = "Identifies the type of the resource.")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecordType() {
    return recordType;
  }




   /**
   * The +E.164-formatted phone number associated with this record.
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The +E.164-formatted phone number associated with this record.")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhoneNumber() {
    return phoneNumber;
  }




   /**
   * The phone number&#39;s current status.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The phone number's current status.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }




  public PhoneNumberDetailed tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public PhoneNumberDetailed addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * A list of user-assigned tags to help manage the phone number.
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of user-assigned tags to help manage the phone number.")
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public PhoneNumberDetailed externalPin(String externalPin) {
    this.externalPin = externalPin;
    return this;
  }

   /**
   * If someone attempts to port your phone number away from Telnyx and your phone number has an external PIN set, Telnyx will attempt to verify that you provided the correct external PIN to the winning carrier. Note that not all carriers cooperate with this security mechanism.
   * @return externalPin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If someone attempts to port your phone number away from Telnyx and your phone number has an external PIN set, Telnyx will attempt to verify that you provided the correct external PIN to the winning carrier. Note that not all carriers cooperate with this security mechanism.")
  @JsonProperty(JSON_PROPERTY_EXTERNAL_PIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalPin() {
    return externalPin;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_PIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalPin(String externalPin) {
    this.externalPin = externalPin;
  }


   /**
   * The user-assigned name of the connection to be associated with this phone number.
   * @return connectionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user-assigned name of the connection to be associated with this phone number.")
  @JsonProperty(JSON_PROPERTY_CONNECTION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConnectionName() {
    return connectionName;
  }




  public PhoneNumberDetailed connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

   /**
   * Identifies the connection associated with the phone number.
   * @return connectionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifies the connection associated with the phone number.")
  @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConnectionId() {
    return connectionId;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }


  public PhoneNumberDetailed customerReference(String customerReference) {
    this.customerReference = customerReference;
    return this;
  }

   /**
   * A customer reference string for customer look ups.
   * @return customerReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MY REF 001", value = "A customer reference string for customer look ups.")
  @JsonProperty(JSON_PROPERTY_CUSTOMER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomerReference() {
    return customerReference;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  public PhoneNumberDetailed messagingProfileId(String messagingProfileId) {
    this.messagingProfileId = messagingProfileId;
    return this;
  }

   /**
   * Identifies the messaging profile associated with the phone number.
   * @return messagingProfileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifies the messaging profile associated with the phone number.")
  @JsonProperty(JSON_PROPERTY_MESSAGING_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessagingProfileId() {
    return messagingProfileId;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGING_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessagingProfileId(String messagingProfileId) {
    this.messagingProfileId = messagingProfileId;
  }


  public PhoneNumberDetailed messagingProfileName(String messagingProfileName) {
    this.messagingProfileName = messagingProfileName;
    return this;
  }

   /**
   * The name of the messaging profile associated with the phone number.
   * @return messagingProfileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "regional-customers", value = "The name of the messaging profile associated with the phone number.")
  @JsonProperty(JSON_PROPERTY_MESSAGING_PROFILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessagingProfileName() {
    return messagingProfileName;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGING_PROFILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessagingProfileName(String messagingProfileName) {
    this.messagingProfileName = messagingProfileName;
  }


  public PhoneNumberDetailed billingGroupId(String billingGroupId) {
    this.billingGroupId = billingGroupId;
    return this;
  }

   /**
   * Identifies the billing group associated with the phone number.
   * @return billingGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifies the billing group associated with the phone number.")
  @JsonProperty(JSON_PROPERTY_BILLING_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBillingGroupId() {
    return billingGroupId;
  }


  @JsonProperty(JSON_PROPERTY_BILLING_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingGroupId(String billingGroupId) {
    this.billingGroupId = billingGroupId;
  }


   /**
   * Indicates whether emergency services are enabled for this number.
   * @return emergencyEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether emergency services are enabled for this number.")
  @JsonProperty(JSON_PROPERTY_EMERGENCY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEmergencyEnabled() {
    return emergencyEnabled;
  }




   /**
   * Identifies the emergency address associated with the phone number.
   * @return emergencyAddressId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifies the emergency address associated with the phone number.")
  @JsonProperty(JSON_PROPERTY_EMERGENCY_ADDRESS_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmergencyAddressId() {
    return emergencyAddressId;
  }




   /**
   * Indicates if call forwarding will be enabled for this number if forwards_to and forwarding_type are filled in. Defaults to true for backwards compatibility with APIV1 use of numbers endpoints.
   * @return callForwardingEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if call forwarding will be enabled for this number if forwards_to and forwarding_type are filled in. Defaults to true for backwards compatibility with APIV1 use of numbers endpoints.")
  @JsonProperty(JSON_PROPERTY_CALL_FORWARDING_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCallForwardingEnabled() {
    return callForwardingEnabled;
  }




   /**
   * Indicates whether a CNAM listing is enabled for this number.
   * @return cnamListingEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether a CNAM listing is enabled for this number.")
  @JsonProperty(JSON_PROPERTY_CNAM_LISTING_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCnamListingEnabled() {
    return cnamListingEnabled;
  }




   /**
   * Indicates whether caller ID is enabled for this number.
   * @return callerIdNameEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether caller ID is enabled for this number.")
  @JsonProperty(JSON_PROPERTY_CALLER_ID_NAME_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCallerIdNameEnabled() {
    return callerIdNameEnabled;
  }




   /**
   * Indicates whether call recording is enabled for this number.
   * @return callRecordingEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether call recording is enabled for this number.")
  @JsonProperty(JSON_PROPERTY_CALL_RECORDING_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCallRecordingEnabled() {
    return callRecordingEnabled;
  }




   /**
   * Indicates whether T38 Fax Gateway for inbound calls to this number.
   * @return t38FaxGatewayEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether T38 Fax Gateway for inbound calls to this number.")
  @JsonProperty(JSON_PROPERTY_T38_FAX_GATEWAY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getT38FaxGatewayEnabled() {
    return t38FaxGatewayEnabled;
  }




   /**
   * ISO 8601 formatted date indicating when the resource was purchased.
   * @return purchasedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ISO 8601 formatted date indicating when the resource was purchased.")
  @JsonProperty(JSON_PROPERTY_PURCHASED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPurchasedAt() {
    return purchasedAt;
  }




   /**
   * ISO 8601 formatted date indicating when the resource was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ISO 8601 formatted date indicating when the resource was created.")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAt() {
    return createdAt;
  }




  public PhoneNumberDetailed numberLevelRouting(NumberLevelRoutingEnum numberLevelRouting) {
    this.numberLevelRouting = numberLevelRouting;
    return this;
  }

   /**
   * Specifies whether the number can have overrides to the routing settings on itself (enabled) or if it uses the associated connection for all routing settings (disabled). Defaults to disabled or the value set on your user profile in default_number_routing_setting. There are performance advantages to using disabled and setting all routing information at the connection level.
   * @return numberLevelRouting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies whether the number can have overrides to the routing settings on itself (enabled) or if it uses the associated connection for all routing settings (disabled). Defaults to disabled or the value set on your user profile in default_number_routing_setting. There are performance advantages to using disabled and setting all routing information at the connection level.")
  @JsonProperty(JSON_PROPERTY_NUMBER_LEVEL_ROUTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NumberLevelRoutingEnum getNumberLevelRouting() {
    return numberLevelRouting;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_LEVEL_ROUTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberLevelRouting(NumberLevelRoutingEnum numberLevelRouting) {
    this.numberLevelRouting = numberLevelRouting;
  }


   /**
   * The phone number&#39;s type.
   * @return phoneNumberType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The phone number's type.")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PhoneNumberTypeEnum getPhoneNumberType() {
    return phoneNumberType;
  }




  /**
   * Return true if this PhoneNumberDetailed object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneNumberDetailed phoneNumberDetailed = (PhoneNumberDetailed) o;
    return Objects.equals(this.id, phoneNumberDetailed.id) &&
        Objects.equals(this.recordType, phoneNumberDetailed.recordType) &&
        Objects.equals(this.phoneNumber, phoneNumberDetailed.phoneNumber) &&
        Objects.equals(this.status, phoneNumberDetailed.status) &&
        Objects.equals(this.tags, phoneNumberDetailed.tags) &&
        Objects.equals(this.externalPin, phoneNumberDetailed.externalPin) &&
        Objects.equals(this.connectionName, phoneNumberDetailed.connectionName) &&
        Objects.equals(this.connectionId, phoneNumberDetailed.connectionId) &&
        Objects.equals(this.customerReference, phoneNumberDetailed.customerReference) &&
        Objects.equals(this.messagingProfileId, phoneNumberDetailed.messagingProfileId) &&
        Objects.equals(this.messagingProfileName, phoneNumberDetailed.messagingProfileName) &&
        Objects.equals(this.billingGroupId, phoneNumberDetailed.billingGroupId) &&
        Objects.equals(this.emergencyEnabled, phoneNumberDetailed.emergencyEnabled) &&
        Objects.equals(this.emergencyAddressId, phoneNumberDetailed.emergencyAddressId) &&
        Objects.equals(this.callForwardingEnabled, phoneNumberDetailed.callForwardingEnabled) &&
        Objects.equals(this.cnamListingEnabled, phoneNumberDetailed.cnamListingEnabled) &&
        Objects.equals(this.callerIdNameEnabled, phoneNumberDetailed.callerIdNameEnabled) &&
        Objects.equals(this.callRecordingEnabled, phoneNumberDetailed.callRecordingEnabled) &&
        Objects.equals(this.t38FaxGatewayEnabled, phoneNumberDetailed.t38FaxGatewayEnabled) &&
        Objects.equals(this.purchasedAt, phoneNumberDetailed.purchasedAt) &&
        Objects.equals(this.createdAt, phoneNumberDetailed.createdAt) &&
        Objects.equals(this.numberLevelRouting, phoneNumberDetailed.numberLevelRouting) &&
        Objects.equals(this.phoneNumberType, phoneNumberDetailed.phoneNumberType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, recordType, phoneNumber, status, tags, externalPin, connectionName, connectionId, customerReference, messagingProfileId, messagingProfileName, billingGroupId, emergencyEnabled, emergencyAddressId, callForwardingEnabled, cnamListingEnabled, callerIdNameEnabled, callRecordingEnabled, t38FaxGatewayEnabled, purchasedAt, createdAt, numberLevelRouting, phoneNumberType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneNumberDetailed {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    externalPin: ").append(toIndentedString(externalPin)).append("\n");
    sb.append("    connectionName: ").append(toIndentedString(connectionName)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    messagingProfileId: ").append(toIndentedString(messagingProfileId)).append("\n");
    sb.append("    messagingProfileName: ").append(toIndentedString(messagingProfileName)).append("\n");
    sb.append("    billingGroupId: ").append(toIndentedString(billingGroupId)).append("\n");
    sb.append("    emergencyEnabled: ").append(toIndentedString(emergencyEnabled)).append("\n");
    sb.append("    emergencyAddressId: ").append(toIndentedString(emergencyAddressId)).append("\n");
    sb.append("    callForwardingEnabled: ").append(toIndentedString(callForwardingEnabled)).append("\n");
    sb.append("    cnamListingEnabled: ").append(toIndentedString(cnamListingEnabled)).append("\n");
    sb.append("    callerIdNameEnabled: ").append(toIndentedString(callerIdNameEnabled)).append("\n");
    sb.append("    callRecordingEnabled: ").append(toIndentedString(callRecordingEnabled)).append("\n");
    sb.append("    t38FaxGatewayEnabled: ").append(toIndentedString(t38FaxGatewayEnabled)).append("\n");
    sb.append("    purchasedAt: ").append(toIndentedString(purchasedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    numberLevelRouting: ").append(toIndentedString(numberLevelRouting)).append("\n");
    sb.append("    phoneNumberType: ").append(toIndentedString(phoneNumberType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

