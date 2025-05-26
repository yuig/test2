package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class sj2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f11120a;

    public sj2(u4 u4Var) {
        this.f11120a = u4Var;
    }

    @Override // a.v7
    public final Object get() {
        t4 adSizeSignalSource = (t4) this.f11120a.get();
        Intrinsics.checkNotNullParameter(adSizeSignalSource, "adSizeSignalSource");
        ci2 ci2Var = ci2.f3928a;
        jh2 jh2Var = jh2.f6818a;
        gj2 gj2Var = gj2.f5594a;
        return new yo1(adSizeSignalSource, ci2Var, jh2Var, yk2.f14301b.f14306a);
    }
}
