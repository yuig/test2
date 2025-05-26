package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class gk2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f5605a;

    public gk2(a.o8 o8Var) {
        this.f5605a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        qd0 firebaseAnalyticsSignalSource = (qd0) this.f5605a.get();
        Intrinsics.checkNotNullParameter(firebaseAnalyticsSignalSource, "firebaseAnalyticsSignalSource");
        ci2 ci2Var = ci2.f3929b;
        jh2 jh2Var = jh2.f6819b;
        gj2 gj2Var = gj2.f5594a;
        return new yo1(firebaseAnalyticsSignalSource, ci2Var, jh2Var, yk2.f14302c.f14306a);
    }
}
