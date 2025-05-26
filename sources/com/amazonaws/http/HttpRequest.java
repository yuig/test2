package com.amazonaws.http;

import com.amazonaws.util.StringUtils;
import java.io.InputStream;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes3.dex */
public class HttpRequest {

    /* renamed from: a, reason: collision with root package name */
    public final String f28598a;

    /* renamed from: b, reason: collision with root package name */
    public final URI f28599b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f28600c;

    /* renamed from: d, reason: collision with root package name */
    public final InputStream f28601d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f28602e;

    public HttpRequest(String str, URI uri, HashMap hashMap, InputStream inputStream) {
        Charset charset = StringUtils.f29048a;
        this.f28598a = str == null ? null : str.isEmpty() ? "" : str.toUpperCase(Locale.ENGLISH);
        this.f28599b = uri;
        this.f28600c = Collections.unmodifiableMap(hashMap);
        this.f28601d = inputStream;
    }

    public final long a() {
        String str;
        Map map = this.f28600c;
        if (map == null || (str = (String) map.get("Content-Length")) == null || str.isEmpty()) {
            return 0L;
        }
        return Long.valueOf(str).longValue();
    }
}
