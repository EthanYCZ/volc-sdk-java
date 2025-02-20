
// Code generated by protoc-gen-volcengine-sdk
// source: imp/service/service_imp.proto
// DO NOT EDIT!

package com.volcengine.service.imp.impl;

import com.google.protobuf.util.JsonFormat;
import java.io.*;

public class ImpServiceImpl extends com.volcengine.service.BaseServiceImpl implements com.volcengine.service.imp.IImpService {
    	
    // 静态字段引用唯一实例:
    private static final ImpServiceImpl CN_NORTH_1_SERVICE = new ImpServiceImpl();

    // 通过静态方法返回实例:
    public static com.volcengine.service.imp.IImpService getInstance() {
        return CN_NORTH_1_SERVICE;
    }

    // private构造方法保证外部无法实例化:
    protected ImpServiceImpl() {
        super(com.volcengine.service.imp.ImpServiceConfig.ServiceInfoMap.get(com.volcengine.helper.Const.REGION_CN_NORTH_1), com.volcengine.service.imp.ImpServiceConfig.apiInfoList);
    }

    public static com.volcengine.service.imp.IImpService getInstance(String region) throws Exception {
        com.volcengine.model.ServiceInfo serviceInfo = com.volcengine.service.imp.ImpServiceConfig.ServiceInfoMap.get(region);
        if (serviceInfo == null) {
            throw new Exception("Cant find the region, please check it carefully");
        }
        switch (region) {
            case com.volcengine.helper.Const.REGION_CN_NORTH_1:
                return CN_NORTH_1_SERVICE;
            default:
                throw new Exception("Cant find the region, please check it carefully");
        }
    }
	
	/**
     * SubmitJob.
     *
     * @param input com.volcengine.service.imp.model.request.ImpSubmitJobRequest
     * @return com.volcengine.service.imp.model.response.ImpSubmitJobResponse
     * @throws Exception the exception
     */
	@Override
	public com.volcengine.service.imp.model.response.ImpSubmitJobResponse SubmitJob(com.volcengine.service.imp.model.request.ImpSubmitJobRequest input) throws Exception {
		com.volcengine.model.response.RawResponse response = query(com.volcengine.service.imp.Const.SubmitJob, com.volcengine.helper.Utils.mapToPairList(com.volcengine.helper.Utils.protoBufferToMap(input, true)));
        if (response.getCode() != com.volcengine.error.SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        com.volcengine.service.imp.model.response.ImpSubmitJobResponse.Builder responseBuilder = com.volcengine.service.imp.model.response.ImpSubmitJobResponse.newBuilder();
        JsonFormat.parser().ignoringUnknownFields().merge(new InputStreamReader(new ByteArrayInputStream(response.getData())), responseBuilder);
        return responseBuilder.build();
	}
	
	
	/**
     * KillJob.
     *
     * @param input com.volcengine.service.imp.model.request.ImpKillJobRequest
     * @return com.volcengine.service.imp.model.response.ImpKillJobResponse
     * @throws Exception the exception
     */
	@Override
	public com.volcengine.service.imp.model.response.ImpKillJobResponse KillJob(com.volcengine.service.imp.model.request.ImpKillJobRequest input) throws Exception {
		com.volcengine.model.response.RawResponse response = query(com.volcengine.service.imp.Const.KillJob, com.volcengine.helper.Utils.mapToPairList(com.volcengine.helper.Utils.protoBufferToMap(input, true)));
        if (response.getCode() != com.volcengine.error.SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        com.volcengine.service.imp.model.response.ImpKillJobResponse.Builder responseBuilder = com.volcengine.service.imp.model.response.ImpKillJobResponse.newBuilder();
        JsonFormat.parser().ignoringUnknownFields().merge(new InputStreamReader(new ByteArrayInputStream(response.getData())), responseBuilder);
        return responseBuilder.build();
	}
	
	
	/**
     * RetrieveJob.
     *
     * @param input com.volcengine.service.imp.model.request.ImpRetrieveJobRequest
     * @return com.volcengine.service.imp.model.response.ImpRetrieveJobResponse
     * @throws Exception the exception
     */
	@Override
	public com.volcengine.service.imp.model.response.ImpRetrieveJobResponse RetrieveJob(com.volcengine.service.imp.model.request.ImpRetrieveJobRequest input) throws Exception {
		com.volcengine.model.response.RawResponse response = query(com.volcengine.service.imp.Const.RetrieveJob, com.volcengine.helper.Utils.mapToPairList(com.volcengine.helper.Utils.protoBufferToMap(input, true)));
        if (response.getCode() != com.volcengine.error.SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        com.volcengine.service.imp.model.response.ImpRetrieveJobResponse.Builder responseBuilder = com.volcengine.service.imp.model.response.ImpRetrieveJobResponse.newBuilder();
        JsonFormat.parser().ignoringUnknownFields().merge(new InputStreamReader(new ByteArrayInputStream(response.getData())), responseBuilder);
        return responseBuilder.build();
	}
	
	
}  // end of service interface
