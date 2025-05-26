package ar0;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.l2;
import androidx.recyclerview.widget.o2;
import kh2.k3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class o extends o2 {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f20402a = new int[2];

    /* renamed from: b, reason: collision with root package name */
    public int[] f20403b = new int[2];

    @Override // androidx.recyclerview.widget.o2
    public final void g(RecyclerView recyclerView, int i13) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        l2 l2Var = recyclerView.f19242n;
        Intrinsics.f(l2Var);
        boolean z13 = l2Var instanceof LinearLayoutManager;
        int[] iArr = this.f20402a;
        if (z13) {
            k3.W((LinearLayoutManager) l2Var, iArr);
        } else if (l2Var instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) l2Var;
            int i14 = staggeredGridLayoutManager.f19286p;
            if (this.f20403b.length < i14) {
                this.f20403b = new int[i14];
            }
            k3.Y(staggeredGridLayoutManager, iArr, this.f20403b);
        } else if (l2Var instanceof PinterestStaggeredGridLayoutManager) {
            PinterestStaggeredGridLayoutManager pinterestStaggeredGridLayoutManager = (PinterestStaggeredGridLayoutManager) l2Var;
            int f19177u = pinterestStaggeredGridLayoutManager.getF19177u();
            if (this.f20403b.length < f19177u) {
                this.f20403b = new int[f19177u];
            }
            k3.X(pinterestStaggeredGridLayoutManager, iArr, this.f20403b);
        }
        int i15 = iArr[0];
        int i16 = iArr[1];
        if (i13 == 0) {
            k(recyclerView, i15, i16);
        } else {
            if (i13 != 1) {
                return;
            }
            l(recyclerView, i15, i16);
        }
    }

    public abstract void k(RecyclerView recyclerView, int i13, int i14);

    public void l(RecyclerView recyclerView, int i13, int i14) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
    }
}
