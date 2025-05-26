package bj;

import a.ad;
import a.bb;
import a.c1;
import a.hf;
import a.t4;
import ads_mobile_sdk.bk0;
import ads_mobile_sdk.f52;
import ads_mobile_sdk.h92;
import ads_mobile_sdk.jk0;
import ads_mobile_sdk.mz0;
import ads_mobile_sdk.n20;
import ads_mobile_sdk.r40;
import ads_mobile_sdk.s40;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k {
    public static void a(m adRequest, gw.b adLoadCallback) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adLoadCallback, "adLoadCallback");
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adLoadCallback, "adLoadCallback");
        ad a13 = hf.a(adRequest.f22907l, adRequest.f22908m, adRequest.f22915t, 1);
        if (a13 instanceof jk0) {
            adLoadCallback.a(new wi.r(wi.q.INVALID_REQUEST, bb.d((jk0) a13), null));
            return;
        }
        c1.f28a.getClass();
        xk2.k kVar = bk0.f3513c;
        ((mz0) ((n20) ((c1) kVar.getValue())).f8532g1.get()).a((Function1) new r(((t4) ((t4) ((t4) ((t4) ((t4) new s40(((n20) ((c1) kVar.getValue())).f8515c).a((wi.k) adRequest)).a((wi.h) adRequest)).a((n) adRequest).a(adRequest).a(h92.f5903i)).b(false)).a(false)).a(1).a().b(), adLoadCallback, null, 0));
    }

    public static void b(String adResponse, gw.b adLoadCallback) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adLoadCallback, "adLoadCallback");
        c1.f28a.getClass();
        xk2.k kVar = bk0.f3513c;
        ((mz0) ((n20) ((c1) kVar.getValue())).f8532g1.get()).a((Function1) new r((f52) new r40(((n20) ((c1) kVar.getValue())).f8515c, h92.f5903i, adResponse, Boolean.FALSE).f10500g.get(), adLoadCallback, null, 1));
    }
}
