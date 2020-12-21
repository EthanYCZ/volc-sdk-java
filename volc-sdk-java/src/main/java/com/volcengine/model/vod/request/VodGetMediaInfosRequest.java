// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/request/request_vod.proto

package com.volcengine.model.vod.request;

/**
 * Protobuf type {@code Volcengine.Models.Vod.Request.VodGetMediaInfosRequest}
 */
public final class VodGetMediaInfosRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Models.Vod.Request.VodGetMediaInfosRequest)
    VodGetMediaInfosRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodGetMediaInfosRequest.newBuilder() to construct.
  private VodGetMediaInfosRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodGetMediaInfosRequest() {
    vids_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodGetMediaInfosRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodGetMediaInfosRequest(
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

            vids_ = s;
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
    return com.volcengine.model.vod.request.VodRequest.internal_static_Volcengine_Models_Vod_Request_VodGetMediaInfosRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.model.vod.request.VodRequest.internal_static_Volcengine_Models_Vod_Request_VodGetMediaInfosRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.model.vod.request.VodGetMediaInfosRequest.class, com.volcengine.model.vod.request.VodGetMediaInfosRequest.Builder.class);
  }

  public static final int VIDS_FIELD_NUMBER = 1;
  private volatile java.lang.Object vids_;
  /**
   * <pre>
   *视频ID列表
   * </pre>
   *
   * <code>string Vids = 1;</code>
   * @return The vids.
   */
  @java.lang.Override
  public java.lang.String getVids() {
    java.lang.Object ref = vids_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      vids_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *视频ID列表
   * </pre>
   *
   * <code>string Vids = 1;</code>
   * @return The bytes for vids.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVidsBytes() {
    java.lang.Object ref = vids_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      vids_ = b;
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
    if (!getVidsBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, vids_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getVidsBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, vids_);
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
    if (!(obj instanceof com.volcengine.model.vod.request.VodGetMediaInfosRequest)) {
      return super.equals(obj);
    }
    com.volcengine.model.vod.request.VodGetMediaInfosRequest other = (com.volcengine.model.vod.request.VodGetMediaInfosRequest) obj;

    if (!getVids()
        .equals(other.getVids())) return false;
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
    hash = (37 * hash) + VIDS_FIELD_NUMBER;
    hash = (53 * hash) + getVids().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.model.vod.request.VodGetMediaInfosRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.model.vod.request.VodGetMediaInfosRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.model.vod.request.VodGetMediaInfosRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.model.vod.request.VodGetMediaInfosRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.model.vod.request.VodGetMediaInfosRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.model.vod.request.VodGetMediaInfosRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.model.vod.request.VodGetMediaInfosRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.model.vod.request.VodGetMediaInfosRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.model.vod.request.VodGetMediaInfosRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.model.vod.request.VodGetMediaInfosRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.model.vod.request.VodGetMediaInfosRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.model.vod.request.VodGetMediaInfosRequest parseFrom(
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
  public static Builder newBuilder(com.volcengine.model.vod.request.VodGetMediaInfosRequest prototype) {
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
   * Protobuf type {@code Volcengine.Models.Vod.Request.VodGetMediaInfosRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Models.Vod.Request.VodGetMediaInfosRequest)
      com.volcengine.model.vod.request.VodGetMediaInfosRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.model.vod.request.VodRequest.internal_static_Volcengine_Models_Vod_Request_VodGetMediaInfosRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.model.vod.request.VodRequest.internal_static_Volcengine_Models_Vod_Request_VodGetMediaInfosRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.model.vod.request.VodGetMediaInfosRequest.class, com.volcengine.model.vod.request.VodGetMediaInfosRequest.Builder.class);
    }

    // Construct using com.volcengine.model.vod.request.VodGetMediaInfosRequest.newBuilder()
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
      vids_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.model.vod.request.VodRequest.internal_static_Volcengine_Models_Vod_Request_VodGetMediaInfosRequest_descriptor;
    }

    @java.lang.Override
    public com.volcengine.model.vod.request.VodGetMediaInfosRequest getDefaultInstanceForType() {
      return com.volcengine.model.vod.request.VodGetMediaInfosRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.model.vod.request.VodGetMediaInfosRequest build() {
      com.volcengine.model.vod.request.VodGetMediaInfosRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.model.vod.request.VodGetMediaInfosRequest buildPartial() {
      com.volcengine.model.vod.request.VodGetMediaInfosRequest result = new com.volcengine.model.vod.request.VodGetMediaInfosRequest(this);
      result.vids_ = vids_;
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
      if (other instanceof com.volcengine.model.vod.request.VodGetMediaInfosRequest) {
        return mergeFrom((com.volcengine.model.vod.request.VodGetMediaInfosRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.model.vod.request.VodGetMediaInfosRequest other) {
      if (other == com.volcengine.model.vod.request.VodGetMediaInfosRequest.getDefaultInstance()) return this;
      if (!other.getVids().isEmpty()) {
        vids_ = other.vids_;
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
      com.volcengine.model.vod.request.VodGetMediaInfosRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.model.vod.request.VodGetMediaInfosRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object vids_ = "";
    /**
     * <pre>
     *视频ID列表
     * </pre>
     *
     * <code>string Vids = 1;</code>
     * @return The vids.
     */
    public java.lang.String getVids() {
      java.lang.Object ref = vids_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        vids_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *视频ID列表
     * </pre>
     *
     * <code>string Vids = 1;</code>
     * @return The bytes for vids.
     */
    public com.google.protobuf.ByteString
        getVidsBytes() {
      java.lang.Object ref = vids_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        vids_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *视频ID列表
     * </pre>
     *
     * <code>string Vids = 1;</code>
     * @param value The vids to set.
     * @return This builder for chaining.
     */
    public Builder setVids(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      vids_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *视频ID列表
     * </pre>
     *
     * <code>string Vids = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearVids() {
      
      vids_ = getDefaultInstance().getVids();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *视频ID列表
     * </pre>
     *
     * <code>string Vids = 1;</code>
     * @param value The bytes for vids to set.
     * @return This builder for chaining.
     */
    public Builder setVidsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      vids_ = value;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Models.Vod.Request.VodGetMediaInfosRequest)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Models.Vod.Request.VodGetMediaInfosRequest)
  private static final com.volcengine.model.vod.request.VodGetMediaInfosRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.model.vod.request.VodGetMediaInfosRequest();
  }

  public static com.volcengine.model.vod.request.VodGetMediaInfosRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodGetMediaInfosRequest>
      PARSER = new com.google.protobuf.AbstractParser<VodGetMediaInfosRequest>() {
    @java.lang.Override
    public VodGetMediaInfosRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodGetMediaInfosRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodGetMediaInfosRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodGetMediaInfosRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.model.vod.request.VodGetMediaInfosRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

