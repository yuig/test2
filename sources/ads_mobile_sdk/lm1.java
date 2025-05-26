package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class lm1 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f7888a;

    public lm1(a.o8 o8Var) {
        this.f7888a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        ng1 nativeAdRenderer = (ng1) this.f7888a.get();
        Intrinsics.checkNotNullParameter(nativeAdRenderer, "nativeAdRenderer");
        kh2.a1.p(nativeAdRenderer);
        return nativeAdRenderer;
    }
}
