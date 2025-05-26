package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class de0 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f4246a;

    public de0(a.o8 o8Var) {
        this.f4246a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        a.t closeGmsgHandler = (a.t) this.f4246a.get();
        Intrinsics.checkNotNullParameter(closeGmsgHandler, "closeGmsgHandler");
        return new pt(closeGmsgHandler);
    }
}
