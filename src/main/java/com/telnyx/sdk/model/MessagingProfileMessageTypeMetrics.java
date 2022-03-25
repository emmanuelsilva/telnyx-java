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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * MessagingProfileMessageTypeMetrics
 */
@JsonPropertyOrder({
  MessagingProfileMessageTypeMetrics.JSON_PROPERTY_LABEL,
  MessagingProfileMessageTypeMetrics.JSON_PROPERTY_SENT,
  MessagingProfileMessageTypeMetrics.JSON_PROPERTY_DELIVERED,
  MessagingProfileMessageTypeMetrics.JSON_PROPERTY_OUTBOUND_ERROR_RATIO,
  MessagingProfileMessageTypeMetrics.JSON_PROPERTY_RECEIVED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MessagingProfileMessageTypeMetrics {
  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public static final String JSON_PROPERTY_SENT = "sent";
  private BigDecimal sent;

  public static final String JSON_PROPERTY_DELIVERED = "delivered";
  private BigDecimal delivered;

  public static final String JSON_PROPERTY_OUTBOUND_ERROR_RATIO = "outbound_error_ratio";
  private BigDecimal outboundErrorRatio;

  public static final String JSON_PROPERTY_RECEIVED = "received";
  private BigDecimal received;

  public MessagingProfileMessageTypeMetrics() { 
  }

   /**
   * The metric type.
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The metric type.")
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLabel() {
    return label;
  }




   /**
   * The number of outbound messages sent.
   * @return sent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of outbound messages sent.")
  @JsonProperty(JSON_PROPERTY_SENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getSent() {
    return sent;
  }




   /**
   * The number of outbound messages successfully delivered.
   * @return delivered
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of outbound messages successfully delivered.")
  @JsonProperty(JSON_PROPERTY_DELIVERED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getDelivered() {
    return delivered;
  }




   /**
   * The ratio of outbound messages sent that resulted in errors.
   * @return outboundErrorRatio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ratio of outbound messages sent that resulted in errors.")
  @JsonProperty(JSON_PROPERTY_OUTBOUND_ERROR_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getOutboundErrorRatio() {
    return outboundErrorRatio;
  }




   /**
   * The number of inbound messages received.
   * @return received
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of inbound messages received.")
  @JsonProperty(JSON_PROPERTY_RECEIVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getReceived() {
    return received;
  }




  /**
   * Return true if this MessagingProfileMessageTypeMetrics object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessagingProfileMessageTypeMetrics messagingProfileMessageTypeMetrics = (MessagingProfileMessageTypeMetrics) o;
    return Objects.equals(this.label, messagingProfileMessageTypeMetrics.label) &&
        Objects.equals(this.sent, messagingProfileMessageTypeMetrics.sent) &&
        Objects.equals(this.delivered, messagingProfileMessageTypeMetrics.delivered) &&
        Objects.equals(this.outboundErrorRatio, messagingProfileMessageTypeMetrics.outboundErrorRatio) &&
        Objects.equals(this.received, messagingProfileMessageTypeMetrics.received);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, sent, delivered, outboundErrorRatio, received);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagingProfileMessageTypeMetrics {\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
    sb.append("    delivered: ").append(toIndentedString(delivered)).append("\n");
    sb.append("    outboundErrorRatio: ").append(toIndentedString(outboundErrorRatio)).append("\n");
    sb.append("    received: ").append(toIndentedString(received)).append("\n");
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

