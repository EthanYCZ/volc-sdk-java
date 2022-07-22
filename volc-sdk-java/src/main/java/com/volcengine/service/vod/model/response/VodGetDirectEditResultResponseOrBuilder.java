// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/response/response_vod.proto

package com.volcengine.service.vod.model.response;

public interface VodGetDirectEditResultResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Response.VodGetDirectEditResultResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *响应通用信息
   * </pre>
   *
   * <code>.Volcengine.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   * @return Whether the responseMetadata field is set.
   */
  boolean hasResponseMetadata();
  /**
   * <pre>
   *响应通用信息
   * </pre>
   *
   * <code>.Volcengine.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   * @return The responseMetadata.
   */
  com.volcengine.service.base.model.base.ResponseMetadata getResponseMetadata();
  /**
   * <pre>
   *响应通用信息
   * </pre>
   *
   * <code>.Volcengine.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   */
  com.volcengine.service.base.model.base.ResponseMetadataOrBuilder getResponseMetadataOrBuilder();

  /**
   * <pre>
   *响应结果
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.GetDirectEditResult Result = 2;</code>
   */
  java.util.List<com.volcengine.service.vod.model.business.GetDirectEditResult> 
      getResultList();
  /**
   * <pre>
   *响应结果
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.GetDirectEditResult Result = 2;</code>
   */
  com.volcengine.service.vod.model.business.GetDirectEditResult getResult(int index);
  /**
   * <pre>
   *响应结果
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.GetDirectEditResult Result = 2;</code>
   */
  int getResultCount();
  /**
   * <pre>
   *响应结果
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.GetDirectEditResult Result = 2;</code>
   */
  java.util.List<? extends com.volcengine.service.vod.model.business.GetDirectEditResultOrBuilder> 
      getResultOrBuilderList();
  /**
   * <pre>
   *响应结果
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.GetDirectEditResult Result = 2;</code>
   */
  com.volcengine.service.vod.model.business.GetDirectEditResultOrBuilder getResultOrBuilder(
      int index);
}
