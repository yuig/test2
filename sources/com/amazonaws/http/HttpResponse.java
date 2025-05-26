package com.amazonaws.http;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* loaded from: classes3.dex */
public class HttpResponse {

    /* renamed from: a, reason: collision with root package name */
    public final String f28603a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28604b;

    /* renamed from: c, reason: collision with root package name */
    public final InputStream f28605c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f28606d;

    /* renamed from: e, reason: collision with root package name */
    public InputStream f28607e;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f28608a;

        /* renamed from: b, reason: collision with root package name */
        public int f28609b;

        /* renamed from: c, reason: collision with root package name */
        public InputStream f28610c;

        /* renamed from: d, reason: collision with root package name */
        public final HashMap f28611d = new HashMap();
    }

    public HttpResponse(String str, int i13, Map map, InputStream inputStream) {
        this.f28603a = str;
        this.f28604b = i13;
        this.f28606d = map;
        this.f28605c = inputStream;
    }

    public final InputStream a() {
        if (this.f28607e == null) {
            synchronized (this) {
                try {
                    if (this.f28605c == null || !"gzip".equals(this.f28606d.get("Content-Encoding"))) {
                        this.f28607e = this.f28605c;
                    } else {
                        this.f28607e = new GZIPInputStream(this.f28605c);
                    }
                } finally {
                }
            }
        }
        return this.f28607e;
    }
}
