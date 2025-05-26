package ads_mobile_sdk;

import android.widget.ImageView;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdView;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class vh1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeAdView f12510a;

    public vh1(NativeAdView nativeAdView) {
        this.f12510a = nativeAdView;
    }

    public final void a(ImageView.ScaleType scaleType) {
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        NativeAdView nativeAdView = this.f12510a;
        int i13 = NativeAdView.f32097c;
        yh1 yh1Var = nativeAdView.f32084a;
        yh1Var.getClass();
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        synchronized (yh1Var) {
            if (yh1Var.f14249d.get()) {
                return;
            }
            yh1Var.f14251f = scaleType;
            Unit unit = Unit.f80348a;
        }
    }
}
