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
 * Specifies objective criteria for acceptance
 */
@ApiModel(description = "Specifies objective criteria for acceptance")
@JsonPropertyOrder({
  DocReqsRequirementTypeAcceptanceCriteria.JSON_PROPERTY_TIME_LIMIT,
  DocReqsRequirementTypeAcceptanceCriteria.JSON_PROPERTY_LOCALITY_LIMIT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DocReqsRequirementTypeAcceptanceCriteria {
  public static final String JSON_PROPERTY_TIME_LIMIT = "time_limit";
  private String timeLimit;

  public static final String JSON_PROPERTY_LOCALITY_LIMIT = "locality_limit";
  private String localityLimit;

  public DocReqsRequirementTypeAcceptanceCriteria() { 
  }

  public DocReqsRequirementTypeAcceptanceCriteria timeLimit(String timeLimit) {
    this.timeLimit = timeLimit;
    return this;
  }

   /**
   * Specifies time-based acceptance criteria
   * @return timeLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Current and not expired", value = "Specifies time-based acceptance criteria")
  @JsonProperty(JSON_PROPERTY_TIME_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimeLimit() {
    return timeLimit;
  }


  @JsonProperty(JSON_PROPERTY_TIME_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeLimit(String timeLimit) {
    this.timeLimit = timeLimit;
  }


  public DocReqsRequirementTypeAcceptanceCriteria localityLimit(String localityLimit) {
    this.localityLimit = localityLimit;
    return this;
  }

   /**
   * Specifies geography-based acceptance criteria
   * @return localityLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Issued by the same country that the phone number belongs to", value = "Specifies geography-based acceptance criteria")
  @JsonProperty(JSON_PROPERTY_LOCALITY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLocalityLimit() {
    return localityLimit;
  }


  @JsonProperty(JSON_PROPERTY_LOCALITY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocalityLimit(String localityLimit) {
    this.localityLimit = localityLimit;
  }


  /**
   * Return true if this DocReqsRequirementType_acceptance_criteria object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocReqsRequirementTypeAcceptanceCriteria docReqsRequirementTypeAcceptanceCriteria = (DocReqsRequirementTypeAcceptanceCriteria) o;
    return Objects.equals(this.timeLimit, docReqsRequirementTypeAcceptanceCriteria.timeLimit) &&
        Objects.equals(this.localityLimit, docReqsRequirementTypeAcceptanceCriteria.localityLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeLimit, localityLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocReqsRequirementTypeAcceptanceCriteria {\n");
    sb.append("    timeLimit: ").append(toIndentedString(timeLimit)).append("\n");
    sb.append("    localityLimit: ").append(toIndentedString(localityLimit)).append("\n");
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

