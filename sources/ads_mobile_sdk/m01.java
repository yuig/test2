package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class m01 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f8037a;

    public m01(a.o8 o8Var) {
        this.f8037a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        in2 listener = (in2) this.f8037a.get();
        Intrinsics.checkNotNullParameter(listener, "listener");
        kh2.a1.p(listener);
        return listener;
    }
}
