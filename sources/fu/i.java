package fu;

import android.content.Context;
import com.pinterest.ads.feature.owc.view.base.BaseAdsBottomSheetBehavior;
import com.pinterest.ads.feature.owc.view.core.AdsBrowserBottomSheet;
import com.pinterest.feature.browser.view.InAppBrowserView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i extends AdsBrowserBottomSheet {

    /* renamed from: u, reason: collision with root package name */
    public final BaseAdsBottomSheetBehavior f62953u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, boolean z13) {
        super(context, null, 0, z13);
        Intrinsics.checkNotNullParameter(context, "context");
        BaseAdsBottomSheetBehavior baseAdsBottomSheetBehavior = new BaseAdsBottomSheetBehavior(context, null, z13);
        baseAdsBottomSheetBehavior.f35311l0 = true;
        this.f62953u = baseAdsBottomSheetBehavior;
    }

    @Override // com.pinterest.ads.feature.owc.view.core.AdsBrowserBottomSheet, cu.i
    public final void Z(float f13) {
        InAppBrowserView inAppBrowserView = this.f35366r;
        if (inAppBrowserView != null) {
            inAppBrowserView.setAlpha(f13);
        }
        InAppBrowserView inAppBrowserView2 = this.f35366r;
        bs1.c.X0(inAppBrowserView2 != null ? inAppBrowserView2.f45398k : null);
        InAppBrowserView inAppBrowserView3 = this.f35366r;
        if (inAppBrowserView3 == null) {
            return;
        }
        inAppBrowserView3.f45406s.d(inAppBrowserView3, InAppBrowserView.f45390w[0], Boolean.FALSE);
    }

    @Override // com.pinterest.ads.feature.owc.view.core.AdsBrowserBottomSheet, cu.i
    /* renamed from: g */
    public final BaseAdsBottomSheetBehavior getF35368t() {
        return this.f62953u;
    }
}
