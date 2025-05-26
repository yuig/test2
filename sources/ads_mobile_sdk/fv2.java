package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class fv2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f5293a;

    public fv2(a.o8 o8Var) {
        this.f5293a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        a.q8 delayPageLoadedGmsgHandler = (a.q8) this.f5293a.get();
        Intrinsics.checkNotNullParameter(delayPageLoadedGmsgHandler, "delayPageLoadedGmsgHandler");
        return new yu2(delayPageLoadedGmsgHandler);
    }
}
