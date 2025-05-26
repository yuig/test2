package a21;

import ck2.i;
import ek2.j;
import kh2.b0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import m60.w;
import nx.d0;
import nx.d1;
import uj2.q;
import x02.a2;
import x02.i2;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final i2 f468a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f469b;

    /* renamed from: c, reason: collision with root package name */
    public final d1 f470c;

    /* renamed from: d, reason: collision with root package name */
    public final w f471d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f472e;

    public c(i2 pinRepository, d0 pinalytics, d1 trackingParamAttacher, w eventManager, boolean z13) {
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f468a = pinRepository;
        this.f469b = pinalytics;
        this.f470c = trackingParamAttacher;
        this.f471d = eventManager;
        this.f472e = z13;
    }

    public final j a(v32.c selectedReaction, String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(selectedReaction, "selectedReaction");
        j0 j0Var = new j0();
        i2 i2Var = this.f468a;
        q P = i2Var.P(uid);
        i11.c cVar = new i11.c(28, new y11.c(1, j0Var, this));
        i11.c cVar2 = new i11.c(29, b.f464j);
        ck2.c cVar3 = i.f27923c;
        a2 a2Var = i.f27924d;
        P.F(cVar, cVar2, cVar3, a2Var);
        xj2.c F = b0.c2(i2Var, uid, selectedReaction, (String) j0Var.f80434a, false).F(new a(0, b.f465k), new a(1, b.f466l), cVar3, a2Var);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        return (j) F;
    }
}
