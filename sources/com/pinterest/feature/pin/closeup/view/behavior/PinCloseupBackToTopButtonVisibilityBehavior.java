package com.pinterest.feature.pin.closeup.view.behavior;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b11.b0;
import bs1.c;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import h32.u0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/feature/pin/closeup/view/behavior/PinCloseupBackToTopButtonVisibilityBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;", "Landroid/view/View;", "bp1/h", "closeup_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class PinCloseupBackToTopButtonVisibilityBehavior extends CoordinatorLayout.Behavior<View> {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f47060a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f47061b;

    /* renamed from: c, reason: collision with root package name */
    public final Function0 f47062c;

    /* renamed from: d, reason: collision with root package name */
    public int f47063d;

    /* renamed from: e, reason: collision with root package name */
    public int f47064e;

    public PinCloseupBackToTopButtonVisibilityBehavior(d0 pinalytics, b0 hasUserFullyScrolledIntoRelatedPins, b0 adjustBackToTopButtonMarginsIfNeeded) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(hasUserFullyScrolledIntoRelatedPins, "hasUserFullyScrolledIntoRelatedPins");
        Intrinsics.checkNotNullParameter(adjustBackToTopButtonMarginsIfNeeded, "adjustBackToTopButtonMarginsIfNeeded");
        this.f47060a = pinalytics;
        this.f47061b = hasUserFullyScrolledIntoRelatedPins;
        this.f47062c = adjustBackToTopButtonMarginsIfNeeded;
        this.f47063d = Integer.MAX_VALUE;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void t(CoordinatorLayout coordinatorLayout, View button, View target, int i13, int i14, int i15, int i16, int i17, int[] consumed) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        this.f47064e += i14;
        if (!((Boolean) this.f47061b.invoke()).booleanValue()) {
            c.b1(button);
            if (this.f47064e > this.f47063d) {
                this.f47063d = Integer.MAX_VALUE;
                return;
            }
            return;
        }
        this.f47063d = Math.min(this.f47063d, this.f47064e);
        if (this.f47064e <= this.f47063d + button.getResources().getDisplayMetrics().heightPixels) {
            c.b1(button);
            return;
        }
        if (button.getVisibility() != 0) {
            button.setVisibility(0);
            this.f47060a.h0((r18 & 1) != 0 ? f1.TAP : f1.RENDER, (r18 & 2) != 0 ? null : u0.SCROLL_TO_TOP_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        }
        this.f47062c.invoke();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean y(CoordinatorLayout coordinatorLayout, View child, View directTargetChild, View target, int i13, int i14) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(directTargetChild, "directTargetChild");
        Intrinsics.checkNotNullParameter(target, "target");
        return true;
    }
}
