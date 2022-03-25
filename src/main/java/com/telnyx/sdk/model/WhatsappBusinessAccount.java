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
import com.telnyx.sdk.model.WhatsappBusinessAccountWhatsappSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * WhatsappBusinessAccount
 */
@JsonPropertyOrder({
  WhatsappBusinessAccount.JSON_PROPERTY_RECORD_TYPE,
  WhatsappBusinessAccount.JSON_PROPERTY_ID,
  WhatsappBusinessAccount.JSON_PROPERTY_ORGANIZATION_ID,
  WhatsappBusinessAccount.JSON_PROPERTY_STATUS,
  WhatsappBusinessAccount.JSON_PROPERTY_WHATSAPP_SETTINGS,
  WhatsappBusinessAccount.JSON_PROPERTY_CREATED_AT,
  WhatsappBusinessAccount.JSON_PROPERTY_UPDATED_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WhatsappBusinessAccount {
  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_ORGANIZATION_ID = "organization_id";
  private UUID organizationId;

  /**
   * The configuration status for the account in the Telnyx platform
   */
  public enum StatusEnum {
    SETUP("setup"),
    
    READY("ready");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_WHATSAPP_SETTINGS = "whatsapp_settings";
  private WhatsappBusinessAccountWhatsappSettings whatsappSettings;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public WhatsappBusinessAccount() { 
  }

  public WhatsappBusinessAccount recordType(String recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * Get recordType
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "whatsapp_business_account", value = "")
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


  public WhatsappBusinessAccount id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12ade33a-21c0-473b-b055-b3c836e1c292", value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(UUID id) {
    this.id = id;
  }


  public WhatsappBusinessAccount organizationId(UUID organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * The owning organization&#39;s ID
   * @return organizationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12ade33a-21c0-473b-b055-b3c836e1c292", value = "The owning organization's ID")
  @JsonProperty(JSON_PROPERTY_ORGANIZATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getOrganizationId() {
    return organizationId;
  }


  @JsonProperty(JSON_PROPERTY_ORGANIZATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrganizationId(UUID organizationId) {
    this.organizationId = organizationId;
  }


  public WhatsappBusinessAccount status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The configuration status for the account in the Telnyx platform
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The configuration status for the account in the Telnyx platform")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public WhatsappBusinessAccount whatsappSettings(WhatsappBusinessAccountWhatsappSettings whatsappSettings) {
    this.whatsappSettings = whatsappSettings;
    return this;
  }

   /**
   * Get whatsappSettings
   * @return whatsappSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WHATSAPP_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WhatsappBusinessAccountWhatsappSettings getWhatsappSettings() {
    return whatsappSettings;
  }


  @JsonProperty(JSON_PROPERTY_WHATSAPP_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWhatsappSettings(WhatsappBusinessAccountWhatsappSettings whatsappSettings) {
    this.whatsappSettings = whatsappSettings;
  }


  public WhatsappBusinessAccount createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * An ISO 8601 datetime string denoting when the account was added to the Telnyx platform
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-01-01T00:00:00.000000Z", value = "An ISO 8601 datetime string denoting when the account was added to the Telnyx platform")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public WhatsappBusinessAccount updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * An ISO 8601 datetime string for when the number order was updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-01-01T00:00:00.000000Z", value = "An ISO 8601 datetime string for when the number order was updated.")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  /**
   * Return true if this WhatsappBusinessAccount object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhatsappBusinessAccount whatsappBusinessAccount = (WhatsappBusinessAccount) o;
    return Objects.equals(this.recordType, whatsappBusinessAccount.recordType) &&
        Objects.equals(this.id, whatsappBusinessAccount.id) &&
        Objects.equals(this.organizationId, whatsappBusinessAccount.organizationId) &&
        Objects.equals(this.status, whatsappBusinessAccount.status) &&
        Objects.equals(this.whatsappSettings, whatsappBusinessAccount.whatsappSettings) &&
        Objects.equals(this.createdAt, whatsappBusinessAccount.createdAt) &&
        Objects.equals(this.updatedAt, whatsappBusinessAccount.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordType, id, organizationId, status, whatsappSettings, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsappBusinessAccount {\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    whatsappSettings: ").append(toIndentedString(whatsappSettings)).append("\n");
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
