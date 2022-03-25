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
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * MobileOperatorNetwork
 */
@JsonPropertyOrder({
  MobileOperatorNetwork.JSON_PROPERTY_ID,
  MobileOperatorNetwork.JSON_PROPERTY_RECORD_TYPE,
  MobileOperatorNetwork.JSON_PROPERTY_NAME,
  MobileOperatorNetwork.JSON_PROPERTY_TADIG,
  MobileOperatorNetwork.JSON_PROPERTY_COUNTRY_CODE,
  MobileOperatorNetwork.JSON_PROPERTY_MCC,
  MobileOperatorNetwork.JSON_PROPERTY_MNC
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MobileOperatorNetwork {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TADIG = "tadig";
  private String tadig;

  public static final String JSON_PROPERTY_COUNTRY_CODE = "country_code";
  private String countryCode;

  public static final String JSON_PROPERTY_MCC = "mcc";
  private String mcc;

  public static final String JSON_PROPERTY_MNC = "mnc";
  private String mnc;

  public MobileOperatorNetwork() { 
  }

   /**
   * Identifies the resource.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6a09cdc3-8948-47f0-aa62-74ac943d6c58", value = "Identifies the resource.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }




   /**
   * Identifies the type of the resource.
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "mobile_operator_network", value = "Identifies the type of the resource.")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecordType() {
    return recordType;
  }




  public MobileOperatorNetwork name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The operator network name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AT&T Mobility (USACG)", value = "The operator network name.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public MobileOperatorNetwork tadig(String tadig) {
    this.tadig = tadig;
    return this;
  }

   /**
   * TADIG stands for Transferred Account Data Interchange Group. The TADIG code is a unique identifier for network operators in GSM mobile networks.
   * @return tadig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USACG", value = "TADIG stands for Transferred Account Data Interchange Group. The TADIG code is a unique identifier for network operators in GSM mobile networks.")
  @JsonProperty(JSON_PROPERTY_TADIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTadig() {
    return tadig;
  }


  @JsonProperty(JSON_PROPERTY_TADIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTadig(String tadig) {
    this.tadig = tadig;
  }


  public MobileOperatorNetwork countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * The mobile operator two-character (ISO 3166-1 alpha-2) origin country code.
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "US", value = "The mobile operator two-character (ISO 3166-1 alpha-2) origin country code.")
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


  public MobileOperatorNetwork mcc(String mcc) {
    this.mcc = mcc;
    return this;
  }

   /**
   * MCC stands for Mobile Country Code. It&#39;s a three decimal digit that identifies a country.&lt;br/&gt;&lt;br/&gt; This code is commonly seen joined with a Mobile Network Code (MNC) in a tuple that allows identifying a carrier known as PLMN (Public Land Mobile Network) code.
   * @return mcc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "310", value = "MCC stands for Mobile Country Code. It's a three decimal digit that identifies a country.<br/><br/> This code is commonly seen joined with a Mobile Network Code (MNC) in a tuple that allows identifying a carrier known as PLMN (Public Land Mobile Network) code.")
  @JsonProperty(JSON_PROPERTY_MCC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMcc() {
    return mcc;
  }


  @JsonProperty(JSON_PROPERTY_MCC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMcc(String mcc) {
    this.mcc = mcc;
  }


  public MobileOperatorNetwork mnc(String mnc) {
    this.mnc = mnc;
    return this;
  }

   /**
   * MNC stands for Mobile Network Code. It&#39;s a two to three decimal digits that identify a network.&lt;br/&gt;&lt;br/&gt;  This code is commonly seen joined with a Mobile Country Code (MCC) in a tuple that allows identifying a carrier known as PLMN (Public Land Mobile Network) code.
   * @return mnc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "410", value = "MNC stands for Mobile Network Code. It's a two to three decimal digits that identify a network.<br/><br/>  This code is commonly seen joined with a Mobile Country Code (MCC) in a tuple that allows identifying a carrier known as PLMN (Public Land Mobile Network) code.")
  @JsonProperty(JSON_PROPERTY_MNC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMnc() {
    return mnc;
  }


  @JsonProperty(JSON_PROPERTY_MNC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMnc(String mnc) {
    this.mnc = mnc;
  }


  /**
   * Return true if this MobileOperatorNetwork object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MobileOperatorNetwork mobileOperatorNetwork = (MobileOperatorNetwork) o;
    return Objects.equals(this.id, mobileOperatorNetwork.id) &&
        Objects.equals(this.recordType, mobileOperatorNetwork.recordType) &&
        Objects.equals(this.name, mobileOperatorNetwork.name) &&
        Objects.equals(this.tadig, mobileOperatorNetwork.tadig) &&
        Objects.equals(this.countryCode, mobileOperatorNetwork.countryCode) &&
        Objects.equals(this.mcc, mobileOperatorNetwork.mcc) &&
        Objects.equals(this.mnc, mobileOperatorNetwork.mnc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, recordType, name, tadig, countryCode, mcc, mnc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MobileOperatorNetwork {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tadig: ").append(toIndentedString(tadig)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    mcc: ").append(toIndentedString(mcc)).append("\n");
    sb.append("    mnc: ").append(toIndentedString(mnc)).append("\n");
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

