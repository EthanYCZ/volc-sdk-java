// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_cdn.proto

package com.volcengine.service.vod.model.business;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Business.VodContentInfo}
 */
public final class VodContentInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Business.VodContentInfo)
    VodContentInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodContentInfo.newBuilder() to construct.
  private VodContentInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodContentInfo() {
    itemId_ = "";
    url_ = "";
    status_ = "";
    taskType_ = "";
    taskId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodContentInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodContentInfo(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            itemId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            url_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            status_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            taskType_ = s;
            break;
          }
          case 40: {

            createTimestamp_ = input.readInt32();
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            taskId_ = s;
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
    return com.volcengine.service.vod.model.business.VodCdn.internal_static_Volcengine_Vod_Models_Business_VodContentInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.business.VodCdn.internal_static_Volcengine_Vod_Models_Business_VodContentInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.business.VodContentInfo.class, com.volcengine.service.vod.model.business.VodContentInfo.Builder.class);
  }

  public static final int ITEMID_FIELD_NUMBER = 1;
  private volatile java.lang.Object itemId_;
  /**
   * <pre>
   *记录ID，可为空
   * </pre>
   *
   * <code>string ItemId = 1;</code>
   * @return The itemId.
   */
  @java.lang.Override
  public java.lang.String getItemId() {
    java.lang.Object ref = itemId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      itemId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *记录ID，可为空
   * </pre>
   *
   * <code>string ItemId = 1;</code>
   * @return The bytes for itemId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getItemIdBytes() {
    java.lang.Object ref = itemId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      itemId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int URL_FIELD_NUMBER = 2;
  private volatile java.lang.Object url_;
  /**
   * <pre>
   *任务URL
   * </pre>
   *
   * <code>string Url = 2;</code>
   * @return The url.
   */
  @java.lang.Override
  public java.lang.String getUrl() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      url_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *任务URL
   * </pre>
   *
   * <code>string Url = 2;</code>
   * @return The bytes for url.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUrlBytes() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      url_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATUS_FIELD_NUMBER = 3;
  private volatile java.lang.Object status_;
  /**
   * <pre>
   *任务状态
   * </pre>
   *
   * <code>string Status = 3;</code>
   * @return The status.
   */
  @java.lang.Override
  public java.lang.String getStatus() {
    java.lang.Object ref = status_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      status_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *任务状态
   * </pre>
   *
   * <code>string Status = 3;</code>
   * @return The bytes for status.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStatusBytes() {
    java.lang.Object ref = status_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      status_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TASKTYPE_FIELD_NUMBER = 4;
  private volatile java.lang.Object taskType_;
  /**
   * <pre>
   *任务类型
   * </pre>
   *
   * <code>string TaskType = 4;</code>
   * @return The taskType.
   */
  @java.lang.Override
  public java.lang.String getTaskType() {
    java.lang.Object ref = taskType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      taskType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *任务类型
   * </pre>
   *
   * <code>string TaskType = 4;</code>
   * @return The bytes for taskType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTaskTypeBytes() {
    java.lang.Object ref = taskType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      taskType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CREATETIMESTAMP_FIELD_NUMBER = 5;
  private int createTimestamp_;
  /**
   * <pre>
   *任务创建时间，单位：Unix秒级时间戳
   * </pre>
   *
   * <code>int32 CreateTimestamp = 5;</code>
   * @return The createTimestamp.
   */
  @java.lang.Override
  public int getCreateTimestamp() {
    return createTimestamp_;
  }

  public static final int TASKID_FIELD_NUMBER = 6;
  private volatile java.lang.Object taskId_;
  /**
   * <pre>
   *任务ID
   * </pre>
   *
   * <code>string TaskId = 6;</code>
   * @return The taskId.
   */
  @java.lang.Override
  public java.lang.String getTaskId() {
    java.lang.Object ref = taskId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      taskId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *任务ID
   * </pre>
   *
   * <code>string TaskId = 6;</code>
   * @return The bytes for taskId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTaskIdBytes() {
    java.lang.Object ref = taskId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      taskId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(itemId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, itemId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(url_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, url_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(status_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, status_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(taskType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, taskType_);
    }
    if (createTimestamp_ != 0) {
      output.writeInt32(5, createTimestamp_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(taskId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, taskId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(itemId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, itemId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(url_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, url_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(status_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, status_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(taskType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, taskType_);
    }
    if (createTimestamp_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, createTimestamp_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(taskId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, taskId_);
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
    if (!(obj instanceof com.volcengine.service.vod.model.business.VodContentInfo)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.business.VodContentInfo other = (com.volcengine.service.vod.model.business.VodContentInfo) obj;

    if (!getItemId()
        .equals(other.getItemId())) return false;
    if (!getUrl()
        .equals(other.getUrl())) return false;
    if (!getStatus()
        .equals(other.getStatus())) return false;
    if (!getTaskType()
        .equals(other.getTaskType())) return false;
    if (getCreateTimestamp()
        != other.getCreateTimestamp()) return false;
    if (!getTaskId()
        .equals(other.getTaskId())) return false;
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
    hash = (37 * hash) + ITEMID_FIELD_NUMBER;
    hash = (53 * hash) + getItemId().hashCode();
    hash = (37 * hash) + URL_FIELD_NUMBER;
    hash = (53 * hash) + getUrl().hashCode();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + getStatus().hashCode();
    hash = (37 * hash) + TASKTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getTaskType().hashCode();
    hash = (37 * hash) + CREATETIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + getCreateTimestamp();
    hash = (37 * hash) + TASKID_FIELD_NUMBER;
    hash = (53 * hash) + getTaskId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.business.VodContentInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodContentInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodContentInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodContentInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodContentInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodContentInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodContentInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodContentInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodContentInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodContentInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodContentInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodContentInfo parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.business.VodContentInfo prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Business.VodContentInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Business.VodContentInfo)
      com.volcengine.service.vod.model.business.VodContentInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.business.VodCdn.internal_static_Volcengine_Vod_Models_Business_VodContentInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.business.VodCdn.internal_static_Volcengine_Vod_Models_Business_VodContentInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.business.VodContentInfo.class, com.volcengine.service.vod.model.business.VodContentInfo.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.business.VodContentInfo.newBuilder()
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
      itemId_ = "";

      url_ = "";

      status_ = "";

      taskType_ = "";

      createTimestamp_ = 0;

      taskId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.business.VodCdn.internal_static_Volcengine_Vod_Models_Business_VodContentInfo_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodContentInfo getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.business.VodContentInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodContentInfo build() {
      com.volcengine.service.vod.model.business.VodContentInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodContentInfo buildPartial() {
      com.volcengine.service.vod.model.business.VodContentInfo result = new com.volcengine.service.vod.model.business.VodContentInfo(this);
      result.itemId_ = itemId_;
      result.url_ = url_;
      result.status_ = status_;
      result.taskType_ = taskType_;
      result.createTimestamp_ = createTimestamp_;
      result.taskId_ = taskId_;
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
      if (other instanceof com.volcengine.service.vod.model.business.VodContentInfo) {
        return mergeFrom((com.volcengine.service.vod.model.business.VodContentInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.business.VodContentInfo other) {
      if (other == com.volcengine.service.vod.model.business.VodContentInfo.getDefaultInstance()) return this;
      if (!other.getItemId().isEmpty()) {
        itemId_ = other.itemId_;
        onChanged();
      }
      if (!other.getUrl().isEmpty()) {
        url_ = other.url_;
        onChanged();
      }
      if (!other.getStatus().isEmpty()) {
        status_ = other.status_;
        onChanged();
      }
      if (!other.getTaskType().isEmpty()) {
        taskType_ = other.taskType_;
        onChanged();
      }
      if (other.getCreateTimestamp() != 0) {
        setCreateTimestamp(other.getCreateTimestamp());
      }
      if (!other.getTaskId().isEmpty()) {
        taskId_ = other.taskId_;
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
      com.volcengine.service.vod.model.business.VodContentInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.business.VodContentInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object itemId_ = "";
    /**
     * <pre>
     *记录ID，可为空
     * </pre>
     *
     * <code>string ItemId = 1;</code>
     * @return The itemId.
     */
    public java.lang.String getItemId() {
      java.lang.Object ref = itemId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        itemId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *记录ID，可为空
     * </pre>
     *
     * <code>string ItemId = 1;</code>
     * @return The bytes for itemId.
     */
    public com.google.protobuf.ByteString
        getItemIdBytes() {
      java.lang.Object ref = itemId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        itemId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *记录ID，可为空
     * </pre>
     *
     * <code>string ItemId = 1;</code>
     * @param value The itemId to set.
     * @return This builder for chaining.
     */
    public Builder setItemId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      itemId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *记录ID，可为空
     * </pre>
     *
     * <code>string ItemId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearItemId() {
      
      itemId_ = getDefaultInstance().getItemId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *记录ID，可为空
     * </pre>
     *
     * <code>string ItemId = 1;</code>
     * @param value The bytes for itemId to set.
     * @return This builder for chaining.
     */
    public Builder setItemIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      itemId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object url_ = "";
    /**
     * <pre>
     *任务URL
     * </pre>
     *
     * <code>string Url = 2;</code>
     * @return The url.
     */
    public java.lang.String getUrl() {
      java.lang.Object ref = url_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        url_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *任务URL
     * </pre>
     *
     * <code>string Url = 2;</code>
     * @return The bytes for url.
     */
    public com.google.protobuf.ByteString
        getUrlBytes() {
      java.lang.Object ref = url_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        url_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *任务URL
     * </pre>
     *
     * <code>string Url = 2;</code>
     * @param value The url to set.
     * @return This builder for chaining.
     */
    public Builder setUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      url_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *任务URL
     * </pre>
     *
     * <code>string Url = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUrl() {
      
      url_ = getDefaultInstance().getUrl();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *任务URL
     * </pre>
     *
     * <code>string Url = 2;</code>
     * @param value The bytes for url to set.
     * @return This builder for chaining.
     */
    public Builder setUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      url_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object status_ = "";
    /**
     * <pre>
     *任务状态
     * </pre>
     *
     * <code>string Status = 3;</code>
     * @return The status.
     */
    public java.lang.String getStatus() {
      java.lang.Object ref = status_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        status_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *任务状态
     * </pre>
     *
     * <code>string Status = 3;</code>
     * @return The bytes for status.
     */
    public com.google.protobuf.ByteString
        getStatusBytes() {
      java.lang.Object ref = status_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        status_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *任务状态
     * </pre>
     *
     * <code>string Status = 3;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *任务状态
     * </pre>
     *
     * <code>string Status = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = getDefaultInstance().getStatus();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *任务状态
     * </pre>
     *
     * <code>string Status = 3;</code>
     * @param value The bytes for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      status_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object taskType_ = "";
    /**
     * <pre>
     *任务类型
     * </pre>
     *
     * <code>string TaskType = 4;</code>
     * @return The taskType.
     */
    public java.lang.String getTaskType() {
      java.lang.Object ref = taskType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        taskType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *任务类型
     * </pre>
     *
     * <code>string TaskType = 4;</code>
     * @return The bytes for taskType.
     */
    public com.google.protobuf.ByteString
        getTaskTypeBytes() {
      java.lang.Object ref = taskType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        taskType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *任务类型
     * </pre>
     *
     * <code>string TaskType = 4;</code>
     * @param value The taskType to set.
     * @return This builder for chaining.
     */
    public Builder setTaskType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      taskType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *任务类型
     * </pre>
     *
     * <code>string TaskType = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTaskType() {
      
      taskType_ = getDefaultInstance().getTaskType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *任务类型
     * </pre>
     *
     * <code>string TaskType = 4;</code>
     * @param value The bytes for taskType to set.
     * @return This builder for chaining.
     */
    public Builder setTaskTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      taskType_ = value;
      onChanged();
      return this;
    }

    private int createTimestamp_ ;
    /**
     * <pre>
     *任务创建时间，单位：Unix秒级时间戳
     * </pre>
     *
     * <code>int32 CreateTimestamp = 5;</code>
     * @return The createTimestamp.
     */
    @java.lang.Override
    public int getCreateTimestamp() {
      return createTimestamp_;
    }
    /**
     * <pre>
     *任务创建时间，单位：Unix秒级时间戳
     * </pre>
     *
     * <code>int32 CreateTimestamp = 5;</code>
     * @param value The createTimestamp to set.
     * @return This builder for chaining.
     */
    public Builder setCreateTimestamp(int value) {
      
      createTimestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *任务创建时间，单位：Unix秒级时间戳
     * </pre>
     *
     * <code>int32 CreateTimestamp = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearCreateTimestamp() {
      
      createTimestamp_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object taskId_ = "";
    /**
     * <pre>
     *任务ID
     * </pre>
     *
     * <code>string TaskId = 6;</code>
     * @return The taskId.
     */
    public java.lang.String getTaskId() {
      java.lang.Object ref = taskId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        taskId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *任务ID
     * </pre>
     *
     * <code>string TaskId = 6;</code>
     * @return The bytes for taskId.
     */
    public com.google.protobuf.ByteString
        getTaskIdBytes() {
      java.lang.Object ref = taskId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        taskId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *任务ID
     * </pre>
     *
     * <code>string TaskId = 6;</code>
     * @param value The taskId to set.
     * @return This builder for chaining.
     */
    public Builder setTaskId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      taskId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *任务ID
     * </pre>
     *
     * <code>string TaskId = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearTaskId() {
      
      taskId_ = getDefaultInstance().getTaskId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *任务ID
     * </pre>
     *
     * <code>string TaskId = 6;</code>
     * @param value The bytes for taskId to set.
     * @return This builder for chaining.
     */
    public Builder setTaskIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      taskId_ = value;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Business.VodContentInfo)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Business.VodContentInfo)
  private static final com.volcengine.service.vod.model.business.VodContentInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.business.VodContentInfo();
  }

  public static com.volcengine.service.vod.model.business.VodContentInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodContentInfo>
      PARSER = new com.google.protobuf.AbstractParser<VodContentInfo>() {
    @java.lang.Override
    public VodContentInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodContentInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodContentInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodContentInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodContentInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

