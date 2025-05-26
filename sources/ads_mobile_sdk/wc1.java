package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class wc1 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f12984a;

    public wc1(a.o8 o8Var) {
        this.f12984a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        rb1 mraidAdEventListener = (rb1) this.f12984a.get();
        Intrinsics.checkNotNullParameter(mraidAdEventListener, "mraidAdEventListener");
        kh2.a1.p(mraidAdEventListener);
        return mraidAdEventListener;
    }
}
