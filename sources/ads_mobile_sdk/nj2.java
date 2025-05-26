package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class nj2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f8835a;

    public nj2(a.o8 o8Var) {
        this.f8835a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        fo2 telephonySignalSource = (fo2) this.f8835a.get();
        Intrinsics.checkNotNullParameter(telephonySignalSource, "telephonySignalSource");
        ci2 ci2Var = ci2.f3929b;
        jh2 jh2Var = jh2.f6819b;
        gj2 gj2Var = gj2.f5594a;
        return new yo1(telephonySignalSource, ci2Var, jh2Var, yk2.f14301b.f14306a);
    }
}
