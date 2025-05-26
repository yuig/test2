package o82;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s2 implements yq0.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v2 f93711a;

    public s2(v2 v2Var) {
        this.f93711a = v2Var;
    }

    @Override // yq0.u
    public final void F(yq0.d0 viewHolder, RecyclerView parent, int i13) {
        Integer num;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(parent, "parent");
        v2 v2Var = this.f93711a;
        ArrayList arrayList = v2Var.B0;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer j13 = ((r2) it.next()).j(i13);
            if (j13 != null) {
                arrayList2.add(j13);
            }
        }
        List M = CollectionsKt.M(arrayList2);
        if (M.size() == 1) {
            Intrinsics.checkNotNullParameter(M, "<this>");
            num = (Integer) CollectionsKt.S(M);
        } else {
            num = null;
        }
        if (num != null) {
            a(viewHolder, parent, num.intValue());
            return;
        }
        ArrayList arrayList3 = v2Var.B0;
        if (!(arrayList3 instanceof Collection) || !arrayList3.isEmpty()) {
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                if (!((r2) it2.next()).f(i13)) {
                    return;
                }
            }
        }
        b(viewHolder, parent);
    }

    @Override // yq0.u
    public final void K(yq0.d0 viewHolder, int i13) {
        View view;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        v2 v2Var = this.f93711a;
        Pair f93 = v2.f9(i13, v2Var.B0);
        r2 r2Var = (r2) f93.f80346a;
        Integer j13 = r2Var.j(r2Var.f93704a.getItemViewType(((Number) f93.f80347b).intValue()));
        View view2 = viewHolder.f19717a;
        if (j13 != null) {
            Object parent = view2.getParent();
            view = parent instanceof View ? (View) parent : null;
            if (view != null) {
                a(viewHolder, view, j13.intValue());
                return;
            }
            return;
        }
        Pair f94 = v2.f9(i13, v2Var.B0);
        if (((r2) f94.f80346a).n0(((Number) f94.f80347b).intValue())) {
            Object parent2 = view2.getParent();
            view = parent2 instanceof View ? (View) parent2 : null;
            if (view != null) {
                b(viewHolder, view);
            }
        }
    }

    public final void a(yq0.d0 d0Var, View view, int i13) {
        androidx.recyclerview.widget.l2 l2Var;
        if (!(this.f93711a.n8().f19650a instanceof PinterestStaggeredGridLayoutManager)) {
            vb0.j.f125466a.F("Only PinterestStaggeredGridLayoutManager supports spanCount", tb0.p.PLATFORM, new Object[0]);
            return;
        }
        View view2 = d0Var.f19717a;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if ((view instanceof RecyclerView) && (l2Var = ((RecyclerView) view).f19242n) != null && (((l2Var instanceof PinterestStaggeredGridLayoutManager) || (l2Var instanceof StaggeredGridLayoutManager) || (l2Var instanceof GridLayoutManager)) && (!(layoutParams instanceof RecyclerView.LayoutParams) || !l2Var.m((RecyclerView.LayoutParams) layoutParams)))) {
            layoutParams = l2Var.A();
        }
        if (layoutParams instanceof PinterestStaggeredGridLayoutManager.LayoutParams) {
            ((PinterestStaggeredGridLayoutManager.LayoutParams) layoutParams).l(i13);
        }
        view2.setLayoutParams(layoutParams);
    }

    public final void b(yq0.d0 d0Var, View view) {
        androidx.recyclerview.widget.l2 l2Var;
        androidx.recyclerview.widget.l2 l2Var2 = this.f93711a.n8().f19650a;
        if (!(l2Var2 instanceof PinterestStaggeredGridLayoutManager) && !(l2Var2 instanceof StaggeredGridLayoutManager)) {
            vb0.j.f125466a.F("Base framework does not know how to make items full span in LayoutManager " + l2Var2 + ". Override your fragment's adapterPlugin to apply span.", tb0.p.PLATFORM, new Object[0]);
            return;
        }
        View view2 = d0Var.f19717a;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if ((view instanceof RecyclerView) && (l2Var = ((RecyclerView) view).f19242n) != null && (((l2Var instanceof PinterestStaggeredGridLayoutManager) || (l2Var instanceof StaggeredGridLayoutManager) || (l2Var instanceof GridLayoutManager)) && (!(layoutParams instanceof RecyclerView.LayoutParams) || !l2Var.m((RecyclerView.LayoutParams) layoutParams)))) {
            layoutParams = l2Var.A();
        }
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).f19298f = true;
        } else if (layoutParams instanceof PinterestStaggeredGridLayoutManager.LayoutParams) {
            ((PinterestStaggeredGridLayoutManager.LayoutParams) layoutParams).k();
        }
        view2.setLayoutParams(layoutParams);
    }
}
