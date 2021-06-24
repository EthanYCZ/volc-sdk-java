// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_media.proto

package com.volcengine.service.vod.model.business;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Business.VodFileSubtitleInfo}
 */
public final class VodFileSubtitleInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Business.VodFileSubtitleInfo)
    VodFileSubtitleInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodFileSubtitleInfo.newBuilder() to construct.
  private VodFileSubtitleInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodFileSubtitleInfo() {
    fileId_ = "";
    subtitleInfoList_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodFileSubtitleInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodFileSubtitleInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            fileId_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              subtitleInfoList_ = new java.util.ArrayList<com.volcengine.service.vod.model.business.VodSubtitleInfo>();
              mutable_bitField0_ |= 0x00000001;
            }
            subtitleInfoList_.add(
                input.readMessage(com.volcengine.service.vod.model.business.VodSubtitleInfo.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        subtitleInfoList_ = java.util.Collections.unmodifiableList(subtitleInfoList_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodFileSubtitleInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodFileSubtitleInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.business.VodFileSubtitleInfo.class, com.volcengine.service.vod.model.business.VodFileSubtitleInfo.Builder.class);
  }

  public static final int FILEID_FIELD_NUMBER = 1;
  private volatile java.lang.Object fileId_;
  /**
   * <pre>
   *文件ID
   * </pre>
   *
   * <code>string FileId = 1;</code>
   * @return The fileId.
   */
  @java.lang.Override
  public java.lang.String getFileId() {
    java.lang.Object ref = fileId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fileId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *文件ID
   * </pre>
   *
   * <code>string FileId = 1;</code>
   * @return The bytes for fileId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFileIdBytes() {
    java.lang.Object ref = fileId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fileId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUBTITLEINFOLIST_FIELD_NUMBER = 2;
  private java.util.List<com.volcengine.service.vod.model.business.VodSubtitleInfo> subtitleInfoList_;
  /**
   * <pre>
   *字幕列表
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodSubtitleInfo SubtitleInfoList = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.volcengine.service.vod.model.business.VodSubtitleInfo> getSubtitleInfoListList() {
    return subtitleInfoList_;
  }
  /**
   * <pre>
   *字幕列表
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodSubtitleInfo SubtitleInfoList = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.volcengine.service.vod.model.business.VodSubtitleInfoOrBuilder> 
      getSubtitleInfoListOrBuilderList() {
    return subtitleInfoList_;
  }
  /**
   * <pre>
   *字幕列表
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodSubtitleInfo SubtitleInfoList = 2;</code>
   */
  @java.lang.Override
  public int getSubtitleInfoListCount() {
    return subtitleInfoList_.size();
  }
  /**
   * <pre>
   *字幕列表
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodSubtitleInfo SubtitleInfoList = 2;</code>
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodSubtitleInfo getSubtitleInfoList(int index) {
    return subtitleInfoList_.get(index);
  }
  /**
   * <pre>
   *字幕列表
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodSubtitleInfo SubtitleInfoList = 2;</code>
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodSubtitleInfoOrBuilder getSubtitleInfoListOrBuilder(
      int index) {
    return subtitleInfoList_.get(index);
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
    if (!getFileIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, fileId_);
    }
    for (int i = 0; i < subtitleInfoList_.size(); i++) {
      output.writeMessage(2, subtitleInfoList_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getFileIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, fileId_);
    }
    for (int i = 0; i < subtitleInfoList_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, subtitleInfoList_.get(i));
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
    if (!(obj instanceof com.volcengine.service.vod.model.business.VodFileSubtitleInfo)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.business.VodFileSubtitleInfo other = (com.volcengine.service.vod.model.business.VodFileSubtitleInfo) obj;

    if (!getFileId()
        .equals(other.getFileId())) return false;
    if (!getSubtitleInfoListList()
        .equals(other.getSubtitleInfoListList())) return false;
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
    hash = (37 * hash) + FILEID_FIELD_NUMBER;
    hash = (53 * hash) + getFileId().hashCode();
    if (getSubtitleInfoListCount() > 0) {
      hash = (37 * hash) + SUBTITLEINFOLIST_FIELD_NUMBER;
      hash = (53 * hash) + getSubtitleInfoListList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.business.VodFileSubtitleInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodFileSubtitleInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodFileSubtitleInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodFileSubtitleInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodFileSubtitleInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodFileSubtitleInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodFileSubtitleInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodFileSubtitleInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodFileSubtitleInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodFileSubtitleInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodFileSubtitleInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodFileSubtitleInfo parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.business.VodFileSubtitleInfo prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Business.VodFileSubtitleInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Business.VodFileSubtitleInfo)
      com.volcengine.service.vod.model.business.VodFileSubtitleInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodFileSubtitleInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodFileSubtitleInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.business.VodFileSubtitleInfo.class, com.volcengine.service.vod.model.business.VodFileSubtitleInfo.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.business.VodFileSubtitleInfo.newBuilder()
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
        getSubtitleInfoListFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      fileId_ = "";

      if (subtitleInfoListBuilder_ == null) {
        subtitleInfoList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        subtitleInfoListBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodFileSubtitleInfo_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodFileSubtitleInfo getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.business.VodFileSubtitleInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodFileSubtitleInfo build() {
      com.volcengine.service.vod.model.business.VodFileSubtitleInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodFileSubtitleInfo buildPartial() {
      com.volcengine.service.vod.model.business.VodFileSubtitleInfo result = new com.volcengine.service.vod.model.business.VodFileSubtitleInfo(this);
      int from_bitField0_ = bitField0_;
      result.fileId_ = fileId_;
      if (subtitleInfoListBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          subtitleInfoList_ = java.util.Collections.unmodifiableList(subtitleInfoList_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.subtitleInfoList_ = subtitleInfoList_;
      } else {
        result.subtitleInfoList_ = subtitleInfoListBuilder_.build();
      }
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
      if (other instanceof com.volcengine.service.vod.model.business.VodFileSubtitleInfo) {
        return mergeFrom((com.volcengine.service.vod.model.business.VodFileSubtitleInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.business.VodFileSubtitleInfo other) {
      if (other == com.volcengine.service.vod.model.business.VodFileSubtitleInfo.getDefaultInstance()) return this;
      if (!other.getFileId().isEmpty()) {
        fileId_ = other.fileId_;
        onChanged();
      }
      if (subtitleInfoListBuilder_ == null) {
        if (!other.subtitleInfoList_.isEmpty()) {
          if (subtitleInfoList_.isEmpty()) {
            subtitleInfoList_ = other.subtitleInfoList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSubtitleInfoListIsMutable();
            subtitleInfoList_.addAll(other.subtitleInfoList_);
          }
          onChanged();
        }
      } else {
        if (!other.subtitleInfoList_.isEmpty()) {
          if (subtitleInfoListBuilder_.isEmpty()) {
            subtitleInfoListBuilder_.dispose();
            subtitleInfoListBuilder_ = null;
            subtitleInfoList_ = other.subtitleInfoList_;
            bitField0_ = (bitField0_ & ~0x00000001);
            subtitleInfoListBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSubtitleInfoListFieldBuilder() : null;
          } else {
            subtitleInfoListBuilder_.addAllMessages(other.subtitleInfoList_);
          }
        }
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
      com.volcengine.service.vod.model.business.VodFileSubtitleInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.business.VodFileSubtitleInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object fileId_ = "";
    /**
     * <pre>
     *文件ID
     * </pre>
     *
     * <code>string FileId = 1;</code>
     * @return The fileId.
     */
    public java.lang.String getFileId() {
      java.lang.Object ref = fileId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fileId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *文件ID
     * </pre>
     *
     * <code>string FileId = 1;</code>
     * @return The bytes for fileId.
     */
    public com.google.protobuf.ByteString
        getFileIdBytes() {
      java.lang.Object ref = fileId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fileId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *文件ID
     * </pre>
     *
     * <code>string FileId = 1;</code>
     * @param value The fileId to set.
     * @return This builder for chaining.
     */
    public Builder setFileId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fileId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *文件ID
     * </pre>
     *
     * <code>string FileId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFileId() {
      
      fileId_ = getDefaultInstance().getFileId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *文件ID
     * </pre>
     *
     * <code>string FileId = 1;</code>
     * @param value The bytes for fileId to set.
     * @return This builder for chaining.
     */
    public Builder setFileIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fileId_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.volcengine.service.vod.model.business.VodSubtitleInfo> subtitleInfoList_ =
      java.util.Collections.emptyList();
    private void ensureSubtitleInfoListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        subtitleInfoList_ = new java.util.ArrayList<com.volcengine.service.vod.model.business.VodSubtitleInfo>(subtitleInfoList_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.volcengine.service.vod.model.business.VodSubtitleInfo, com.volcengine.service.vod.model.business.VodSubtitleInfo.Builder, com.volcengine.service.vod.model.business.VodSubtitleInfoOrBuilder> subtitleInfoListBuilder_;

    /**
     * <pre>
     *字幕列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodSubtitleInfo SubtitleInfoList = 2;</code>
     */
    public java.util.List<com.volcengine.service.vod.model.business.VodSubtitleInfo> getSubtitleInfoListList() {
      if (subtitleInfoListBuilder_ == null) {
        return java.util.Collections.unmodifiableList(subtitleInfoList_);
      } else {
        return subtitleInfoListBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     *字幕列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodSubtitleInfo SubtitleInfoList = 2;</code>
     */
    public int getSubtitleInfoListCount() {
      if (subtitleInfoListBuilder_ == null) {
        return subtitleInfoList_.size();
      } else {
        return subtitleInfoListBuilder_.getCount();
      }
    }
    /**
     * <pre>
     *字幕列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodSubtitleInfo SubtitleInfoList = 2;</code>
     */
    public com.volcengine.service.vod.model.business.VodSubtitleInfo getSubtitleInfoList(int index) {
      if (subtitleInfoListBuilder_ == null) {
        return subtitleInfoList_.get(index);
      } else {
        return subtitleInfoListBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     *字幕列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodSubtitleInfo SubtitleInfoList = 2;</code>
     */
    public Builder setSubtitleInfoList(
        int index, com.volcengine.service.vod.model.business.VodSubtitleInfo value) {
      if (subtitleInfoListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSubtitleInfoListIsMutable();
        subtitleInfoList_.set(index, value);
        onChanged();
      } else {
        subtitleInfoListBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *字幕列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodSubtitleInfo SubtitleInfoList = 2;</code>
     */
    public Builder setSubtitleInfoList(
        int index, com.volcengine.service.vod.model.business.VodSubtitleInfo.Builder builderForValue) {
      if (subtitleInfoListBuilder_ == null) {
        ensureSubtitleInfoListIsMutable();
        subtitleInfoList_.set(index, builderForValue.build());
        onChanged();
      } else {
        subtitleInfoListBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *字幕列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodSubtitleInfo SubtitleInfoList = 2;</code>
     */
    public Builder addSubtitleInfoList(com.volcengine.service.vod.model.business.VodSubtitleInfo value) {
      if (subtitleInfoListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSubtitleInfoListIsMutable();
        subtitleInfoList_.add(value);
        onChanged();
      } else {
        subtitleInfoListBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     *字幕列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodSubtitleInfo SubtitleInfoList = 2;</code>
     */
    public Builder addSubtitleInfoList(
        int index, com.volcengine.service.vod.model.business.VodSubtitleInfo value) {
      if (subtitleInfoListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSubtitleInfoListIsMutable();
        subtitleInfoList_.add(index, value);
        onChanged();
      } else {
        subtitleInfoListBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *字幕列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodSubtitleInfo SubtitleInfoList = 2;</code>
     */
    public Builder addSubtitleInfoList(
        com.volcengine.service.vod.model.business.VodSubtitleInfo.Builder builderForValue) {
      if (subtitleInfoListBuilder_ == null) {
        ensureSubtitleInfoListIsMutable();
        subtitleInfoList_.add(builderForValue.build());
        onChanged();
      } else {
        subtitleInfoListBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *字幕列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodSubtitleInfo SubtitleInfoList = 2;</code>
     */
    public Builder addSubtitleInfoList(
        int index, com.volcengine.service.vod.model.business.VodSubtitleInfo.Builder builderForValue) {
      if (subtitleInfoListBuilder_ == null) {
        ensureSubtitleInfoListIsMutable();
        subtitleInfoList_.add(index, builderForValue.build());
        onChanged();
      } else {
        subtitleInfoListBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *字幕列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodSubtitleInfo SubtitleInfoList = 2;</code>
     */
    public Builder addAllSubtitleInfoList(
        java.lang.Iterable<? extends com.volcengine.service.vod.model.business.VodSubtitleInfo> values) {
      if (subtitleInfoListBuilder_ == null) {
        ensureSubtitleInfoListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, subtitleInfoList_);
        onChanged();
      } else {
        subtitleInfoListBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     *字幕列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodSubtitleInfo SubtitleInfoList = 2;</code>
     */
    public Builder clearSubtitleInfoList() {
      if (subtitleInfoListBuilder_ == null) {
        subtitleInfoList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        subtitleInfoListBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     *字幕列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodSubtitleInfo SubtitleInfoList = 2;</code>
     */
    public Builder removeSubtitleInfoList(int index) {
      if (subtitleInfoListBuilder_ == null) {
        ensureSubtitleInfoListIsMutable();
        subtitleInfoList_.remove(index);
        onChanged();
      } else {
        subtitleInfoListBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     *字幕列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodSubtitleInfo SubtitleInfoList = 2;</code>
     */
    public com.volcengine.service.vod.model.business.VodSubtitleInfo.Builder getSubtitleInfoListBuilder(
        int index) {
      return getSubtitleInfoListFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     *字幕列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodSubtitleInfo SubtitleInfoList = 2;</code>
     */
    public com.volcengine.service.vod.model.business.VodSubtitleInfoOrBuilder getSubtitleInfoListOrBuilder(
        int index) {
      if (subtitleInfoListBuilder_ == null) {
        return subtitleInfoList_.get(index);  } else {
        return subtitleInfoListBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     *字幕列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodSubtitleInfo SubtitleInfoList = 2;</code>
     */
    public java.util.List<? extends com.volcengine.service.vod.model.business.VodSubtitleInfoOrBuilder> 
         getSubtitleInfoListOrBuilderList() {
      if (subtitleInfoListBuilder_ != null) {
        return subtitleInfoListBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(subtitleInfoList_);
      }
    }
    /**
     * <pre>
     *字幕列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodSubtitleInfo SubtitleInfoList = 2;</code>
     */
    public com.volcengine.service.vod.model.business.VodSubtitleInfo.Builder addSubtitleInfoListBuilder() {
      return getSubtitleInfoListFieldBuilder().addBuilder(
          com.volcengine.service.vod.model.business.VodSubtitleInfo.getDefaultInstance());
    }
    /**
     * <pre>
     *字幕列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodSubtitleInfo SubtitleInfoList = 2;</code>
     */
    public com.volcengine.service.vod.model.business.VodSubtitleInfo.Builder addSubtitleInfoListBuilder(
        int index) {
      return getSubtitleInfoListFieldBuilder().addBuilder(
          index, com.volcengine.service.vod.model.business.VodSubtitleInfo.getDefaultInstance());
    }
    /**
     * <pre>
     *字幕列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodSubtitleInfo SubtitleInfoList = 2;</code>
     */
    public java.util.List<com.volcengine.service.vod.model.business.VodSubtitleInfo.Builder> 
         getSubtitleInfoListBuilderList() {
      return getSubtitleInfoListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.volcengine.service.vod.model.business.VodSubtitleInfo, com.volcengine.service.vod.model.business.VodSubtitleInfo.Builder, com.volcengine.service.vod.model.business.VodSubtitleInfoOrBuilder> 
        getSubtitleInfoListFieldBuilder() {
      if (subtitleInfoListBuilder_ == null) {
        subtitleInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.volcengine.service.vod.model.business.VodSubtitleInfo, com.volcengine.service.vod.model.business.VodSubtitleInfo.Builder, com.volcengine.service.vod.model.business.VodSubtitleInfoOrBuilder>(
                subtitleInfoList_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        subtitleInfoList_ = null;
      }
      return subtitleInfoListBuilder_;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Business.VodFileSubtitleInfo)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Business.VodFileSubtitleInfo)
  private static final com.volcengine.service.vod.model.business.VodFileSubtitleInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.business.VodFileSubtitleInfo();
  }

  public static com.volcengine.service.vod.model.business.VodFileSubtitleInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodFileSubtitleInfo>
      PARSER = new com.google.protobuf.AbstractParser<VodFileSubtitleInfo>() {
    @java.lang.Override
    public VodFileSubtitleInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodFileSubtitleInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodFileSubtitleInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodFileSubtitleInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodFileSubtitleInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

