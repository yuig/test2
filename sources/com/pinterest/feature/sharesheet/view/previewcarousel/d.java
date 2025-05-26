package com.pinterest.feature.sharesheet.view.previewcarousel;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.pinterest.feature.sharesheet.view.SharesheetBoardPreviewContainer;
import kh2.s0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d implements r {

    /* renamed from: b, reason: collision with root package name */
    public static final d f48430b = new d();

    @Override // com.pinterest.feature.sharesheet.view.previewcarousel.r
    public final i a(Context context, FrameLayout itemViewFrame) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(itemViewFrame, "itemViewFrame");
        SharesheetBoardPreviewContainer sharesheetBoardPreviewContainer = new SharesheetBoardPreviewContainer(context, null, 0, Integer.valueOf(s0.u(context, context)), 6);
        ViewGroup.LayoutParams layoutParams = sharesheetBoardPreviewContainer.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        itemViewFrame.addView(sharesheetBoardPreviewContainer);
        return new a(itemViewFrame, sharesheetBoardPreviewContainer);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 85365403;
    }

    public final String toString() {
        return "BoardVideoPreviewViewHolderProvider";
    }
}
