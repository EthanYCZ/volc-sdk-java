// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

public interface VodGetAudioInfoForAuditRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Request.VodGetAudioInfoForAuditRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * vid
   * </pre>
   *
   * <code>string Vid = 1;</code>
   * @return The vid.
   */
  java.lang.String getVid();
  /**
   * <pre>
   * vid
   * </pre>
   *
   * <code>string Vid = 1;</code>
   * @return The bytes for vid.
   */
  com.google.protobuf.ByteString
      getVidBytes();

  /**
   * <pre>
   *音频审核帧模板中的Strategy，抽帧策略
   * </pre>
   *
   * <code>string Strategy = 2;</code>
   * @return The strategy.
   */
  java.lang.String getStrategy();
  /**
   * <pre>
   *音频审核帧模板中的Strategy，抽帧策略
   * </pre>
   *
   * <code>string Strategy = 2;</code>
   * @return The bytes for strategy.
   */
  com.google.protobuf.ByteString
      getStrategyBytes();
}
