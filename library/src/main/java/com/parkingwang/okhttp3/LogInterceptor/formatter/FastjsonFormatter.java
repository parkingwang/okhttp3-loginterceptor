package com.parkingwang.okhttp3.LogInterceptor.formatter;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

class FastjsonFormatter extends JSONFormatter {
    static JSONFormatter buildIfSupported() {
        try {
            Class.forName("com.alibaba.fastjson.JSON");
            return new FastjsonFormatter();
        } catch (ClassNotFoundException ignore) {
            return null;
        }
    }

    @Override
    String format(String source) {
        return JSON.toJSONString(JSON.parseObject(source), SerializerFeature.PrettyFormat);
    }
}