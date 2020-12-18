// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_common.proto

package com.volcengine.model.vod.business;

public final class VodCommon {
  private VodCommon() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Models_Vod_Business_VodSourceInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Models_Vod_Business_VodSourceInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Models_Vod_Business_VodAudioStreamMeta_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Models_Vod_Business_VodAudioStreamMeta_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Models_Vod_Business_VodVideoStreamMeta_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Models_Vod_Business_VodVideoStreamMeta_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Models_Vod_Business_VodTranscodeInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Models_Vod_Business_VodTranscodeInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Models_Vod_Business_VodAdaptiveInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Models_Vod_Business_VodAdaptiveInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Models_Vod_Business_VodPlayInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Models_Vod_Business_VodPlayInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035vod/business/vod_common.proto\022\036Volceng" +
      "ine.Models.Vod.Business\"\364\001\n\rVodSourceInf" +
      "o\022\016\n\006FileId\030\001 \001(\t\022\013\n\003Md5\030\002 \001(\t\022\020\n\010FileTy" +
      "pe\030\003 \001(\t\022\r\n\005Codec\030\004 \001(\t\022\016\n\006Height\030\005 \001(\005\022" +
      "\r\n\005Width\030\006 \001(\005\022\016\n\006Format\030\007 \001(\t\022\020\n\010Durati" +
      "on\030\010 \001(\002\022\014\n\004Size\030\t \001(\001\022\020\n\010StoreUri\030\n \001(\t" +
      "\022\022\n\nDefinition\030\013 \001(\t\022\017\n\007Bitrate\030\014 \001(\005\022\013\n" +
      "\003Fps\030\r \001(\002\022\022\n\nCreateTime\030\016 \001(\t\"Z\n\022VodAud" +
      "ioStreamMeta\022\r\n\005Codec\030\001 \001(\t\022\020\n\010Duration\030" +
      "\002 \001(\002\022\022\n\nSampleRate\030\003 \001(\005\022\017\n\007Bitrate\030\004 \001" +
      "(\005\"\206\001\n\022VodVideoStreamMeta\022\r\n\005Codec\030\001 \001(\t" +
      "\022\016\n\006Height\030\002 \001(\005\022\r\n\005Width\030\003 \001(\005\022\020\n\010Durat" +
      "ion\030\004 \001(\002\022\022\n\nDefinition\030\005 \001(\t\022\017\n\007Bitrate" +
      "\030\006 \001(\005\022\013\n\003Fps\030\007 \001(\002\"\324\002\n\020VodTranscodeInfo" +
      "\022\016\n\006FileId\030\001 \001(\t\022\013\n\003Md5\030\002 \001(\t\022\020\n\010FileTyp" +
      "e\030\003 \001(\t\022\020\n\010LogoType\030\004 \001(\t\022\017\n\007Encrypt\030\005 \001" +
      "(\010\022\016\n\006Format\030\006 \001(\t\022\020\n\010Duration\030\007 \001(\002\022\014\n\004" +
      "Size\030\010 \001(\001\022\020\n\010StoreUri\030\t \001(\t\022K\n\017VideoStr" +
      "eamMeta\030\n \001(\01322.Volcengine.Models.Vod.Bu" +
      "siness.VodVideoStreamMeta\022K\n\017AudioStream" +
      "Meta\030\013 \001(\01322.Volcengine.Models.Vod.Busin" +
      "ess.VodAudioStreamMeta\022\022\n\nCreateTime\030\014 \001" +
      "(\t\"S\n\017VodAdaptiveInfo\022\023\n\013MainPlayUrl\030\001 \001" +
      "(\t\022\025\n\rBackupPlayUrl\030\002 \001(\t\022\024\n\014AdaptiveTyp" +
      "e\030\003 \001(\t\"\334\002\n\013VodPlayInfo\022\016\n\006FileId\030\001 \001(\t\022" +
      "\013\n\003Md5\030\002 \001(\t\022\020\n\010FileType\030\003 \001(\t\022\016\n\006Format" +
      "\030\004 \001(\t\022\r\n\005Codec\030\005 \001(\t\022\022\n\nDefinition\030\006 \001(" +
      "\t\022\023\n\013MainPlayUrl\030\007 \001(\t\022\025\n\rBackupPlayUrl\030" +
      "\010 \001(\t\022\017\n\007Bitrate\030\t \001(\005\022\r\n\005Width\030\n \001(\005\022\016\n" +
      "\006Height\030\013 \001(\005\022\014\n\004Size\030\014 \001(\001\022\021\n\tCheckInfo" +
      "\030\r \001(\t\022\022\n\nIndexRange\030\016 \001(\t\022\021\n\tInitRange\030" +
      "\017 \001(\t\022\020\n\010PlayAuth\030\020 \001(\t\022\022\n\nPlayAuthId\030\021 " +
      "\001(\t\022\020\n\010LogoType\030\022 \001(\t\022\017\n\007Quality\030\023 \001(\tB\255" +
      "\001\n!com.volcengine.model.vod.businessB\tVo" +
      "dCommonP\001Z9github.com/volcengine/volc-sd" +
      "k-golang/models/vod/business\240\001\001\330\001\001\302\002\000\312\002\030" +
      "Volc\\Models\\Vod\\Business\342\002\033Volc\\Models\\V" +
      "od\\GPBMetadatab\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Volcengine_Models_Vod_Business_VodSourceInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Volcengine_Models_Vod_Business_VodSourceInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Models_Vod_Business_VodSourceInfo_descriptor,
        new java.lang.String[] { "FileId", "Md5", "FileType", "Codec", "Height", "Width", "Format", "Duration", "Size", "StoreUri", "Definition", "Bitrate", "Fps", "CreateTime", });
    internal_static_Volcengine_Models_Vod_Business_VodAudioStreamMeta_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Volcengine_Models_Vod_Business_VodAudioStreamMeta_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Models_Vod_Business_VodAudioStreamMeta_descriptor,
        new java.lang.String[] { "Codec", "Duration", "SampleRate", "Bitrate", });
    internal_static_Volcengine_Models_Vod_Business_VodVideoStreamMeta_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Volcengine_Models_Vod_Business_VodVideoStreamMeta_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Models_Vod_Business_VodVideoStreamMeta_descriptor,
        new java.lang.String[] { "Codec", "Height", "Width", "Duration", "Definition", "Bitrate", "Fps", });
    internal_static_Volcengine_Models_Vod_Business_VodTranscodeInfo_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_Volcengine_Models_Vod_Business_VodTranscodeInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Models_Vod_Business_VodTranscodeInfo_descriptor,
        new java.lang.String[] { "FileId", "Md5", "FileType", "LogoType", "Encrypt", "Format", "Duration", "Size", "StoreUri", "VideoStreamMeta", "AudioStreamMeta", "CreateTime", });
    internal_static_Volcengine_Models_Vod_Business_VodAdaptiveInfo_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_Volcengine_Models_Vod_Business_VodAdaptiveInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Models_Vod_Business_VodAdaptiveInfo_descriptor,
        new java.lang.String[] { "MainPlayUrl", "BackupPlayUrl", "AdaptiveType", });
    internal_static_Volcengine_Models_Vod_Business_VodPlayInfo_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_Volcengine_Models_Vod_Business_VodPlayInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Models_Vod_Business_VodPlayInfo_descriptor,
        new java.lang.String[] { "FileId", "Md5", "FileType", "Format", "Codec", "Definition", "MainPlayUrl", "BackupPlayUrl", "Bitrate", "Width", "Height", "Size", "CheckInfo", "IndexRange", "InitRange", "PlayAuth", "PlayAuthId", "LogoType", "Quality", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
