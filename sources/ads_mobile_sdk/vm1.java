package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class vm1 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f12566a;

    public vm1(oh1 oh1Var) {
        this.f12566a = oh1Var;
    }

    @Override // a.v7
    public final Object get() {
        nh1 nativeAdSignalSource = (nh1) this.f12566a.get();
        Intrinsics.checkNotNullParameter(nativeAdSignalSource, "nativeAdSignalSource");
        ci2 ci2Var = ci2.f3928a;
        jh2 jh2Var = jh2.f6819b;
        gj2 gj2Var = gj2.f5594a;
        return new yo1(nativeAdSignalSource, ci2Var, jh2Var, yk2.f14301b.f14306a);
    }
}
