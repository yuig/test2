package com.pinterest.ads.feature.owc.view.leadgen.bottomSheet;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.pinterest.ads.feature.owc.view.base.BaseAdsBottomSheetBehavior;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/ads/feature/owc/view/leadgen/bottomSheet/AdsLeadGenBottomSheetBehavior;", "Landroid/view/View;", "V", "Lcom/pinterest/ads/feature/owc/view/base/BaseAdsBottomSheetBehavior;", "ads_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class AdsLeadGenBottomSheetBehavior<V extends View> extends BaseAdsBottomSheetBehavior<V> {

    /* renamed from: o0, reason: collision with root package name */
    public boolean f35375o0;

    @Override // com.pinterest.ads.feature.owc.view.base.BaseAdsBottomSheetBehavior, com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean B(CoordinatorLayout parent, View child, MotionEvent event) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f35375o0) {
            return super.B(parent, child, event);
        }
        return false;
    }

    @Override // com.pinterest.ads.feature.owc.view.base.BaseAdsBottomSheetBehavior, com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean k(CoordinatorLayout parent, View child, MotionEvent event) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f35375o0) {
            return super.k(parent, child, event);
        }
        return false;
    }
}
