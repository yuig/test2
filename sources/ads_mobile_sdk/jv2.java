package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class jv2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f6976a;

    public jv2(a.o8 o8Var) {
        this.f6976a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        q92 resultGmsgHandler = (q92) this.f6976a.get();
        Intrinsics.checkNotNullParameter(resultGmsgHandler, "resultGmsgHandler");
        return new yu2(resultGmsgHandler);
    }
}
