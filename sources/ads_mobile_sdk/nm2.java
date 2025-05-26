package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class nm2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f8871a;

    public nm2(a.o8 o8Var) {
        this.f8871a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        q92 resultGmsgHandler = (q92) this.f8871a.get();
        Intrinsics.checkNotNullParameter(resultGmsgHandler, "resultGmsgHandler");
        return new hm2(resultGmsgHandler);
    }
}
