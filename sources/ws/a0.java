package ws;

import android.app.Application;
import ao2.j0;
import h32.a4;
import h32.d4;
import h32.i0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import mu.g0;
import so.ob;
import xs.d0;
import xs.e0;
import xs.f0;
import zy.l0;

/* loaded from: classes3.dex */
public final class a0 extends l82.b implements l82.i {

    /* renamed from: m, reason: collision with root package name */
    public static final zq.a f131037m = new zq.a(10, 0);

    /* renamed from: c, reason: collision with root package name */
    public final q f131038c;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f131039d;

    /* renamed from: e, reason: collision with root package name */
    public final nu.b f131040e;

    /* renamed from: f, reason: collision with root package name */
    public final f0 f131041f;

    /* renamed from: g, reason: collision with root package name */
    public final ob f131042g;

    /* renamed from: h, reason: collision with root package name */
    public final es.a f131043h;

    /* renamed from: i, reason: collision with root package name */
    public final nx.b0 f131044i;

    /* renamed from: j, reason: collision with root package name */
    public final ur.a f131045j;

    /* renamed from: k, reason: collision with root package name */
    public final es.h f131046k;

    /* renamed from: l, reason: collision with root package name */
    public final l82.y f131047l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(j0 scope, Application application, q cartingSEP, d0 cartingBottomSheetSEP, nu.b adsCoreSEP, f0 cartingBottomSheetStateTransformer, ob perfLoggerSEPFactory, es.a adFormats, nx.b0 pinAuxHelper, ur.a adsDependencies, es.h adsCommonDisplay, x cartingStateEngineBuilder) {
        super(scope);
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(cartingSEP, "cartingSEP");
        Intrinsics.checkNotNullParameter(cartingBottomSheetSEP, "cartingBottomSheetSEP");
        Intrinsics.checkNotNullParameter(adsCoreSEP, "adsCoreSEP");
        Intrinsics.checkNotNullParameter(cartingBottomSheetStateTransformer, "cartingBottomSheetStateTransformer");
        Intrinsics.checkNotNullParameter(perfLoggerSEPFactory, "perfLoggerSEPFactory");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(adsDependencies, "adsDependencies");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        Intrinsics.checkNotNullParameter(cartingStateEngineBuilder, "cartingStateEngineBuilder");
        this.f131038c = cartingSEP;
        this.f131039d = cartingBottomSheetSEP;
        this.f131040e = adsCoreSEP;
        this.f131041f = cartingBottomSheetStateTransformer;
        this.f131042g = perfLoggerSEPFactory;
        this.f131043h = adFormats;
        this.f131044i = pinAuxHelper;
        this.f131045j = adsDependencies;
        this.f131046k = adsCommonDisplay;
        hs.a buildEngine = new hs.a(4, this, application);
        cartingStateEngineBuilder.getClass();
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(buildEngine, "buildEngine");
        l82.a0 a0Var = new l82.a0(scope);
        buildEngine.invoke(a0Var);
        this.f131047l = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f131047l.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f131047l.e();
    }

    public final void h(String pinId, int i13, boolean z13) {
        i0 i0Var;
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        g0 g0Var = new g0(pinId, mu.i0.NETWORK_IF_NOT_CACHED);
        d4 d4Var = d4.ONE_TAP_V3_BROWSER;
        a4 a4Var = a4.BROWSER;
        pu.x xVar = new pu.x(new mu.x(g0Var, new l0(new i0(d4Var, a4Var, null, h32.g0.BROWSER, null, null), 2), z13, i13, 46), null, 14);
        switch (f131037m.f142631a) {
            case 10:
                i0Var = new i0(null, null, null, null, null, null);
                break;
            default:
                i0Var = new i0(d4Var, a4Var, null, null, null, null);
                break;
        }
        l82.y.i(this.f131047l, new z(xVar, new xs.g0(pinId, 0L, e0.CARTING_INITIAL, 0L, false, new HashMap(), new l0(i0Var, 2))), false, new tq.a0(this, 18), 2);
    }
}
