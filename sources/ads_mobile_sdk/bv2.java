package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class bv2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f3619a;

    public bv2(a.o8 o8Var) {
        this.f3619a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        jn clickGmsgHandler = (jn) this.f3619a.get();
        Intrinsics.checkNotNullParameter(clickGmsgHandler, "clickGmsgHandler");
        return new yu2(clickGmsgHandler);
    }
}
