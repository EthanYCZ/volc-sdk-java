// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_common.proto

package com.volcengine.service.vod.model.business;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Business.VodVideoStreamMeta}
 */
public final class VodVideoStreamMeta extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Business.VodVideoStreamMeta)
    VodVideoStreamMetaOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodVideoStreamMeta.newBuilder() to construct.
  private VodVideoStreamMeta(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodVideoStreamMeta() {
    codec_ = "";
    definition_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodVideoStreamMeta();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodVideoStreamMeta(
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

            codec_ = s;
            break;
          }
          case 16: {

            height_ = input.readInt32();
            break;
          }
          case 24: {

            width_ = input.readInt32();
            break;
          }
          case 37: {

            duration_ = input.readFloat();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            definition_ = s;
            break;
          }
          case 48: {

            bitrate_ = input.readInt32();
            break;
          }
          case 61: {

            fps_ = input.readFloat();
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
    return com.volcengine.service.vod.model.business.VodCommon.internal_static_Volcengine_Vod_Models_Business_VodVideoStreamMeta_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.business.VodCommon.internal_static_Volcengine_Vod_Models_Business_VodVideoStreamMeta_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.business.VodVideoStreamMeta.class, com.volcengine.service.vod.model.business.VodVideoStreamMeta.Builder.class);
  }

  public static final int CODEC_FIELD_NUMBER = 1;
  private volatile java.lang.Object codec_;
  /**
   * <pre>
   *视频编码格式
   * </pre>
   *
   * <code>string Codec = 1;</code>
   * @return The codec.
   */
  @java.lang.Override
  public java.lang.String getCodec() {
    java.lang.Object ref = codec_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      codec_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *视频编码格式
   * </pre>
   *
   * <code>string Codec = 1;</code>
   * @return The bytes for codec.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCodecBytes() {
    java.lang.Object ref = codec_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      codec_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HEIGHT_FIELD_NUMBER = 2;
  private int height_;
  /**
   * <pre>
   *视频高度
   * </pre>
   *
   * <code>int32 Height = 2;</code>
   * @return The height.
   */
  @java.lang.Override
  public int getHeight() {
    return height_;
  }

  public static final int WIDTH_FIELD_NUMBER = 3;
  private int width_;
  /**
   * <pre>
   *视频宽度
   * </pre>
   *
   * <code>int32 Width = 3;</code>
   * @return The width.
   */
  @java.lang.Override
  public int getWidth() {
    return width_;
  }

  public static final int DURATION_FIELD_NUMBER = 4;
  private float duration_;
  /**
   * <pre>
   *视频时长
   * </pre>
   *
   * <code>float Duration = 4;</code>
   * @return The duration.
   */
  @java.lang.Override
  public float getDuration() {
    return duration_;
  }

  public static final int DEFINITION_FIELD_NUMBER = 5;
  private volatile java.lang.Object definition_;
  /**
   * <pre>
   *视频清晰度
   * </pre>
   *
   * <code>string Definition = 5;</code>
   * @return The definition.
   */
  @java.lang.Override
  public java.lang.String getDefinition() {
    java.lang.Object ref = definition_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      definition_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *视频清晰度
   * </pre>
   *
   * <code>string Definition = 5;</code>
   * @return The bytes for definition.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDefinitionBytes() {
    java.lang.Object ref = definition_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      definition_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BITRATE_FIELD_NUMBER = 6;
  private int bitrate_;
  /**
   * <pre>
   *视频码率(Kbps)
   * </pre>
   *
   * <code>int32 Bitrate = 6;</code>
   * @return The bitrate.
   */
  @java.lang.Override
  public int getBitrate() {
    return bitrate_;
  }

  public static final int FPS_FIELD_NUMBER = 7;
  private float fps_;
  /**
   * <pre>
   *帧率
   * </pre>
   *
   * <code>float Fps = 7;</code>
   * @return The fps.
   */
  @java.lang.Override
  public float getFps() {
    return fps_;
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
    if (!getCodecBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, codec_);
    }
    if (height_ != 0) {
      output.writeInt32(2, height_);
    }
    if (width_ != 0) {
      output.writeInt32(3, width_);
    }
    if (duration_ != 0F) {
      output.writeFloat(4, duration_);
    }
    if (!getDefinitionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, definition_);
    }
    if (bitrate_ != 0) {
      output.writeInt32(6, bitrate_);
    }
    if (fps_ != 0F) {
      output.writeFloat(7, fps_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCodecBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, codec_);
    }
    if (height_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, height_);
    }
    if (width_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, width_);
    }
    if (duration_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, duration_);
    }
    if (!getDefinitionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, definition_);
    }
    if (bitrate_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, bitrate_);
    }
    if (fps_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(7, fps_);
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
    if (!(obj instanceof com.volcengine.service.vod.model.business.VodVideoStreamMeta)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.business.VodVideoStreamMeta other = (com.volcengine.service.vod.model.business.VodVideoStreamMeta) obj;

    if (!getCodec()
        .equals(other.getCodec())) return false;
    if (getHeight()
        != other.getHeight()) return false;
    if (getWidth()
        != other.getWidth()) return false;
    if (java.lang.Float.floatToIntBits(getDuration())
        != java.lang.Float.floatToIntBits(
            other.getDuration())) return false;
    if (!getDefinition()
        .equals(other.getDefinition())) return false;
    if (getBitrate()
        != other.getBitrate()) return false;
    if (java.lang.Float.floatToIntBits(getFps())
        != java.lang.Float.floatToIntBits(
            other.getFps())) return false;
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
    hash = (37 * hash) + CODEC_FIELD_NUMBER;
    hash = (53 * hash) + getCodec().hashCode();
    hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + getHeight();
    hash = (37 * hash) + WIDTH_FIELD_NUMBER;
    hash = (53 * hash) + getWidth();
    hash = (37 * hash) + DURATION_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getDuration());
    hash = (37 * hash) + DEFINITION_FIELD_NUMBER;
    hash = (53 * hash) + getDefinition().hashCode();
    hash = (37 * hash) + BITRATE_FIELD_NUMBER;
    hash = (53 * hash) + getBitrate();
    hash = (37 * hash) + FPS_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getFps());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.business.VodVideoStreamMeta parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodVideoStreamMeta parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodVideoStreamMeta parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodVideoStreamMeta parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodVideoStreamMeta parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodVideoStreamMeta parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodVideoStreamMeta parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodVideoStreamMeta parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodVideoStreamMeta parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodVideoStreamMeta parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodVideoStreamMeta parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodVideoStreamMeta parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.business.VodVideoStreamMeta prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Business.VodVideoStreamMeta}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Business.VodVideoStreamMeta)
      com.volcengine.service.vod.model.business.VodVideoStreamMetaOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.business.VodCommon.internal_static_Volcengine_Vod_Models_Business_VodVideoStreamMeta_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.business.VodCommon.internal_static_Volcengine_Vod_Models_Business_VodVideoStreamMeta_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.business.VodVideoStreamMeta.class, com.volcengine.service.vod.model.business.VodVideoStreamMeta.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.business.VodVideoStreamMeta.newBuilder()
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
      codec_ = "";

      height_ = 0;

      width_ = 0;

      duration_ = 0F;

      definition_ = "";

      bitrate_ = 0;

      fps_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.business.VodCommon.internal_static_Volcengine_Vod_Models_Business_VodVideoStreamMeta_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodVideoStreamMeta getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.business.VodVideoStreamMeta.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodVideoStreamMeta build() {
      com.volcengine.service.vod.model.business.VodVideoStreamMeta result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodVideoStreamMeta buildPartial() {
      com.volcengine.service.vod.model.business.VodVideoStreamMeta result = new com.volcengine.service.vod.model.business.VodVideoStreamMeta(this);
      result.codec_ = codec_;
      result.height_ = height_;
      result.width_ = width_;
      result.duration_ = duration_;
      result.definition_ = definition_;
      result.bitrate_ = bitrate_;
      result.fps_ = fps_;
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
      if (other instanceof com.volcengine.service.vod.model.business.VodVideoStreamMeta) {
        return mergeFrom((com.volcengine.service.vod.model.business.VodVideoStreamMeta)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.business.VodVideoStreamMeta other) {
      if (other == com.volcengine.service.vod.model.business.VodVideoStreamMeta.getDefaultInstance()) return this;
      if (!other.getCodec().isEmpty()) {
        codec_ = other.codec_;
        onChanged();
      }
      if (other.getHeight() != 0) {
        setHeight(other.getHeight());
      }
      if (other.getWidth() != 0) {
        setWidth(other.getWidth());
      }
      if (other.getDuration() != 0F) {
        setDuration(other.getDuration());
      }
      if (!other.getDefinition().isEmpty()) {
        definition_ = other.definition_;
        onChanged();
      }
      if (other.getBitrate() != 0) {
        setBitrate(other.getBitrate());
      }
      if (other.getFps() != 0F) {
        setFps(other.getFps());
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
      com.volcengine.service.vod.model.business.VodVideoStreamMeta parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.business.VodVideoStreamMeta) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object codec_ = "";
    /**
     * <pre>
     *视频编码格式
     * </pre>
     *
     * <code>string Codec = 1;</code>
     * @return The codec.
     */
    public java.lang.String getCodec() {
      java.lang.Object ref = codec_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        codec_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *视频编码格式
     * </pre>
     *
     * <code>string Codec = 1;</code>
     * @return The bytes for codec.
     */
    public com.google.protobuf.ByteString
        getCodecBytes() {
      java.lang.Object ref = codec_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        codec_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *视频编码格式
     * </pre>
     *
     * <code>string Codec = 1;</code>
     * @param value The codec to set.
     * @return This builder for chaining.
     */
    public Builder setCodec(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      codec_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *视频编码格式
     * </pre>
     *
     * <code>string Codec = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCodec() {
      
      codec_ = getDefaultInstance().getCodec();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *视频编码格式
     * </pre>
     *
     * <code>string Codec = 1;</code>
     * @param value The bytes for codec to set.
     * @return This builder for chaining.
     */
    public Builder setCodecBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      codec_ = value;
      onChanged();
      return this;
    }

    private int height_ ;
    /**
     * <pre>
     *视频高度
     * </pre>
     *
     * <code>int32 Height = 2;</code>
     * @return The height.
     */
    @java.lang.Override
    public int getHeight() {
      return height_;
    }
    /**
     * <pre>
     *视频高度
     * </pre>
     *
     * <code>int32 Height = 2;</code>
     * @param value The height to set.
     * @return This builder for chaining.
     */
    public Builder setHeight(int value) {
      
      height_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *视频高度
     * </pre>
     *
     * <code>int32 Height = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHeight() {
      
      height_ = 0;
      onChanged();
      return this;
    }

    private int width_ ;
    /**
     * <pre>
     *视频宽度
     * </pre>
     *
     * <code>int32 Width = 3;</code>
     * @return The width.
     */
    @java.lang.Override
    public int getWidth() {
      return width_;
    }
    /**
     * <pre>
     *视频宽度
     * </pre>
     *
     * <code>int32 Width = 3;</code>
     * @param value The width to set.
     * @return This builder for chaining.
     */
    public Builder setWidth(int value) {
      
      width_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *视频宽度
     * </pre>
     *
     * <code>int32 Width = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearWidth() {
      
      width_ = 0;
      onChanged();
      return this;
    }

    private float duration_ ;
    /**
     * <pre>
     *视频时长
     * </pre>
     *
     * <code>float Duration = 4;</code>
     * @return The duration.
     */
    @java.lang.Override
    public float getDuration() {
      return duration_;
    }
    /**
     * <pre>
     *视频时长
     * </pre>
     *
     * <code>float Duration = 4;</code>
     * @param value The duration to set.
     * @return This builder for chaining.
     */
    public Builder setDuration(float value) {
      
      duration_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *视频时长
     * </pre>
     *
     * <code>float Duration = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDuration() {
      
      duration_ = 0F;
      onChanged();
      return this;
    }

    private java.lang.Object definition_ = "";
    /**
     * <pre>
     *视频清晰度
     * </pre>
     *
     * <code>string Definition = 5;</code>
     * @return The definition.
     */
    public java.lang.String getDefinition() {
      java.lang.Object ref = definition_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        definition_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *视频清晰度
     * </pre>
     *
     * <code>string Definition = 5;</code>
     * @return The bytes for definition.
     */
    public com.google.protobuf.ByteString
        getDefinitionBytes() {
      java.lang.Object ref = definition_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        definition_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *视频清晰度
     * </pre>
     *
     * <code>string Definition = 5;</code>
     * @param value The definition to set.
     * @return This builder for chaining.
     */
    public Builder setDefinition(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      definition_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *视频清晰度
     * </pre>
     *
     * <code>string Definition = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearDefinition() {
      
      definition_ = getDefaultInstance().getDefinition();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *视频清晰度
     * </pre>
     *
     * <code>string Definition = 5;</code>
     * @param value The bytes for definition to set.
     * @return This builder for chaining.
     */
    public Builder setDefinitionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      definition_ = value;
      onChanged();
      return this;
    }

    private int bitrate_ ;
    /**
     * <pre>
     *视频码率(Kbps)
     * </pre>
     *
     * <code>int32 Bitrate = 6;</code>
     * @return The bitrate.
     */
    @java.lang.Override
    public int getBitrate() {
      return bitrate_;
    }
    /**
     * <pre>
     *视频码率(Kbps)
     * </pre>
     *
     * <code>int32 Bitrate = 6;</code>
     * @param value The bitrate to set.
     * @return This builder for chaining.
     */
    public Builder setBitrate(int value) {
      
      bitrate_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *视频码率(Kbps)
     * </pre>
     *
     * <code>int32 Bitrate = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearBitrate() {
      
      bitrate_ = 0;
      onChanged();
      return this;
    }

    private float fps_ ;
    /**
     * <pre>
     *帧率
     * </pre>
     *
     * <code>float Fps = 7;</code>
     * @return The fps.
     */
    @java.lang.Override
    public float getFps() {
      return fps_;
    }
    /**
     * <pre>
     *帧率
     * </pre>
     *
     * <code>float Fps = 7;</code>
     * @param value The fps to set.
     * @return This builder for chaining.
     */
    public Builder setFps(float value) {
      
      fps_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *帧率
     * </pre>
     *
     * <code>float Fps = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearFps() {
      
      fps_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Business.VodVideoStreamMeta)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Business.VodVideoStreamMeta)
  private static final com.volcengine.service.vod.model.business.VodVideoStreamMeta DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.business.VodVideoStreamMeta();
  }

  public static com.volcengine.service.vod.model.business.VodVideoStreamMeta getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodVideoStreamMeta>
      PARSER = new com.google.protobuf.AbstractParser<VodVideoStreamMeta>() {
    @java.lang.Override
    public VodVideoStreamMeta parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodVideoStreamMeta(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodVideoStreamMeta> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodVideoStreamMeta> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodVideoStreamMeta getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

