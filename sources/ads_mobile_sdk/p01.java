package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class p01 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f9511a;

    public p01(a.o8 o8Var) {
        this.f9511a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        e70 listener = (e70) this.f9511a.get();
        Intrinsics.checkNotNullParameter(listener, "listener");
        kh2.a1.p(listener);
        return listener;
    }
}
