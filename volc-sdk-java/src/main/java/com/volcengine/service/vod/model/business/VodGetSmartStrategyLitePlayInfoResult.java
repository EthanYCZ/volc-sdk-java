// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_smart_strategy.proto

package com.volcengine.service.vod.model.business;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Business.VodGetSmartStrategyLitePlayInfoResult}
 */
public final class VodGetSmartStrategyLitePlayInfoResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Business.VodGetSmartStrategyLitePlayInfoResult)
    VodGetSmartStrategyLitePlayInfoResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodGetSmartStrategyLitePlayInfoResult.newBuilder() to construct.
  private VodGetSmartStrategyLitePlayInfoResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodGetSmartStrategyLitePlayInfoResult() {
    streamType_ = 0;
    dataStoreStatus_ = 0;
    originalPlayUrl_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodGetSmartStrategyLitePlayInfoResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodGetSmartStrategyLitePlayInfoResult(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            int rawValue = input.readEnum();

            streamType_ = rawValue;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            dataStoreStatus_ = rawValue;
            break;
          }
          case 26: {
            com.volcengine.service.vod.model.business.VodPlayInfoModel.Builder subBuilder = null;
            if (playInfoModel_ != null) {
              subBuilder = playInfoModel_.toBuilder();
            }
            playInfoModel_ = input.readMessage(com.volcengine.service.vod.model.business.VodPlayInfoModel.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(playInfoModel_);
              playInfoModel_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            originalPlayUrl_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.volcengine.service.vod.model.business.VodSmartStrategy.internal_static_Volcengine_Vod_Models_Business_VodGetSmartStrategyLitePlayInfoResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.business.VodSmartStrategy.internal_static_Volcengine_Vod_Models_Business_VodGetSmartStrategyLitePlayInfoResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.business.VodGetSmartStrategyLitePlayInfoResult.class, com.volcengine.service.vod.model.business.VodGetSmartStrategyLitePlayInfoResult.Builder.class);
  }

  public static final int STREAMTYPE_FIELD_NUMBER = 1;
  private int streamType_;
  /**
   * <pre>
   * 当前返回的播放流类型
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodSmartStrategyResponseStreamType StreamType = 1;</code>
   * @return The enum numeric value on the wire for streamType.
   */
  @java.lang.Override public int getStreamTypeValue() {
    return streamType_;
  }
  /**
   * <pre>
   * 当前返回的播放流类型
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodSmartStrategyResponseStreamType StreamType = 1;</code>
   * @return The streamType.
   */
  @java.lang.Override public com.volcengine.service.vod.model.business.VodSmartStrategyResponseStreamType getStreamType() {
    @SuppressWarnings("deprecation")
    com.volcengine.service.vod.model.business.VodSmartStrategyResponseStreamType result = com.volcengine.service.vod.model.business.VodSmartStrategyResponseStreamType.valueOf(streamType_);
    return result == null ? com.volcengine.service.vod.model.business.VodSmartStrategyResponseStreamType.UNRECOGNIZED : result;
  }

  public static final int DATASTORESTATUS_FIELD_NUMBER = 2;
  private int dataStoreStatus_;
  /**
   * <pre>
   * 该视频在点播中的元信息状态
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodSmartStrategyDataStoreStatus DataStoreStatus = 2;</code>
   * @return The enum numeric value on the wire for dataStoreStatus.
   */
  @java.lang.Override public int getDataStoreStatusValue() {
    return dataStoreStatus_;
  }
  /**
   * <pre>
   * 该视频在点播中的元信息状态
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodSmartStrategyDataStoreStatus DataStoreStatus = 2;</code>
   * @return The dataStoreStatus.
   */
  @java.lang.Override public com.volcengine.service.vod.model.business.VodSmartStrategyDataStoreStatus getDataStoreStatus() {
    @SuppressWarnings("deprecation")
    com.volcengine.service.vod.model.business.VodSmartStrategyDataStoreStatus result = com.volcengine.service.vod.model.business.VodSmartStrategyDataStoreStatus.valueOf(dataStoreStatus_);
    return result == null ? com.volcengine.service.vod.model.business.VodSmartStrategyDataStoreStatus.UNRECOGNIZED : result;
  }

  public static final int PLAYINFOMODEL_FIELD_NUMBER = 3;
  private com.volcengine.service.vod.model.business.VodPlayInfoModel playInfoModel_;
  /**
   * <pre>
   * 匹配的VideoModel
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodPlayInfoModel PlayInfoModel = 3;</code>
   * @return Whether the playInfoModel field is set.
   */
  @java.lang.Override
  public boolean hasPlayInfoModel() {
    return playInfoModel_ != null;
  }
  /**
   * <pre>
   * 匹配的VideoModel
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodPlayInfoModel PlayInfoModel = 3;</code>
   * @return The playInfoModel.
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodPlayInfoModel getPlayInfoModel() {
    return playInfoModel_ == null ? com.volcengine.service.vod.model.business.VodPlayInfoModel.getDefaultInstance() : playInfoModel_;
  }
  /**
   * <pre>
   * 匹配的VideoModel
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.VodPlayInfoModel PlayInfoModel = 3;</code>
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodPlayInfoModelOrBuilder getPlayInfoModelOrBuilder() {
    return getPlayInfoModel();
  }

  public static final int ORIGINALPLAYURL_FIELD_NUMBER = 4;
  private volatile java.lang.Object originalPlayUrl_;
  /**
   * <pre>
   * 原始URL
   * </pre>
   *
   * <code>string OriginalPlayUrl = 4;</code>
   * @return The originalPlayUrl.
   */
  @java.lang.Override
  public java.lang.String getOriginalPlayUrl() {
    java.lang.Object ref = originalPlayUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      originalPlayUrl_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 原始URL
   * </pre>
   *
   * <code>string OriginalPlayUrl = 4;</code>
   * @return The bytes for originalPlayUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOriginalPlayUrlBytes() {
    java.lang.Object ref = originalPlayUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      originalPlayUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (streamType_ != com.volcengine.service.vod.model.business.VodSmartStrategyResponseStreamType.UndefinedVodSmartStrategyResponseStreamType.getNumber()) {
      output.writeEnum(1, streamType_);
    }
    if (dataStoreStatus_ != com.volcengine.service.vod.model.business.VodSmartStrategyDataStoreStatus.UndefinedVodSmartStrategyDataStoreStatus.getNumber()) {
      output.writeEnum(2, dataStoreStatus_);
    }
    if (playInfoModel_ != null) {
      output.writeMessage(3, getPlayInfoModel());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(originalPlayUrl_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, originalPlayUrl_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (streamType_ != com.volcengine.service.vod.model.business.VodSmartStrategyResponseStreamType.UndefinedVodSmartStrategyResponseStreamType.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, streamType_);
    }
    if (dataStoreStatus_ != com.volcengine.service.vod.model.business.VodSmartStrategyDataStoreStatus.UndefinedVodSmartStrategyDataStoreStatus.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, dataStoreStatus_);
    }
    if (playInfoModel_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getPlayInfoModel());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(originalPlayUrl_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, originalPlayUrl_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.volcengine.service.vod.model.business.VodGetSmartStrategyLitePlayInfoResult)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.business.VodGetSmartStrategyLitePlayInfoResult other = (com.volcengine.service.vod.model.business.VodGetSmartStrategyLitePlayInfoResult) obj;

    if (streamType_ != other.streamType_) return false;
    if (dataStoreStatus_ != other.dataStoreStatus_) return false;
    if (hasPlayInfoModel() != other.hasPlayInfoModel()) return false;
    if (hasPlayInfoModel()) {
      if (!getPlayInfoModel()
          .equals(other.getPlayInfoModel())) return false;
    }
    if (!getOriginalPlayUrl()
        .equals(other.getOriginalPlayUrl())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + STREAMTYPE_FIELD_NUMBER;
    hash = (53 * hash) + streamType_;
    hash = (37 * hash) + DATASTORESTATUS_FIELD_NUMBER;
    hash = (53 * hash) + dataStoreStatus_;
    if (hasPlayInfoModel()) {
      hash = (37 * hash) + PLAYINFOMODEL_FIELD_NUMBER;
      hash = (53 * hash) + getPlayInfoModel().hashCode();
    }
    hash = (37 * hash) + ORIGINALPLAYURL_FIELD_NUMBER;
    hash = (53 * hash) + getOriginalPlayUrl().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.business.VodGetSmartStrategyLitePlayInfoResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodGetSmartStrategyLitePlayInfoResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodGetSmartStrategyLitePlayInfoResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodGetSmartStrategyLitePlayInfoResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodGetSmartStrategyLitePlayInfoResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodGetSmartStrategyLitePlayInfoResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodGetSmartStrategyLitePlayInfoResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodGetSmartStrategyLitePlayInfoResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodGetSmartStrategyLitePlayInfoResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodGetSmartStrategyLitePlayInfoResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodGetSmartStrategyLitePlayInfoResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodGetSmartStrategyLitePlayInfoResult parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.volcengine.service.vod.model.business.VodGetSmartStrategyLitePlayInfoResult prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code Volcengine.Vod.Models.Business.VodGetSmartStrategyLitePlayInfoResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Business.VodGetSmartStrategyLitePlayInfoResult)
      com.volcengine.service.vod.model.business.VodGetSmartStrategyLitePlayInfoResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.business.VodSmartStrategy.internal_static_Volcengine_Vod_Models_Business_VodGetSmartStrategyLitePlayInfoResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.business.VodSmartStrategy.internal_static_Volcengine_Vod_Models_Business_VodGetSmartStrategyLitePlayInfoResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.business.VodGetSmartStrategyLitePlayInfoResult.class, com.volcengine.service.vod.model.business.VodGetSmartStrategyLitePlayInfoResult.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.business.VodGetSmartStrategyLitePlayInfoResult.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      streamType_ = 0;

      dataStoreStatus_ = 0;

      if (playInfoModelBuilder_ == null) {
        playInfoModel_ = null;
      } else {
        playInfoModel_ = null;
        playInfoModelBuilder_ = null;
      }
      originalPlayUrl_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.business.VodSmartStrategy.internal_static_Volcengine_Vod_Models_Business_VodGetSmartStrategyLitePlayInfoResult_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodGetSmartStrategyLitePlayInfoResult getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.business.VodGetSmartStrategyLitePlayInfoResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodGetSmartStrategyLitePlayInfoResult build() {
      com.volcengine.service.vod.model.business.VodGetSmartStrategyLitePlayInfoResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodGetSmartStrategyLitePlayInfoResult buildPartial() {
      com.volcengine.service.vod.model.business.VodGetSmartStrategyLitePlayInfoResult result = new com.volcengine.service.vod.model.business.VodGetSmartStrategyLitePlayInfoResult(this);
      result.streamType_ = streamType_;
      result.dataStoreStatus_ = dataStoreStatus_;
      if (playInfoModelBuilder_ == null) {
        result.playInfoModel_ = playInfoModel_;
      } else {
        result.playInfoModel_ = playInfoModelBuilder_.build();
      }
      result.originalPlayUrl_ = originalPlayUrl_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.volcengine.service.vod.model.business.VodGetSmartStrategyLitePlayInfoResult) {
        return mergeFrom((com.volcengine.service.vod.model.business.VodGetSmartStrategyLitePlayInfoResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.business.VodGetSmartStrategyLitePlayInfoResult other) {
      if (other == com.volcengine.service.vod.model.business.VodGetSmartStrategyLitePlayInfoResult.getDefaultInstance()) return this;
      if (other.streamType_ != 0) {
        setStreamTypeValue(other.getStreamTypeValue());
      }
      if (other.dataStoreStatus_ != 0) {
        setDataStoreStatusValue(other.getDataStoreStatusValue());
      }
      if (other.hasPlayInfoModel()) {
        mergePlayInfoModel(other.getPlayInfoModel());
      }
      if (!other.getOriginalPlayUrl().isEmpty()) {
        originalPlayUrl_ = other.originalPlayUrl_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.volcengine.service.vod.model.business.VodGetSmartStrategyLitePlayInfoResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.business.VodGetSmartStrategyLitePlayInfoResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int streamType_ = 0;
    /**
     * <pre>
     * 当前返回的播放流类型
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodSmartStrategyResponseStreamType StreamType = 1;</code>
     * @return The enum numeric value on the wire for streamType.
     */
    @java.lang.Override public int getStreamTypeValue() {
      return streamType_;
    }
    /**
     * <pre>
     * 当前返回的播放流类型
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodSmartStrategyResponseStreamType StreamType = 1;</code>
     * @param value The enum numeric value on the wire for streamType to set.
     * @return This builder for chaining.
     */
    public Builder setStreamTypeValue(int value) {
      
      streamType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 当前返回的播放流类型
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodSmartStrategyResponseStreamType StreamType = 1;</code>
     * @return The streamType.
     */
    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodSmartStrategyResponseStreamType getStreamType() {
      @SuppressWarnings("deprecation")
      com.volcengine.service.vod.model.business.VodSmartStrategyResponseStreamType result = com.volcengine.service.vod.model.business.VodSmartStrategyResponseStreamType.valueOf(streamType_);
      return result == null ? com.volcengine.service.vod.model.business.VodSmartStrategyResponseStreamType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * 当前返回的播放流类型
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodSmartStrategyResponseStreamType StreamType = 1;</code>
     * @param value The streamType to set.
     * @return This builder for chaining.
     */
    public Builder setStreamType(com.volcengine.service.vod.model.business.VodSmartStrategyResponseStreamType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      streamType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 当前返回的播放流类型
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodSmartStrategyResponseStreamType StreamType = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStreamType() {
      
      streamType_ = 0;
      onChanged();
      return this;
    }

    private int dataStoreStatus_ = 0;
    /**
     * <pre>
     * 该视频在点播中的元信息状态
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodSmartStrategyDataStoreStatus DataStoreStatus = 2;</code>
     * @return The enum numeric value on the wire for dataStoreStatus.
     */
    @java.lang.Override public int getDataStoreStatusValue() {
      return dataStoreStatus_;
    }
    /**
     * <pre>
     * 该视频在点播中的元信息状态
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodSmartStrategyDataStoreStatus DataStoreStatus = 2;</code>
     * @param value The enum numeric value on the wire for dataStoreStatus to set.
     * @return This builder for chaining.
     */
    public Builder setDataStoreStatusValue(int value) {
      
      dataStoreStatus_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 该视频在点播中的元信息状态
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodSmartStrategyDataStoreStatus DataStoreStatus = 2;</code>
     * @return The dataStoreStatus.
     */
    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodSmartStrategyDataStoreStatus getDataStoreStatus() {
      @SuppressWarnings("deprecation")
      com.volcengine.service.vod.model.business.VodSmartStrategyDataStoreStatus result = com.volcengine.service.vod.model.business.VodSmartStrategyDataStoreStatus.valueOf(dataStoreStatus_);
      return result == null ? com.volcengine.service.vod.model.business.VodSmartStrategyDataStoreStatus.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * 该视频在点播中的元信息状态
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodSmartStrategyDataStoreStatus DataStoreStatus = 2;</code>
     * @param value The dataStoreStatus to set.
     * @return This builder for chaining.
     */
    public Builder setDataStoreStatus(com.volcengine.service.vod.model.business.VodSmartStrategyDataStoreStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      dataStoreStatus_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 该视频在点播中的元信息状态
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodSmartStrategyDataStoreStatus DataStoreStatus = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDataStoreStatus() {
      
      dataStoreStatus_ = 0;
      onChanged();
      return this;
    }

    private com.volcengine.service.vod.model.business.VodPlayInfoModel playInfoModel_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.volcengine.service.vod.model.business.VodPlayInfoModel, com.volcengine.service.vod.model.business.VodPlayInfoModel.Builder, com.volcengine.service.vod.model.business.VodPlayInfoModelOrBuilder> playInfoModelBuilder_;
    /**
     * <pre>
     * 匹配的VideoModel
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodPlayInfoModel PlayInfoModel = 3;</code>
     * @return Whether the playInfoModel field is set.
     */
    public boolean hasPlayInfoModel() {
      return playInfoModelBuilder_ != null || playInfoModel_ != null;
    }
    /**
     * <pre>
     * 匹配的VideoModel
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodPlayInfoModel PlayInfoModel = 3;</code>
     * @return The playInfoModel.
     */
    public com.volcengine.service.vod.model.business.VodPlayInfoModel getPlayInfoModel() {
      if (playInfoModelBuilder_ == null) {
        return playInfoModel_ == null ? com.volcengine.service.vod.model.business.VodPlayInfoModel.getDefaultInstance() : playInfoModel_;
      } else {
        return playInfoModelBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 匹配的VideoModel
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodPlayInfoModel PlayInfoModel = 3;</code>
     */
    public Builder setPlayInfoModel(com.volcengine.service.vod.model.business.VodPlayInfoModel value) {
      if (playInfoModelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        playInfoModel_ = value;
        onChanged();
      } else {
        playInfoModelBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * 匹配的VideoModel
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodPlayInfoModel PlayInfoModel = 3;</code>
     */
    public Builder setPlayInfoModel(
        com.volcengine.service.vod.model.business.VodPlayInfoModel.Builder builderForValue) {
      if (playInfoModelBuilder_ == null) {
        playInfoModel_ = builderForValue.build();
        onChanged();
      } else {
        playInfoModelBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * 匹配的VideoModel
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodPlayInfoModel PlayInfoModel = 3;</code>
     */
    public Builder mergePlayInfoModel(com.volcengine.service.vod.model.business.VodPlayInfoModel value) {
      if (playInfoModelBuilder_ == null) {
        if (playInfoModel_ != null) {
          playInfoModel_ =
            com.volcengine.service.vod.model.business.VodPlayInfoModel.newBuilder(playInfoModel_).mergeFrom(value).buildPartial();
        } else {
          playInfoModel_ = value;
        }
        onChanged();
      } else {
        playInfoModelBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * 匹配的VideoModel
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodPlayInfoModel PlayInfoModel = 3;</code>
     */
    public Builder clearPlayInfoModel() {
      if (playInfoModelBuilder_ == null) {
        playInfoModel_ = null;
        onChanged();
      } else {
        playInfoModel_ = null;
        playInfoModelBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * 匹配的VideoModel
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodPlayInfoModel PlayInfoModel = 3;</code>
     */
    public com.volcengine.service.vod.model.business.VodPlayInfoModel.Builder getPlayInfoModelBuilder() {
      
      onChanged();
      return getPlayInfoModelFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 匹配的VideoModel
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodPlayInfoModel PlayInfoModel = 3;</code>
     */
    public com.volcengine.service.vod.model.business.VodPlayInfoModelOrBuilder getPlayInfoModelOrBuilder() {
      if (playInfoModelBuilder_ != null) {
        return playInfoModelBuilder_.getMessageOrBuilder();
      } else {
        return playInfoModel_ == null ?
            com.volcengine.service.vod.model.business.VodPlayInfoModel.getDefaultInstance() : playInfoModel_;
      }
    }
    /**
     * <pre>
     * 匹配的VideoModel
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.VodPlayInfoModel PlayInfoModel = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.volcengine.service.vod.model.business.VodPlayInfoModel, com.volcengine.service.vod.model.business.VodPlayInfoModel.Builder, com.volcengine.service.vod.model.business.VodPlayInfoModelOrBuilder> 
        getPlayInfoModelFieldBuilder() {
      if (playInfoModelBuilder_ == null) {
        playInfoModelBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.volcengine.service.vod.model.business.VodPlayInfoModel, com.volcengine.service.vod.model.business.VodPlayInfoModel.Builder, com.volcengine.service.vod.model.business.VodPlayInfoModelOrBuilder>(
                getPlayInfoModel(),
                getParentForChildren(),
                isClean());
        playInfoModel_ = null;
      }
      return playInfoModelBuilder_;
    }

    private java.lang.Object originalPlayUrl_ = "";
    /**
     * <pre>
     * 原始URL
     * </pre>
     *
     * <code>string OriginalPlayUrl = 4;</code>
     * @return The originalPlayUrl.
     */
    public java.lang.String getOriginalPlayUrl() {
      java.lang.Object ref = originalPlayUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        originalPlayUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 原始URL
     * </pre>
     *
     * <code>string OriginalPlayUrl = 4;</code>
     * @return The bytes for originalPlayUrl.
     */
    public com.google.protobuf.ByteString
        getOriginalPlayUrlBytes() {
      java.lang.Object ref = originalPlayUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        originalPlayUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 原始URL
     * </pre>
     *
     * <code>string OriginalPlayUrl = 4;</code>
     * @param value The originalPlayUrl to set.
     * @return This builder for chaining.
     */
    public Builder setOriginalPlayUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      originalPlayUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 原始URL
     * </pre>
     *
     * <code>string OriginalPlayUrl = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearOriginalPlayUrl() {
      
      originalPlayUrl_ = getDefaultInstance().getOriginalPlayUrl();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 原始URL
     * </pre>
     *
     * <code>string OriginalPlayUrl = 4;</code>
     * @param value The bytes for originalPlayUrl to set.
     * @return This builder for chaining.
     */
    public Builder setOriginalPlayUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      originalPlayUrl_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Business.VodGetSmartStrategyLitePlayInfoResult)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Business.VodGetSmartStrategyLitePlayInfoResult)
  private static final com.volcengine.service.vod.model.business.VodGetSmartStrategyLitePlayInfoResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.business.VodGetSmartStrategyLitePlayInfoResult();
  }

  public static com.volcengine.service.vod.model.business.VodGetSmartStrategyLitePlayInfoResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodGetSmartStrategyLitePlayInfoResult>
      PARSER = new com.google.protobuf.AbstractParser<VodGetSmartStrategyLitePlayInfoResult>() {
    @java.lang.Override
    public VodGetSmartStrategyLitePlayInfoResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodGetSmartStrategyLitePlayInfoResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodGetSmartStrategyLitePlayInfoResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodGetSmartStrategyLitePlayInfoResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodGetSmartStrategyLitePlayInfoResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

