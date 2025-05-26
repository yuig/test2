package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ge0 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f5537a;

    public ge0(a.o8 o8Var) {
        this.f5537a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        p11 interstitialPropertiesGmsgHandler = (p11) this.f5537a.get();
        Intrinsics.checkNotNullParameter(interstitialPropertiesGmsgHandler, "interstitialPropertiesGmsgHandler");
        return new pt(interstitialPropertiesGmsgHandler);
    }
}
