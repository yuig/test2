package com.pinterest.feature.sharesheet.view.previewcarousel;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kh2.s0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements r {

    /* renamed from: b, reason: collision with root package name */
    public static final g f48434b = new g();

    @Override // com.pinterest.feature.sharesheet.view.previewcarousel.r
    public final i a(Context context, FrameLayout itemViewFrame) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(itemViewFrame, "itemViewFrame");
        r.f48459a.getClass();
        l lVar = new l(s0.u(context, context), q.b(context), context);
        itemViewFrame.addView(lVar);
        ViewGroup.LayoutParams layoutParams = lVar.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = null;
        FrameLayout.LayoutParams layoutParams3 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams3 != null) {
            layoutParams3.gravity = 17;
            layoutParams2 = layoutParams3;
        }
        lVar.setLayoutParams(layoutParams2);
        return new a(itemViewFrame, lVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -587885910;
    }

    public final String toString() {
        return "PinOrSpinPreviewViewHolderProvider";
    }
}
