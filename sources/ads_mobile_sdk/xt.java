package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class xt implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f13802a;

    public xt(a.o8 o8Var) {
        this.f13802a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        a.q8 delayPageLoadedGmsgHandler = (a.q8) this.f13802a.get();
        Intrinsics.checkNotNullParameter(delayPageLoadedGmsgHandler, "delayPageLoadedGmsgHandler");
        return new pt(delayPageLoadedGmsgHandler);
    }
}
