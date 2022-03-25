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
 * CreateRoomClientTokenResponseData
 */
@JsonPropertyOrder({
  CreateRoomClientTokenResponseData.JSON_PROPERTY_TOKEN,
  CreateRoomClientTokenResponseData.JSON_PROPERTY_TOKEN_EXPIRES_AT,
  CreateRoomClientTokenResponseData.JSON_PROPERTY_REFRESH_TOKEN,
  CreateRoomClientTokenResponseData.JSON_PROPERTY_REFRESH_TOKEN_EXPIRES_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateRoomClientTokenResponseData {
  public static final String JSON_PROPERTY_TOKEN = "token";
  private String token;

  public static final String JSON_PROPERTY_TOKEN_EXPIRES_AT = "token_expires_at";
  private String tokenExpiresAt;

  public static final String JSON_PROPERTY_REFRESH_TOKEN = "refresh_token";
  private String refreshToken;

  public static final String JSON_PROPERTY_REFRESH_TOKEN_EXPIRES_AT = "refresh_token_expires_at";
  private String refreshTokenExpiresAt;

  public CreateRoomClientTokenResponseData() { 
  }

  public CreateRoomClientTokenResponseData token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJhdWQiOiJ0ZWxueXhfdGVsZXBob255IiwiZXhwIjoxNTkwMDEwMTQzLCJpYXQiOjE1ODc1OTA5NDMsImlzcyI6InRlbG55eF90ZWxlcGhvbnkiLCJqdGkiOiJiOGM3NDgzNy1kODllLTRhNjUtOWNmMi0zNGM3YTZmYTYwYzgiLCJuYmYiOjE1ODc1OTA5NDIsInN1YiI6IjVjN2FjN2QwLWRiNjUtNGYxMS05OGUxLWVlYzBkMWQ1YzZhZSIsInRlbF90b2tlbiI6InJqX1pra1pVT1pNeFpPZk9tTHBFVUIzc2lVN3U2UmpaRmVNOXMtZ2JfeENSNTZXRktGQUppTXlGMlQ2Q0JSbWxoX1N5MGlfbGZ5VDlBSThzRWlmOE1USUlzenl6U2xfYURuRzQ4YU81MHlhSEd1UlNZYlViU1ltOVdJaVEwZz09IiwidHlwIjoiYWNjZXNzIn0.gNEwzTow5MLLPLQENytca7pUN79PmPj6FyqZWW06ZeEmesxYpwKh0xRtA0TzLh6CDYIRHrI8seofOO0YFGDhpQ", value = "")
  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getToken() {
    return token;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToken(String token) {
    this.token = token;
  }


  public CreateRoomClientTokenResponseData tokenExpiresAt(String tokenExpiresAt) {
    this.tokenExpiresAt = tokenExpiresAt;
    return this;
  }

   /**
   * ISO 8601 timestamp when the token expires.
   * @return tokenExpiresAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-03-26T17:51:59Z", value = "ISO 8601 timestamp when the token expires.")
  @JsonProperty(JSON_PROPERTY_TOKEN_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTokenExpiresAt() {
    return tokenExpiresAt;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTokenExpiresAt(String tokenExpiresAt) {
    this.tokenExpiresAt = tokenExpiresAt;
  }


  public CreateRoomClientTokenResponseData refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

   /**
   * Get refreshToken
   * @return refreshToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJhdWQiOiJ0ZWxueXhfdGVsZXBob255IiwiZXhwIjoxNTkwMDEwMTQzLCJpYXQiOjE1ODc1OTA5NDMsImlzcyI6InRlbG55eF90ZWxlcGhvbnkiLCJqdGkiOiJiOGM3NDgzNy1kODllLTRhNjUtOWNmMi0zNGM3YTZmYTYwYzgiLCJuYmYiOjE1ODc1OTA5NDIsInN1YiI6IjVjN2FjN2QwLWRiNjUtNGYxMS05OGUxLWVlYzBkMWQ1YzZhZSIsInRlbF90b2tlbiI6InJqX1pra1pVT1pNeFpPZk9tTHBFVUIzc2lVN3U2UmpaRmVNOXMtZ2JfeENSNTZXRktGQUppTXlGMlQ2Q0JSbWxoX1N5MGlfbGZ5VDlBSThzRWlmOE1USUlzenl6U2xfYURuRzQ4YU81MHlhSEd1UlNZYlViU1ltOVdJaVEwZz09IiwidHlwIjoiYWNjZXNzIn0.gNEwzTow5MLLPLQENytca7pUN79PmPj6FyqZWW06ZeEmesxYpwKh0xRtA0TzLh6CDYIRHrI8seofOO0YFGDhpQ", value = "")
  @JsonProperty(JSON_PROPERTY_REFRESH_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRefreshToken() {
    return refreshToken;
  }


  @JsonProperty(JSON_PROPERTY_REFRESH_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }


  public CreateRoomClientTokenResponseData refreshTokenExpiresAt(String refreshTokenExpiresAt) {
    this.refreshTokenExpiresAt = refreshTokenExpiresAt;
    return this;
  }

   /**
   * ISO 8601 timestamp when the refresh token expires.
   * @return refreshTokenExpiresAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-03-26T17:51:59Z", value = "ISO 8601 timestamp when the refresh token expires.")
  @JsonProperty(JSON_PROPERTY_REFRESH_TOKEN_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRefreshTokenExpiresAt() {
    return refreshTokenExpiresAt;
  }


  @JsonProperty(JSON_PROPERTY_REFRESH_TOKEN_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefreshTokenExpiresAt(String refreshTokenExpiresAt) {
    this.refreshTokenExpiresAt = refreshTokenExpiresAt;
  }


  /**
   * Return true if this Create_Room_Client_Token_Response_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRoomClientTokenResponseData createRoomClientTokenResponseData = (CreateRoomClientTokenResponseData) o;
    return Objects.equals(this.token, createRoomClientTokenResponseData.token) &&
        Objects.equals(this.tokenExpiresAt, createRoomClientTokenResponseData.tokenExpiresAt) &&
        Objects.equals(this.refreshToken, createRoomClientTokenResponseData.refreshToken) &&
        Objects.equals(this.refreshTokenExpiresAt, createRoomClientTokenResponseData.refreshTokenExpiresAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, tokenExpiresAt, refreshToken, refreshTokenExpiresAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRoomClientTokenResponseData {\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    tokenExpiresAt: ").append(toIndentedString(tokenExpiresAt)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    refreshTokenExpiresAt: ").append(toIndentedString(refreshTokenExpiresAt)).append("\n");
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
