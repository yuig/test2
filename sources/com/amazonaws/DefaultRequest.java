package com.amazonaws;

import a.a;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.util.AWSRequestMetrics;
import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public class DefaultRequest<T> implements Request<T> {

    /* renamed from: a, reason: collision with root package name */
    public String f28531a;

    /* renamed from: e, reason: collision with root package name */
    public URI f28535e;

    /* renamed from: g, reason: collision with root package name */
    public final AmazonWebServiceRequest f28537g;

    /* renamed from: i, reason: collision with root package name */
    public InputStream f28539i;

    /* renamed from: j, reason: collision with root package name */
    public long f28540j;

    /* renamed from: k, reason: collision with root package name */
    public AWSRequestMetrics f28541k;

    /* renamed from: b, reason: collision with root package name */
    public boolean f28532b = false;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f28533c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f28534d = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public HttpMethodName f28538h = HttpMethodName.POST;

    /* renamed from: f, reason: collision with root package name */
    public final String f28536f = "Amazon S3";

    public DefaultRequest(AmazonWebServiceRequest amazonWebServiceRequest) {
        this.f28537g = amazonWebServiceRequest;
    }

    public final void a(String str, String str2) {
        this.f28534d.put(str, str2);
    }

    public final void b(String str, String str2) {
        this.f28533c.put(str, str2);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f28538h);
        sb3.append(" ");
        sb3.append(this.f28535e);
        sb3.append(" ");
        String str = this.f28531a;
        if (str == null) {
            sb3.append("/");
        } else {
            if (!str.startsWith("/")) {
                sb3.append("/");
            }
            sb3.append(str);
        }
        sb3.append(" ");
        LinkedHashMap linkedHashMap = this.f28533c;
        if (!linkedHashMap.isEmpty()) {
            sb3.append("Parameters: (");
            for (String str2 : linkedHashMap.keySet()) {
                a.B(sb3, str2, ": ", (String) linkedHashMap.get(str2), ", ");
            }
            sb3.append(") ");
        }
        HashMap hashMap = this.f28534d;
        if (!hashMap.isEmpty()) {
            sb3.append("Headers: (");
            for (String str3 : hashMap.keySet()) {
                a.B(sb3, str3, ": ", (String) hashMap.get(str3), ", ");
            }
            sb3.append(") ");
        }
        return sb3.toString();
    }
}
