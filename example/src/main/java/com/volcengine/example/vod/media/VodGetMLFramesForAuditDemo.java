// Code generated by protoc-gen-volcengine-sdk
// source: getMLFramesForAudit
// DO NOT EDIT!

package com.volcengine.example.vod.media;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
public class VodGetMLFramesForAuditDemo {

    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            com.volcengine.service.vod.model.request.VodGetMLFramesForAuditRequest.Builder reqBuilder = com.volcengine.service.vod.model.request.VodGetMLFramesForAuditRequest.newBuilder();
			reqBuilder.setVid("your Vid");
			reqBuilder.setStrategy("your Strategy");
			reqBuilder.setFrameOpt("your FrameOpt");
			reqBuilder.setFrameFps("your FrameFps");
			reqBuilder.setNumberOfFrames("your NumberOfFrames");
			reqBuilder.setCutTimeMills("your CutTimeMills");
			reqBuilder.setNeedFirstFrame("your NeedFirstFrame");
			reqBuilder.setNeedLastFrame("your NeedLastFrame");
			reqBuilder.setStartTimeMill("your StartTimeMill");
			reqBuilder.setEndTimeMill("your EndTimeMill");
			reqBuilder.setMinNumberOfFrames("your MinNumberOfFrames");
			reqBuilder.setMaxNumberOfFrames("your MaxNumberOfFrames");
			
            com.volcengine.service.vod.model.response.VodGetMLFramesForAuditResponse resp = vodService.getMLFramesForAudit(reqBuilder.build());
            if (resp.getResponseMetadata().hasError()) {
                System.out.println(resp.getResponseMetadata().getError());
                System.exit(-1);
            }
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}