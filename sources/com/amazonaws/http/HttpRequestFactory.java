package com.amazonaws.http;

import a.a;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.DefaultRequest;
import com.amazonaws.util.HttpUtils;
import com.amazonaws.util.StringUtils;
import ep.b;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class HttpRequestFactory {
    public static HttpRequest a(DefaultRequest defaultRequest, ClientConfiguration clientConfiguration) {
        boolean z13 = true;
        String a13 = HttpUtils.a(defaultRequest.f28535e.toString(), defaultRequest.f28531a, true);
        String b13 = HttpUtils.b(defaultRequest);
        HttpMethodName httpMethodName = defaultRequest.f28538h;
        boolean z14 = defaultRequest.f28539i != null;
        if (httpMethodName == HttpMethodName.POST && !z14) {
            z13 = false;
        }
        if (b13 != null && z13) {
            a13 = a.D(a13, "?", b13);
        }
        HashMap hashMap = new HashMap();
        URI uri = defaultRequest.f28535e;
        String host = uri.getHost();
        if (HttpUtils.c(uri)) {
            StringBuilder D = b.D(host, ":");
            D.append(uri.getPort());
            host = D.toString();
        }
        hashMap.put("Host", host);
        for (Map.Entry entry : defaultRequest.f28534d.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        if (hashMap.get("Content-Type") == null || ((String) hashMap.get("Content-Type")).isEmpty()) {
            hashMap.put("Content-Type", "application/x-www-form-urlencoded; charset=" + StringUtils.a("UTF-8"));
        }
        InputStream inputStream = defaultRequest.f28539i;
        HttpMethodName httpMethodName2 = HttpMethodName.PATCH;
        if (httpMethodName == httpMethodName2) {
            httpMethodName = HttpMethodName.POST;
            hashMap.put("X-HTTP-Method-Override", httpMethodName2.toString());
        }
        if (httpMethodName == HttpMethodName.POST && defaultRequest.f28539i == null && b13 != null) {
            byte[] bytes = b13.getBytes(StringUtils.f29048a);
            inputStream = new ByteArrayInputStream(bytes);
            hashMap.put("Content-Length", String.valueOf(bytes.length));
        }
        clientConfiguration.getClass();
        hashMap.put("Accept-Encoding", "identity");
        HttpRequest httpRequest = new HttpRequest(httpMethodName.toString(), URI.create(a13), hashMap, inputStream);
        httpRequest.f28602e = defaultRequest.f28532b;
        return httpRequest;
    }
}
