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
 * The request body when creating a verification.
 */
@ApiModel(description = "The request body when creating a verification.")
@JsonPropertyOrder({
  CreateVerificationRequestWhatsapp.JSON_PROPERTY_PHONE_NUMBER,
  CreateVerificationRequestWhatsapp.JSON_PROPERTY_VERIFY_PROFILE_ID,
  CreateVerificationRequestWhatsapp.JSON_PROPERTY_TIMEOUT_SECS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateVerificationRequestWhatsapp {
  public static final String JSON_PROPERTY_PHONE_NUMBER = "phone_number";
  private String phoneNumber;

  public static final String JSON_PROPERTY_VERIFY_PROFILE_ID = "verify_profile_id";
  private UUID verifyProfileId;

  public static final String JSON_PROPERTY_TIMEOUT_SECS = "timeout_secs";
  private Integer timeoutSecs;

  public CreateVerificationRequestWhatsapp() { 
  }

  public CreateVerificationRequestWhatsapp phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * +E164 formatted phone number.
   * @return phoneNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "+13035551234", required = true, value = "+E164 formatted phone number.")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPhoneNumber() {
    return phoneNumber;
  }


  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public CreateVerificationRequestWhatsapp verifyProfileId(UUID verifyProfileId) {
    this.verifyProfileId = verifyProfileId;
    return this;
  }

   /**
   * The identifier of the associated Verify profile.
   * @return verifyProfileId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "12ade33a-21c0-473b-b055-b3c836e1c292", required = true, value = "The identifier of the associated Verify profile.")
  @JsonProperty(JSON_PROPERTY_VERIFY_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getVerifyProfileId() {
    return verifyProfileId;
  }


  @JsonProperty(JSON_PROPERTY_VERIFY_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVerifyProfileId(UUID verifyProfileId) {
    this.verifyProfileId = verifyProfileId;
  }


  public CreateVerificationRequestWhatsapp timeoutSecs(Integer timeoutSecs) {
    this.timeoutSecs = timeoutSecs;
    return this;
  }

   /**
   * The number of seconds the verification code is valid for.
   * @return timeoutSecs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "300", value = "The number of seconds the verification code is valid for.")
  @JsonProperty(JSON_PROPERTY_TIMEOUT_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTimeoutSecs() {
    return timeoutSecs;
  }


  @JsonProperty(JSON_PROPERTY_TIMEOUT_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeoutSecs(Integer timeoutSecs) {
    this.timeoutSecs = timeoutSecs;
  }


  /**
   * Return true if this CreateVerificationRequestWhatsapp object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateVerificationRequestWhatsapp createVerificationRequestWhatsapp = (CreateVerificationRequestWhatsapp) o;
    return Objects.equals(this.phoneNumber, createVerificationRequestWhatsapp.phoneNumber) &&
        Objects.equals(this.verifyProfileId, createVerificationRequestWhatsapp.verifyProfileId) &&
        Objects.equals(this.timeoutSecs, createVerificationRequestWhatsapp.timeoutSecs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, verifyProfileId, timeoutSecs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateVerificationRequestWhatsapp {\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    verifyProfileId: ").append(toIndentedString(verifyProfileId)).append("\n");
    sb.append("    timeoutSecs: ").append(toIndentedString(timeoutSecs)).append("\n");
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

