package rr;

import android.app.Activity;
import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t2 extends d0 {
    @Override // rr.d0
    public final String a() {
        return "privacy_data";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        qr.h hVar = this.f109723a;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(uri, "uri");
        sr.k kVar = hVar.f104952m;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(uri, "uri");
        us1.a aVar = kVar.f115075a;
        Activity context = aVar.getContext();
        String uri2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
        ((lu1.c) kVar.f115076b).u(uri2, context);
        aVar.g();
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        List<String> pathSegments = uri.getPathSegments();
        return pathSegments != null && pathSegments.size() > 0 && Intrinsics.d(pathSegments.get(0), "age-appeal");
    }
}
