package com.parkingwang.okhttp3.LogInterceptor.formatter;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author 黄浩杭 (huanghaohang@parkingwang.com)
 * @since 2017-04-24
 */
public class MoshiFormatterTest {

    @Test
    public void testJSONFormatter() {
        JSONFormatter formatter = MoshiFormatter.buildIfSupported();
        Assert.assertNotNull(formatter);
        System.out.println(formatter.format("{\"key\":\"value\",\"object\": {\"name\":\"value\",\"age\":\"1\"}}"));
    }
}
