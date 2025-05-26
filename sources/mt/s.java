package mt;

import android.app.Application;
import ao2.j0;
import h32.a4;
import h32.d4;
import h32.i0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import l82.a0;
import mu.g0;
import nt.q0;
import nt.w0;
import nt.x0;
import nx.b0;
import so.ob;
import xs.f0;
import zy.l0;

/* loaded from: classes3.dex */
public final class s extends l82.b implements l82.i {

    /* renamed from: h, reason: collision with root package name */
    public static final zq.a f88124h = new zq.a(14, 0);

    /* renamed from: c, reason: collision with root package name */
    public final ws.q f88125c;

    /* renamed from: d, reason: collision with root package name */
    public final q0 f88126d;

    /* renamed from: e, reason: collision with root package name */
    public final nu.b f88127e;

    /* renamed from: f, reason: collision with root package name */
    public final ob f88128f;

    /* renamed from: g, reason: collision with root package name */
    public final l82.y f88129g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(j0 scope, Application application, ws.q leadGenSEP, q0 leadGenBottomSheetSEP, nu.b adsCoreSEP, w0 leadGenBottomSheetStateTransformer, ob perfLoggerSEPFactory, es.a adFormats, b0 pinAuxHelper, ur.a adsDependencies, es.h adsCommonDisplay) {
        super(scope);
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(leadGenSEP, "leadGenSEP");
        Intrinsics.checkNotNullParameter(leadGenBottomSheetSEP, "leadGenBottomSheetSEP");
        Intrinsics.checkNotNullParameter(adsCoreSEP, "adsCoreSEP");
        Intrinsics.checkNotNullParameter(leadGenBottomSheetStateTransformer, "leadGenBottomSheetStateTransformer");
        Intrinsics.checkNotNullParameter(perfLoggerSEPFactory, "perfLoggerSEPFactory");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(adsDependencies, "adsDependencies");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        this.f88125c = leadGenSEP;
        this.f88126d = leadGenBottomSheetSEP;
        this.f88127e = adsCoreSEP;
        this.f88128f = perfLoggerSEPFactory;
        a0 a0Var = new a0(scope);
        q stateTransformer = new q(new f0(new mu.w(new lt.j(2), adFormats, pinAuxHelper, adsCommonDisplay, ((ur.b) adsDependencies).f123059b), new f0(adFormats, adsDependencies)), leadGenBottomSheetStateTransformer);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f88129g = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f88129g.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f88129g.e();
    }

    public final void h(String pinId, int i13, boolean z13) {
        i0 i0Var;
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        g0 g0Var = new g0(pinId);
        d4 d4Var = d4.ONE_TAP_V3_BROWSER;
        a4 a4Var = a4.BROWSER;
        pu.x xVar = new pu.x(new mu.x(g0Var, new l0(new i0(d4Var, a4Var, null, h32.g0.BROWSER, null, null), 2), z13, i13, 46), null, 14);
        switch (f88124h.f142631a) {
            case 10:
                i0Var = new i0(null, null, null, null, null, null);
                break;
            default:
                i0Var = new i0(d4Var, a4Var, null, null, null, null);
                break;
        }
        l82.y.i(this.f88129g, new r(xVar, new x0(pinId, 0L, nt.a.SIGN_UP_INVISIBLE, 0L, false, new HashMap(), new l0(i0Var, 2), false)), false, new tq.a0(this, 19), 2);
    }
}
