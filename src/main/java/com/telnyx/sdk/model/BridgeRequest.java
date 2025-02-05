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
 * BridgeRequest
 */
@JsonPropertyOrder({
  BridgeRequest.JSON_PROPERTY_CALL_CONTROL_ID,
  BridgeRequest.JSON_PROPERTY_CLIENT_STATE,
  BridgeRequest.JSON_PROPERTY_COMMAND_ID,
  BridgeRequest.JSON_PROPERTY_QUEUE,
  BridgeRequest.JSON_PROPERTY_PARK_AFTER_UNBRIDGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BridgeRequest {
  public static final String JSON_PROPERTY_CALL_CONTROL_ID = "call_control_id";
  private String callControlId;

  public static final String JSON_PROPERTY_CLIENT_STATE = "client_state";
  private String clientState;

  public static final String JSON_PROPERTY_COMMAND_ID = "command_id";
  private String commandId;

  public static final String JSON_PROPERTY_QUEUE = "queue";
  private String queue;

  public static final String JSON_PROPERTY_PARK_AFTER_UNBRIDGE = "park_after_unbridge";
  private String parkAfterUnbridge;

  public BridgeRequest() { 
  }

  public BridgeRequest callControlId(String callControlId) {
    this.callControlId = callControlId;
    return this;
  }

   /**
   * The Call Control ID of the call you want to bridge with.
   * @return callControlId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "v2:T02llQxIyaRkhfRKxgAP8nY511EhFLizdvdUKJiSw8d6A9BborherQ", required = true, value = "The Call Control ID of the call you want to bridge with.")
  @JsonProperty(JSON_PROPERTY_CALL_CONTROL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCallControlId() {
    return callControlId;
  }


  @JsonProperty(JSON_PROPERTY_CALL_CONTROL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCallControlId(String callControlId) {
    this.callControlId = callControlId;
  }


  public BridgeRequest clientState(String clientState) {
    this.clientState = clientState;
    return this;
  }

   /**
   * Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string.
   * @return clientState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "aGF2ZSBhIG5pY2UgZGF5ID1d", value = "Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string.")
  @JsonProperty(JSON_PROPERTY_CLIENT_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientState() {
    return clientState;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientState(String clientState) {
    this.clientState = clientState;
  }


  public BridgeRequest commandId(String commandId) {
    this.commandId = commandId;
    return this;
  }

   /**
   * Use this field to avoid duplicate commands. Telnyx will ignore any command with the same &#x60;command_id&#x60; for the same &#x60;call_control_id&#x60;.
   * @return commandId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "891510ac-f3e4-11e8-af5b-de00688a4901", value = "Use this field to avoid duplicate commands. Telnyx will ignore any command with the same `command_id` for the same `call_control_id`.")
  @JsonProperty(JSON_PROPERTY_COMMAND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCommandId() {
    return commandId;
  }


  @JsonProperty(JSON_PROPERTY_COMMAND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCommandId(String commandId) {
    this.commandId = commandId;
  }


  public BridgeRequest queue(String queue) {
    this.queue = queue;
    return this;
  }

   /**
   * The name of the queue you want to bridge with, can&#39;t be used together with call_control_id parameter. Bridging with a queue means bridging with the first call in the queue. The call will always be removed from the queue regardless of whether bridging succeeds. Returns an error when the queue is empty.
   * @return queue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "support", value = "The name of the queue you want to bridge with, can't be used together with call_control_id parameter. Bridging with a queue means bridging with the first call in the queue. The call will always be removed from the queue regardless of whether bridging succeeds. Returns an error when the queue is empty.")
  @JsonProperty(JSON_PROPERTY_QUEUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getQueue() {
    return queue;
  }


  @JsonProperty(JSON_PROPERTY_QUEUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQueue(String queue) {
    this.queue = queue;
  }


  public BridgeRequest parkAfterUnbridge(String parkAfterUnbridge) {
    this.parkAfterUnbridge = parkAfterUnbridge;
    return this;
  }

   /**
   * Specifies behavior after the bridge ends (i.e. the opposite leg either hangs up or is transferred). If supplied with the value &#x60;self&#x60;, the current leg will be parked after unbridge. If not set, the default behavior is to hang up the leg.
   * @return parkAfterUnbridge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "self", value = "Specifies behavior after the bridge ends (i.e. the opposite leg either hangs up or is transferred). If supplied with the value `self`, the current leg will be parked after unbridge. If not set, the default behavior is to hang up the leg.")
  @JsonProperty(JSON_PROPERTY_PARK_AFTER_UNBRIDGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getParkAfterUnbridge() {
    return parkAfterUnbridge;
  }


  @JsonProperty(JSON_PROPERTY_PARK_AFTER_UNBRIDGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParkAfterUnbridge(String parkAfterUnbridge) {
    this.parkAfterUnbridge = parkAfterUnbridge;
  }


  /**
   * Return true if this BridgeRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BridgeRequest bridgeRequest = (BridgeRequest) o;
    return Objects.equals(this.callControlId, bridgeRequest.callControlId) &&
        Objects.equals(this.clientState, bridgeRequest.clientState) &&
        Objects.equals(this.commandId, bridgeRequest.commandId) &&
        Objects.equals(this.queue, bridgeRequest.queue) &&
        Objects.equals(this.parkAfterUnbridge, bridgeRequest.parkAfterUnbridge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callControlId, clientState, commandId, queue, parkAfterUnbridge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BridgeRequest {\n");
    sb.append("    callControlId: ").append(toIndentedString(callControlId)).append("\n");
    sb.append("    clientState: ").append(toIndentedString(clientState)).append("\n");
    sb.append("    commandId: ").append(toIndentedString(commandId)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    parkAfterUnbridge: ").append(toIndentedString(parkAfterUnbridge)).append("\n");
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

