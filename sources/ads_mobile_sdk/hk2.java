package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class hk2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f6006a;

    public hk2(a.o8 o8Var) {
        this.f6006a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        kr0 sdkCoreDataSignalSource = (kr0) this.f6006a.get();
        Intrinsics.checkNotNullParameter(sdkCoreDataSignalSource, "sdkCoreDataSignalSource");
        ci2 ci2Var = ci2.f3929b;
        jh2 jh2Var = jh2.f6819b;
        gj2 gj2Var = gj2.f5594a;
        return new yo1(sdkCoreDataSignalSource, ci2Var, jh2Var, yk2.f14301b.f14306a);
    }
}
