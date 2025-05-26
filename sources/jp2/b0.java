package jp2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import org.chromium.net.UrlResponseInfo;

/* loaded from: classes2.dex */
public final class b0 extends UrlResponseInfo {

    /* renamed from: a, reason: collision with root package name */
    public final List f77306a;

    /* renamed from: b, reason: collision with root package name */
    public final int f77307b;

    /* renamed from: c, reason: collision with root package name */
    public final String f77308c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f77309d;

    /* renamed from: e, reason: collision with root package name */
    public final String f77310e;

    /* renamed from: f, reason: collision with root package name */
    public final String f77311f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicLong f77312g;

    /* renamed from: h, reason: collision with root package name */
    public final a0 f77313h;

    public b0(List list, int i13, String str, ArrayList arrayList, boolean z13, String str2, String str3, long j13) {
        this.f77306a = Collections.unmodifiableList(list);
        this.f77307b = i13;
        this.f77308c = str;
        this.f77313h = new a0(Collections.unmodifiableList(arrayList));
        this.f77309d = z13;
        this.f77310e = str2;
        this.f77311f = str3;
        this.f77312g = new AtomicLong(j13);
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final Map getAllHeaders() {
        return this.f77313h.getAsMap();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final List getAllHeadersAsList() {
        return this.f77313h.f77302a;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final int getHttpStatusCode() {
        return this.f77307b;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getHttpStatusText() {
        return this.f77308c;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getNegotiatedProtocol() {
        return this.f77310e;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getProxyServer() {
        return this.f77311f;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final long getReceivedByteCount() {
        return this.f77312g.get();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getUrl() {
        return (String) ep.b.i(this.f77306a, 1);
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final List getUrlChain() {
        return this.f77306a;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String url = getUrl();
        String obj = this.f77306a.toString();
        String obj2 = this.f77313h.f77302a.toString();
        long j13 = this.f77312g.get();
        StringBuilder w13 = a.a.w("UrlResponseInfo@[", hexString, "][", url, "]: urlChain = ");
        w13.append(obj);
        w13.append(", httpStatus = ");
        w13.append(this.f77307b);
        w13.append(" ");
        a.a.B(w13, this.f77308c, ", headers = ", obj2, ", wasCached = ");
        w13.append(this.f77309d);
        w13.append(", negotiatedProtocol = ");
        w13.append(this.f77310e);
        w13.append(", proxyServer= ");
        w13.append(this.f77311f);
        w13.append(", receivedByteCount = ");
        w13.append(j13);
        return w13.toString();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final boolean wasCached() {
        return this.f77309d;
    }
}
