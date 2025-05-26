package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ls implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f7940a;

    public ls(xv0 xv0Var) {
        this.f7940a = xv0Var;
    }

    @Override // a.v7
    public final Object get() {
        xi.c initializationConfig = (xi.c) this.f7940a.get();
        Intrinsics.checkNotNullParameter(initializationConfig, "initializationConfig");
        String str = initializationConfig.f134993a;
        kh2.a1.p(str);
        return str;
    }
}
