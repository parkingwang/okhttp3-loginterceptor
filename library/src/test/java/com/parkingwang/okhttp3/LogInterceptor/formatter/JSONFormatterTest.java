package com.parkingwang.okhttp3.LogInterceptor.formatter;

import org.junit.Test;

/**
 * JSON格式化
 *
 * @author 黄浩杭 (huanghaohang@parkingwang.com)
 * @since 2017-04-10
 */
public class JSONFormatterTest {

    @Test
    public void testJSONFormatter() {
        System.out.println(com.parkingwang.okhttp3.LogInterceptor.formatter.JSONFormatter.formatJSON("{\"key\":\"value\",\"object\": {\"name\":\"value\",\"age\":\"1\"}}"));
        System.out.println(com.parkingwang.okhttp3.LogInterceptor.formatter.JSONFormatter.FORMATTER.getClass());
    }
}
