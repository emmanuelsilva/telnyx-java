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
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * MdrDetailResponse
 */
@JsonPropertyOrder({
  MdrDetailResponse.JSON_PROPERTY_CREATED_AT,
  MdrDetailResponse.JSON_PROPERTY_PROFILE_NAME,
  MdrDetailResponse.JSON_PROPERTY_DIRECTION,
  MdrDetailResponse.JSON_PROPERTY_PARTS,
  MdrDetailResponse.JSON_PROPERTY_STATUS,
  MdrDetailResponse.JSON_PROPERTY_CLD,
  MdrDetailResponse.JSON_PROPERTY_CLI,
  MdrDetailResponse.JSON_PROPERTY_RATE,
  MdrDetailResponse.JSON_PROPERTY_COST,
  MdrDetailResponse.JSON_PROPERTY_CURRENCY,
  MdrDetailResponse.JSON_PROPERTY_ID,
  MdrDetailResponse.JSON_PROPERTY_MESSAGE_TYPE,
  MdrDetailResponse.JSON_PROPERTY_RECORD_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MdrDetailResponse {
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_PROFILE_NAME = "profile_name";
  private String profileName;

  public static final String JSON_PROPERTY_DIRECTION = "direction";
  private String direction;

  public static final String JSON_PROPERTY_PARTS = "parts";
  private BigDecimal parts;

  /**
   * Message status
   */
  public enum StatusEnum {
    GW_TIMEOUT("GW_TIMEOUT"),
    
    DELIVERED("DELIVERED"),
    
    DLR_UNCONFIRMED("DLR_UNCONFIRMED"),
    
    DLR_TIMEOUT("DLR_TIMEOUT"),
    
    RECEIVED("RECEIVED"),
    
    GW_REJECT("GW_REJECT"),
    
    FAILED("FAILED");

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

  public static final String JSON_PROPERTY_CLD = "cld";
  private String cld;

  public static final String JSON_PROPERTY_CLI = "cli";
  private String cli;

  public static final String JSON_PROPERTY_RATE = "rate";
  private String rate;

  public static final String JSON_PROPERTY_COST = "cost";
  private String cost;

  /**
   * Currency of the rate and cost
   */
  public enum CurrencyEnum {
    AUD("AUD"),
    
    CAD("CAD"),
    
    EUR("EUR"),
    
    GBP("GBP"),
    
    USD("USD");

    private String value;

    CurrencyEnum(String value) {
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
    public static CurrencyEnum fromValue(String value) {
      for (CurrencyEnum b : CurrencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private CurrencyEnum currency;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  /**
   * Type of message
   */
  public enum MessageTypeEnum {
    SMS("SMS"),
    
    MMS("MMS");

    private String value;

    MessageTypeEnum(String value) {
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
    public static MessageTypeEnum fromValue(String value) {
      for (MessageTypeEnum b : MessageTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_MESSAGE_TYPE = "message_type";
  private MessageTypeEnum messageType;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public MdrDetailResponse() { 
  }

  public MdrDetailResponse createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Message sent time
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-07-01T00:00-06:00", value = "Message sent time")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public MdrDetailResponse profileName(String profileName) {
    this.profileName = profileName;
    return this;
  }

   /**
   * Configured profile name. New profiles can be created and configured on Telnyx portal
   * @return profileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "configured-profile-name", value = "Configured profile name. New profiles can be created and configured on Telnyx portal")
  @JsonProperty(JSON_PROPERTY_PROFILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProfileName() {
    return profileName;
  }


  @JsonProperty(JSON_PROPERTY_PROFILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProfileName(String profileName) {
    this.profileName = profileName;
  }


  public MdrDetailResponse direction(String direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Direction of message - inbound or outbound.
   * @return direction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "outbound", value = "Direction of message - inbound or outbound.")
  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDirection() {
    return direction;
  }


  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDirection(String direction) {
    this.direction = direction;
  }


  public MdrDetailResponse parts(BigDecimal parts) {
    this.parts = parts;
    return this;
  }

   /**
   * Number of parts this message has. Max number of character is 160. If message contains more characters then that it will be broken down in multiple parts
   * @return parts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "Number of parts this message has. Max number of character is 160. If message contains more characters then that it will be broken down in multiple parts")
  @JsonProperty(JSON_PROPERTY_PARTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getParts() {
    return parts;
  }


  @JsonProperty(JSON_PROPERTY_PARTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParts(BigDecimal parts) {
    this.parts = parts;
  }


  public MdrDetailResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Message status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DELIVERED", value = "Message status")
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


  public MdrDetailResponse cld(String cld) {
    this.cld = cld;
    return this;
  }

   /**
   * The destination number for a call, or the callee
   * @return cld
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "+1555123456", value = "The destination number for a call, or the callee")
  @JsonProperty(JSON_PROPERTY_CLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCld() {
    return cld;
  }


  @JsonProperty(JSON_PROPERTY_CLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCld(String cld) {
    this.cld = cld;
  }


  public MdrDetailResponse cli(String cli) {
    this.cli = cli;
    return this;
  }

   /**
   * The number associated with the person initiating the call, or the caller
   * @return cli
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "+1555123456", value = "The number associated with the person initiating the call, or the caller")
  @JsonProperty(JSON_PROPERTY_CLI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCli() {
    return cli;
  }


  @JsonProperty(JSON_PROPERTY_CLI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCli(String cli) {
    this.cli = cli;
  }


  public MdrDetailResponse rate(String rate) {
    this.rate = rate;
    return this;
  }

   /**
   * Rate applied to the message
   * @return rate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.05", value = "Rate applied to the message")
  @JsonProperty(JSON_PROPERTY_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRate() {
    return rate;
  }


  @JsonProperty(JSON_PROPERTY_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRate(String rate) {
    this.rate = rate;
  }


  public MdrDetailResponse cost(String cost) {
    this.cost = cost;
    return this;
  }

   /**
   * Final cost. Cost is calculated as rate * parts
   * @return cost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.1", value = "Final cost. Cost is calculated as rate * parts")
  @JsonProperty(JSON_PROPERTY_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCost() {
    return cost;
  }


  @JsonProperty(JSON_PROPERTY_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCost(String cost) {
    this.cost = cost;
  }


  public MdrDetailResponse currency(CurrencyEnum currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency of the rate and cost
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "Currency of the rate and cost")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CurrencyEnum getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(CurrencyEnum currency) {
    this.currency = currency;
  }


  public MdrDetailResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id of message detail record
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "99b637f3-07fd-45ac-b9ca-b87208c24650", value = "Id of message detail record")
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


  public MdrDetailResponse messageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
    return this;
  }

   /**
   * Type of message
   * @return messageType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SMS", value = "Type of message")
  @JsonProperty(JSON_PROPERTY_MESSAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MessageTypeEnum getMessageType() {
    return messageType;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
  }


  public MdrDetailResponse recordType(String recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * Get recordType
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "mdr_report", value = "")
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
   * Return true if this MdrDetailResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MdrDetailResponse mdrDetailResponse = (MdrDetailResponse) o;
    return Objects.equals(this.createdAt, mdrDetailResponse.createdAt) &&
        Objects.equals(this.profileName, mdrDetailResponse.profileName) &&
        Objects.equals(this.direction, mdrDetailResponse.direction) &&
        Objects.equals(this.parts, mdrDetailResponse.parts) &&
        Objects.equals(this.status, mdrDetailResponse.status) &&
        Objects.equals(this.cld, mdrDetailResponse.cld) &&
        Objects.equals(this.cli, mdrDetailResponse.cli) &&
        Objects.equals(this.rate, mdrDetailResponse.rate) &&
        Objects.equals(this.cost, mdrDetailResponse.cost) &&
        Objects.equals(this.currency, mdrDetailResponse.currency) &&
        Objects.equals(this.id, mdrDetailResponse.id) &&
        Objects.equals(this.messageType, mdrDetailResponse.messageType) &&
        Objects.equals(this.recordType, mdrDetailResponse.recordType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, profileName, direction, parts, status, cld, cli, rate, cost, currency, id, messageType, recordType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MdrDetailResponse {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    profileName: ").append(toIndentedString(profileName)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    parts: ").append(toIndentedString(parts)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    cld: ").append(toIndentedString(cld)).append("\n");
    sb.append("    cli: ").append(toIndentedString(cli)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
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
