package uu;

import android.app.Application;
import ao2.j0;
import h32.a4;
import h32.d4;
import h32.i0;
import kotlin.jvm.internal.Intrinsics;
import l82.a0;
import l82.y;
import mu.g0;
import mu.w;
import nx.b0;
import pu.x;
import tu.c0;
import u50.r;
import xs.f0;
import zy.l0;

/* loaded from: classes3.dex */
public final class k extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final nu.b f123126c;

    /* renamed from: d, reason: collision with root package name */
    public final y f123127d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Application application, j0 scope, nu.b adsCoreSEM, es.a adFormats, b0 pinAuxHelper, ur.a adsDependencies, es.h adsCommonDisplay) {
        super(scope);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(adsCoreSEM, "adsCoreSEM");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(adsDependencies, "adsDependencies");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        this.f123126c = adsCoreSEM;
        a0 a0Var = new a0(scope);
        ou.k stateTransformer = new ou.k(new f0(new w(new lt.j(2), adFormats, pinAuxHelper, adsCommonDisplay, ((ur.b) adsDependencies).f123059b), new f0(adFormats, adsDependencies)), 1);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f123127d = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f123127d.d();
    }

    @Override // l82.i
    public final r c() {
        return this.f123127d.e();
    }

    public final void h(String pinId, int i13, boolean z13) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        int i14 = 12;
        y.i(this.f123127d, new l(new x(new mu.x(new g0(pinId), new l0(new i0(d4.ONE_TAP_V3_BROWSER, a4.BROWSER, null, h32.g0.BROWSER, null, null), 2), z13, i13, 46), new c0(), i14)), false, new wt.c(this, i14), 2);
    }
}
