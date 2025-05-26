package com.pinterest.feature.sharesheet.view.previewcarousel;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.pinterest.component.board.view.LegoBoardRep;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements r {

    /* renamed from: b, reason: collision with root package name */
    public static final c f48429b = new c();

    @Override // com.pinterest.feature.sharesheet.view.previewcarousel.r
    public final i a(Context context, FrameLayout itemViewFrame) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(itemViewFrame, "itemViewFrame");
        LegoBoardRep legoBoardRep = new LegoBoardRep(context);
        legoBoardRep.a0(new qc2.d(), b.f48428i);
        FrameLayout.LayoutParams layoutParams = null;
        legoBoardRep.setBackground(bs1.c.f0(legoBoardRep, eo1.d.rounded_rect_board_rep_border, null, null, 6));
        itemViewFrame.addView(legoBoardRep);
        ViewGroup.LayoutParams layoutParams2 = legoBoardRep.getLayoutParams();
        FrameLayout.LayoutParams layoutParams3 = layoutParams2 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams2 : null;
        if (layoutParams3 != null) {
            layoutParams3.gravity = 17;
            layoutParams = layoutParams3;
        }
        legoBoardRep.setLayoutParams(layoutParams);
        return new a(itemViewFrame, legoBoardRep);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -1034360796;
    }

    public final String toString() {
        return "BoardLinkPreviewViewHolderProvider";
    }
}
