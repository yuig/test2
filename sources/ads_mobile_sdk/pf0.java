package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class pf0 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f9662a;

    public pf0(a.o8 o8Var) {
        this.f9662a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        f80 listener = (f80) this.f9662a.get();
        Intrinsics.checkNotNullParameter(listener, "listener");
        kh2.a1.p(listener);
        return listener;
    }
}
