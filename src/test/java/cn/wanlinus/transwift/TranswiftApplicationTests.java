package cn.wanlinus.transwift;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class TranswiftApplicationTests {

    @Test
    public void contextLoads() throws UnsupportedEncodingException {
        System.out.println(URLDecoder.decode("\u8ba4\u4e3a", "utf-8"));
    }

}
