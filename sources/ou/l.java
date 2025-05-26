package ou;

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
public final class l extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final nu.b f97697c;

    /* renamed from: d, reason: collision with root package name */
    public final y f97698d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Application application, j0 scope, nu.b adsCoreSEM, es.a adFormats, b0 pinAuxHelper, ur.a adsDependencies, es.h adsCommonDisplay) {
        super(scope);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(adsCoreSEM, "adsCoreSEM");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(adsDependencies, "adsDependencies");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        this.f97697c = adsCoreSEM;
        a0 a0Var = new a0(scope);
        k stateTransformer = new k(new f0(new w(new lt.j(2), adFormats, pinAuxHelper, adsCommonDisplay, ((ur.b) adsDependencies).f123059b), new f0(adFormats, adsDependencies)), 0);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f97698d = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f97698d.d();
    }

    @Override // l82.i
    public final r c() {
        return this.f97698d.e();
    }

    public final void h(String pinId, int i13, boolean z13) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        y.i(this.f97698d, new m(new x(new mu.x(new g0(pinId), new l0(new i0(d4.ONE_TAP_V3_BROWSER, a4.BROWSER, null, h32.g0.BROWSER, null, null), 2), z13, i13, 46), new c0(), 12)), false, new wt.c(this, 11), 2);
    }
}
