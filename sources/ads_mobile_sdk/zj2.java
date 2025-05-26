package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class zj2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f14804a;

    public zj2(a.o8 o8Var) {
        this.f14804a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        bh audioSignalSource = (bh) this.f14804a.get();
        Intrinsics.checkNotNullParameter(audioSignalSource, "audioSignalSource");
        ci2 ci2Var = ci2.f3928a;
        jh2 jh2Var = jh2.f6818a;
        gj2 gj2Var = gj2.f5594a;
        return new ul(audioSignalSource, yk2.f14303d.f14306a);
    }
}
