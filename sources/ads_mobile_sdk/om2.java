package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class om2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f9377a;

    public om2(a.o8 o8Var) {
        this.f9377a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        rf2 paidPersonalizationEnabledGmsgHandler = (rf2) this.f9377a.get();
        Intrinsics.checkNotNullParameter(paidPersonalizationEnabledGmsgHandler, "paidPersonalizationEnabledGmsgHandler");
        return new hm2(paidPersonalizationEnabledGmsgHandler);
    }
}
