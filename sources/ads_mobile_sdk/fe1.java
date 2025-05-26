package ads_mobile_sdk;

import com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class fe1 implements a.v3, a.x5 {

    /* renamed from: a, reason: collision with root package name */
    public final InternalNativeAd f5129a;

    public fe1(InternalNativeAd internalNativeAd) {
        Intrinsics.checkNotNullParameter(internalNativeAd, "internalNativeAd");
        this.f5129a = internalNativeAd;
    }

    @Override // a.x5
    public final ss2 a() {
        return this.f5129a.a();
    }

    @Override // a.x5
    public final r0 b() {
        return this.f5129a.b();
    }

    @Override // a.x5
    public final Object a(bl2.c cVar) {
        return this.f5129a.a(cVar);
    }

    @Override // a.x5
    public final void a(wi.b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<set-?>");
        InternalNativeAd internalNativeAd = this.f5129a;
        internalNativeAd.getClass();
        Intrinsics.checkNotNullParameter(b0Var, "<set-?>");
        internalNativeAd.f8013i = b0Var;
    }
}
