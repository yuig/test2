package rr;

import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x extends d0 {

    /* renamed from: g, reason: collision with root package name */
    public final m60.w f109868g;

    /* renamed from: h, reason: collision with root package name */
    public final nx.d0 f109869h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(qr.h webhookDeeplinkUtil, m60.w eventManager, nx.d0 pinalytics) {
        super(webhookDeeplinkUtil);
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f109868g = eventManager;
        this.f109869h = pinalytics;
    }

    public static boolean g(String str, List list) {
        if (list.isEmpty() && Intrinsics.d(str, "community-creation")) {
            return true;
        }
        return list.size() == 1 && Intrinsics.d(list.get(0), "community-creation");
    }

    @Override // rr.d0
    public final String a() {
        return "event_community_creation";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        List<String> pathSegments = uri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        if (g(uri.getHost(), pathSegments)) {
            this.f109868g.f(new jc0.v(new lp.k(this.f109869h), false, 0L, 30));
            this.f109723a.t(null);
        }
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        List<String> pathSegments = uri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        return g(uri.getHost(), pathSegments);
    }
}
