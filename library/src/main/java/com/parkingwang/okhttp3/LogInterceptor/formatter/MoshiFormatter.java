package com.parkingwang.okhttp3.LogInterceptor.formatter;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.Moshi;

import java.io.IOException;

import okio.Buffer;

/**
 * @author 黄浩杭 (huanghaohang@parkingwang.com)
 * @since 2017-04-24
 */
class MoshiFormatter extends JSONFormatter {
    private final Moshi MOSHI = new Moshi.Builder().build();
    private final JsonAdapter<Object> ADAPTER = MOSHI.adapter(Object.class).indent("    ");

    @Override
    String format(String source) {
        Buffer buffer = new Buffer().writeUtf8(source);
        JsonReader reader = JsonReader.of(buffer);
        try {
            return ADAPTER.toJson(reader.readJsonValue());
        } catch (IOException e) {
            return  "";
        }
    }

    static JSONFormatter buildIfSupported() {
        try {
            Class.forName("com.squareup.moshi.Moshi");
            return new MoshiFormatter();
        } catch (ClassNotFoundException ignore) {
            return null;
        }
    }
}
