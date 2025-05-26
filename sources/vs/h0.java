package vs;

import android.app.Application;
import ao2.j0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h0 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final z f126486c;

    /* renamed from: d, reason: collision with root package name */
    public final l82.y f126487d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(j0 scope, Application application, z adsDebuggerSEP, es.a adFormats, es.h adsCommonDisplay) {
        super(scope);
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(adsDebuggerSEP, "adsDebuggerSEP");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        this.f126486c = adsDebuggerSEP;
        l82.a0 a0Var = new l82.a0(scope);
        f0 stateTransformer = new f0(adFormats, adsCommonDisplay);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f126487d = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f126487d.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f126487d.e();
    }

    public final void h(String pinId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        l82.y.i(this.f126487d, new g0(pinId), false, new tq.a0(this, 17), 2);
    }
}
