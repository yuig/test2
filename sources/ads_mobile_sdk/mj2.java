package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class mj2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f8258a;

    public mj2(a.o8 o8Var) {
        this.f8258a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        ne appPermissionsSignalSource = (ne) this.f8258a.get();
        Intrinsics.checkNotNullParameter(appPermissionsSignalSource, "appPermissionsSignalSource");
        ci2 ci2Var = ci2.f3928a;
        jh2 jh2Var = jh2.f6819b;
        gj2 gj2Var = gj2.f5594a;
        return new yo1(appPermissionsSignalSource, ci2Var, jh2Var, yk2.f14301b.f14306a);
    }
}
