package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class TranslateImageRequest {
    @JSONField(name = "TargetLanguage")
    String targetLanguage;

    @JSONField(name = "Image")
    String image;
}
