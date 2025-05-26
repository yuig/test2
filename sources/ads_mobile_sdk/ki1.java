package ads_mobile_sdk;

import a.s5;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ki1 {

    /* renamed from: a, reason: collision with root package name */
    public final s5 f7330a;

    /* renamed from: b, reason: collision with root package name */
    public final gi1 f7331b;

    public ki1(s5 nativeAdViewabilityMonitor, gi1 nativeAdViewVisibilityChangedListenerImpl) {
        Intrinsics.checkNotNullParameter(nativeAdViewabilityMonitor, "nativeAdViewabilityMonitor");
        Intrinsics.checkNotNullParameter(nativeAdViewVisibilityChangedListenerImpl, "nativeAdViewVisibilityChangedListenerImpl");
        this.f7330a = nativeAdViewabilityMonitor;
        this.f7331b = nativeAdViewVisibilityChangedListenerImpl;
    }

    public final void a(a.pf nativeAdViewContainer) {
        Intrinsics.checkNotNullParameter(nativeAdViewContainer, "nativeAdViewContainer");
        this.f7331b.f5578b.a(nativeAdViewContainer);
        FrameLayout targetView = ((yh1) nativeAdViewContainer).c();
        if (targetView != null) {
            s5 s5Var = this.f7330a;
            s5Var.getClass();
            Intrinsics.checkNotNullParameter(targetView, "targetView");
            s5Var.f6834e = targetView;
            s5Var.f6835f = true;
            s5Var.a(targetView);
        }
    }
}
