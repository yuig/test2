package ek1;

import h32.a4;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final fv.d f59266a;

    /* renamed from: b, reason: collision with root package name */
    public final es.h f59267b;

    /* renamed from: c, reason: collision with root package name */
    public final es.a f59268c;

    public k(fv.d adIdeaPinStaticPlaytimeTracker, es.h adsCommonDisplay, es.a adFormats) {
        Intrinsics.checkNotNullParameter(adIdeaPinStaticPlaytimeTracker, "adIdeaPinStaticPlaytimeTracker");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        this.f59266a = adIdeaPinStaticPlaytimeTracker;
        this.f59267b = adsCommonDisplay;
        this.f59268c = adFormats;
    }

    @Override // l82.g
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void e(ao2.j0 scope, n0 request, u50.r eventIntake) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (!(request instanceof m0)) {
            throw new NoWhenBranchMatchedException();
        }
        m0 m0Var = (m0) request;
        if (m0Var.k() != null && m0Var.j() != null && m0Var.m()) {
            eventIntake.a(new e0(ro1.c.f108967f.i(m0Var.k(), this.f59267b, this.f59268c)));
        }
        if (m0Var.l() != a4.SEARCH_TAB) {
            ((fv.c) this.f59266a).g(m0Var.k(), m0Var.m(), m0Var.j());
        }
    }
}
