package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class o01 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f9087a;

    public o01(a.o8 o8Var) {
        this.f9087a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        g00 listener = (g00) this.f9087a.get();
        Intrinsics.checkNotNullParameter(listener, "listener");
        kh2.a1.p(listener);
        return listener;
    }
}
