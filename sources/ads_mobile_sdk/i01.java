package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i01 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f6160a;

    public i01(xv0 xv0Var) {
        this.f6160a = xv0Var;
    }

    @Override // a.v7
    public final Object get() {
        ws0 listener = (ws0) this.f6160a.get();
        Intrinsics.checkNotNullParameter(listener, "listener");
        kh2.a1.p(listener);
        return listener;
    }
}
