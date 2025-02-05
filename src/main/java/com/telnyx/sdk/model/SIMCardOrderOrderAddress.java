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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * An object representing the address information from when the order was submitted.
 */
@ApiModel(description = "An object representing the address information from when the order was submitted.")
@JsonPropertyOrder({
  SIMCardOrderOrderAddress.JSON_PROPERTY_ID,
  SIMCardOrderOrderAddress.JSON_PROPERTY_STREET_ADDRESS,
  SIMCardOrderOrderAddress.JSON_PROPERTY_EXTENDED_ADDRESS,
  SIMCardOrderOrderAddress.JSON_PROPERTY_LOCALITY,
  SIMCardOrderOrderAddress.JSON_PROPERTY_ADMINISTRATIVE_AREA,
  SIMCardOrderOrderAddress.JSON_PROPERTY_COUNTRY_CODE,
  SIMCardOrderOrderAddress.JSON_PROPERTY_POSTAL_CODE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SIMCardOrderOrderAddress {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_STREET_ADDRESS = "street_address";
  private String streetAddress;

  public static final String JSON_PROPERTY_EXTENDED_ADDRESS = "extended_address";
  private String extendedAddress;

  public static final String JSON_PROPERTY_LOCALITY = "locality";
  private String locality;

  public static final String JSON_PROPERTY_ADMINISTRATIVE_AREA = "administrative_area";
  private String administrativeArea;

  public static final String JSON_PROPERTY_COUNTRY_CODE = "country_code";
  private String countryCode;

  public static final String JSON_PROPERTY_POSTAL_CODE = "postal_code";
  private String postalCode;

  public SIMCardOrderOrderAddress() { 
  }

  public SIMCardOrderOrderAddress id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Uniquely identifies the address for the order.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1293384261075731499", value = "Uniquely identifies the address for the order.")
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


  public SIMCardOrderOrderAddress streetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

   /**
   * The name of the street where the address is located.
   * @return streetAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "311 W Superior St", value = "The name of the street where the address is located.")
  @JsonProperty(JSON_PROPERTY_STREET_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStreetAddress() {
    return streetAddress;
  }


  @JsonProperty(JSON_PROPERTY_STREET_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }


  public SIMCardOrderOrderAddress extendedAddress(String extendedAddress) {
    this.extendedAddress = extendedAddress;
    return this;
  }

   /**
   * Supplemental field for address information.
   * @return extendedAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Suite 504", value = "Supplemental field for address information.")
  @JsonProperty(JSON_PROPERTY_EXTENDED_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExtendedAddress() {
    return extendedAddress;
  }


  @JsonProperty(JSON_PROPERTY_EXTENDED_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExtendedAddress(String extendedAddress) {
    this.extendedAddress = extendedAddress;
  }


  public SIMCardOrderOrderAddress locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * The name of the city where the address is located.
   * @return locality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Chicago", value = "The name of the city where the address is located.")
  @JsonProperty(JSON_PROPERTY_LOCALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLocality() {
    return locality;
  }


  @JsonProperty(JSON_PROPERTY_LOCALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocality(String locality) {
    this.locality = locality;
  }


  public SIMCardOrderOrderAddress administrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
    return this;
  }

   /**
   * State or province where the address is located.
   * @return administrativeArea
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "IL", value = "State or province where the address is located.")
  @JsonProperty(JSON_PROPERTY_ADMINISTRATIVE_AREA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdministrativeArea() {
    return administrativeArea;
  }


  @JsonProperty(JSON_PROPERTY_ADMINISTRATIVE_AREA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdministrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
  }


  public SIMCardOrderOrderAddress countryCode(String countryCode) {
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


  public SIMCardOrderOrderAddress postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postal code for the address.
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "60654", value = "Postal code for the address.")
  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPostalCode() {
    return postalCode;
  }


  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  /**
   * Return true if this SIMCardOrder_order_address object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SIMCardOrderOrderAddress siMCardOrderOrderAddress = (SIMCardOrderOrderAddress) o;
    return Objects.equals(this.id, siMCardOrderOrderAddress.id) &&
        Objects.equals(this.streetAddress, siMCardOrderOrderAddress.streetAddress) &&
        Objects.equals(this.extendedAddress, siMCardOrderOrderAddress.extendedAddress) &&
        Objects.equals(this.locality, siMCardOrderOrderAddress.locality) &&
        Objects.equals(this.administrativeArea, siMCardOrderOrderAddress.administrativeArea) &&
        Objects.equals(this.countryCode, siMCardOrderOrderAddress.countryCode) &&
        Objects.equals(this.postalCode, siMCardOrderOrderAddress.postalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, streetAddress, extendedAddress, locality, administrativeArea, countryCode, postalCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SIMCardOrderOrderAddress {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    extendedAddress: ").append(toIndentedString(extendedAddress)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    administrativeArea: ").append(toIndentedString(administrativeArea)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
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

