// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_workflow.proto

package com.volcengine.model.vod.business;

public interface TranscodeVideoOverrideOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Models.Vod.Business.TranscodeVideoOverride)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 被覆盖的视频模板Id, 支持ALL
   * </pre>
   *
   * <code>repeated string TemplateId = 1;</code>
   * @return A list containing the templateId.
   */
  java.util.List<java.lang.String>
      getTemplateIdList();
  /**
   * <pre>
   * 被覆盖的视频模板Id, 支持ALL
   * </pre>
   *
   * <code>repeated string TemplateId = 1;</code>
   * @return The count of templateId.
   */
  int getTemplateIdCount();
  /**
   * <pre>
   * 被覆盖的视频模板Id, 支持ALL
   * </pre>
   *
   * <code>repeated string TemplateId = 1;</code>
   * @param index The index of the element to return.
   * @return The templateId at the given index.
   */
  java.lang.String getTemplateId(int index);
  /**
   * <pre>
   * 被覆盖的视频模板Id, 支持ALL
   * </pre>
   *
   * <code>repeated string TemplateId = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the templateId at the given index.
   */
  com.google.protobuf.ByteString
      getTemplateIdBytes(int index);

  /**
   * <pre>
   * 裁剪参数
   * </pre>
   *
   * <code>.Volcengine.Models.Vod.Business.Clip Clip = 2;</code>
   * @return Whether the clip field is set.
   */
  boolean hasClip();
  /**
   * <pre>
   * 裁剪参数
   * </pre>
   *
   * <code>.Volcengine.Models.Vod.Business.Clip Clip = 2;</code>
   * @return The clip.
   */
  com.volcengine.model.vod.business.Clip getClip();
  /**
   * <pre>
   * 裁剪参数
   * </pre>
   *
   * <code>.Volcengine.Models.Vod.Business.Clip Clip = 2;</code>
   */
  com.volcengine.model.vod.business.ClipOrBuilder getClipOrBuilder();
}
