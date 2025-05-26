package rr;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class u0 extends d0 {
    @Override // rr.d0
    public final String a() {
        return "line_redirect";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f109723a.t(null);
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        String path;
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(uri, "uri");
        return uri.getPathSegments().size() == 3 && (path = uri.getPath()) != null && StringsKt.E(path, "oauth/line/redirect", false);
    }
}
