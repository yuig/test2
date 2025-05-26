package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class lm2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f7889a;

    public lm2(a.o8 o8Var) {
        this.f7889a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        a.r8 logGmsgHandler = (a.r8) this.f7889a.get();
        Intrinsics.checkNotNullParameter(logGmsgHandler, "logGmsgHandler");
        return new hm2(logGmsgHandler);
    }
}
