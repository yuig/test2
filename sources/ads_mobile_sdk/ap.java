package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ap implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f2462a;

    public ap(a.o8 o8Var) {
        this.f2462a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        qt2 listener = (qt2) this.f2462a.get();
        Intrinsics.checkNotNullParameter(listener, "listener");
        kh2.a1.p(listener);
        return listener;
    }
}
