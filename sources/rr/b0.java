package rr;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b0 extends d0 {

    /* renamed from: g, reason: collision with root package name */
    public final wk2.a f109705g;

    /* renamed from: h, reason: collision with root package name */
    public final nx.d0 f109706h;

    /* renamed from: i, reason: collision with root package name */
    public final i92.k f109707i;

    /* renamed from: j, reason: collision with root package name */
    public final xk2.v f109708j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(qr.h webhookDeeplinkUtil, wk2.a ideaPinWorkUtilsProvider, nx.d0 pinalytics, i92.k toastUtils) {
        super(webhookDeeplinkUtil);
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        Intrinsics.checkNotNullParameter(ideaPinWorkUtilsProvider, "ideaPinWorkUtilsProvider");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        this.f109705g = ideaPinWorkUtilsProvider;
        this.f109706h = pinalytics;
        this.f109707i = toastUtils;
        this.f109708j = xk2.m.b(a0.f109697j);
    }

    public static final String g(b0 b0Var, int i13) {
        String string = b0Var.f109723a.f104940a.getContext().getString(i13);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // rr.d0
    public final String a() {
        return "creator-onboarding-landing";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        ((bw0.b) this.f109705g.get()).a().l(wj2.c.a()).o(new ir.h(27, new ba.s(27, this, uri)), new ir.h(28, new tq.a0(this, 9)));
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return Intrinsics.d(uri.getScheme(), "pinterest") ? Intrinsics.d(uri.getHost(), "creator-onboarding-landing") : !uri.getPathSegments().isEmpty() && n60.o.x(uri, 0, "creator-onboarding-landing");
    }
}
