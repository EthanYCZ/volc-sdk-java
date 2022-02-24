// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_media.proto

package com.volcengine.service.vod.model.business;

public interface VodBetterFrameDataForAuditOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.VodBetterFrameDataForAudit)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Frame URI
   * </pre>
   *
   * <code>string StoreUri = 1;</code>
   * @return The storeUri.
   */
  java.lang.String getStoreUri();
  /**
   * <pre>
   * Frame URI
   * </pre>
   *
   * <code>string StoreUri = 1;</code>
   * @return The bytes for storeUri.
   */
  com.google.protobuf.ByteString
      getStoreUriBytes();

  /**
   * <pre>
   * 帧号
   * </pre>
   *
   * <code>int32 FrameNumber = 2;</code>
   * @return The frameNumber.
   */
  int getFrameNumber();

  /**
   * <pre>
   * 帧的时间戳，单位:ms
   * </pre>
   *
   * <code>double CutTimeMill = 3;</code>
   * @return The cutTimeMill.
   */
  double getCutTimeMill();

  /**
   * <pre>
   *截图的宽度
   * </pre>
   *
   * <code>int32 Width = 4;</code>
   * @return The width.
   */
  int getWidth();

  /**
   * <pre>
   *截图的高度
   * </pre>
   *
   * <code>int32 Height = 5;</code>
   * @return The height.
   */
  int getHeight();

  /**
   * <pre>
   * Cover Rate
   * </pre>
   *
   * <code>double CoverRate = 6;</code>
   * @return The coverRate.
   */
  double getCoverRate();

  /**
   * <pre>
   * Hash Code
   * </pre>
   *
   * <code>repeated double LBPHashCode = 7;</code>
   * @return A list containing the lBPHashCode.
   */
  java.util.List<java.lang.Double> getLBPHashCodeList();
  /**
   * <pre>
   * Hash Code
   * </pre>
   *
   * <code>repeated double LBPHashCode = 7;</code>
   * @return The count of lBPHashCode.
   */
  int getLBPHashCodeCount();
  /**
   * <pre>
   * Hash Code
   * </pre>
   *
   * <code>repeated double LBPHashCode = 7;</code>
   * @param index The index of the element to return.
   * @return The lBPHashCode at the given index.
   */
  double getLBPHashCode(int index);
}
