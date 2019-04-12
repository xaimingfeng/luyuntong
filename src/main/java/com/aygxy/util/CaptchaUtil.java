package com.aygxy.util;

import java.util.Random;

/**
 * @Date 2019/4/7 11:20
 * @Description 验证码工具类
 **/
public class CaptchaUtil {

    private static final char[] CHARS={'A','B','C','D','E','F','G','H','G','K','M','N','P','Q','R','S','T','U','V','W','X','Y','Z'
            ,'a','b','c','d','e','f','g','h','i','j','k','m','n','p','q','r','s','t','u','v','w','x','y','z','2','3','4','5','6','7','8','9'};

    private static final char[] NUMERIC_CHARS={'0','1','2','3','4','5','6','7','8','9'};

    private static String randomCode(Integer length, char[] source) {
        char[] code = new char[length];
        for (int i = 0; i < length; i++) {
            int index = new Random().nextInt(source.length);
            code[i] = source[index];
        }
        return String.valueOf(code);
    }

    public static String randomCode(Integer length) {
        return randomCode(length, CHARS);
    }

    public static String randomNumericCode(Integer length) {
        return randomCode(length, NUMERIC_CHARS);
    }
}
