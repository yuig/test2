package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class gu implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f5689a;

    public gu(a.o8 o8Var) {
        this.f5689a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        q92 resultGmsgHandler = (q92) this.f5689a.get();
        Intrinsics.checkNotNullParameter(resultGmsgHandler, "resultGmsgHandler");
        return new pt(resultGmsgHandler);
    }
}
