package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class tk2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f11573a;

    public tk2(a.o8 o8Var) {
        this.f11573a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        eg2 sharedPreferenceSignalSource = (eg2) this.f11573a.get();
        Intrinsics.checkNotNullParameter(sharedPreferenceSignalSource, "sharedPreferenceSignalSource");
        ci2 ci2Var = ci2.f3928a;
        jh2 jh2Var = jh2.f6819b;
        gj2 gj2Var = gj2.f5594a;
        return new yo1(sharedPreferenceSignalSource, ci2Var, jh2Var, yk2.f14301b.f14306a);
    }
}
