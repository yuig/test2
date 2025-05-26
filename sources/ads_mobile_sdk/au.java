package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class au implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f2544a;

    public au(a.o8 o8Var) {
        this.f2544a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        cy2 locationGmsgHandler = (cy2) this.f2544a.get();
        Intrinsics.checkNotNullParameter(locationGmsgHandler, "locationGmsgHandler");
        return new pt(locationGmsgHandler);
    }
}
