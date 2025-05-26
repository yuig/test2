package ek1;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;
import so.fa;

/* loaded from: classes2.dex */
public final class j implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final a11.d f59257a;

    /* renamed from: b, reason: collision with root package name */
    public final nx.f0 f59258b;

    /* renamed from: c, reason: collision with root package name */
    public final fa f59259c;

    /* renamed from: d, reason: collision with root package name */
    public final es.h f59260d;

    /* renamed from: e, reason: collision with root package name */
    public final es.a f59261e;

    public j(a11.d clickThroughHelperFactory, nx.f0 pinalyticsFactory, fa adEventHandlerFactory, es.h adsCommonDisplay, es.a adFormats) {
        Intrinsics.checkNotNullParameter(clickThroughHelperFactory, "clickThroughHelperFactory");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(adEventHandlerFactory, "adEventHandlerFactory");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        this.f59257a = clickThroughHelperFactory;
        this.f59258b = pinalyticsFactory;
        this.f59259c = adEventHandlerFactory;
        this.f59260d = adsCommonDisplay;
        this.f59261e = adFormats;
    }

    @Override // l82.g
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void e(ao2.j0 scope, bk1.v0 request, u50.r eventIntake) {
        boolean z13;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        boolean z14 = request instanceof bk1.u0;
        a11.d dVar = this.f59257a;
        nx.f0 f0Var = this.f59258b;
        if (!z14) {
            if (request instanceof bk1.t0) {
                bk1.t0 t0Var = (bk1.t0) request;
                nx.j0 a13 = ((nx.m) f0Var).a(new i(t0Var.j(), t0Var.s()));
                this.f59259c.a(dVar.a(a13)).a(t0Var.p(), a13, t0Var.m(), t0Var.q(), t0Var.getAuxData(), com.bumptech.glide.c.D(t0Var.p()), t0Var.t(), t0Var.k(), t0Var.n(), t0Var.r(), t0Var.r(), t0Var.r(), t0Var.u(), t0Var.v(), t0Var.l(), t0Var.o());
                return;
            } else {
                if (request instanceof bk1.s0) {
                    bk1.s0 s0Var = (bk1.s0) request;
                    a11.e.b(dVar.a(((nx.m) f0Var).a(new i(s0Var.j(), s0Var.l()))), s0Var.k(), s0Var.m(), true, -1, null, null, null, null, null, 496);
                    return;
                }
                return;
            }
        }
        bk1.u0 u0Var = (bk1.u0) request;
        a11.n a14 = dVar.a(((nx.m) f0Var).a(new i(u0Var.j(), u0Var.q())));
        String n13 = u0Var.n();
        if (u0Var.s()) {
            f30 o13 = u0Var.o();
            ps0.y yVar = ro1.c.f108967f;
            ro1.b e13 = ps0.y.e(n13);
            boolean z15 = e13 == ro1.b.BOARD || e13 == ro1.b.PROFILE;
            if (o13.d5().booleanValue() && z15) {
                int i13 = h.f59237a[yVar.f(n13, o13, this.f59260d, this.f59261e).ordinal()];
                if (!(i13 == 1 || i13 == 2 || i13 == 3)) {
                    z13 = true;
                    a11.e.c(a14, u0Var.n(), u0Var.o(), (u0Var.r() || z13) ? false : true, 0, 0, u0Var.m(), false, u0Var.l(), u0Var.k(), u0Var.getAuxData(), null, false, false, null, u0Var.t(), u0Var.p(), false, 80984);
                }
            }
        }
        z13 = false;
        if (u0Var.r()) {
        }
        a11.e.c(a14, u0Var.n(), u0Var.o(), (u0Var.r() || z13) ? false : true, 0, 0, u0Var.m(), false, u0Var.l(), u0Var.k(), u0Var.getAuxData(), null, false, false, null, u0Var.t(), u0Var.p(), false, 80984);
    }
}
