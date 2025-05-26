package rr;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import ey.h3;
import ey.j3;
import ey.k3;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;

/* loaded from: classes.dex */
public final class a1 extends d0 {

    /* renamed from: g, reason: collision with root package name */
    public final x10.b f109701g;

    /* renamed from: h, reason: collision with root package name */
    public final j10.g f109702h;

    /* renamed from: i, reason: collision with root package name */
    public final nx.d0 f109703i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(qr.h webhookDeeplinkUtil, x10.b pinApiService, j10.g mergeAndCacheHelper, nx.d0 pinalytics) {
        super(webhookDeeplinkUtil);
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        Intrinsics.checkNotNullParameter(pinApiService, "pinApiService");
        Intrinsics.checkNotNullParameter(mergeAndCacheHelper, "mergeAndCacheHelper");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f109701g = pinApiService;
        this.f109702h = mergeAndCacheHelper;
        this.f109703i = pinalytics;
    }

    @Override // rr.d0
    public final String a() {
        return "pin_activity";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String str = uri.getPathSegments().get(1);
        String queryParameter = uri.getQueryParameter("featured_did_it_ids");
        qr.h hVar = this.f109723a;
        if (!hVar.f104943d.e()) {
            sr.g gVar = hVar.f104949j;
            gVar.f115057b.a("unauth_pin_deeplink");
            Context context = kb0.a.f79058b;
            Intent i13 = ((lu1.c) gVar.f115058c).i(m60.f0.W());
            i13.putExtra("com.pinterest.EXTRA_PIN_ID", str);
            gVar.f115056a.startActivity(i13);
            hVar.q();
            return;
        }
        Intrinsics.f(str);
        int i14 = at1.d.f20439o;
        n60.s i15 = ((m60.m0) nl.b.e()).i();
        Intrinsics.g(i15, "null cannot be cast to non-null type com.pinterest.base.application.EarlyAppInitImpl");
        k3 k3Var = (k3) ((bf2.b) i15.j()).get();
        j3 j3Var = j3.f60510a;
        Intrinsics.f(k3Var);
        h3 f13 = j3.f(j3Var, k3Var, jy.h.f77707a, str, 8);
        Intrinsics.checkNotNullExpressionValue(new kk2.h(new kk2.g(this.f109701g.m(str, n00.b.a(n00.c.PIN_CLOSEUP), Util.B(f13.f60495b)).r(tk2.e.f118017c).l(wj2.c.a()), new n0(1, k.f109760p), 2), new xo.b(10), 0).o(new n0(2, new ba.s(29, this, queryParameter)), new n0(3, new tq.a0(this, 12))), "subscribe(...)");
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        List<String> pathSegments = uri.getPathSegments();
        return (pathSegments.size() == 4 && Intrinsics.d(pathSegments.get(0), "pin") && Intrinsics.d(pathSegments.get(2), "activity") && Intrinsics.d(pathSegments.get(3), "tried")) || (pathSegments.size() == 2 && Intrinsics.d(pathSegments.get(0), "pin_activity"));
    }
}
