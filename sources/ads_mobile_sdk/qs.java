package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class qs implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f10239a;

    public qs(xv0 xv0Var) {
        this.f10239a = xv0Var;
    }

    @Override // a.v7
    public final Object get() {
        xi.c initializationConfig = (xi.c) this.f10239a.get();
        Intrinsics.checkNotNullParameter(initializationConfig, "initializationConfig");
        return Boolean.valueOf(initializationConfig.f134994b);
    }
}
