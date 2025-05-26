package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ee1 implements a.v3, a.x5 {

    /* renamed from: a, reason: collision with root package name */
    public final sx0 f4830a;

    public ee1(sx0 internalBannerAd) {
        Intrinsics.checkNotNullParameter(internalBannerAd, "internalBannerAd");
        this.f4830a = internalBannerAd;
    }

    @Override // a.x5
    public final ss2 a() {
        return this.f4830a.a();
    }

    @Override // a.x5
    public final r0 b() {
        return this.f4830a.b();
    }

    @Override // a.x5
    public final Object a(bl2.c cVar) {
        sx0 sx0Var = this.f4830a;
        sx0Var.getClass();
        return lw0.a(sx0Var, cVar);
    }

    @Override // a.x5
    public final void a(wi.b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<set-?>");
        sx0 sx0Var = this.f4830a;
        sx0Var.getClass();
        Intrinsics.checkNotNullParameter(b0Var, "<set-?>");
        sx0Var.f8013i = b0Var;
    }
}
