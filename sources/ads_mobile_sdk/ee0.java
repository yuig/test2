package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ee0 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f4829a;

    public ee0(a.o8 o8Var) {
        this.f4829a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        pz customCloseGmsgHandler = (pz) this.f4829a.get();
        Intrinsics.checkNotNullParameter(customCloseGmsgHandler, "customCloseGmsgHandler");
        return new pt(customCloseGmsgHandler);
    }
}
