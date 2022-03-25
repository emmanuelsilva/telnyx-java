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
import com.telnyx.sdk.model.DocReqsRequirementTypeAcceptanceCriteria;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * DocReqsRequirementType
 */
@JsonPropertyOrder({
  DocReqsRequirementType.JSON_PROPERTY_ACCEPTANCE_CRITERIA,
  DocReqsRequirementType.JSON_PROPERTY_DESCRIPTION,
  DocReqsRequirementType.JSON_PROPERTY_EXAMPLE,
  DocReqsRequirementType.JSON_PROPERTY_TYPE,
  DocReqsRequirementType.JSON_PROPERTY_NAME,
  DocReqsRequirementType.JSON_PROPERTY_RECORD_TYPE,
  DocReqsRequirementType.JSON_PROPERTY_ID,
  DocReqsRequirementType.JSON_PROPERTY_CREATED_AT,
  DocReqsRequirementType.JSON_PROPERTY_UPDATED_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DocReqsRequirementType {
  public static final String JSON_PROPERTY_ACCEPTANCE_CRITERIA = "acceptance_criteria";
  private DocReqsRequirementTypeAcceptanceCriteria acceptanceCriteria;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_EXAMPLE = "example";
  private String example;

  /**
   * Defines the type of this requirement type
   */
  public enum TypeEnum {
    DOCUMENT("document"),
    
    ADDRESS("address"),
    
    TEXTUAL("textual");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public DocReqsRequirementType() { 
  }

  public DocReqsRequirementType acceptanceCriteria(DocReqsRequirementTypeAcceptanceCriteria acceptanceCriteria) {
    this.acceptanceCriteria = acceptanceCriteria;
    return this;
  }

   /**
   * Get acceptanceCriteria
   * @return acceptanceCriteria
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCEPTANCE_CRITERIA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DocReqsRequirementTypeAcceptanceCriteria getAcceptanceCriteria() {
    return acceptanceCriteria;
  }


  @JsonProperty(JSON_PROPERTY_ACCEPTANCE_CRITERIA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAcceptanceCriteria(DocReqsRequirementTypeAcceptanceCriteria acceptanceCriteria) {
    this.acceptanceCriteria = acceptanceCriteria;
  }


  public DocReqsRequirementType description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Describes the requirement type
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Proves the customer has a physical address in the same locality as the phone number", value = "Describes the requirement type")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public DocReqsRequirementType example(String example) {
    this.example = example;
    return this;
  }

   /**
   * Provides one or more examples of acceptable documents
   * @return example
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Utility bill, internet bill, phone bill, or lease", value = "Provides one or more examples of acceptable documents")
  @JsonProperty(JSON_PROPERTY_EXAMPLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExample() {
    return example;
  }


  @JsonProperty(JSON_PROPERTY_EXAMPLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExample(String example) {
    this.example = example;
  }


  public DocReqsRequirementType type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Defines the type of this requirement type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "document", value = "Defines the type of this requirement type")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


   /**
   * A short descriptive name for this requirement_type
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Proof of Address", value = "A short descriptive name for this requirement_type")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }




   /**
   * Identifies the type of the resource
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "requirement_type", value = "Identifies the type of the resource")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecordType() {
    return recordType;
  }




   /**
   * Identifies the associated document
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6a09cdc3-8948-47f0-aa62-74ac943d6c58", value = "Identifies the associated document")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }




   /**
   * ISO 8601 formatted date-time indicating when the resource was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-04-09T22:25:27.521Z", value = "ISO 8601 formatted date-time indicating when the resource was created.")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAt() {
    return createdAt;
  }




   /**
   * ISO 8601 formatted date-time indicating when the resource was last updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-04-12T20:20:20.020Z", value = "ISO 8601 formatted date-time indicating when the resource was last updated.")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpdatedAt() {
    return updatedAt;
  }




  /**
   * Return true if this DocReqsRequirementType object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocReqsRequirementType docReqsRequirementType = (DocReqsRequirementType) o;
    return Objects.equals(this.acceptanceCriteria, docReqsRequirementType.acceptanceCriteria) &&
        Objects.equals(this.description, docReqsRequirementType.description) &&
        Objects.equals(this.example, docReqsRequirementType.example) &&
        Objects.equals(this.type, docReqsRequirementType.type) &&
        Objects.equals(this.name, docReqsRequirementType.name) &&
        Objects.equals(this.recordType, docReqsRequirementType.recordType) &&
        Objects.equals(this.id, docReqsRequirementType.id) &&
        Objects.equals(this.createdAt, docReqsRequirementType.createdAt) &&
        Objects.equals(this.updatedAt, docReqsRequirementType.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptanceCriteria, description, example, type, name, recordType, id, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocReqsRequirementType {\n");
    sb.append("    acceptanceCriteria: ").append(toIndentedString(acceptanceCriteria)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    example: ").append(toIndentedString(example)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

