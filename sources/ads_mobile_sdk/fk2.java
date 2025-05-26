package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class fk2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f5191a;

    public fk2(a.o8 o8Var) {
        this.f5191a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        gc0 experimentIdsSignalSource = (gc0) this.f5191a.get();
        Intrinsics.checkNotNullParameter(experimentIdsSignalSource, "experimentIdsSignalSource");
        ci2 ci2Var = ci2.f3928a;
        jh2 jh2Var = jh2.f6818a;
        gj2 gj2Var = gj2.f5594a;
        return new yo1(experimentIdsSignalSource, ci2Var, jh2Var, yk2.f14301b.f14306a);
    }
}
