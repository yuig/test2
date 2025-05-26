package com.pinterest.ads.feature.owc.view.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/ads/feature/owc/view/base/AdsNonCollapsibleBottomSheetBehavior;", "Landroid/view/View;", "V", "Lcom/pinterest/ads/feature/owc/view/base/BaseAdsBottomSheetBehavior;", "ads_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class AdsNonCollapsibleBottomSheetBehavior<V extends View> extends BaseAdsBottomSheetBehavior<V> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsNonCollapsibleBottomSheetBehavior(Context context, AttributeSet attributeSet, boolean z13) {
        super(context, attributeSet, z13);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.pinterest.ads.feature.owc.view.base.BaseAdsBottomSheetBehavior, com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean k(CoordinatorLayout parent, View child, MotionEvent event) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getActionMasked() == 2 && this.L == 3) {
            this.f35310k0 = false;
        }
        return super.k(parent, child, event);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void q(CoordinatorLayout coordinatorLayout, View child, View target, int i13, int i14, int[] consumed, int i15) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        if (this.f35310k0) {
            super.q(coordinatorLayout, child, target, i13, i14, consumed, i15);
        }
    }
}
