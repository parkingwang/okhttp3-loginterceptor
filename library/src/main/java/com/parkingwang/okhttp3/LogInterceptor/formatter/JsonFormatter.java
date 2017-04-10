package com.parkingwang.okhttp3.LogInterceptor.formatter;

import org.json.JSONObject;

class JsonFormatter extends JSONFormatter {

    private static final int INDENT_SPACES = 4;

    static JsonFormatter buildIfSupported() {
        try {
            Class.forName("org.json.JSONObject");
            return new JsonFormatter();
        } catch (ClassNotFoundException ignore) {
            return null;
        }
    }

    @Override
    String format(String source) {
        return new JSONObject(source).toString(INDENT_SPACES);
    }
}
