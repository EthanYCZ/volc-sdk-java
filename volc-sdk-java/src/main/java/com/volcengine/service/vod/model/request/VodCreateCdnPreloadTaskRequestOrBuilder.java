// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

public interface VodCreateCdnPreloadTaskRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Request.VodCreateCdnPreloadTaskRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 空间名
   * </pre>
   *
   * <code>string SpaceName = 1;</code>
   * @return The spaceName.
   */
  java.lang.String getSpaceName();
  /**
   * <pre>
   * 空间名
   * </pre>
   *
   * <code>string SpaceName = 1;</code>
   * @return The bytes for spaceName.
   */
  com.google.protobuf.ByteString
      getSpaceNameBytes();

  /**
   * <pre>
   * 预热Url
   * </pre>
   *
   * <code>string Urls = 2;</code>
   * @return The urls.
   */
  java.lang.String getUrls();
  /**
   * <pre>
   * 预热Url
   * </pre>
   *
   * <code>string Urls = 2;</code>
   * @return The bytes for urls.
   */
  com.google.protobuf.ByteString
      getUrlsBytes();
}
