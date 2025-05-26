package ads_mobile_sdk;

import android.content.Context;
import ao2.j0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class z60 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f14656a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f14657b;

    /* renamed from: c, reason: collision with root package name */
    public final a.o8 f14658c;

    /* renamed from: d, reason: collision with root package name */
    public final a.o8 f14659d;

    /* renamed from: e, reason: collision with root package name */
    public final a.o8 f14660e;

    /* renamed from: f, reason: collision with root package name */
    public final a.o8 f14661f;

    /* renamed from: g, reason: collision with root package name */
    public final a.o8 f14662g;

    public z60(xv0 xv0Var, a.o8 o8Var, a.o8 o8Var2, a.o8 o8Var3, a.o8 o8Var4, xv0 xv0Var2, a.o8 o8Var5) {
        this.f14656a = xv0Var;
        this.f14657b = o8Var;
        this.f14658c = o8Var2;
        this.f14659d = o8Var3;
        this.f14660e = o8Var4;
        this.f14661f = xv0Var2;
        this.f14662g = o8Var5;
    }

    @Override // a.v7
    public final Object get() {
        Context context = (Context) this.f14656a.get();
        j0 backgroundScope = (j0) this.f14657b.get();
        t60 debugDialogManager = (t60) this.f14658c.get();
        oh0 flags = (oh0) this.f14659d.get();
        wi.k baseRequest = (wi.k) this.f14660e.get();
        r0 adConfiguration = (r0) this.f14661f.get();
        ss2 traceMetaSet = (ss2) this.f14662g.get();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(debugDialogManager, "debugDialogManager");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        return new y60(context, backgroundScope, debugDialogManager, flags, baseRequest.l(), adConfiguration.f10400z, adConfiguration.A, traceMetaSet);
    }
}
