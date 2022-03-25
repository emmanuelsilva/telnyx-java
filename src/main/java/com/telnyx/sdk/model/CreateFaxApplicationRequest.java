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
import com.telnyx.sdk.model.AnchorsiteOverride;
import com.telnyx.sdk.model.CreateFaxApplicationRequestInbound;
import com.telnyx.sdk.model.CreateFaxApplicationRequestOutbound;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * CreateFaxApplicationRequest
 */
@JsonPropertyOrder({
  CreateFaxApplicationRequest.JSON_PROPERTY_APPLICATION_NAME,
  CreateFaxApplicationRequest.JSON_PROPERTY_ACTIVE,
  CreateFaxApplicationRequest.JSON_PROPERTY_ANCHORSITE_OVERRIDE,
  CreateFaxApplicationRequest.JSON_PROPERTY_WEBHOOK_EVENT_URL,
  CreateFaxApplicationRequest.JSON_PROPERTY_WEBHOOK_EVENT_FAILOVER_URL,
  CreateFaxApplicationRequest.JSON_PROPERTY_WEBHOOK_TIMEOUT_SECS,
  CreateFaxApplicationRequest.JSON_PROPERTY_INBOUND,
  CreateFaxApplicationRequest.JSON_PROPERTY_OUTBOUND
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateFaxApplicationRequest {
  public static final String JSON_PROPERTY_APPLICATION_NAME = "application_name";
  private String applicationName;

  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active = true;

  public static final String JSON_PROPERTY_ANCHORSITE_OVERRIDE = "anchorsite_override";
  private AnchorsiteOverride anchorsiteOverride = AnchorsiteOverride.LATENCY;

  public static final String JSON_PROPERTY_WEBHOOK_EVENT_URL = "webhook_event_url";
  private String webhookEventUrl;

  public static final String JSON_PROPERTY_WEBHOOK_EVENT_FAILOVER_URL = "webhook_event_failover_url";
  private JsonNullable<String> webhookEventFailoverUrl = JsonNullable.<String>of("");

  public static final String JSON_PROPERTY_WEBHOOK_TIMEOUT_SECS = "webhook_timeout_secs";
  private JsonNullable<Integer> webhookTimeoutSecs = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_INBOUND = "inbound";
  private CreateFaxApplicationRequestInbound inbound;

  public static final String JSON_PROPERTY_OUTBOUND = "outbound";
  private CreateFaxApplicationRequestOutbound outbound;

  public CreateFaxApplicationRequest() { 
  }

  public CreateFaxApplicationRequest applicationName(String applicationName) {
    this.applicationName = applicationName;
    return this;
  }

   /**
   * A user-assigned name to help manage the application.
   * @return applicationName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "call-router", required = true, value = "A user-assigned name to help manage the application.")
  @JsonProperty(JSON_PROPERTY_APPLICATION_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getApplicationName() {
    return applicationName;
  }


  @JsonProperty(JSON_PROPERTY_APPLICATION_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setApplicationName(String applicationName) {
    this.applicationName = applicationName;
  }


  public CreateFaxApplicationRequest active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Specifies whether the connection can be used.
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Specifies whether the connection can be used.")
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActive() {
    return active;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActive(Boolean active) {
    this.active = active;
  }


  public CreateFaxApplicationRequest anchorsiteOverride(AnchorsiteOverride anchorsiteOverride) {
    this.anchorsiteOverride = anchorsiteOverride;
    return this;
  }

   /**
   * Get anchorsiteOverride
   * @return anchorsiteOverride
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ANCHORSITE_OVERRIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AnchorsiteOverride getAnchorsiteOverride() {
    return anchorsiteOverride;
  }


  @JsonProperty(JSON_PROPERTY_ANCHORSITE_OVERRIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnchorsiteOverride(AnchorsiteOverride anchorsiteOverride) {
    this.anchorsiteOverride = anchorsiteOverride;
  }


  public CreateFaxApplicationRequest webhookEventUrl(String webhookEventUrl) {
    this.webhookEventUrl = webhookEventUrl;
    return this;
  }

   /**
   * The URL where webhooks related to this connection will be sent. Must include a scheme, such as &#39;https&#39;.
   * @return webhookEventUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "https://example.com", required = true, value = "The URL where webhooks related to this connection will be sent. Must include a scheme, such as 'https'.")
  @JsonProperty(JSON_PROPERTY_WEBHOOK_EVENT_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getWebhookEventUrl() {
    return webhookEventUrl;
  }


  @JsonProperty(JSON_PROPERTY_WEBHOOK_EVENT_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWebhookEventUrl(String webhookEventUrl) {
    this.webhookEventUrl = webhookEventUrl;
  }


  public CreateFaxApplicationRequest webhookEventFailoverUrl(String webhookEventFailoverUrl) {
    this.webhookEventFailoverUrl = JsonNullable.<String>of(webhookEventFailoverUrl);
    return this;
  }

   /**
   * The failover URL where webhooks related to this connection will be sent if sending to the primary URL fails. Must include a scheme, such as &#39;https&#39;.
   * @return webhookEventFailoverUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://failover.example.com", value = "The failover URL where webhooks related to this connection will be sent if sending to the primary URL fails. Must include a scheme, such as 'https'.")
  @JsonIgnore

  public String getWebhookEventFailoverUrl() {
        return webhookEventFailoverUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WEBHOOK_EVENT_FAILOVER_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getWebhookEventFailoverUrl_JsonNullable() {
    return webhookEventFailoverUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_WEBHOOK_EVENT_FAILOVER_URL)
  public void setWebhookEventFailoverUrl_JsonNullable(JsonNullable<String> webhookEventFailoverUrl) {
    this.webhookEventFailoverUrl = webhookEventFailoverUrl;
  }

  public void setWebhookEventFailoverUrl(String webhookEventFailoverUrl) {
    this.webhookEventFailoverUrl = JsonNullable.<String>of(webhookEventFailoverUrl);
  }


  public CreateFaxApplicationRequest webhookTimeoutSecs(Integer webhookTimeoutSecs) {
    this.webhookTimeoutSecs = JsonNullable.<Integer>of(webhookTimeoutSecs);
    return this;
  }

   /**
   * Specifies how many seconds to wait before timing out a webhook.
   * minimum: 0
   * maximum: 30
   * @return webhookTimeoutSecs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "25", value = "Specifies how many seconds to wait before timing out a webhook.")
  @JsonIgnore

  public Integer getWebhookTimeoutSecs() {
        return webhookTimeoutSecs.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WEBHOOK_TIMEOUT_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getWebhookTimeoutSecs_JsonNullable() {
    return webhookTimeoutSecs;
  }
  
  @JsonProperty(JSON_PROPERTY_WEBHOOK_TIMEOUT_SECS)
  public void setWebhookTimeoutSecs_JsonNullable(JsonNullable<Integer> webhookTimeoutSecs) {
    this.webhookTimeoutSecs = webhookTimeoutSecs;
  }

  public void setWebhookTimeoutSecs(Integer webhookTimeoutSecs) {
    this.webhookTimeoutSecs = JsonNullable.<Integer>of(webhookTimeoutSecs);
  }


  public CreateFaxApplicationRequest inbound(CreateFaxApplicationRequestInbound inbound) {
    this.inbound = inbound;
    return this;
  }

   /**
   * Get inbound
   * @return inbound
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INBOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CreateFaxApplicationRequestInbound getInbound() {
    return inbound;
  }


  @JsonProperty(JSON_PROPERTY_INBOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInbound(CreateFaxApplicationRequestInbound inbound) {
    this.inbound = inbound;
  }


  public CreateFaxApplicationRequest outbound(CreateFaxApplicationRequestOutbound outbound) {
    this.outbound = outbound;
    return this;
  }

   /**
   * Get outbound
   * @return outbound
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OUTBOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CreateFaxApplicationRequestOutbound getOutbound() {
    return outbound;
  }


  @JsonProperty(JSON_PROPERTY_OUTBOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutbound(CreateFaxApplicationRequestOutbound outbound) {
    this.outbound = outbound;
  }


  /**
   * Return true if this CreateFaxApplicationRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFaxApplicationRequest createFaxApplicationRequest = (CreateFaxApplicationRequest) o;
    return Objects.equals(this.applicationName, createFaxApplicationRequest.applicationName) &&
        Objects.equals(this.active, createFaxApplicationRequest.active) &&
        Objects.equals(this.anchorsiteOverride, createFaxApplicationRequest.anchorsiteOverride) &&
        Objects.equals(this.webhookEventUrl, createFaxApplicationRequest.webhookEventUrl) &&
        equalsNullable(this.webhookEventFailoverUrl, createFaxApplicationRequest.webhookEventFailoverUrl) &&
        equalsNullable(this.webhookTimeoutSecs, createFaxApplicationRequest.webhookTimeoutSecs) &&
        Objects.equals(this.inbound, createFaxApplicationRequest.inbound) &&
        Objects.equals(this.outbound, createFaxApplicationRequest.outbound);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationName, active, anchorsiteOverride, webhookEventUrl, hashCodeNullable(webhookEventFailoverUrl), hashCodeNullable(webhookTimeoutSecs), inbound, outbound);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFaxApplicationRequest {\n");
    sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    anchorsiteOverride: ").append(toIndentedString(anchorsiteOverride)).append("\n");
    sb.append("    webhookEventUrl: ").append(toIndentedString(webhookEventUrl)).append("\n");
    sb.append("    webhookEventFailoverUrl: ").append(toIndentedString(webhookEventFailoverUrl)).append("\n");
    sb.append("    webhookTimeoutSecs: ").append(toIndentedString(webhookTimeoutSecs)).append("\n");
    sb.append("    inbound: ").append(toIndentedString(inbound)).append("\n");
    sb.append("    outbound: ").append(toIndentedString(outbound)).append("\n");
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

