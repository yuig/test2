package com.amazonaws.services.s3.internal;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public abstract class S3HttpUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f28815a = Pattern.compile(Pattern.quote("+") + "|" + Pattern.quote("*") + "|" + Pattern.quote("%7E") + "|" + Pattern.quote("%2F") + "|" + Pattern.quote("%3A") + "|" + Pattern.quote("%27") + "|" + Pattern.quote("%28") + "|" + Pattern.quote("%29") + "|" + Pattern.quote("%21") + "|" + Pattern.quote("%5B") + "|" + Pattern.quote("%5D") + "|" + Pattern.quote("%24"));

    public static String a(String str) {
        if (str == null) {
            return "";
        }
        try {
            String encode = URLEncoder.encode(str, "UTF-8");
            Matcher matcher = f28815a.matcher(encode);
            StringBuffer stringBuffer = new StringBuffer(encode.length());
            while (matcher.find()) {
                String group = matcher.group(0);
                if ("+".equals(group)) {
                    group = " ";
                } else if ("*".equals(group)) {
                    group = "%2A";
                } else if ("%7E".equals(group)) {
                    group = "~";
                }
                matcher.appendReplacement(stringBuffer, group);
            }
            matcher.appendTail(stringBuffer);
            return stringBuffer.toString();
        } catch (UnsupportedEncodingException e13) {
            throw new RuntimeException(e13);
        }
    }
}
