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
 * PortingOrderEndUserLocation
 */
@JsonPropertyOrder({
  PortingOrderEndUserLocation.JSON_PROPERTY_STREET_ADDRESS,
  PortingOrderEndUserLocation.JSON_PROPERTY_EXTENDED_ADDRESS,
  PortingOrderEndUserLocation.JSON_PROPERTY_LOCALITY,
  PortingOrderEndUserLocation.JSON_PROPERTY_ADMINISTRATIVE_AREA,
  PortingOrderEndUserLocation.JSON_PROPERTY_POSTAL_CODE,
  PortingOrderEndUserLocation.JSON_PROPERTY_COUNTRY_CODE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PortingOrderEndUserLocation {
  public static final String JSON_PROPERTY_STREET_ADDRESS = "street_address";
  private String streetAddress;

  public static final String JSON_PROPERTY_EXTENDED_ADDRESS = "extended_address";
  private String extendedAddress;

  public static final String JSON_PROPERTY_LOCALITY = "locality";
  private String locality;

  public static final String JSON_PROPERTY_ADMINISTRATIVE_AREA = "administrative_area";
  private String administrativeArea;

  public static final String JSON_PROPERTY_POSTAL_CODE = "postal_code";
  private String postalCode;

  public static final String JSON_PROPERTY_COUNTRY_CODE = "country_code";
  private String countryCode;

  public PortingOrderEndUserLocation() { 
  }

  public PortingOrderEndUserLocation streetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

   /**
   * First line of billing address
   * @return streetAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "311 W. Superior St", value = "First line of billing address")
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


  public PortingOrderEndUserLocation extendedAddress(String extendedAddress) {
    this.extendedAddress = extendedAddress;
    return this;
  }

   /**
   * Second line of billing address
   * @return extendedAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Suite 504", value = "Second line of billing address")
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


  public PortingOrderEndUserLocation locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * City or municipality of billing address
   * @return locality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Chicago", value = "City or municipality of billing address")
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


  public PortingOrderEndUserLocation administrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
    return this;
  }

   /**
   * State, province, or similar of billing address
   * @return administrativeArea
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "IL", value = "State, province, or similar of billing address")
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


  public PortingOrderEndUserLocation postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postal Code of billing address
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "60654", value = "Postal Code of billing address")
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


  public PortingOrderEndUserLocation countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * ISO3166-1 alpha-2 country code of billing address
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "US", value = "ISO3166-1 alpha-2 country code of billing address")
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


  /**
   * Return true if this PortingOrderEndUserLocation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortingOrderEndUserLocation portingOrderEndUserLocation = (PortingOrderEndUserLocation) o;
    return Objects.equals(this.streetAddress, portingOrderEndUserLocation.streetAddress) &&
        Objects.equals(this.extendedAddress, portingOrderEndUserLocation.extendedAddress) &&
        Objects.equals(this.locality, portingOrderEndUserLocation.locality) &&
        Objects.equals(this.administrativeArea, portingOrderEndUserLocation.administrativeArea) &&
        Objects.equals(this.postalCode, portingOrderEndUserLocation.postalCode) &&
        Objects.equals(this.countryCode, portingOrderEndUserLocation.countryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streetAddress, extendedAddress, locality, administrativeArea, postalCode, countryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortingOrderEndUserLocation {\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    extendedAddress: ").append(toIndentedString(extendedAddress)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    administrativeArea: ").append(toIndentedString(administrativeArea)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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

