package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class hu implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f6081a;

    public hu(a.o8 o8Var) {
        this.f6081a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        rf2 paidPersonalizationEnabledGmsgHandler = (rf2) this.f6081a.get();
        Intrinsics.checkNotNullParameter(paidPersonalizationEnabledGmsgHandler, "paidPersonalizationEnabledGmsgHandler");
        return new pt(paidPersonalizationEnabledGmsgHandler);
    }
}
