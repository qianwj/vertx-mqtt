package io.vertx.mqtt;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

/**
 * Converter and mapper for {@link io.vertx.mqtt.MqttClientOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.mqtt.MqttClientOptions} original class using Vert.x codegen.
 */
public class MqttClientOptionsConverter {


  private static final Base64.Decoder BASE64_DECODER = JsonUtil.BASE64_DECODER;
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, MqttClientOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "cleanSession":
          if (member.getValue() instanceof Boolean) {
            obj.setCleanSession((Boolean)member.getValue());
          }
          break;
        case "willFlag":
          if (member.getValue() instanceof Boolean) {
            obj.setWillFlag((Boolean)member.getValue());
          }
          break;
        case "willRetain":
          if (member.getValue() instanceof Boolean) {
            obj.setWillRetain((Boolean)member.getValue());
          }
          break;
        case "willQoS":
          if (member.getValue() instanceof Number) {
            obj.setWillQoS(((Number)member.getValue()).intValue());
          }
          break;
        case "keepAliveInterval":
          if (member.getValue() instanceof Number) {
            obj.setKeepAliveInterval(((Number)member.getValue()).intValue());
          }
          break;
        case "username":
          if (member.getValue() instanceof String) {
            obj.setUsername((String)member.getValue());
          }
          break;
        case "password":
          if (member.getValue() instanceof String) {
            obj.setPassword((String)member.getValue());
          }
          break;
        case "clientId":
          if (member.getValue() instanceof String) {
            obj.setClientId((String)member.getValue());
          }
          break;
        case "willTopic":
          if (member.getValue() instanceof String) {
            obj.setWillTopic((String)member.getValue());
          }
          break;
        case "willMessage":
          if (member.getValue() instanceof String) {
            obj.setWillMessage((String)member.getValue());
          }
          break;
        case "willMessageBytes":
          break;
        case "ackTimeout":
          if (member.getValue() instanceof Number) {
            obj.setAckTimeout(((Number)member.getValue()).intValue());
          }
          break;
        case "maxInflightQueue":
          if (member.getValue() instanceof Number) {
            obj.setMaxInflightQueue(((Number)member.getValue()).intValue());
          }
          break;
        case "autoKeepAlive":
          if (member.getValue() instanceof Boolean) {
            obj.setAutoKeepAlive((Boolean)member.getValue());
          }
          break;
        case "autoGeneratedClientId":
          if (member.getValue() instanceof Boolean) {
            obj.setAutoGeneratedClientId((Boolean)member.getValue());
          }
          break;
        case "autoAck":
          if (member.getValue() instanceof Boolean) {
            obj.setAutoAck((Boolean)member.getValue());
          }
          break;
        case "maxMessageSize":
          if (member.getValue() instanceof Number) {
            obj.setMaxMessageSize(((Number)member.getValue()).intValue());
          }
          break;
      }
    }
  }

   static void toJson(MqttClientOptions obj, JsonObject json) {
    toJson(obj, json.getMap());
  }

   static void toJson(MqttClientOptions obj, java.util.Map<String, Object> json) {
    json.put("cleanSession", obj.isCleanSession());
    json.put("willFlag", obj.isWillFlag());
    json.put("willRetain", obj.isWillRetain());
    json.put("willQoS", obj.getWillQoS());
    json.put("keepAliveInterval", obj.getKeepAliveInterval());
    if (obj.getUsername() != null) {
      json.put("username", obj.getUsername());
    }
    if (obj.getPassword() != null) {
      json.put("password", obj.getPassword());
    }
    if (obj.getClientId() != null) {
      json.put("clientId", obj.getClientId());
    }
    if (obj.getWillTopic() != null) {
      json.put("willTopic", obj.getWillTopic());
    }
    if (obj.getWillMessage() != null) {
      json.put("willMessage", obj.getWillMessage());
    }
    if (obj.getWillMessageBytes() != null) {
      json.put("willMessageBytes", BASE64_ENCODER.encodeToString(obj.getWillMessageBytes().getBytes()));
    }
    json.put("ackTimeout", obj.getAckTimeout());
    json.put("maxInflightQueue", obj.getMaxInflightQueue());
    json.put("autoKeepAlive", obj.isAutoKeepAlive());
    json.put("autoGeneratedClientId", obj.isAutoGeneratedClientId());
    json.put("autoAck", obj.isAutoAck());
    json.put("maxMessageSize", obj.getMaxMessageSize());
  }
}
