package zq0;

import android.view.KeyEvent;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.l2;
import ar0.s;
import eb2.j;
import kotlin.jvm.internal.Intrinsics;
import qa2.c0;

/* loaded from: classes.dex */
public final class a extends s {

    /* renamed from: a, reason: collision with root package name */
    public boolean f142651a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f142652b = new int[2];

    /* renamed from: c, reason: collision with root package name */
    public int[] f142653c = new int[2];

    @Override // ar0.s, ar0.x
    public final void a(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        o(recyclerView, false);
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
    }

    @Override // ar0.s, ar0.y
    public final void c(RecyclerView recyclerView, int i13, int i14) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.c(recyclerView, i13, i14);
        l2 l2Var = recyclerView.f19242n;
        Intrinsics.f(l2Var);
        j.a(l2Var, this.f142652b, n(l2Var));
    }

    @Override // ar0.s, ar0.y
    public final void d(RecyclerView recyclerView, int i13) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.d(recyclerView, i13);
        if (i13 == 0) {
            this.f142651a = false;
            p(recyclerView, false);
        } else {
            if (i13 != 1) {
                return;
            }
            this.f142651a = true;
            p(recyclerView, true);
        }
    }

    @Override // ar0.s, ar0.x
    public final void h(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.h(recyclerView);
        o(recyclerView, true);
    }

    public final int[] n(l2 l2Var) {
        int p13 = l2Var instanceof StaggeredGridLayoutManager ? ((StaggeredGridLayoutManager) l2Var).p1() : l2Var instanceof PinterestStaggeredGridLayoutManager ? ((PinterestStaggeredGridLayoutManager) l2Var).getF19177u() : l2Var instanceof GridLayoutManager ? ((GridLayoutManager) l2Var).L1() : 0;
        if (this.f142653c.length < p13) {
            this.f142653c = new int[p13];
        }
        return this.f142653c;
    }

    public final void o(RecyclerView recyclerView, boolean z13) {
        l2 l2Var = recyclerView.f19242n;
        Intrinsics.f(l2Var);
        int[] n13 = n(l2Var);
        int[] iArr = this.f142652b;
        j.a(l2Var, iArr, n13);
        int i13 = iArr[0];
        int i14 = iArr[1];
        if (i13 == -1 || i14 == -1 || i13 > i14) {
            return;
        }
        while (true) {
            KeyEvent.Callback z14 = l2Var.z(i13);
            c0 c0Var = z14 instanceof c0 ? (c0) z14 : null;
            if (c0Var != null) {
                if (z13) {
                    c0Var.onInitialized();
                } else {
                    c0Var.onDeactivated();
                }
            }
            if (i13 == i14) {
                return;
            } else {
                i13++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ar0.s, ar0.r
    public final void onViewAttachedToWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        c0 c0Var = view instanceof c0 ? (c0) view : null;
        if (c0Var != null) {
            if (this.f142651a) {
                c0Var.onAttached();
            } else {
                c0Var.onInitialized();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ar0.s, ar0.r
    public final void onViewDetachedFromWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view instanceof c0) {
        }
    }

    public final void p(RecyclerView recyclerView, boolean z13) {
        l2 layoutManager = recyclerView.f19242n;
        Intrinsics.f(layoutManager);
        int[] n13 = n(layoutManager);
        int[] iArr = this.f142652b;
        j.a(layoutManager, iArr, n13);
        int i13 = iArr[0];
        int i14 = iArr[1];
        if (i13 == -1 || i14 == -1 || !z13) {
            return;
        }
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        if (i13 > i14) {
            return;
        }
        while (true) {
            KeyEvent.Callback z14 = layoutManager.z(i13);
            c0 c0Var = z14 instanceof c0 ? (c0) z14 : null;
            if (c0Var != null) {
                c0Var.onScrollStarted();
            }
            if (i13 == i14) {
                return;
            } else {
                i13++;
            }
        }
    }
}
