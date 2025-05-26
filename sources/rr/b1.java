package rr;

import android.net.Uri;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b1 extends d0 {

    /* renamed from: g, reason: collision with root package name */
    public final nx.d0 f109709g;

    /* renamed from: h, reason: collision with root package name */
    public String f109710h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(qr.h webhookDeeplinkUtil, nx.d0 pinalytics) {
        super(webhookDeeplinkUtil);
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f109709g = pinalytics;
    }

    @Override // rr.d0
    public final String a() {
        return this.f109710h;
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f109710h = "idea-pin-builder";
        qr.h hVar = this.f109723a;
        el.a.l2(this.f109709g, hVar.f104940a.getContext(), ou1.e.DEEPLINK);
        hVar.q();
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        List j13 = kotlin.collections.f0.j("pin-builder", "story-pin-builder", "idea-pin-builder", "pin-creation-tool");
        if (Intrinsics.d(uri.getScheme(), "pinterest")) {
            return CollectionsKt.L(j13, uri.getHost());
        }
        Intrinsics.checkNotNullExpressionValue(uri.getPathSegments(), "getPathSegments(...)");
        if (!r1.isEmpty()) {
            List<String> pathSegments = uri.getPathSegments();
            Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
            if (j13.contains(d7.b.F(pathSegments))) {
                return true;
            }
        }
        return false;
    }
}
