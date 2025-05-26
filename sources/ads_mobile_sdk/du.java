package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class du implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f4440a;

    public du(a.o8 o8Var) {
        this.f4440a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        sc1 mraidLoadedGmsgHandler = (sc1) this.f4440a.get();
        Intrinsics.checkNotNullParameter(mraidLoadedGmsgHandler, "mraidLoadedGmsgHandler");
        return new pt(mraidLoadedGmsgHandler);
    }
}
