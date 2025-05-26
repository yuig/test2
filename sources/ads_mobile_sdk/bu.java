package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class bu implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f3597a;

    public bu(a.o8 o8Var) {
        this.f3597a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        a.r8 logGmsgHandler = (a.r8) this.f3597a.get();
        Intrinsics.checkNotNullParameter(logGmsgHandler, "logGmsgHandler");
        return new pt(logGmsgHandler);
    }
}
