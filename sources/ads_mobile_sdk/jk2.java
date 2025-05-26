package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class jk2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f6861a;

    public jk2(ta1 ta1Var) {
        this.f6861a = ta1Var;
    }

    @Override // a.v7
    public final Object get() {
        sa1 memorySignalSource = (sa1) this.f6861a.get();
        Intrinsics.checkNotNullParameter(memorySignalSource, "memorySignalSource");
        ci2 ci2Var = ci2.f3929b;
        jh2 jh2Var = jh2.f6819b;
        gj2 gj2Var = gj2.f5594a;
        return new yo1(memorySignalSource, ci2Var, jh2Var, yk2.f14301b.f14306a);
    }
}
