package e11;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.l2;
import ar0.s;
import eb2.j;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i extends s {

    /* renamed from: a, reason: collision with root package name */
    public final l2 f56813a;

    /* renamed from: b, reason: collision with root package name */
    public final h f56814b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f56815c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f56816d;

    /* renamed from: e, reason: collision with root package name */
    public int f56817e;

    /* renamed from: f, reason: collision with root package name */
    public int f56818f;

    public i(l2 layoutManager, h scrollPositionListener) {
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        Intrinsics.checkNotNullParameter(scrollPositionListener, "scrollPositionListener");
        this.f56813a = layoutManager;
        this.f56814b = scrollPositionListener;
        boolean z13 = layoutManager instanceof StaggeredGridLayoutManager;
        int i13 = 0;
        this.f56815c = new int[z13 ? ((StaggeredGridLayoutManager) layoutManager).f19286p : layoutManager instanceof PinterestStaggeredGridLayoutManager ? ((PinterestStaggeredGridLayoutManager) layoutManager).getF19177u() : layoutManager instanceof GridLayoutManager ? ((GridLayoutManager) layoutManager).F : 0];
        if (z13) {
            i13 = ((StaggeredGridLayoutManager) layoutManager).f19286p;
        } else if (layoutManager instanceof PinterestStaggeredGridLayoutManager) {
            i13 = ((PinterestStaggeredGridLayoutManager) layoutManager).getF19177u();
        } else if (layoutManager instanceof GridLayoutManager) {
            i13 = ((GridLayoutManager) layoutManager).F;
        }
        this.f56816d = new int[i13];
        this.f56817e = -1;
        this.f56818f = -1;
    }

    @Override // ar0.s, ar0.y
    public final void c(RecyclerView recyclerView, int i13, int i14) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        boolean z13 = i14 < 0;
        l2 l2Var = this.f56813a;
        int b13 = j.b(l2Var, this.f56815c);
        int i15 = this.f56817e;
        h hVar = this.f56814b;
        if (i15 != b13) {
            this.f56817e = b13;
            hVar.onFirstVisibleItemChanged(b13, z13);
        }
        int c13 = j.c(l2Var, this.f56816d);
        if (this.f56818f != c13) {
            this.f56818f = c13;
            hVar.onLastVisibleItemChanged(c13, z13);
        }
    }
}
