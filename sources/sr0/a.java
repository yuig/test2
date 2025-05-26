package sr0;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.l2;
import eb2.i;
import eb2.j;
import kotlin.jvm.internal.Intrinsics;
import nr0.f;
import rr0.g;
import yq0.d0;
import yq0.u;

/* loaded from: classes.dex */
public final class a implements u {

    /* renamed from: a, reason: collision with root package name */
    public final f f115079a;

    public a(f dynamicDataSource) {
        j layoutManagerUtils = i.f58262a;
        Intrinsics.checkNotNullParameter(dynamicDataSource, "dynamicDataSource");
        Intrinsics.checkNotNullParameter(layoutManagerUtils, "layoutManagerUtils");
        this.f115079a = dynamicDataSource;
    }

    @Override // yq0.u
    public final void F(d0 viewHolder, RecyclerView parent, int i13) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(parent, "parent");
        f fVar = this.f115079a;
        Integer j13 = ((g) fVar).j(i13);
        if (j13 != null) {
            b(viewHolder, parent, j13.intValue(), true);
        } else if (fVar.f(i13)) {
            c(viewHolder, parent, true);
        }
    }

    @Override // yq0.u
    public final void K(d0 viewHolder, int i13) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        f fVar = this.f115079a;
        int itemViewType = fVar.getItemViewType(i13);
        g gVar = (g) fVar;
        Integer j13 = gVar.j(itemViewType);
        View view = viewHolder.f19717a;
        if (j13 != null) {
            Object parent = view.getParent();
            b(viewHolder, parent instanceof View ? (View) parent : null, j13.intValue(), false);
        } else if (gVar.n0(i13)) {
            Object parent2 = view.getParent();
            c(viewHolder, parent2 instanceof View ? (View) parent2 : null, false);
        }
    }

    public final ViewGroup.LayoutParams a(View view, ViewGroup.LayoutParams layoutParams, boolean z13) {
        l2 l2Var;
        return (z13 && (view instanceof RecyclerView) && (l2Var = ((RecyclerView) view).f19242n) != null) ? ((l2Var instanceof PinterestStaggeredGridLayoutManager) || (l2Var instanceof StaggeredGridLayoutManager) || (l2Var instanceof GridLayoutManager)) ? ((layoutParams instanceof RecyclerView.LayoutParams) && l2Var.m((RecyclerView.LayoutParams) layoutParams)) ? layoutParams : l2Var.A() : layoutParams : layoutParams;
    }

    public final void b(d0 d0Var, View view, int i13, boolean z13) {
        View view2 = d0Var.f19717a;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        ViewGroup.LayoutParams a13 = a(view, layoutParams, z13);
        if (a13 != null) {
            layoutParams = a13;
        }
        if (layoutParams instanceof PinterestStaggeredGridLayoutManager.LayoutParams) {
            ((PinterestStaggeredGridLayoutManager.LayoutParams) layoutParams).l(i13);
        }
        if (layoutParams != null) {
            view2.setLayoutParams(layoutParams);
        }
    }

    public final void c(d0 d0Var, View view, boolean z13) {
        View view2 = d0Var.f19717a;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        ViewGroup.LayoutParams a13 = a(view, layoutParams, z13);
        if (a13 != null) {
            layoutParams = a13;
        }
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).f19298f = true;
        } else if (layoutParams instanceof PinterestStaggeredGridLayoutManager.LayoutParams) {
            ((PinterestStaggeredGridLayoutManager.LayoutParams) layoutParams).k();
        }
        if (layoutParams != null) {
            view2.setLayoutParams(layoutParams);
        }
    }
}
