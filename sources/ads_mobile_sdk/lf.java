package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class lf implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f7790a;

    public lf(a.o8 o8Var) {
        this.f7790a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        wp listener = (wp) this.f7790a.get();
        Intrinsics.checkNotNullParameter(listener, "listener");
        kh2.a1.p(listener);
        return listener;
    }
}
