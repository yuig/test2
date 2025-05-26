package eb2;

import android.view.View;
import android.widget.Scroller;
import androidx.appcompat.app.x0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c3;
import androidx.recyclerview.widget.j1;
import androidx.recyclerview.widget.k1;
import androidx.recyclerview.widget.l1;
import androidx.recyclerview.widget.l2;
import androidx.recyclerview.widget.m1;
import androidx.recyclerview.widget.u2;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import q5.v0;

/* loaded from: classes4.dex */
public final class m extends c3 {

    /* renamed from: d, reason: collision with root package name */
    public final int f58268d;

    /* renamed from: e, reason: collision with root package name */
    public final RecyclerView f58269e;

    /* renamed from: f, reason: collision with root package name */
    public int f58270f;

    /* renamed from: g, reason: collision with root package name */
    public int f58271g;

    /* renamed from: h, reason: collision with root package name */
    public int f58272h;

    /* renamed from: i, reason: collision with root package name */
    public l f58273i;

    /* renamed from: j, reason: collision with root package name */
    public int f58274j;

    /* renamed from: k, reason: collision with root package name */
    public final Scroller f58275k;

    /* renamed from: l, reason: collision with root package name */
    public final l1 f58276l;

    /* renamed from: m, reason: collision with root package name */
    public final x0 f58277m;

    public m(int i13, RecyclerView recyclerView, LinearLayoutManager recyclerLayoutManager) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(recyclerLayoutManager, "recyclerLayoutManager");
        this.f58268d = i13;
        this.f58269e = recyclerView;
        this.f58274j = -1;
        if (recyclerLayoutManager.k()) {
            j1 j1Var = new j1(recyclerLayoutManager);
            Intrinsics.checkNotNullExpressionValue(j1Var, "createHorizontalHelper(...)");
            this.f58276l = j1Var;
            WeakHashMap weakHashMap = v0.f102521a;
            this.f58277m = new x0(this, recyclerView.getLayoutDirection());
        } else {
            if (!recyclerLayoutManager.l()) {
                throw new IllegalStateException("RecyclerView must be scrollable");
            }
            k1 k1Var = new k1(recyclerLayoutManager);
            Intrinsics.checkNotNullExpressionValue(k1Var, "createVerticalHelper(...)");
            this.f58276l = k1Var;
            this.f58277m = new x0(this, 0);
        }
        this.f58275k = new Scroller(recyclerView.getContext());
        n(recyclerLayoutManager);
    }

    @Override // androidx.recyclerview.widget.c3
    public final void b(RecyclerView recyclerView) {
        super.b(recyclerView);
    }

    @Override // androidx.recyclerview.widget.c3
    public final int[] c(l2 layoutManager, View targetView) {
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        Intrinsics.checkNotNullParameter(targetView, "targetView");
        int[] iArr = new int[2];
        boolean k13 = layoutManager.k();
        x0 x0Var = this.f58277m;
        if (k13) {
            iArr[0] = x0Var.h(targetView);
        }
        if (layoutManager.l()) {
            iArr[1] = x0Var.h(targetView);
        }
        l lVar = this.f58273i;
        if (lVar != null) {
            if (iArr[0] == 0 && iArr[1] == 0) {
                lVar.j(l2.Z(targetView));
            } else {
                lVar.i(l2.Z(targetView));
            }
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.c3
    public final m1 f(l2 layoutManager) {
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        if (!(layoutManager instanceof u2)) {
            return null;
        }
        return new m1(9, this.f58269e.getContext(), this);
    }

    @Override // androidx.recyclerview.widget.c3
    public final View h(l2 layoutManager) {
        int i13;
        View z13;
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        LinearLayoutManager layoutManager2 = (LinearLayoutManager) layoutManager;
        int k13 = layoutManager2.k1();
        if (k13 == -1) {
            i13 = -1;
        } else {
            n(layoutManager2);
            if (k13 >= this.f58274j) {
                i13 = layoutManager2.h1();
                if (i13 == -1 || i13 % this.f58270f != 0) {
                    i13 = o(this.f58270f + k13);
                }
            } else {
                int o13 = o(k13);
                if (layoutManager2.z(o13) == null) {
                    x0 x0Var = this.f58277m;
                    x0Var.getClass();
                    Intrinsics.checkNotNullParameter(layoutManager2, "layoutManager");
                    int[] iArr = new int[2];
                    int k14 = layoutManager2.k1();
                    boolean k15 = layoutManager2.k();
                    Object obj = x0Var.f16148b;
                    if (k15 && o13 <= k14) {
                        if (x0Var.f16147a) {
                            m mVar = (m) obj;
                            iArr[0] = ((k14 - o13) * mVar.f58272h) + mVar.f58276l.b(layoutManager2.z(layoutManager2.l1()));
                        } else {
                            m mVar2 = (m) obj;
                            iArr[0] = mVar2.f58276l.e(layoutManager2.z(k14)) - ((k14 - o13) * mVar2.f58272h);
                        }
                    }
                    if (layoutManager2.l() && o13 <= k14 && (z13 = layoutManager2.z(k14)) != null) {
                        iArr[1] = z13.getTop() - ((k14 - o13) * ((m) obj).f58272h);
                    }
                    this.f58269e.Z2(iArr[0], iArr[1]);
                }
                i13 = o13;
            }
            this.f58274j = k13;
        }
        if (i13 == -1) {
            return null;
        }
        return layoutManager.z(i13);
    }

    @Override // androidx.recyclerview.widget.c3
    public final int i(l2 layoutManager, int i13, int i14) {
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        n(layoutManager);
        Scroller scroller = this.f58275k;
        scroller.fling(0, 0, i13, i14, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        x0 x0Var = this.f58277m;
        if (i13 != 0) {
            return x0Var.f(linearLayoutManager, scroller.getFinalX(), this.f58272h);
        }
        if (i14 != 0) {
            return x0Var.f(linearLayoutManager, scroller.getFinalY(), this.f58272h);
        }
        return -1;
    }

    public final void l() {
        super.b(this.f58269e);
    }

    public final void m() {
        this.f58273i = null;
        super.b(null);
    }

    public final void n(l2 l2Var) {
        View D;
        if (this.f58272h != 0) {
            return;
        }
        View D2 = l2Var.D(0);
        if (D2 == null) {
            D2 = null;
        }
        if (D2 == null || (D = l2Var.D(0)) == null) {
            return;
        }
        boolean k13 = l2Var.k();
        RecyclerView recyclerView = this.f58269e;
        if (k13) {
            this.f58272h = D.getWidth();
            this.f58270f = (recyclerView.getWidth() / this.f58272h) * (l2Var instanceof GridLayoutManager ? ((GridLayoutManager) l2Var).F : 1);
        } else if (l2Var.l()) {
            this.f58272h = D.getHeight();
            this.f58270f = (recyclerView.getHeight() / this.f58272h) * (l2Var instanceof GridLayoutManager ? ((GridLayoutManager) l2Var).F : 1);
        }
        this.f58271g = this.f58270f * this.f58268d;
    }

    public final int o(int i13) {
        return i13 - (i13 % this.f58270f);
    }
}
