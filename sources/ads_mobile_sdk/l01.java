package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l01 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f7597a;

    public l01(a.o8 o8Var) {
        this.f7597a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        v5 listener = (v5) this.f7597a.get();
        Intrinsics.checkNotNullParameter(listener, "listener");
        kh2.a1.p(listener);
        return listener;
    }
}
