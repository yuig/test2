package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class vj2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f12544a;

    public vj2(a.o8 o8Var) {
        this.f12544a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        i7 adapterVersionsSignalSource = (i7) this.f12544a.get();
        Intrinsics.checkNotNullParameter(adapterVersionsSignalSource, "adapterVersionsSignalSource");
        ci2 ci2Var = ci2.f3929b;
        jh2 jh2Var = jh2.f6819b;
        gj2 gj2Var = gj2.f5594a;
        return new yo1(adapterVersionsSignalSource, ci2Var, jh2Var, yk2.f14301b.f14306a);
    }
}
