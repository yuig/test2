package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class zk1 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f14809a;

    public zk1(a.o8 o8Var) {
        this.f14809a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        cy2 viewLocationGmsgHandler = (cy2) this.f14809a.get();
        Intrinsics.checkNotNullParameter(viewLocationGmsgHandler, "viewLocationGmsgHandler");
        return new rk1(viewLocationGmsgHandler);
    }
}
