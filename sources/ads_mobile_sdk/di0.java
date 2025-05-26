package ads_mobile_sdk;

import android.content.Context;
import ao2.j0;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class di0 extends wi0 {
    public final h92 C;
    public final a.e4 D;
    public ln0 E;
    public final xk2.k F;
    public final boolean G;
    public int H;
    public final boolean I;

    /* renamed from: J, reason: collision with root package name */
    public final boolean f4287J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di0(Context applicationContext, j0 uiScope, CoroutineContext uiContext, j0 backgroundScope, oh0 flags, a.j3 traceLogger, String afmaVersion, h92 requestType, r0 adConfiguration, a.e4 omidMonitor, cm0 gmaUtil) {
        super(applicationContext, uiScope, uiContext, backgroundScope, flags, traceLogger, afmaVersion, gmaUtil);
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(afmaVersion, "afmaVersion");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(omidMonitor, "omidMonitor");
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        this.C = requestType;
        this.D = omidMonitor;
        this.F = xk2.m.b(new ai0(this));
        this.G = adConfiguration.D;
        this.H = adConfiguration.f10354J;
        this.I = adConfiguration.M;
        this.f4287J = adConfiguration.K;
    }

    @Override // a.d3
    public final Object a(boolean z13, j70 j70Var) {
        Object a13 = a(z13, (bl2.c) j70Var);
        return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : Unit.f80348a;
    }

    @Override // ads_mobile_sdk.wi0
    public final boolean d() {
        return this.f4287J;
    }

    @Override // ads_mobile_sdk.wi0
    public final boolean f() {
        return this.I;
    }

    @Override // ads_mobile_sdk.wi0
    public final ym0 h() {
        return (ym0) this.F.getValue();
    }

    @Override // ads_mobile_sdk.wi0
    public final int i() {
        return this.H;
    }

    public final void a(ln0 ln0Var) {
        Intrinsics.checkNotNullParameter(ln0Var, "<set-?>");
        this.E = ln0Var;
    }

    @Override // ads_mobile_sdk.wi0
    public final void a(int i13) {
        this.H = i13;
    }
}
