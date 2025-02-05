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
import com.telnyx.sdk.model.MobileOperatorNetworkPreferencesResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * A JSON object representation of the operation. The information present here will relate directly to the source of the OTA request.
 */
@ApiModel(description = "A JSON object representation of the operation. The information present here will relate directly to the source of the OTA request.")
@JsonPropertyOrder({
  CompleteOTAUpdateSettings.JSON_PROPERTY_MOBILE_OPERATOR_NETWORKS_PREFERENCES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CompleteOTAUpdateSettings {
  public static final String JSON_PROPERTY_MOBILE_OPERATOR_NETWORKS_PREFERENCES = "mobile_operator_networks_preferences";
  private List<MobileOperatorNetworkPreferencesResponse> mobileOperatorNetworksPreferences = null;

  public CompleteOTAUpdateSettings() { 
  }

  public CompleteOTAUpdateSettings mobileOperatorNetworksPreferences(List<MobileOperatorNetworkPreferencesResponse> mobileOperatorNetworksPreferences) {
    this.mobileOperatorNetworksPreferences = mobileOperatorNetworksPreferences;
    return this;
  }

  public CompleteOTAUpdateSettings addMobileOperatorNetworksPreferencesItem(MobileOperatorNetworkPreferencesResponse mobileOperatorNetworksPreferencesItem) {
    if (this.mobileOperatorNetworksPreferences == null) {
      this.mobileOperatorNetworksPreferences = new ArrayList<>();
    }
    this.mobileOperatorNetworksPreferences.add(mobileOperatorNetworksPreferencesItem);
    return this;
  }

   /**
   * A list of mobile operator networks and the priority that should be applied when the SIM is connecting to the network.
   * @return mobileOperatorNetworksPreferences
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of mobile operator networks and the priority that should be applied when the SIM is connecting to the network.")
  @JsonProperty(JSON_PROPERTY_MOBILE_OPERATOR_NETWORKS_PREFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<MobileOperatorNetworkPreferencesResponse> getMobileOperatorNetworksPreferences() {
    return mobileOperatorNetworksPreferences;
  }


  @JsonProperty(JSON_PROPERTY_MOBILE_OPERATOR_NETWORKS_PREFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMobileOperatorNetworksPreferences(List<MobileOperatorNetworkPreferencesResponse> mobileOperatorNetworksPreferences) {
    this.mobileOperatorNetworksPreferences = mobileOperatorNetworksPreferences;
  }


  /**
   * Return true if this CompleteOTAUpdate_settings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompleteOTAUpdateSettings completeOTAUpdateSettings = (CompleteOTAUpdateSettings) o;
    return Objects.equals(this.mobileOperatorNetworksPreferences, completeOTAUpdateSettings.mobileOperatorNetworksPreferences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mobileOperatorNetworksPreferences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompleteOTAUpdateSettings {\n");
    sb.append("    mobileOperatorNetworksPreferences: ").append(toIndentedString(mobileOperatorNetworksPreferences)).append("\n");
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

