/*
 * Gate API v4
 * APIv4 provides spot, margin and futures trading operations. There are public APIs to retrieve the real-time market statistics, and private APIs which needs authentication to trade on user's behalf.
 *
 * Contact: support@mail.gate.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.gate.gateapi.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.gate.gateapi.models.FuturesOrderBookItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * FuturesOrderBook
 */

public class FuturesOrderBook {
  public static final String SERIALIZED_NAME_ASKS = "asks";
  @SerializedName(SERIALIZED_NAME_ASKS)
  private List<FuturesOrderBookItem> asks = new ArrayList<>();

  public static final String SERIALIZED_NAME_BIDS = "bids";
  @SerializedName(SERIALIZED_NAME_BIDS)
  private List<FuturesOrderBookItem> bids = new ArrayList<>();

  public FuturesOrderBook asks(List<FuturesOrderBookItem> asks) {
    this.asks = asks;
    return this;
  }

  public FuturesOrderBook addAsksItem(FuturesOrderBookItem asksItem) {
    this.asks.add(asksItem);
    return this;
  }

   /**
   * Asks order depth
   * @return asks
  **/
  @ApiModelProperty(required = true, value = "Asks order depth")
  public List<FuturesOrderBookItem> getAsks() {
    return asks;
  }

  public void setAsks(List<FuturesOrderBookItem> asks) {
    this.asks = asks;
  }

  public FuturesOrderBook bids(List<FuturesOrderBookItem> bids) {
    this.bids = bids;
    return this;
  }

  public FuturesOrderBook addBidsItem(FuturesOrderBookItem bidsItem) {
    this.bids.add(bidsItem);
    return this;
  }

   /**
   * Bids order depth
   * @return bids
  **/
  @ApiModelProperty(required = true, value = "Bids order depth")
  public List<FuturesOrderBookItem> getBids() {
    return bids;
  }

  public void setBids(List<FuturesOrderBookItem> bids) {
    this.bids = bids;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FuturesOrderBook futuresOrderBook = (FuturesOrderBook) o;
    return Objects.equals(this.asks, futuresOrderBook.asks) &&
        Objects.equals(this.bids, futuresOrderBook.bids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asks, bids);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FuturesOrderBook {\n");
    
    sb.append("    asks: ").append(toIndentedString(asks)).append("\n");
    sb.append("    bids: ").append(toIndentedString(bids)).append("\n");
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

