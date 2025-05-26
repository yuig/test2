package wk1;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.l2;
import kotlin.jvm.internal.Intrinsics;
import sq0.f0;
import yq0.d0;
import yq0.u;

/* loaded from: classes5.dex */
public final class o implements u {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f130170a;

    /* renamed from: b, reason: collision with root package name */
    public final eb2.j f130171b;

    /* renamed from: c, reason: collision with root package name */
    public final tb0.h f130172c;

    public o(i dataSourceProvider, eb2.j layoutManagerUtils, tb0.h crashReporting) {
        Intrinsics.checkNotNullParameter(dataSourceProvider, "dataSourceProvider");
        Intrinsics.checkNotNullParameter(layoutManagerUtils, "layoutManagerUtils");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        this.f130170a = dataSourceProvider;
        this.f130171b = layoutManagerUtils;
        this.f130172c = crashReporting;
    }

    @Override // yq0.u
    public final void F(d0 viewHolder, RecyclerView parent, int i13) {
        nr0.j jVar;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(parent, "parent");
        try {
            jVar = (nr0.j) this.f130170a.q(i13);
        } catch (Exception e13) {
            this.f130172c.q(e13, a.a.d("MultiSectionDynamicRecyclerAdapterPlugin no DataSource for view type ", i13), tb0.p.PLATFORM);
            jVar = null;
        }
        if (jVar != null) {
            Integer j13 = jVar.j(i13);
            eb2.j jVar2 = this.f130171b;
            View view = viewHolder.f19717a;
            if (j13 != null) {
                int intValue = j13.intValue();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                ViewGroup.LayoutParams a13 = a(parent, layoutParams);
                if (a13 != null) {
                    layoutParams = a13;
                }
                jVar2.getClass();
                if (layoutParams instanceof PinterestStaggeredGridLayoutManager.LayoutParams) {
                    ((PinterestStaggeredGridLayoutManager.LayoutParams) layoutParams).l(intValue);
                }
                if (layoutParams != null) {
                    view.setLayoutParams(layoutParams);
                    return;
                }
                return;
            }
            if (jVar.f(i13)) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                ViewGroup.LayoutParams a14 = a(parent, layoutParams2);
                if (a14 != null) {
                    layoutParams2 = a14;
                }
                jVar2.getClass();
                if (layoutParams2 instanceof StaggeredGridLayoutManager.LayoutParams) {
                    ((StaggeredGridLayoutManager.LayoutParams) layoutParams2).f19298f = true;
                } else if (layoutParams2 instanceof PinterestStaggeredGridLayoutManager.LayoutParams) {
                    ((PinterestStaggeredGridLayoutManager.LayoutParams) layoutParams2).k();
                }
                view.setLayoutParams(layoutParams2);
            }
        }
    }

    @Override // yq0.u
    public final void K(d0 viewHolder, int i13) {
        nr0.j jVar;
        View view;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        f0 f0Var = this.f130170a;
        int itemViewType = f0Var.getItemViewType(i13);
        try {
            jVar = (nr0.j) f0Var.q(itemViewType);
        } catch (Exception e13) {
            this.f130172c.q(e13, a.a.d("MultiSectionDynamicRecyclerAdapterPlugin no DataSource for view type ", itemViewType), tb0.p.PLATFORM);
            jVar = null;
        }
        if (jVar != null) {
            Integer j13 = jVar.j(itemViewType);
            eb2.j jVar2 = this.f130171b;
            View view2 = viewHolder.f19717a;
            if (j13 != null) {
                Object parent = view2.getParent();
                view = parent instanceof View ? (View) parent : null;
                int intValue = j13.intValue();
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                ViewGroup.LayoutParams a13 = a(view, layoutParams);
                if (a13 != null) {
                    layoutParams = a13;
                }
                jVar2.getClass();
                if (layoutParams instanceof PinterestStaggeredGridLayoutManager.LayoutParams) {
                    ((PinterestStaggeredGridLayoutManager.LayoutParams) layoutParams).l(intValue);
                }
                if (layoutParams != null) {
                    view2.setLayoutParams(layoutParams);
                    return;
                }
                return;
            }
            if (jVar.f(itemViewType)) {
                Object parent2 = view2.getParent();
                view = parent2 instanceof View ? (View) parent2 : null;
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                ViewGroup.LayoutParams a14 = a(view, layoutParams2);
                if (a14 != null) {
                    layoutParams2 = a14;
                }
                jVar2.getClass();
                if (layoutParams2 instanceof StaggeredGridLayoutManager.LayoutParams) {
                    ((StaggeredGridLayoutManager.LayoutParams) layoutParams2).f19298f = true;
                } else if (layoutParams2 instanceof PinterestStaggeredGridLayoutManager.LayoutParams) {
                    ((PinterestStaggeredGridLayoutManager.LayoutParams) layoutParams2).k();
                }
                view2.setLayoutParams(layoutParams2);
            }
        }
    }

    public final ViewGroup.LayoutParams a(View view, ViewGroup.LayoutParams layoutParams) {
        l2 l2Var;
        if (!(view instanceof RecyclerView) || (l2Var = ((RecyclerView) view).f19242n) == null) {
            return layoutParams;
        }
        this.f130171b.getClass();
        return ((l2Var instanceof PinterestStaggeredGridLayoutManager) || (l2Var instanceof StaggeredGridLayoutManager) || (l2Var instanceof GridLayoutManager)) ? ((layoutParams instanceof RecyclerView.LayoutParams) && l2Var.m((RecyclerView.LayoutParams) layoutParams)) ? layoutParams : l2Var.A() : layoutParams;
    }
}
