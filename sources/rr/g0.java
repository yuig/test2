package rr;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class g0 extends d0 {
    @Override // rr.d0
    public final String a() {
        return "facebook";
    }

    @Override // rr.d0
    public final boolean b() {
        return false;
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        qr.h hVar = this.f109723a;
        if (hVar.f104943d.e()) {
            hVar.l(null);
        } else {
            hVar.n(null);
        }
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String host = uri.getHost();
        return host != null && StringsKt.E(host, "facebook", false);
    }
}
