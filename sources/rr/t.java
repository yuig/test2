package rr;

import android.net.Uri;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t extends d0 {

    /* renamed from: g, reason: collision with root package name */
    public final m60.f0 f109858g;

    static {
        new com.google.android.gms.common.api.d(29, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(qr.h webhookDeeplinkUtil, m60.f0 devUtils) {
        super(webhookDeeplinkUtil);
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        Intrinsics.checkNotNullParameter(devUtils, "devUtils");
        this.f109858g = devUtils;
    }

    @Override // rr.d0
    public final String a() {
        return "browser_fallback";
    }

    @Override // rr.d0
    public final boolean b() {
        return false;
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        List<String> pathSegments;
        Intrinsics.checkNotNullParameter(uri, "uri");
        String y03 = df.j1.y0(uri.getQueryParameter("address_url"));
        this.f109858g.N(y03, "Invalid address_url param", new Object[0]);
        if (y03 != null) {
            Uri parse = Uri.parse(y03);
            boolean L = CollectionsKt.L(ie0.a.f72200e, parse.getHost());
            qr.h hVar = this.f109723a;
            if (L && (pathSegments = parse.getPathSegments()) != null && pathSegments.isEmpty()) {
                hVar.l(null);
            } else {
                hVar.g(y03, false, true);
            }
        }
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String queryParameter = uri.getQueryParameter("address_url");
        return Intrinsics.d(uri.getScheme(), "pinterest") && Intrinsics.d(uri.getHost(), "browser") && queryParameter != null && df.j1.y0(queryParameter) != null;
    }
}
