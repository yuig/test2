package ads_mobile_sdk;

import a.b6;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class t11 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f11312a;

    public t11(a.o8 o8Var) {
        this.f11312a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        b6 interstitialAdRenderer = (b6) this.f11312a.get();
        Intrinsics.checkNotNullParameter(interstitialAdRenderer, "interstitialAdRenderer");
        kh2.a1.p(interstitialAdRenderer);
        return interstitialAdRenderer;
    }
}
