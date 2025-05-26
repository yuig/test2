package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class q31 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f9929a;

    public q31(a.o8 o8Var) {
        this.f9929a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        a.r8 logGmsgHandler = (a.r8) this.f9929a.get();
        Intrinsics.checkNotNullParameter(logGmsgHandler, "logGmsgHandler");
        return new m31(logGmsgHandler);
    }
}
