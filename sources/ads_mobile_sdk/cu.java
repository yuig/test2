package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class cu implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f4034a;

    public cu(a.o8 o8Var) {
        this.f4034a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        lc1 mraidGmsgHandler = (lc1) this.f4034a.get();
        Intrinsics.checkNotNullParameter(mraidGmsgHandler, "mraidGmsgHandler");
        return new pt(mraidGmsgHandler);
    }
}
