// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/request/request_vod.proto

package com.volcengine.model.vod.request;

public interface VodUpdateMediaPublishStatusRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Models.Vod.Request.VodUpdateMediaPublishStatusRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *视频ID
   * </pre>
   *
   * <code>string Vid = 1;</code>
   * @return The vid.
   */
  java.lang.String getVid();
  /**
   * <pre>
   *视频ID
   * </pre>
   *
   * <code>string Vid = 1;</code>
   * @return The bytes for vid.
   */
  com.google.protobuf.ByteString
      getVidBytes();

  /**
   * <pre>
   *视频发布状态
   * </pre>
   *
   * <code>string Status = 2;</code>
   * @return The status.
   */
  java.lang.String getStatus();
  /**
   * <pre>
   *视频发布状态
   * </pre>
   *
   * <code>string Status = 2;</code>
   * @return The bytes for status.
   */
  com.google.protobuf.ByteString
      getStatusBytes();
}
