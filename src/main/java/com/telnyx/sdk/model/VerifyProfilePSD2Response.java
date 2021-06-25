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
 * VerifyProfilePSD2Response
 */
@JsonPropertyOrder({
  VerifyProfilePSD2Response.JSON_PROPERTY_DEFAULT_VERIFICATION_TIMEOUT_SECS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VerifyProfilePSD2Response {
  public static final String JSON_PROPERTY_DEFAULT_VERIFICATION_TIMEOUT_SECS = "default_verification_timeout_secs";
  private Integer defaultVerificationTimeoutSecs;


  public VerifyProfilePSD2Response defaultVerificationTimeoutSecs(Integer defaultVerificationTimeoutSecs) {
    this.defaultVerificationTimeoutSecs = defaultVerificationTimeoutSecs;
    return this;
  }

   /**
   * For every request that is initiated via this Verify profile, this sets the number of seconds before a verification request code expires. Once the verification request expires, the user cannot use the code to verify their identity.
   * @return defaultVerificationTimeoutSecs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "300", value = "For every request that is initiated via this Verify profile, this sets the number of seconds before a verification request code expires. Once the verification request expires, the user cannot use the code to verify their identity.")
  @JsonProperty(JSON_PROPERTY_DEFAULT_VERIFICATION_TIMEOUT_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDefaultVerificationTimeoutSecs() {
    return defaultVerificationTimeoutSecs;
  }


  public void setDefaultVerificationTimeoutSecs(Integer defaultVerificationTimeoutSecs) {
    this.defaultVerificationTimeoutSecs = defaultVerificationTimeoutSecs;
  }


  /**
   * Return true if this VerifyProfilePSD2Response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyProfilePSD2Response verifyProfilePSD2Response = (VerifyProfilePSD2Response) o;
    return Objects.equals(this.defaultVerificationTimeoutSecs, verifyProfilePSD2Response.defaultVerificationTimeoutSecs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultVerificationTimeoutSecs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyProfilePSD2Response {\n");
    sb.append("    defaultVerificationTimeoutSecs: ").append(toIndentedString(defaultVerificationTimeoutSecs)).append("\n");
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

