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
import com.telnyx.sdk.model.PhoneNumberRegulatoryRequirement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * NumberOrderPhoneNumber
 */
@JsonPropertyOrder({
  NumberOrderPhoneNumber.JSON_PROPERTY_ID,
  NumberOrderPhoneNumber.JSON_PROPERTY_RECORD_TYPE,
  NumberOrderPhoneNumber.JSON_PROPERTY_PHONE_NUMBER,
  NumberOrderPhoneNumber.JSON_PROPERTY_ORDER_REQUEST_ID,
  NumberOrderPhoneNumber.JSON_PROPERTY_SUB_NUMBER_ORDER_ID,
  NumberOrderPhoneNumber.JSON_PROPERTY_COUNTRY_CODE,
  NumberOrderPhoneNumber.JSON_PROPERTY_PHONE_NUMBER_TYPE,
  NumberOrderPhoneNumber.JSON_PROPERTY_REGULATORY_REQUIREMENTS,
  NumberOrderPhoneNumber.JSON_PROPERTY_REQUIREMENTS_MET,
  NumberOrderPhoneNumber.JSON_PROPERTY_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NumberOrderPhoneNumber {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public static final String JSON_PROPERTY_PHONE_NUMBER = "phone_number";
  private String phoneNumber;

  public static final String JSON_PROPERTY_ORDER_REQUEST_ID = "order_request_id";
  private UUID orderRequestId;

  public static final String JSON_PROPERTY_SUB_NUMBER_ORDER_ID = "sub_number_order_id";
  private UUID subNumberOrderId;

  public static final String JSON_PROPERTY_COUNTRY_CODE = "country_code";
  private String countryCode;

  /**
   * Gets or Sets phoneNumberType
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

  public static final String JSON_PROPERTY_REGULATORY_REQUIREMENTS = "regulatory_requirements";
  private List<PhoneNumberRegulatoryRequirement> regulatoryRequirements = null;

  public static final String JSON_PROPERTY_REQUIREMENTS_MET = "requirements_met";
  private Boolean requirementsMet;

  /**
   * The status of the phone number in the order.
   */
  public enum StatusEnum {
    PENDING("pending"),
    
    SUCCESS("success"),
    
    FAILURE("failure");

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

  public NumberOrderPhoneNumber() { 
  }

  @JsonCreator
  public NumberOrderPhoneNumber(
    @JsonProperty(JSON_PROPERTY_ID) UUID id, 
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE) String recordType, 
    @JsonProperty(JSON_PROPERTY_REQUIREMENTS_MET) Boolean requirementsMet, 
    @JsonProperty(JSON_PROPERTY_STATUS) StatusEnum status
  ) {
    this();
    this.id = id;
    this.recordType = recordType;
    this.requirementsMet = requirementsMet;
    this.status = status;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "dc8e4d67-33a0-4cbb-af74-7b58f05bd494", value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }




   /**
   * Get recordType
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "number_order_phone_number", value = "")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecordType() {
    return recordType;
  }




  public NumberOrderPhoneNumber phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "+19705555098", value = "")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhoneNumber() {
    return phoneNumber;
  }


  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public NumberOrderPhoneNumber orderRequestId(UUID orderRequestId) {
    this.orderRequestId = orderRequestId;
    return this;
  }

   /**
   * Get orderRequestId
   * @return orderRequestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "dc8e4d67-33a0-4cbb-af74-7b58f05bd495", value = "")
  @JsonProperty(JSON_PROPERTY_ORDER_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getOrderRequestId() {
    return orderRequestId;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrderRequestId(UUID orderRequestId) {
    this.orderRequestId = orderRequestId;
  }


  public NumberOrderPhoneNumber subNumberOrderId(UUID subNumberOrderId) {
    this.subNumberOrderId = subNumberOrderId;
    return this;
  }

   /**
   * Get subNumberOrderId
   * @return subNumberOrderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "dc8e4d67-33a0-4cbb-af74-7b58f05bd496", value = "")
  @JsonProperty(JSON_PROPERTY_SUB_NUMBER_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getSubNumberOrderId() {
    return subNumberOrderId;
  }


  @JsonProperty(JSON_PROPERTY_SUB_NUMBER_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubNumberOrderId(UUID subNumberOrderId) {
    this.subNumberOrderId = subNumberOrderId;
  }


  public NumberOrderPhoneNumber countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "US", value = "")
  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountryCode() {
    return countryCode;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public NumberOrderPhoneNumber phoneNumberType(PhoneNumberTypeEnum phoneNumberType) {
    this.phoneNumberType = phoneNumberType;
    return this;
  }

   /**
   * Get phoneNumberType
   * @return phoneNumberType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "local", value = "")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PhoneNumberTypeEnum getPhoneNumberType() {
    return phoneNumberType;
  }


  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhoneNumberType(PhoneNumberTypeEnum phoneNumberType) {
    this.phoneNumberType = phoneNumberType;
  }


  public NumberOrderPhoneNumber regulatoryRequirements(List<PhoneNumberRegulatoryRequirement> regulatoryRequirements) {
    this.regulatoryRequirements = regulatoryRequirements;
    return this;
  }

  public NumberOrderPhoneNumber addRegulatoryRequirementsItem(PhoneNumberRegulatoryRequirement regulatoryRequirementsItem) {
    if (this.regulatoryRequirements == null) {
      this.regulatoryRequirements = new ArrayList<>();
    }
    this.regulatoryRequirements.add(regulatoryRequirementsItem);
    return this;
  }

   /**
   * Get regulatoryRequirements
   * @return regulatoryRequirements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REGULATORY_REQUIREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PhoneNumberRegulatoryRequirement> getRegulatoryRequirements() {
    return regulatoryRequirements;
  }


  @JsonProperty(JSON_PROPERTY_REGULATORY_REQUIREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegulatoryRequirements(List<PhoneNumberRegulatoryRequirement> regulatoryRequirements) {
    this.regulatoryRequirements = regulatoryRequirements;
  }


   /**
   * True if all requirements are met for a phone number, false otherwise.
   * @return requirementsMet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "True if all requirements are met for a phone number, false otherwise.")
  @JsonProperty(JSON_PROPERTY_REQUIREMENTS_MET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRequirementsMet() {
    return requirementsMet;
  }




   /**
   * The status of the phone number in the order.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The status of the phone number in the order.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }




  /**
   * Return true if this NumberOrderPhoneNumber object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NumberOrderPhoneNumber numberOrderPhoneNumber = (NumberOrderPhoneNumber) o;
    return Objects.equals(this.id, numberOrderPhoneNumber.id) &&
        Objects.equals(this.recordType, numberOrderPhoneNumber.recordType) &&
        Objects.equals(this.phoneNumber, numberOrderPhoneNumber.phoneNumber) &&
        Objects.equals(this.orderRequestId, numberOrderPhoneNumber.orderRequestId) &&
        Objects.equals(this.subNumberOrderId, numberOrderPhoneNumber.subNumberOrderId) &&
        Objects.equals(this.countryCode, numberOrderPhoneNumber.countryCode) &&
        Objects.equals(this.phoneNumberType, numberOrderPhoneNumber.phoneNumberType) &&
        Objects.equals(this.regulatoryRequirements, numberOrderPhoneNumber.regulatoryRequirements) &&
        Objects.equals(this.requirementsMet, numberOrderPhoneNumber.requirementsMet) &&
        Objects.equals(this.status, numberOrderPhoneNumber.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, recordType, phoneNumber, orderRequestId, subNumberOrderId, countryCode, phoneNumberType, regulatoryRequirements, requirementsMet, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberOrderPhoneNumber {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    orderRequestId: ").append(toIndentedString(orderRequestId)).append("\n");
    sb.append("    subNumberOrderId: ").append(toIndentedString(subNumberOrderId)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    phoneNumberType: ").append(toIndentedString(phoneNumberType)).append("\n");
    sb.append("    regulatoryRequirements: ").append(toIndentedString(regulatoryRequirements)).append("\n");
    sb.append("    requirementsMet: ").append(toIndentedString(requirementsMet)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

