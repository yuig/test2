package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class bi2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f2888a;

    public bi2(zh2 zh2Var) {
        this.f2888a = zh2Var;
    }

    @Override // a.v7
    public final Object get() {
        yh2 signalGenerationResponseKeySignalSource = (yh2) this.f2888a.get();
        Intrinsics.checkNotNullParameter(signalGenerationResponseKeySignalSource, "signalGenerationResponseKeySignalSource");
        ci2 ci2Var = ci2.f3928a;
        jh2 jh2Var = jh2.f6819b;
        gj2 gj2Var = gj2.f5594a;
        return new yo1(signalGenerationResponseKeySignalSource, ci2Var, jh2Var, yk2.f14302c.f14306a);
    }
}
