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
 * PortingOrderRequirement
 */
@JsonPropertyOrder({
  PortingOrderRequirement.JSON_PROPERTY_FIELD_TYPE,
  PortingOrderRequirement.JSON_PROPERTY_FIELD_VALUE,
  PortingOrderRequirement.JSON_PROPERTY_REQUIREMENT_TYPE_ID,
  PortingOrderRequirement.JSON_PROPERTY_RECORD_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PortingOrderRequirement {
  /**
   * Type of value expected on field_value field
   */
  public enum FieldTypeEnum {
    DOCUMENT("document");

    private String value;

    FieldTypeEnum(String value) {
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
    public static FieldTypeEnum fromValue(String value) {
      for (FieldTypeEnum b : FieldTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_FIELD_TYPE = "field_type";
  private FieldTypeEnum fieldType;

  public static final String JSON_PROPERTY_FIELD_VALUE = "field_value";
  private String fieldValue;

  public static final String JSON_PROPERTY_REQUIREMENT_TYPE_ID = "requirement_type_id";
  private String requirementTypeId;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public PortingOrderRequirement() { 
  }

  public PortingOrderRequirement fieldType(FieldTypeEnum fieldType) {
    this.fieldType = fieldType;
    return this;
  }

   /**
   * Type of value expected on field_value field
   * @return fieldType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "document", value = "Type of value expected on field_value field")
  @JsonProperty(JSON_PROPERTY_FIELD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FieldTypeEnum getFieldType() {
    return fieldType;
  }


  @JsonProperty(JSON_PROPERTY_FIELD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFieldType(FieldTypeEnum fieldType) {
    this.fieldType = fieldType;
  }


  public PortingOrderRequirement fieldValue(String fieldValue) {
    this.fieldValue = fieldValue;
    return this;
  }

   /**
   * identifies the document that satisfies this requirement
   * @return fieldValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9787fb5f-cbe5-4de4-b765-3303774ee9fe", value = "identifies the document that satisfies this requirement")
  @JsonProperty(JSON_PROPERTY_FIELD_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFieldValue() {
    return fieldValue;
  }


  @JsonProperty(JSON_PROPERTY_FIELD_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFieldValue(String fieldValue) {
    this.fieldValue = fieldValue;
  }


  public PortingOrderRequirement requirementTypeId(String requirementTypeId) {
    this.requirementTypeId = requirementTypeId;
    return this;
  }

   /**
   * Identifies the requirement type that meets this requirement
   * @return requirementTypeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "59b0762a-b274-4f76-ac32-4d5cf0272e66", value = "Identifies the requirement type that meets this requirement")
  @JsonProperty(JSON_PROPERTY_REQUIREMENT_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRequirementTypeId() {
    return requirementTypeId;
  }


  @JsonProperty(JSON_PROPERTY_REQUIREMENT_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequirementTypeId(String requirementTypeId) {
    this.requirementTypeId = requirementTypeId;
  }


  public PortingOrderRequirement recordType(String recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * Identifies the type of the resource.
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "porting_requirement", value = "Identifies the type of the resource.")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecordType() {
    return recordType;
  }


  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecordType(String recordType) {
    this.recordType = recordType;
  }


  /**
   * Return true if this PortingOrderRequirement object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortingOrderRequirement portingOrderRequirement = (PortingOrderRequirement) o;
    return Objects.equals(this.fieldType, portingOrderRequirement.fieldType) &&
        Objects.equals(this.fieldValue, portingOrderRequirement.fieldValue) &&
        Objects.equals(this.requirementTypeId, portingOrderRequirement.requirementTypeId) &&
        Objects.equals(this.recordType, portingOrderRequirement.recordType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldType, fieldValue, requirementTypeId, recordType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortingOrderRequirement {\n");
    sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
    sb.append("    fieldValue: ").append(toIndentedString(fieldValue)).append("\n");
    sb.append("    requirementTypeId: ").append(toIndentedString(requirementTypeId)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
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
