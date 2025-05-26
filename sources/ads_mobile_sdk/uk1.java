package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class uk1 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f12099a;

    public uk1(a.o8 o8Var) {
        this.f12099a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        a.q8 delayPageLoadedGmsgHandler = (a.q8) this.f12099a.get();
        Intrinsics.checkNotNullParameter(delayPageLoadedGmsgHandler, "delayPageLoadedGmsgHandler");
        return new rk1(delayPageLoadedGmsgHandler);
    }
}
