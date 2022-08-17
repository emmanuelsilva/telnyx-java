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
import com.telnyx.sdk.model.ButtonComponentType;
import com.telnyx.sdk.model.ButtonSubtype;
import com.telnyx.sdk.model.TemplateButtonParameter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * TemplateButtonComponent
 */
@JsonPropertyOrder({
  TemplateButtonComponent.JSON_PROPERTY_TYPE,
  TemplateButtonComponent.JSON_PROPERTY_SUB_TYPE,
  TemplateButtonComponent.JSON_PROPERTY_INDEX,
  TemplateButtonComponent.JSON_PROPERTY_PARAMETERS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TemplateButtonComponent {
  public static final String JSON_PROPERTY_TYPE = "type";
  private ButtonComponentType type;

  public static final String JSON_PROPERTY_SUB_TYPE = "sub_type";
  private ButtonSubtype subType;

  public static final String JSON_PROPERTY_INDEX = "index";
  private Integer index;

  public static final String JSON_PROPERTY_PARAMETERS = "parameters";
  private List parameters;

  public TemplateButtonComponent() { 
  }

  public TemplateButtonComponent type(ButtonComponentType type) {
    this.type = type;
    return this;
  }

   /**
   * Describes the component type.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Describes the component type.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ButtonComponentType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(ButtonComponentType type) {
    this.type = type;
  }


  public TemplateButtonComponent subType(ButtonSubtype subType) {
    this.subType = subType;
    return this;
  }

   /**
   * Used when type is set to button.
   * @return subType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Used when type is set to button.")
  @JsonProperty(JSON_PROPERTY_SUB_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ButtonSubtype getSubType() {
    return subType;
  }


  @JsonProperty(JSON_PROPERTY_SUB_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubType(ButtonSubtype subType) {
    this.subType = subType;
  }


  public TemplateButtonComponent index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * Position index of the button. You can have up to 3 buttons using index values of 0-2.
   * @return index
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Position index of the button. You can have up to 3 buttons using index values of 0-2.")
  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getIndex() {
    return index;
  }


  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIndex(Integer index) {
    this.index = index;
  }


  public TemplateButtonComponent parameters(List parameters) {
    this.parameters = parameters;
    return this;
  }

   /**
   * The parameters for the button, which are set at creation time in your Business Manager.
   * @return parameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The parameters for the button, which are set at creation time in your Business Manager.")
  @JsonProperty(JSON_PROPERTY_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List getParameters() {
    return parameters;
  }


  @JsonProperty(JSON_PROPERTY_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setParameters(List parameters) {
    this.parameters = parameters;
  }


  /**
   * Return true if this TemplateButtonComponent object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateButtonComponent templateButtonComponent = (TemplateButtonComponent) o;
    return Objects.equals(this.type, templateButtonComponent.type) &&
        Objects.equals(this.subType, templateButtonComponent.subType) &&
        Objects.equals(this.index, templateButtonComponent.index) &&
        Objects.equals(this.parameters, templateButtonComponent.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, subType, index, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateButtonComponent {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
