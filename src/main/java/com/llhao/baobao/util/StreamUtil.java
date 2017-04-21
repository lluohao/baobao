package com.llhao.baobao.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/**
 * Created by HAO zong on 2017-4-16.
 */
public class StreamUtil {
    public static String readAll(InputStream is,String charset) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(is,charset));
        StringBuilder builder = new StringBuilder();
        String line = null;
        while ((line=reader.readLine())!=null){
            builder.append(line+"\n");
        }
        return builder.toString();
    }
}
