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
import com.telnyx.sdk.model.Error;
import com.telnyx.sdk.model.InboundMessagePayloadCost;
import com.telnyx.sdk.model.OutboundMessagePayloadFrom;
import com.telnyx.sdk.model.OutboundMessagePayloadMedia;
import com.telnyx.sdk.model.OutboundMessagePayloadTo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * OutboundMessagePayload
 */
@JsonPropertyOrder({
  OutboundMessagePayload.JSON_PROPERTY_RECORD_TYPE,
  OutboundMessagePayload.JSON_PROPERTY_DIRECTION,
  OutboundMessagePayload.JSON_PROPERTY_ID,
  OutboundMessagePayload.JSON_PROPERTY_TYPE,
  OutboundMessagePayload.JSON_PROPERTY_MESSAGING_PROFILE_ID,
  OutboundMessagePayload.JSON_PROPERTY_ORGANIZATION_ID,
  OutboundMessagePayload.JSON_PROPERTY_FROM,
  OutboundMessagePayload.JSON_PROPERTY_TO,
  OutboundMessagePayload.JSON_PROPERTY_TEXT,
  OutboundMessagePayload.JSON_PROPERTY_SUBJECT,
  OutboundMessagePayload.JSON_PROPERTY_MEDIA,
  OutboundMessagePayload.JSON_PROPERTY_WEBHOOK_URL,
  OutboundMessagePayload.JSON_PROPERTY_WEBHOOK_FAILOVER_URL,
  OutboundMessagePayload.JSON_PROPERTY_ENCODING,
  OutboundMessagePayload.JSON_PROPERTY_PARTS,
  OutboundMessagePayload.JSON_PROPERTY_TAGS,
  OutboundMessagePayload.JSON_PROPERTY_COST,
  OutboundMessagePayload.JSON_PROPERTY_RECEIVED_AT,
  OutboundMessagePayload.JSON_PROPERTY_SENT_AT,
  OutboundMessagePayload.JSON_PROPERTY_COMPLETED_AT,
  OutboundMessagePayload.JSON_PROPERTY_VALID_UNTIL,
  OutboundMessagePayload.JSON_PROPERTY_ERRORS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OutboundMessagePayload {
  /**
   * Identifies the type of the resource.
   */
  public enum RecordTypeEnum {
    MESSAGE("message");

    private String value;

    RecordTypeEnum(String value) {
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
    public static RecordTypeEnum fromValue(String value) {
      for (RecordTypeEnum b : RecordTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private RecordTypeEnum recordType;

  /**
   * The direction of the message. Inbound messages are sent to you whereas outbound messages are sent from you.
   */
  public enum DirectionEnum {
    OUTBOUND("outbound");

    private String value;

    DirectionEnum(String value) {
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
    public static DirectionEnum fromValue(String value) {
      for (DirectionEnum b : DirectionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DIRECTION = "direction";
  private DirectionEnum direction;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  /**
   * The type of message.
   */
  public enum TypeEnum {
    SMS("SMS"),
    
    MMS("MMS");

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

  public static final String JSON_PROPERTY_MESSAGING_PROFILE_ID = "messaging_profile_id";
  private String messagingProfileId;

  public static final String JSON_PROPERTY_ORGANIZATION_ID = "organization_id";
  private UUID organizationId;

  public static final String JSON_PROPERTY_FROM = "from";
  private OutboundMessagePayloadFrom from;

  public static final String JSON_PROPERTY_TO = "to";
  private List<OutboundMessagePayloadTo> to = null;

  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public static final String JSON_PROPERTY_SUBJECT = "subject";
  private JsonNullable<String> subject = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MEDIA = "media";
  private List<OutboundMessagePayloadMedia> media = null;

  public static final String JSON_PROPERTY_WEBHOOK_URL = "webhook_url";
  private JsonNullable<String> webhookUrl = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_WEBHOOK_FAILOVER_URL = "webhook_failover_url";
  private JsonNullable<String> webhookFailoverUrl = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ENCODING = "encoding";
  private String encoding;

  public static final String JSON_PROPERTY_PARTS = "parts";
  private Integer parts;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_COST = "cost";
  private JsonNullable<InboundMessagePayloadCost> cost = JsonNullable.<InboundMessagePayloadCost>undefined();

  public static final String JSON_PROPERTY_RECEIVED_AT = "received_at";
  private OffsetDateTime receivedAt;

  public static final String JSON_PROPERTY_SENT_AT = "sent_at";
  private OffsetDateTime sentAt;

  public static final String JSON_PROPERTY_COMPLETED_AT = "completed_at";
  private OffsetDateTime completedAt;

  public static final String JSON_PROPERTY_VALID_UNTIL = "valid_until";
  private JsonNullable<OffsetDateTime> validUntil = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<Error> errors = null;


  public OutboundMessagePayload recordType(RecordTypeEnum recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * Identifies the type of the resource.
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "message", value = "Identifies the type of the resource.")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecordTypeEnum getRecordType() {
    return recordType;
  }


  public void setRecordType(RecordTypeEnum recordType) {
    this.recordType = recordType;
  }


  public OutboundMessagePayload direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }

   /**
   * The direction of the message. Inbound messages are sent to you whereas outbound messages are sent from you.
   * @return direction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "outbound", value = "The direction of the message. Inbound messages are sent to you whereas outbound messages are sent from you.")
  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DirectionEnum getDirection() {
    return direction;
  }


  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }


  public OutboundMessagePayload id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Identifies the type of resource.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifies the type of resource.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public OutboundMessagePayload type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of message.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of message.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public OutboundMessagePayload messagingProfileId(String messagingProfileId) {
    this.messagingProfileId = messagingProfileId;
    return this;
  }

   /**
   * Unique identifier for a messaging profile.
   * @return messagingProfileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier for a messaging profile.")
  @JsonProperty(JSON_PROPERTY_MESSAGING_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessagingProfileId() {
    return messagingProfileId;
  }


  public void setMessagingProfileId(String messagingProfileId) {
    this.messagingProfileId = messagingProfileId;
  }


  public OutboundMessagePayload organizationId(UUID organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * The id of the organization the messaging profile belongs to.
   * @return organizationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the organization the messaging profile belongs to.")
  @JsonProperty(JSON_PROPERTY_ORGANIZATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getOrganizationId() {
    return organizationId;
  }


  public void setOrganizationId(UUID organizationId) {
    this.organizationId = organizationId;
  }


  public OutboundMessagePayload from(OutboundMessagePayloadFrom from) {
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OutboundMessagePayloadFrom getFrom() {
    return from;
  }


  public void setFrom(OutboundMessagePayloadFrom from) {
    this.from = from;
  }


  public OutboundMessagePayload to(List<OutboundMessagePayloadTo> to) {
    this.to = to;
    return this;
  }

  public OutboundMessagePayload addToItem(OutboundMessagePayloadTo toItem) {
    if (this.to == null) {
      this.to = new ArrayList<>();
    }
    this.to.add(toItem);
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<OutboundMessagePayloadTo> getTo() {
    return to;
  }


  public void setTo(List<OutboundMessagePayloadTo> to) {
    this.to = to;
  }


  public OutboundMessagePayload text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Message body (i.e., content) as a non-empty string.  **Required for SMS**
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Message body (i.e., content) as a non-empty string.  **Required for SMS**")
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  public OutboundMessagePayload subject(String subject) {
    this.subject = JsonNullable.<String>of(subject);
    return this;
  }

   /**
   * Subject of multimedia message
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Subject of multimedia message")
  @JsonIgnore

  public String getSubject() {
        return subject.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSubject_JsonNullable() {
    return subject;
  }
  
  @JsonProperty(JSON_PROPERTY_SUBJECT)
  public void setSubject_JsonNullable(JsonNullable<String> subject) {
    this.subject = subject;
  }

  public void setSubject(String subject) {
    this.subject = JsonNullable.<String>of(subject);
  }


  public OutboundMessagePayload media(List<OutboundMessagePayloadMedia> media) {
    this.media = media;
    return this;
  }

  public OutboundMessagePayload addMediaItem(OutboundMessagePayloadMedia mediaItem) {
    if (this.media == null) {
      this.media = new ArrayList<>();
    }
    this.media.add(mediaItem);
    return this;
  }

   /**
   * Get media
   * @return media
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MEDIA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<OutboundMessagePayloadMedia> getMedia() {
    return media;
  }


  public void setMedia(List<OutboundMessagePayloadMedia> media) {
    this.media = media;
  }


  public OutboundMessagePayload webhookUrl(String webhookUrl) {
    this.webhookUrl = JsonNullable.<String>of(webhookUrl);
    return this;
  }

   /**
   * The URL where webhooks related to this message will be sent.
   * @return webhookUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL where webhooks related to this message will be sent.")
  @JsonIgnore

  public String getWebhookUrl() {
        return webhookUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WEBHOOK_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getWebhookUrl_JsonNullable() {
    return webhookUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_WEBHOOK_URL)
  public void setWebhookUrl_JsonNullable(JsonNullable<String> webhookUrl) {
    this.webhookUrl = webhookUrl;
  }

  public void setWebhookUrl(String webhookUrl) {
    this.webhookUrl = JsonNullable.<String>of(webhookUrl);
  }


  public OutboundMessagePayload webhookFailoverUrl(String webhookFailoverUrl) {
    this.webhookFailoverUrl = JsonNullable.<String>of(webhookFailoverUrl);
    return this;
  }

   /**
   * The failover URL where webhooks related to this message will be sent if sending to the primary URL fails.
   * @return webhookFailoverUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The failover URL where webhooks related to this message will be sent if sending to the primary URL fails.")
  @JsonIgnore

  public String getWebhookFailoverUrl() {
        return webhookFailoverUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WEBHOOK_FAILOVER_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getWebhookFailoverUrl_JsonNullable() {
    return webhookFailoverUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_WEBHOOK_FAILOVER_URL)
  public void setWebhookFailoverUrl_JsonNullable(JsonNullable<String> webhookFailoverUrl) {
    this.webhookFailoverUrl = webhookFailoverUrl;
  }

  public void setWebhookFailoverUrl(String webhookFailoverUrl) {
    this.webhookFailoverUrl = JsonNullable.<String>of(webhookFailoverUrl);
  }


  public OutboundMessagePayload encoding(String encoding) {
    this.encoding = encoding;
    return this;
  }

   /**
   * Encoding scheme used for the message body.
   * @return encoding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Encoding scheme used for the message body.")
  @JsonProperty(JSON_PROPERTY_ENCODING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEncoding() {
    return encoding;
  }


  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }


  public OutboundMessagePayload parts(Integer parts) {
    this.parts = parts;
    return this;
  }

   /**
   * Number of parts into which the message&#39;s body must be split.
   * minimum: 1
   * maximum: 10
   * @return parts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of parts into which the message's body must be split.")
  @JsonProperty(JSON_PROPERTY_PARTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getParts() {
    return parts;
  }


  public void setParts(Integer parts) {
    this.parts = parts;
  }


  public OutboundMessagePayload tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public OutboundMessagePayload addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Tags associated with the resource.
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tags associated with the resource.")
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public OutboundMessagePayload cost(InboundMessagePayloadCost cost) {
    this.cost = JsonNullable.<InboundMessagePayloadCost>of(cost);
    return this;
  }

   /**
   * Get cost
   * @return cost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public InboundMessagePayloadCost getCost() {
        return cost.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<InboundMessagePayloadCost> getCost_JsonNullable() {
    return cost;
  }
  
  @JsonProperty(JSON_PROPERTY_COST)
  public void setCost_JsonNullable(JsonNullable<InboundMessagePayloadCost> cost) {
    this.cost = cost;
  }

  public void setCost(InboundMessagePayloadCost cost) {
    this.cost = JsonNullable.<InboundMessagePayloadCost>of(cost);
  }


  public OutboundMessagePayload receivedAt(OffsetDateTime receivedAt) {
    this.receivedAt = receivedAt;
    return this;
  }

   /**
   * ISO 8601 formatted date indicating when the message request was received.
   * @return receivedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ISO 8601 formatted date indicating when the message request was received.")
  @JsonProperty(JSON_PROPERTY_RECEIVED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getReceivedAt() {
    return receivedAt;
  }


  public void setReceivedAt(OffsetDateTime receivedAt) {
    this.receivedAt = receivedAt;
  }


  public OutboundMessagePayload sentAt(OffsetDateTime sentAt) {
    this.sentAt = sentAt;
    return this;
  }

   /**
   * ISO 8601 formatted date indicating when the message was sent.
   * @return sentAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ISO 8601 formatted date indicating when the message was sent.")
  @JsonProperty(JSON_PROPERTY_SENT_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getSentAt() {
    return sentAt;
  }


  public void setSentAt(OffsetDateTime sentAt) {
    this.sentAt = sentAt;
  }


  public OutboundMessagePayload completedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
    return this;
  }

   /**
   * ISO 8601 formatted date indicating when the message was finalized.
   * @return completedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ISO 8601 formatted date indicating when the message was finalized.")
  @JsonProperty(JSON_PROPERTY_COMPLETED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCompletedAt() {
    return completedAt;
  }


  public void setCompletedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
  }


  public OutboundMessagePayload validUntil(OffsetDateTime validUntil) {
    this.validUntil = JsonNullable.<OffsetDateTime>of(validUntil);
    return this;
  }

   /**
   * Message must be out of the queue by this time or else it will be discarded and marked as &#39;sending_failed&#39;. Once the message moves out of the queue, this field will be nulled
   * @return validUntil
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Message must be out of the queue by this time or else it will be discarded and marked as 'sending_failed'. Once the message moves out of the queue, this field will be nulled")
  @JsonIgnore

  public OffsetDateTime getValidUntil() {
        return validUntil.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VALID_UNTIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getValidUntil_JsonNullable() {
    return validUntil;
  }
  
  @JsonProperty(JSON_PROPERTY_VALID_UNTIL)
  public void setValidUntil_JsonNullable(JsonNullable<OffsetDateTime> validUntil) {
    this.validUntil = validUntil;
  }

  public void setValidUntil(OffsetDateTime validUntil) {
    this.validUntil = JsonNullable.<OffsetDateTime>of(validUntil);
  }


  public OutboundMessagePayload errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public OutboundMessagePayload addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * These errors may point at addressees when referring to unsuccessful/unconfirmed delivery statuses.
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "These errors may point at addressees when referring to unsuccessful/unconfirmed delivery statuses.")
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Error> getErrors() {
    return errors;
  }


  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }


  /**
   * Return true if this OutboundMessagePayload object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutboundMessagePayload outboundMessagePayload = (OutboundMessagePayload) o;
    return Objects.equals(this.recordType, outboundMessagePayload.recordType) &&
        Objects.equals(this.direction, outboundMessagePayload.direction) &&
        Objects.equals(this.id, outboundMessagePayload.id) &&
        Objects.equals(this.type, outboundMessagePayload.type) &&
        Objects.equals(this.messagingProfileId, outboundMessagePayload.messagingProfileId) &&
        Objects.equals(this.organizationId, outboundMessagePayload.organizationId) &&
        Objects.equals(this.from, outboundMessagePayload.from) &&
        Objects.equals(this.to, outboundMessagePayload.to) &&
        Objects.equals(this.text, outboundMessagePayload.text) &&
        Objects.equals(this.subject, outboundMessagePayload.subject) &&
        Objects.equals(this.media, outboundMessagePayload.media) &&
        Objects.equals(this.webhookUrl, outboundMessagePayload.webhookUrl) &&
        Objects.equals(this.webhookFailoverUrl, outboundMessagePayload.webhookFailoverUrl) &&
        Objects.equals(this.encoding, outboundMessagePayload.encoding) &&
        Objects.equals(this.parts, outboundMessagePayload.parts) &&
        Objects.equals(this.tags, outboundMessagePayload.tags) &&
        Objects.equals(this.cost, outboundMessagePayload.cost) &&
        Objects.equals(this.receivedAt, outboundMessagePayload.receivedAt) &&
        Objects.equals(this.sentAt, outboundMessagePayload.sentAt) &&
        Objects.equals(this.completedAt, outboundMessagePayload.completedAt) &&
        Objects.equals(this.validUntil, outboundMessagePayload.validUntil) &&
        Objects.equals(this.errors, outboundMessagePayload.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordType, direction, id, type, messagingProfileId, organizationId, from, to, text, subject, media, webhookUrl, webhookFailoverUrl, encoding, parts, tags, cost, receivedAt, sentAt, completedAt, validUntil, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundMessagePayload {\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    messagingProfileId: ").append(toIndentedString(messagingProfileId)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    webhookUrl: ").append(toIndentedString(webhookUrl)).append("\n");
    sb.append("    webhookFailoverUrl: ").append(toIndentedString(webhookFailoverUrl)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    parts: ").append(toIndentedString(parts)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    receivedAt: ").append(toIndentedString(receivedAt)).append("\n");
    sb.append("    sentAt: ").append(toIndentedString(sentAt)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

