package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class nk2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f8843a;

    public nk2(a.o8 o8Var) {
        this.f8843a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        hw1 perAppIdV2SignalSource = (hw1) this.f8843a.get();
        Intrinsics.checkNotNullParameter(perAppIdV2SignalSource, "perAppIdV2SignalSource");
        ci2 ci2Var = ci2.f3929b;
        jh2 jh2Var = jh2.f6819b;
        gj2 gj2Var = gj2.f5594a;
        return new yo1(perAppIdV2SignalSource, ci2Var, jh2Var, yk2.f14301b.f14306a);
    }
}
