package com.pinterest.navigation.view.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.pinterest.design.widget.NestedScrollingViewGroup;
import q5.r;

/* loaded from: classes2.dex */
public final class PinterestAppBarLayoutBehavior<V extends View> extends AppBarLayout.ScrollingViewBehavior {
    public PinterestAppBarLayoutBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static void L(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = viewGroup.getChildAt(i13);
            if (childAt instanceof r) {
                childAt.scrollBy(0, 1);
            } else if (childAt instanceof ViewGroup) {
                L((ViewGroup) childAt);
            }
        }
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if ((view2 instanceof AppBarLayout) && view2.getTop() < 0 && (view instanceof NestedScrollingViewGroup)) {
            L((NestedScrollingViewGroup) view);
        }
        super.h(coordinatorLayout, view, view2);
        return false;
    }
}
