package ads_mobile_sdk;

import com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;

/* loaded from: classes2.dex */
public final class tz implements bj.a {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ rl2.u[] f11747f;

    /* renamed from: a, reason: collision with root package name */
    public final InternalNativeAd f11748a;

    /* renamed from: b, reason: collision with root package name */
    public final co2 f11749b;

    /* renamed from: c, reason: collision with root package name */
    public final co2 f11750c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11751d;

    /* renamed from: e, reason: collision with root package name */
    public final c91 f11752e;

    static {
        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x(tz.class, "adEventCallback", "getAdEventCallback()Lcom/google/android/libraries/ads/mobile/sdk/nativead/NativeAdEventCallback;", 0);
        l0 l0Var = kotlin.jvm.internal.k0.f80436a;
        f11747f = new rl2.u[]{l0Var.e(xVar), a.a.y(tz.class, "onCustomClickListener", "getOnCustomClickListener()Lcom/google/android/libraries/ads/mobile/sdk/nativead/OnCustomClickListener;", 0, l0Var)};
    }

    public tz(InternalNativeAd internalNativeAd) {
        Intrinsics.checkNotNullParameter(internalNativeAd, "internalNativeAd");
        this.f11748a = internalNativeAd;
        this.f11749b = new co2(null, new rz(this));
        this.f11750c = new co2(null, new sz(this));
        this.f11751d = internalNativeAd.f32086n.f6370c;
        this.f11752e = new c91(internalNativeAd);
    }
}
