package rr;

import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends d0 {
    static {
        new com.google.android.gms.common.api.d(22, 0);
    }

    @Override // rr.d0
    public final String a() {
        return "about";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f109723a.s(uri);
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        List<String> pathSegments = uri.getPathSegments();
        if (df.j1.G0(uri)) {
            return (pathSegments.size() == 1 || pathSegments.size() == 2) && Intrinsics.d(pathSegments.get(0), "about");
        }
        return false;
    }
}
