package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ak2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f2434a;

    public ak2(a.o8 o8Var) {
        this.f2434a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        lj batterySignalSource = (lj) this.f2434a.get();
        Intrinsics.checkNotNullParameter(batterySignalSource, "batterySignalSource");
        ci2 ci2Var = ci2.f3928a;
        jh2 jh2Var = jh2.f6818a;
        gj2 gj2Var = gj2.f5594a;
        return new ul(batterySignalSource, yk2.f14301b.f14306a);
    }
}
