package qv0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h2;
import androidx.recyclerview.widget.l2;
import androidx.recyclerview.widget.w2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c0 extends h2 {
    @Override // androidx.recyclerview.widget.h2
    public final void f(Rect outRect, View view, RecyclerView parent, w2 state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.f(outRect, view, parent, state);
        l2 l2Var = parent.f19242n;
        Intrinsics.g(l2Var, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        int i13 = ((GridLayoutManager) l2Var).F;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNullExpressionValue(layoutParams, "getLayoutParams(...)");
        if ((layoutParams instanceof GridLayoutManager.LayoutParams) && ((GridLayoutManager.LayoutParams) layoutParams).f19156f == i13) {
            return;
        }
        int c13 = ml2.c.c(bs1.c.T(eo1.c.space_100));
        int c14 = ml2.c.c(bs1.c.T(eo1.c.space_200));
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        Intrinsics.g(layoutParams2, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager.LayoutParams");
        int i14 = ((GridLayoutManager.LayoutParams) layoutParams2).f19155e;
        int i15 = i14 == 0 ? c14 : c13;
        if (i14 == i13 - 1) {
            c13 = c14;
        }
        outRect.set(i15, c14, c13, c14);
    }
}
