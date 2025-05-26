package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class wk2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f13106a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f13107b;

    public wk2(fu2 fu2Var, a.o8 o8Var) {
        this.f13106a = fu2Var;
        this.f13107b = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        eu2 trustlessTokenSignalSource = (eu2) this.f13106a.get();
        oh0 flags = (oh0) this.f13107b.get();
        Intrinsics.checkNotNullParameter(trustlessTokenSignalSource, "trustlessTokenSignalSource");
        Intrinsics.checkNotNullParameter(flags, "flags");
        ci2 ci2Var = ci2.f3929b;
        jh2 jh2Var = jh2.f6819b;
        gj2 gj2Var = gj2.f5594a;
        return new yo1(trustlessTokenSignalSource, ci2Var, jh2Var, yk2.f14301b.f14306a);
    }
}
