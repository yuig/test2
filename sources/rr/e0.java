package rr;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e0 extends d0 {
    @Override // rr.d0
    public final String a() {
        return "email_translated";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String host = uri.getHost();
        boolean contains = host != null ? ie0.a.f72198c.contains(host) : false;
        String uri2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
        sr.q.b(this.f109723a, uri2, !contains, 4);
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String host = uri.getHost();
        return (host != null ? ie0.a.f72198c.contains(host) : false) || ((kotlin.text.z.i("www.pinterest.com", uri.getHost(), true) || kotlin.text.z.i("pinterest.com", uri.getHost(), true)) && df.j1.b1(uri.getEncodedPath(), true));
    }
}
