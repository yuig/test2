package com.pinterest.feature.sharesheet.view.previewcarousel;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.z;
import ao2.j0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h implements r {

    /* renamed from: b, reason: collision with root package name */
    public static final h f48435b = new h();

    @Override // com.pinterest.feature.sharesheet.view.previewcarousel.r
    public final i a(Context context, FrameLayout itemViewFrame) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(itemViewFrame, "itemViewFrame");
        z r13 = b7.c.r(itemViewFrame);
        j0 S = r13 != null ? bf.b.S(r13) : dl2.b.e();
        r.f48459a.getClass();
        o oVar = new o(context, S, q.a(context, true), q.b(context));
        itemViewFrame.addView(oVar);
        ViewGroup.LayoutParams layoutParams = oVar.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = null;
        FrameLayout.LayoutParams layoutParams3 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams3 != null) {
            layoutParams3.gravity = 17;
            layoutParams2 = layoutParams3;
        }
        oVar.setLayoutParams(layoutParams2);
        return new e(itemViewFrame, oVar, 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 269888138;
    }

    public final String toString() {
        return "PinVideoPreviewViewHolderProvider";
    }
}
