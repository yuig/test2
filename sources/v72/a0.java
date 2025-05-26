package v72;

import android.app.Application;
import ao2.j0;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import ni1.n2;
import ni1.y2;
import nx.b0;
import so.ab;
import so.da;
import so.oa;
import so.w8;
import so.ya;
import x02.b1;
import xs0.f0;

/* loaded from: classes4.dex */
public final class a0 implements wt1.d, l82.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f124398a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final l82.y f124399b;

    /* renamed from: c, reason: collision with root package name */
    public final l82.g f124400c;

    public a0(Application application, ya sbaPinCollageGridCellSEPFactory, es.h adsCommonDisplay, es.a adFormats, fs.c adsSalesDealsDisplay, jv.a adsPostClickHelper, b0 pinAuxHelper, ur.a adsDependencies, j0 scope, zw.a pinActionHandlerSEP) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(sbaPinCollageGridCellSEPFactory, "sbaPinCollageGridCellSEPFactory");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(adsSalesDealsDisplay, "adsSalesDealsDisplay");
        Intrinsics.checkNotNullParameter(adsPostClickHelper, "adsPostClickHelper");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(adsDependencies, "adsDependencies");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pinActionHandlerSEP, "pinActionHandlerSEP");
        sbaPinCollageGridCellSEPFactory.getClass();
        w8 w8Var = sbaPinCollageGridCellSEPFactory.f114732a;
        c72.b0 b0Var = (c72.b0) w8Var.f114689b.f113846od.get();
        oa oaVar = w8Var.f114689b;
        this.f124400c = new w72.e(pinActionHandlerSEP, b0Var, (b1) oaVar.Xf.get(), (a) oaVar.f113619bg.get(), (da) oaVar.f113914sc.get());
        l82.a0 a0Var = new l82.a0(scope);
        f0 stateTransformer = new f0(new n2(adsCommonDisplay, adFormats, adsSalesDealsDisplay, adsPostClickHelper, pinAuxHelper, adsDependencies), 2);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f124399b = l82.a0.b(a0Var, new z("", null, false, false, new y2(null, 0, null, null, null, null, null, false, false, false, false, false, false, 0.0f, 0L, 0, null, null, null, 0, null, 0, 0, null, null, null, false, null, false, null, -1, 4194303)), new s12.a(this, 22), 2);
    }

    @Override // l82.i
    public final do2.i a() {
        int i13 = this.f124398a;
        l82.y yVar = this.f124399b;
        switch (i13) {
        }
        return yVar.d();
    }

    @Override // wt1.d
    public final u50.o b(i0 i0Var, boolean z13) {
        int i13 = this.f124398a;
        l82.y yVar = this.f124399b;
        switch (i13) {
            case 0:
                z startState = (z) i0Var;
                Intrinsics.checkNotNullParameter(startState, "startState");
                return (i) yVar.j(startState, z13);
            default:
                wc2.q startState2 = (wc2.q) i0Var;
                Intrinsics.checkNotNullParameter(startState2, "startState");
                return (wc2.f) yVar.j(startState2, z13);
        }
    }

    @Override // l82.i
    public final u50.r c() {
        int i13 = this.f124398a;
        l82.y yVar = this.f124399b;
        switch (i13) {
        }
        return yVar.e();
    }

    public a0(Application application, ab webviewPinSEPFactory, es.h adsCommonDisplay, es.a adFormats, fs.c adsSalesDealsDisplay, jv.a adsPostClickHelper, b0 pinAuxHelper, ur.a adsDependencies, j0 scope, zw.a pinActionHandlerSEP) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(webviewPinSEPFactory, "webviewPinSEPFactory");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(adsSalesDealsDisplay, "adsSalesDealsDisplay");
        Intrinsics.checkNotNullParameter(adsPostClickHelper, "adsPostClickHelper");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(adsDependencies, "adsDependencies");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pinActionHandlerSEP, "pinActionHandlerSEP");
        this.f124400c = new mb0.a(pinActionHandlerSEP, (da) webviewPinSEPFactory.f113337a.f114689b.f113914sc.get());
        l82.a0 a0Var = new l82.a0(scope);
        f0 stateTransformer = new f0(new n2(adsCommonDisplay, adFormats, adsSalesDealsDisplay, adsPostClickHelper, pinAuxHelper, adsDependencies), 3);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f124399b = l82.a0.b(a0Var, new wc2.q(null, 0, new y2(null, 0, null, null, null, null, null, false, false, false, false, false, false, 0.0f, 0L, 0, null, null, null, 0, null, 0, 0, null, null, null, false, null, false, null, -1, 4194303)), new ha2.j(this, 23), 2);
    }
}
