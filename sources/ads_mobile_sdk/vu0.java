package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class vu0 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f12659a;

    public vu0(a.o8 o8Var) {
        this.f12659a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        a.r1 backButtonGmsgHandler = (a.r1) this.f12659a.get();
        Intrinsics.checkNotNullParameter(backButtonGmsgHandler, "backButtonGmsgHandler");
        return new ou0(backButtonGmsgHandler);
    }
}
