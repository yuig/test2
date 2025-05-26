package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class hi implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f5982a;

    public hi(a.o8 o8Var) {
        this.f5982a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        qh bannerAdRenderer = (qh) this.f5982a.get();
        Intrinsics.checkNotNullParameter(bannerAdRenderer, "bannerAdRenderer");
        kh2.a1.p(bannerAdRenderer);
        return bannerAdRenderer;
    }
}
