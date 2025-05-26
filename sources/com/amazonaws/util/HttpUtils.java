package com.amazonaws.util;

import a.a;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public abstract class HttpUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f29040a = Pattern.compile(Pattern.quote("+") + "|" + Pattern.quote("*") + "|" + Pattern.quote("%7E") + "|" + Pattern.quote("%2F"));

    static {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(Pattern.quote("%2A"));
        sb3.append("|");
        sb3.append(Pattern.quote("%2B"));
        sb3.append("|");
        Pattern.compile(sb3.toString());
    }

    public static String a(String str, String str2, boolean z13) {
        if (str2 == null || str2.length() <= 0) {
            return !str.endsWith("/") ? str.concat("/") : str;
        }
        if (str2.startsWith("/")) {
            if (str.endsWith("/")) {
                str = str.substring(0, str.length() - 1);
            }
        } else if (!str.endsWith("/")) {
            str = str.concat("/");
        }
        String d2 = d(str2, true);
        if (z13) {
            d2 = d2.replace("//", "/%2F");
        }
        return a.C(str, d2);
    }

    public static String b(Request request) {
        if (((DefaultRequest) request).f28533c.isEmpty()) {
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        try {
            boolean z13 = true;
            for (Map.Entry entry : ((DefaultRequest) request).f28533c.entrySet()) {
                String encode = URLEncoder.encode((String) entry.getKey(), "UTF-8");
                String str = (String) entry.getValue();
                String encode2 = str == null ? "" : URLEncoder.encode(str, "UTF-8");
                if (z13) {
                    z13 = false;
                } else {
                    sb3.append("&");
                }
                sb3.append(encode);
                sb3.append("=");
                sb3.append(encode2);
            }
            return sb3.toString();
        } catch (UnsupportedEncodingException e13) {
            throw new IllegalArgumentException(e13);
        }
    }

    public static boolean c(URI uri) {
        String a13 = StringUtils.a(uri.getScheme());
        int port = uri.getPort();
        if (port <= 0) {
            return false;
        }
        if ("http".equals(a13) && port == 80) {
            return false;
        }
        return ("https".equals(a13) && port == 443) ? false : true;
    }

    public static String d(String str, boolean z13) {
        if (str == null) {
            return "";
        }
        try {
            String encode = URLEncoder.encode(str, "UTF-8");
            Matcher matcher = f29040a.matcher(encode);
            StringBuffer stringBuffer = new StringBuffer(encode.length());
            while (matcher.find()) {
                String group = matcher.group(0);
                if ("+".equals(group)) {
                    group = "%20";
                } else if ("*".equals(group)) {
                    group = "%2A";
                } else if ("%7E".equals(group)) {
                    group = "~";
                } else if (z13 && "%2F".equals(group)) {
                    group = "/";
                }
                matcher.appendReplacement(stringBuffer, group);
            }
            matcher.appendTail(stringBuffer);
            return stringBuffer.toString();
        } catch (UnsupportedEncodingException e13) {
            throw new RuntimeException(e13);
        }
    }

    public static boolean e(Request request) {
        return HttpMethodName.POST.equals(((DefaultRequest) request).f28538h) && (((DefaultRequest) request).f28539i == null);
    }
}
