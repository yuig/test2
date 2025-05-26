package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class dk2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f4323a;

    public dk2(a.o8 o8Var) {
        this.f4323a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        b70 debugSignalSource = (b70) this.f4323a.get();
        Intrinsics.checkNotNullParameter(debugSignalSource, "debugSignalSource");
        ci2 ci2Var = ci2.f3929b;
        jh2 jh2Var = jh2.f6818a;
        gj2 gj2Var = gj2.f5594a;
        return new yo1(debugSignalSource, ci2Var, jh2Var, yk2.f14301b.f14306a);
    }
}
