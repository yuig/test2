package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class qj2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f10113a;

    public qj2(a.o8 o8Var) {
        this.f10113a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        j3 adRequestSignalSource = (j3) this.f10113a.get();
        Intrinsics.checkNotNullParameter(adRequestSignalSource, "adRequestSignalSource");
        ci2 ci2Var = ci2.f3928a;
        jh2 jh2Var = jh2.f6818a;
        gj2 gj2Var = gj2.f5594a;
        return new yo1(adRequestSignalSource, ci2Var, jh2Var, yk2.f14301b.f14306a);
    }
}
