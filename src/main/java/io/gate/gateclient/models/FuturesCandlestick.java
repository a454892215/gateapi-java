/*
 * Gate API v4
 * APIv4 futures provides all sorts of futures trading operations. There are public APIs to retrieve the real-time market statistics, and private APIs which needs authentication to trade on user's behalf.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@mail.gate.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.gate.gateclient.models;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * data point detail
 */
@ApiModel(description = "data point detail")

public class FuturesCandlestick {
  public static final String SERIALIZED_NAME_T = "t";
  @SerializedName(SERIALIZED_NAME_T)
  private BigDecimal t;

  public static final String SERIALIZED_NAME_V = "v";
  @SerializedName(SERIALIZED_NAME_V)
  private Long v;

  public static final String SERIALIZED_NAME_C = "c";
  @SerializedName(SERIALIZED_NAME_C)
  private String c;

  public static final String SERIALIZED_NAME_H = "h";
  @SerializedName(SERIALIZED_NAME_H)
  private String h;

  public static final String SERIALIZED_NAME_L = "l";
  @SerializedName(SERIALIZED_NAME_L)
  private String l;

  public static final String SERIALIZED_NAME_O = "o";
  @SerializedName(SERIALIZED_NAME_O)
  private String o;

  public FuturesCandlestick t(BigDecimal t) {
    this.t = t;
    return this;
  }

   /**
   * Unix timestamp in seconds
   * @return t
  **/
  @ApiModelProperty(value = "Unix timestamp in seconds")
  @JsonSerialize(using = ToStringSerializer.class)
  public BigDecimal getT() {
    return t;
  }

  public void setT(BigDecimal t) {
    this.t = t;
  }

  public FuturesCandlestick v(Long v) {
    this.v = v;
    return this;
  }

   /**
   * size volume. Only returned if &#x60;contract&#x60; is not prefixed
   * @return v
  **/
  @ApiModelProperty(value = "size volume. Only returned if `contract` is not prefixed")
  public Long getV() {
    return v;
  }

  public void setV(Long v) {
    this.v = v;
  }

  public FuturesCandlestick c(String c) {
    this.c = c;
    return this;
  }

   /**
   * close price
   * @return c
  **/
  @ApiModelProperty(value = "close price")
  public String getC() {
    return c;
  }

  public void setC(String c) {
    this.c = c;
  }

  public FuturesCandlestick h(String h) {
    this.h = h;
    return this;
  }

   /**
   * highest price
   * @return h
  **/
  @ApiModelProperty(value = "highest price")
  public String getH() {
    return h;
  }

  public void setH(String h) {
    this.h = h;
  }

  public FuturesCandlestick l(String l) {
    this.l = l;
    return this;
  }

   /**
   * lowest price
   * @return l
  **/
  @ApiModelProperty(value = "lowest price")
  public String getL() {
    return l;
  }

  public void setL(String l) {
    this.l = l;
  }

  public FuturesCandlestick o(String o) {
    this.o = o;
    return this;
  }

   /**
   * open price
   * @return o
  **/
  @ApiModelProperty(value = "open price")
  public String getO() {
    return o;
  }

  public void setO(String o) {
    this.o = o;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FuturesCandlestick futuresCandlestick = (FuturesCandlestick) o;
    return Objects.equals(this.t, futuresCandlestick.t) &&
        Objects.equals(this.v, futuresCandlestick.v) &&
        Objects.equals(this.c, futuresCandlestick.c) &&
        Objects.equals(this.h, futuresCandlestick.h) &&
        Objects.equals(this.l, futuresCandlestick.l) &&
        Objects.equals(this.o, futuresCandlestick.o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(t, v, c, h, l, o);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FuturesCandlestick {\n");
    
    sb.append("    t: ").append(toIndentedString(t)).append("\n");
    sb.append("    v: ").append(toIndentedString(v)).append("\n");
    sb.append("    c: ").append(toIndentedString(c)).append("\n");
    sb.append("    h: ").append(toIndentedString(h)).append("\n");
    sb.append("    l: ").append(toIndentedString(l)).append("\n");
    sb.append("    o: ").append(toIndentedString(o)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

