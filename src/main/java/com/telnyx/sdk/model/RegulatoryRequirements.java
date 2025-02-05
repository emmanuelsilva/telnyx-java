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
import com.telnyx.sdk.model.RegulatoryRequirementsRegionInformationInner;
import com.telnyx.sdk.model.RegulatoryRequirementsRegulatoryRequirementsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * RegulatoryRequirements
 */
@JsonPropertyOrder({
  RegulatoryRequirements.JSON_PROPERTY_PHONE_NUMBER,
  RegulatoryRequirements.JSON_PROPERTY_PHONE_NUMBER_TYPE,
  RegulatoryRequirements.JSON_PROPERTY_REGION_INFORMATION,
  RegulatoryRequirements.JSON_PROPERTY_RECORD_TYPE,
  RegulatoryRequirements.JSON_PROPERTY_REGULATORY_REQUIREMENTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RegulatoryRequirements {
  public static final String JSON_PROPERTY_PHONE_NUMBER = "phone_number";
  private String phoneNumber;

  public static final String JSON_PROPERTY_PHONE_NUMBER_TYPE = "phone_number_type";
  private String phoneNumberType;

  public static final String JSON_PROPERTY_REGION_INFORMATION = "region_information";
  private List<RegulatoryRequirementsRegionInformationInner> regionInformation = null;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public static final String JSON_PROPERTY_REGULATORY_REQUIREMENTS = "regulatory_requirements";
  private List<RegulatoryRequirementsRegulatoryRequirementsInner> regulatoryRequirements = null;

  public RegulatoryRequirements() { 
  }

  @JsonCreator
  public RegulatoryRequirements(
    @JsonProperty(JSON_PROPERTY_PHONE_NUMBER) String phoneNumber, 
    @JsonProperty(JSON_PROPERTY_PHONE_NUMBER_TYPE) String phoneNumberType, 
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE) String recordType
  ) {
    this();
    this.phoneNumber = phoneNumber;
    this.phoneNumberType = phoneNumberType;
    this.recordType = recordType;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "+41215471644", value = "")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhoneNumber() {
    return phoneNumber;
  }




   /**
   * Get phoneNumberType
   * @return phoneNumberType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "local", value = "")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhoneNumberType() {
    return phoneNumberType;
  }




  public RegulatoryRequirements regionInformation(List<RegulatoryRequirementsRegionInformationInner> regionInformation) {
    this.regionInformation = regionInformation;
    return this;
  }

  public RegulatoryRequirements addRegionInformationItem(RegulatoryRequirementsRegionInformationInner regionInformationItem) {
    if (this.regionInformation == null) {
      this.regionInformation = new ArrayList<>();
    }
    this.regionInformation.add(regionInformationItem);
    return this;
  }

   /**
   * Get regionInformation
   * @return regionInformation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REGION_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RegulatoryRequirementsRegionInformationInner> getRegionInformation() {
    return regionInformation;
  }


  @JsonProperty(JSON_PROPERTY_REGION_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegionInformation(List<RegulatoryRequirementsRegionInformationInner> regionInformation) {
    this.regionInformation = regionInformation;
  }


   /**
   * Get recordType
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "phone_number_regulatory_requirements", value = "")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecordType() {
    return recordType;
  }




  public RegulatoryRequirements regulatoryRequirements(List<RegulatoryRequirementsRegulatoryRequirementsInner> regulatoryRequirements) {
    this.regulatoryRequirements = regulatoryRequirements;
    return this;
  }

  public RegulatoryRequirements addRegulatoryRequirementsItem(RegulatoryRequirementsRegulatoryRequirementsInner regulatoryRequirementsItem) {
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

  public List<RegulatoryRequirementsRegulatoryRequirementsInner> getRegulatoryRequirements() {
    return regulatoryRequirements;
  }


  @JsonProperty(JSON_PROPERTY_REGULATORY_REQUIREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegulatoryRequirements(List<RegulatoryRequirementsRegulatoryRequirementsInner> regulatoryRequirements) {
    this.regulatoryRequirements = regulatoryRequirements;
  }


  /**
   * Return true if this RegulatoryRequirements object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegulatoryRequirements regulatoryRequirements = (RegulatoryRequirements) o;
    return Objects.equals(this.phoneNumber, regulatoryRequirements.phoneNumber) &&
        Objects.equals(this.phoneNumberType, regulatoryRequirements.phoneNumberType) &&
        Objects.equals(this.regionInformation, regulatoryRequirements.regionInformation) &&
        Objects.equals(this.recordType, regulatoryRequirements.recordType) &&
        Objects.equals(this.regulatoryRequirements, regulatoryRequirements.regulatoryRequirements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, phoneNumberType, regionInformation, recordType, regulatoryRequirements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegulatoryRequirements {\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    phoneNumberType: ").append(toIndentedString(phoneNumberType)).append("\n");
    sb.append("    regionInformation: ").append(toIndentedString(regionInformation)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    regulatoryRequirements: ").append(toIndentedString(regulatoryRequirements)).append("\n");
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

