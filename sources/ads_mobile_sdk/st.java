package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class st implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f11219a;

    public st(a.o8 o8Var) {
        this.f11219a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        vl canOpenAppGmsgHandler = (vl) this.f11219a.get();
        Intrinsics.checkNotNullParameter(canOpenAppGmsgHandler, "canOpenAppGmsgHandler");
        return new pt(canOpenAppGmsgHandler);
    }
}
