// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_workflow.proto

package com.volcengine.service.vod.model.business;

public interface ExecutionStageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.ExecutionStage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 阶段名称
   * </pre>
   *
   * <code>string DisplayName = 1;</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * 阶段名称
   * </pre>
   *
   * <code>string DisplayName = 1;</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * 阶段详情
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.StageDetail StageDetail = 2;</code>
   */
  java.util.List<com.volcengine.service.vod.model.business.StageDetail> 
      getStageDetailList();
  /**
   * <pre>
   * 阶段详情
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.StageDetail StageDetail = 2;</code>
   */
  com.volcengine.service.vod.model.business.StageDetail getStageDetail(int index);
  /**
   * <pre>
   * 阶段详情
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.StageDetail StageDetail = 2;</code>
   */
  int getStageDetailCount();
  /**
   * <pre>
   * 阶段详情
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.StageDetail StageDetail = 2;</code>
   */
  java.util.List<? extends com.volcengine.service.vod.model.business.StageDetailOrBuilder> 
      getStageDetailOrBuilderList();
  /**
   * <pre>
   * 阶段详情
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.StageDetail StageDetail = 2;</code>
   */
  com.volcengine.service.vod.model.business.StageDetailOrBuilder getStageDetailOrBuilder(
      int index);

  /**
   * <pre>
   * 阶段开始时间
   * </pre>
   *
   * <code>.google.protobuf.Timestamp StartTime = 3;</code>
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   * <pre>
   * 阶段开始时间
   * </pre>
   *
   * <code>.google.protobuf.Timestamp StartTime = 3;</code>
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   * <pre>
   * 阶段开始时间
   * </pre>
   *
   * <code>.google.protobuf.Timestamp StartTime = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   * <pre>
   * 阶段完成时间
   * </pre>
   *
   * <code>.google.protobuf.Timestamp EndTime = 4;</code>
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   * <pre>
   * 阶段完成时间
   * </pre>
   *
   * <code>.google.protobuf.Timestamp EndTime = 4;</code>
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   * <pre>
   * 阶段完成时间
   * </pre>
   *
   * <code>.google.protobuf.Timestamp EndTime = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();
}
