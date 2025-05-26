package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class dv2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f4463a;

    public dv2(a.o8 o8Var) {
        this.f4463a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        pz customCloseGmsgHandler = (pz) this.f4463a.get();
        Intrinsics.checkNotNullParameter(customCloseGmsgHandler, "customCloseGmsgHandler");
        return new yu2(customCloseGmsgHandler);
    }
}
