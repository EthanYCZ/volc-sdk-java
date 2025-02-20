// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

public interface VodGetSmartStrategyLitePlayInfoRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Request.VodGetSmartStrategyLitePlayInfoRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 播放url 
   * </pre>
   *
   * <code>string PlayUrl = 1;</code>
   * @return The playUrl.
   */
  java.lang.String getPlayUrl();
  /**
   * <pre>
   * 播放url 
   * </pre>
   *
   * <code>string PlayUrl = 1;</code>
   * @return The bytes for playUrl.
   */
  com.google.protobuf.ByteString
      getPlayUrlBytes();

  /**
   * <pre>
   * 封装格式，支持mp4,dash,hls，默认mp4Format 
   * </pre>
   *
   * <code>string Format = 2;</code>
   * @return The format.
   */
  java.lang.String getFormat();
  /**
   * <pre>
   * 封装格式，支持mp4,dash,hls，默认mp4Format 
   * </pre>
   *
   * <code>string Format = 2;</code>
   * @return The bytes for format.
   */
  com.google.protobuf.ByteString
      getFormatBytes();

  /**
   * <pre>
   * 编码类型，默认h264，可选值为h264,bytevc1等Codec 
   * </pre>
   *
   * <code>string Codec = 3;</code>
   * @return The codec.
   */
  java.lang.String getCodec();
  /**
   * <pre>
   * 编码类型，默认h264，可选值为h264,bytevc1等Codec 
   * </pre>
   *
   * <code>string Codec = 3;</code>
   * @return The bytes for codec.
   */
  com.google.protobuf.ByteString
      getCodecBytes();

  /**
   * <pre>
   * 视频流清晰度，默认返回全部，支持：240p，360p，480p，540p，720p，1080p,
   * 2k, 4k
   * </pre>
   *
   * <code>string Definition = 4;</code>
   * @return The definition.
   */
  java.lang.String getDefinition();
  /**
   * <pre>
   * 视频流清晰度，默认返回全部，支持：240p，360p，480p，540p，720p，1080p,
   * 2k, 4k
   * </pre>
   *
   * <code>string Definition = 4;</code>
   * @return The bytes for definition.
   */
  com.google.protobuf.ByteString
      getDefinitionBytes();

  /**
   * <pre>
   * 流文件类型，默认video，支持：加密视频流evideo，加密音频流传eaudio，非加密视频流video，普通音频音频流audio
   * </pre>
   *
   * <code>string FileType = 5;</code>
   * @return The fileType.
   */
  java.lang.String getFileType();
  /**
   * <pre>
   * 流文件类型，默认video，支持：加密视频流evideo，加密音频流传eaudio，非加密视频流video，普通音频音频流audio
   * </pre>
   *
   * <code>string FileType = 5;</code>
   * @return The bytes for fileType.
   */
  com.google.protobuf.ByteString
      getFileTypeBytes();

  /**
   * <pre>
   * 水印贴片标签 
   * </pre>
   *
   * <code>string LogoType = 6;</code>
   * @return The logoType.
   */
  java.lang.String getLogoType();
  /**
   * <pre>
   * 水印贴片标签 
   * </pre>
   *
   * <code>string LogoType = 6;</code>
   * @return The bytes for logoType.
   */
  com.google.protobuf.ByteString
      getLogoTypeBytes();

  /**
   * <pre>
   * 返回https播放地址，默认否, 1-是；0-否 
   * </pre>
   *
   * <code>string Ssl = 7;</code>
   * @return The ssl.
   */
  java.lang.String getSsl();
  /**
   * <pre>
   * 返回https播放地址，默认否, 1-是；0-否 
   * </pre>
   *
   * <code>string Ssl = 7;</code>
   * @return The bytes for ssl.
   */
  com.google.protobuf.ByteString
      getSslBytes();

  /**
   * <pre>
   * 是否需要雪碧图（缩略图），默认否，1-是；0-否 
   * </pre>
   *
   * <code>string NeedThumbs = 8;</code>
   * @return The needThumbs.
   */
  java.lang.String getNeedThumbs();
  /**
   * <pre>
   * 是否需要雪碧图（缩略图），默认否，1-是；0-否 
   * </pre>
   *
   * <code>string NeedThumbs = 8;</code>
   * @return The bytes for needThumbs.
   */
  com.google.protobuf.ByteString
      getNeedThumbsBytes();

  /**
   * <pre>
   * 是否需要蒙版弹幕，默认否，1-是；0-否 
   * </pre>
   *
   * <code>string NeedBarrageMask = 9;</code>
   * @return The needBarrageMask.
   */
  java.lang.String getNeedBarrageMask();
  /**
   * <pre>
   * 是否需要蒙版弹幕，默认否，1-是；0-否 
   * </pre>
   *
   * <code>string NeedBarrageMask = 9;</code>
   * @return The bytes for needBarrageMask.
   */
  com.google.protobuf.ByteString
      getNeedBarrageMaskBytes();

  /**
   * <pre>
   * 唯一性标识信息 
   * </pre>
   *
   * <code>string UnionInfo = 10;</code>
   * @return The unionInfo.
   */
  java.lang.String getUnionInfo();
  /**
   * <pre>
   * 唯一性标识信息 
   * </pre>
   *
   * <code>string UnionInfo = 10;</code>
   * @return The bytes for unionInfo.
   */
  com.google.protobuf.ByteString
      getUnionInfoBytes();

  /**
   * <pre>
   * HDR清晰度，默认不查询，支持：all,
   * 240p，360p, 420p，480p，540p，720p，1080p, 2k, 4k
   * </pre>
   *
   * <code>string HDRDefinition = 11;</code>
   * @return The hDRDefinition.
   */
  java.lang.String getHDRDefinition();
  /**
   * <pre>
   * HDR清晰度，默认不查询，支持：all,
   * 240p，360p, 420p，480p，540p，720p，1080p, 2k, 4k
   * </pre>
   *
   * <code>string HDRDefinition = 11;</code>
   * @return The bytes for hDRDefinition.
   */
  com.google.protobuf.ByteString
      getHDRDefinitionBytes();
}
