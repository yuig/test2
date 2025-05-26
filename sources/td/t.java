package td;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class t implements nd.h {

    /* renamed from: b, reason: collision with root package name */
    public final u f117435b;

    /* renamed from: c, reason: collision with root package name */
    public final URL f117436c;

    /* renamed from: d, reason: collision with root package name */
    public final String f117437d;

    /* renamed from: e, reason: collision with root package name */
    public String f117438e;

    /* renamed from: f, reason: collision with root package name */
    public URL f117439f;

    /* renamed from: g, reason: collision with root package name */
    public volatile byte[] f117440g;

    /* renamed from: h, reason: collision with root package name */
    public int f117441h;

    public t(URL url) {
        x xVar = u.f117442a;
        d7.b.p(url, "Argument must not be null");
        this.f117436c = url;
        this.f117437d = null;
        d7.b.p(xVar, "Argument must not be null");
        this.f117435b = xVar;
    }

    @Override // nd.h
    public final void a(MessageDigest messageDigest) {
        if (this.f117440g == null) {
            this.f117440g = c().getBytes(nd.h.f90415a);
        }
        messageDigest.update(this.f117440g);
    }

    public final String c() {
        String str = this.f117437d;
        if (str != null) {
            return str;
        }
        URL url = this.f117436c;
        d7.b.p(url, "Argument must not be null");
        return url.toString();
    }

    public final String d() {
        if (TextUtils.isEmpty(this.f117438e)) {
            String str = this.f117437d;
            if (TextUtils.isEmpty(str)) {
                URL url = this.f117436c;
                d7.b.p(url, "Argument must not be null");
                str = url.toString();
            }
            this.f117438e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f117438e;
    }

    @Override // nd.h
    public final boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return c().equals(tVar.c()) && this.f117435b.equals(tVar.f117435b);
    }

    @Override // nd.h
    public final int hashCode() {
        if (this.f117441h == 0) {
            int hashCode = c().hashCode();
            this.f117441h = hashCode;
            this.f117441h = this.f117435b.hashCode() + (hashCode * 31);
        }
        return this.f117441h;
    }

    public final String toString() {
        return c();
    }

    public t(String str) {
        this(str, u.f117442a);
    }

    public t(String str, x xVar) {
        this.f117436c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f117437d = str;
            d7.b.p(xVar, "Argument must not be null");
            this.f117435b = xVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
