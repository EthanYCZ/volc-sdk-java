package com.volcengine.example.media;

import com.volcengine.model.vod.request.VodUpdateSubtitleStatusRequest;
import com.volcengine.model.vod.response.VodUpdateSubtitleStatusResponse;
import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;

public class UpdateSubtitleStatusDemo {
    public static void main(String[] args) {
        IVodService vodService = VodServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        // vodService.setAccessKey("");
        // vodService.setSecretKey("");

        String vid = "vid";
        String fileIds = "fileIds";
        String formats = "formats";
        String languages = "languages";
        String status = "status";

        try {
            VodUpdateSubtitleStatusRequest.Builder req = VodUpdateSubtitleStatusRequest.newBuilder();
            req.setVid(vid);
            req.setFileIds(fileIds);
            req.setFormats(formats);
            req.setLanguages(languages);
            req.setStatus(status);

            VodUpdateSubtitleStatusResponse resp = vodService.updateSubtitleStatus(req.build());
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
