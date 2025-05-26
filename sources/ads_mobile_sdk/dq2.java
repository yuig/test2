package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class dq2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f4409a;

    public dq2(a.o8 o8Var) {
        this.f4409a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        ar2 listener = (ar2) this.f4409a.get();
        Intrinsics.checkNotNullParameter(listener, "listener");
        kh2.a1.p(listener);
        return listener;
    }
}
