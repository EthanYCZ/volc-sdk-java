// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: imp/business/imp_common.proto

package com.volcengine.service.imp.model.business;

/**
 * Protobuf type {@code Volcengine.Imp.Models.Business.InputPath}
 */
public final class InputPath extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Imp.Models.Business.InputPath)
    InputPathOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InputPath.newBuilder() to construct.
  private InputPath(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InputPath() {
    type_ = "";
    tosBucket_ = "";
    vodSpaceName_ = "";
    fileId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InputPath();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private InputPath(
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

            type_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            tosBucket_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            vodSpaceName_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            fileId_ = s;
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
    return com.volcengine.service.imp.model.business.ImpWorkflow.internal_static_Volcengine_Imp_Models_Business_InputPath_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.imp.model.business.ImpWorkflow.internal_static_Volcengine_Imp_Models_Business_InputPath_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.imp.model.business.InputPath.class, com.volcengine.service.imp.model.business.InputPath.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private volatile java.lang.Object type_;
  /**
   * <pre>
   * 可选：VOD TOS
   * </pre>
   *
   * <code>string Type = 1;</code>
   * @return The type.
   */
  @java.lang.Override
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 可选：VOD TOS
   * </pre>
   *
   * <code>string Type = 1;</code>
   * @return The bytes for type.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOSBUCKET_FIELD_NUMBER = 2;
  private volatile java.lang.Object tosBucket_;
  /**
   * <code>string TosBucket = 2;</code>
   * @return The tosBucket.
   */
  @java.lang.Override
  public java.lang.String getTosBucket() {
    java.lang.Object ref = tosBucket_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tosBucket_ = s;
      return s;
    }
  }
  /**
   * <code>string TosBucket = 2;</code>
   * @return The bytes for tosBucket.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTosBucketBytes() {
    java.lang.Object ref = tosBucket_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tosBucket_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VODSPACENAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object vodSpaceName_;
  /**
   * <code>string VodSpaceName = 3;</code>
   * @return The vodSpaceName.
   */
  @java.lang.Override
  public java.lang.String getVodSpaceName() {
    java.lang.Object ref = vodSpaceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      vodSpaceName_ = s;
      return s;
    }
  }
  /**
   * <code>string VodSpaceName = 3;</code>
   * @return The bytes for vodSpaceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVodSpaceNameBytes() {
    java.lang.Object ref = vodSpaceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      vodSpaceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILEID_FIELD_NUMBER = 4;
  private volatile java.lang.Object fileId_;
  /**
   * <code>string FileId = 4;</code>
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
   * <code>string FileId = 4;</code>
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
    if (!getTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, type_);
    }
    if (!getTosBucketBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, tosBucket_);
    }
    if (!getVodSpaceNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, vodSpaceName_);
    }
    if (!getFileIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, fileId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, type_);
    }
    if (!getTosBucketBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, tosBucket_);
    }
    if (!getVodSpaceNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, vodSpaceName_);
    }
    if (!getFileIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, fileId_);
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
    if (!(obj instanceof com.volcengine.service.imp.model.business.InputPath)) {
      return super.equals(obj);
    }
    com.volcengine.service.imp.model.business.InputPath other = (com.volcengine.service.imp.model.business.InputPath) obj;

    if (!getType()
        .equals(other.getType())) return false;
    if (!getTosBucket()
        .equals(other.getTosBucket())) return false;
    if (!getVodSpaceName()
        .equals(other.getVodSpaceName())) return false;
    if (!getFileId()
        .equals(other.getFileId())) return false;
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    hash = (37 * hash) + TOSBUCKET_FIELD_NUMBER;
    hash = (53 * hash) + getTosBucket().hashCode();
    hash = (37 * hash) + VODSPACENAME_FIELD_NUMBER;
    hash = (53 * hash) + getVodSpaceName().hashCode();
    hash = (37 * hash) + FILEID_FIELD_NUMBER;
    hash = (53 * hash) + getFileId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.imp.model.business.InputPath parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.imp.model.business.InputPath parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.imp.model.business.InputPath parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.imp.model.business.InputPath parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.imp.model.business.InputPath parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.imp.model.business.InputPath parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.imp.model.business.InputPath parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.imp.model.business.InputPath parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.imp.model.business.InputPath parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.imp.model.business.InputPath parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.imp.model.business.InputPath parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.imp.model.business.InputPath parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.imp.model.business.InputPath prototype) {
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
   * Protobuf type {@code Volcengine.Imp.Models.Business.InputPath}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Imp.Models.Business.InputPath)
      com.volcengine.service.imp.model.business.InputPathOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.imp.model.business.ImpWorkflow.internal_static_Volcengine_Imp_Models_Business_InputPath_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.imp.model.business.ImpWorkflow.internal_static_Volcengine_Imp_Models_Business_InputPath_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.imp.model.business.InputPath.class, com.volcengine.service.imp.model.business.InputPath.Builder.class);
    }

    // Construct using com.volcengine.service.imp.model.business.InputPath.newBuilder()
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
      type_ = "";

      tosBucket_ = "";

      vodSpaceName_ = "";

      fileId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.imp.model.business.ImpWorkflow.internal_static_Volcengine_Imp_Models_Business_InputPath_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.imp.model.business.InputPath getDefaultInstanceForType() {
      return com.volcengine.service.imp.model.business.InputPath.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.imp.model.business.InputPath build() {
      com.volcengine.service.imp.model.business.InputPath result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.imp.model.business.InputPath buildPartial() {
      com.volcengine.service.imp.model.business.InputPath result = new com.volcengine.service.imp.model.business.InputPath(this);
      result.type_ = type_;
      result.tosBucket_ = tosBucket_;
      result.vodSpaceName_ = vodSpaceName_;
      result.fileId_ = fileId_;
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
      if (other instanceof com.volcengine.service.imp.model.business.InputPath) {
        return mergeFrom((com.volcengine.service.imp.model.business.InputPath)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.imp.model.business.InputPath other) {
      if (other == com.volcengine.service.imp.model.business.InputPath.getDefaultInstance()) return this;
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        onChanged();
      }
      if (!other.getTosBucket().isEmpty()) {
        tosBucket_ = other.tosBucket_;
        onChanged();
      }
      if (!other.getVodSpaceName().isEmpty()) {
        vodSpaceName_ = other.vodSpaceName_;
        onChanged();
      }
      if (!other.getFileId().isEmpty()) {
        fileId_ = other.fileId_;
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
      com.volcengine.service.imp.model.business.InputPath parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.imp.model.business.InputPath) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object type_ = "";
    /**
     * <pre>
     * 可选：VOD TOS
     * </pre>
     *
     * <code>string Type = 1;</code>
     * @return The type.
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 可选：VOD TOS
     * </pre>
     *
     * <code>string Type = 1;</code>
     * @return The bytes for type.
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 可选：VOD TOS
     * </pre>
     *
     * <code>string Type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 可选：VOD TOS
     * </pre>
     *
     * <code>string Type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = getDefaultInstance().getType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 可选：VOD TOS
     * </pre>
     *
     * <code>string Type = 1;</code>
     * @param value The bytes for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      type_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object tosBucket_ = "";
    /**
     * <code>string TosBucket = 2;</code>
     * @return The tosBucket.
     */
    public java.lang.String getTosBucket() {
      java.lang.Object ref = tosBucket_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tosBucket_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string TosBucket = 2;</code>
     * @return The bytes for tosBucket.
     */
    public com.google.protobuf.ByteString
        getTosBucketBytes() {
      java.lang.Object ref = tosBucket_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tosBucket_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string TosBucket = 2;</code>
     * @param value The tosBucket to set.
     * @return This builder for chaining.
     */
    public Builder setTosBucket(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      tosBucket_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string TosBucket = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTosBucket() {
      
      tosBucket_ = getDefaultInstance().getTosBucket();
      onChanged();
      return this;
    }
    /**
     * <code>string TosBucket = 2;</code>
     * @param value The bytes for tosBucket to set.
     * @return This builder for chaining.
     */
    public Builder setTosBucketBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      tosBucket_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object vodSpaceName_ = "";
    /**
     * <code>string VodSpaceName = 3;</code>
     * @return The vodSpaceName.
     */
    public java.lang.String getVodSpaceName() {
      java.lang.Object ref = vodSpaceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        vodSpaceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string VodSpaceName = 3;</code>
     * @return The bytes for vodSpaceName.
     */
    public com.google.protobuf.ByteString
        getVodSpaceNameBytes() {
      java.lang.Object ref = vodSpaceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        vodSpaceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string VodSpaceName = 3;</code>
     * @param value The vodSpaceName to set.
     * @return This builder for chaining.
     */
    public Builder setVodSpaceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      vodSpaceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string VodSpaceName = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearVodSpaceName() {
      
      vodSpaceName_ = getDefaultInstance().getVodSpaceName();
      onChanged();
      return this;
    }
    /**
     * <code>string VodSpaceName = 3;</code>
     * @param value The bytes for vodSpaceName to set.
     * @return This builder for chaining.
     */
    public Builder setVodSpaceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      vodSpaceName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object fileId_ = "";
    /**
     * <code>string FileId = 4;</code>
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
     * <code>string FileId = 4;</code>
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
     * <code>string FileId = 4;</code>
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
     * <code>string FileId = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearFileId() {
      
      fileId_ = getDefaultInstance().getFileId();
      onChanged();
      return this;
    }
    /**
     * <code>string FileId = 4;</code>
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Imp.Models.Business.InputPath)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Imp.Models.Business.InputPath)
  private static final com.volcengine.service.imp.model.business.InputPath DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.imp.model.business.InputPath();
  }

  public static com.volcengine.service.imp.model.business.InputPath getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InputPath>
      PARSER = new com.google.protobuf.AbstractParser<InputPath>() {
    @java.lang.Override
    public InputPath parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new InputPath(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InputPath> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InputPath> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.imp.model.business.InputPath getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

