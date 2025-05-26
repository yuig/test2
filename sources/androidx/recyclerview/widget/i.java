package androidx.recyclerview.widget;

import a.cb;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final y1 f19441a;

    /* renamed from: e, reason: collision with root package name */
    public View f19445e;

    /* renamed from: d, reason: collision with root package name */
    public int f19444d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final h f19442b = new h();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f19443c = new ArrayList();

    public i(y1 y1Var) {
        this.f19441a = y1Var;
    }

    public final void a(View view, int i13, boolean z13) {
        y1 y1Var = this.f19441a;
        int g13 = i13 < 0 ? y1Var.g() : f(i13);
        this.f19442b.e(g13, z13);
        if (z13) {
            g(view);
        }
        RecyclerView recyclerView = (RecyclerView) y1Var.f19715a;
        recyclerView.addView(view, g13);
        y2 w13 = RecyclerView.w1(view);
        b2 b2Var = recyclerView.f19240m;
        if (b2Var != null && w13 != null) {
            b2Var.w(w13);
        }
        ArrayList arrayList = recyclerView.C;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((m2) recyclerView.C.get(size)).d(view);
            }
        }
    }

    public final void b(View view, int i13, ViewGroup.LayoutParams layoutParams, boolean z13) {
        y1 y1Var = this.f19441a;
        int g13 = i13 < 0 ? y1Var.g() : f(i13);
        this.f19442b.e(g13, z13);
        if (z13) {
            g(view);
        }
        y1Var.getClass();
        y2 w13 = RecyclerView.w1(view);
        Object obj = y1Var.f19715a;
        if (w13 != null) {
            if (!w13.L() && !w13.d0()) {
                StringBuilder sb3 = new StringBuilder("Called attach on a child which is not detached: ");
                sb3.append(w13);
                throw new IllegalArgumentException(cb.f((RecyclerView) obj, sb3));
            }
            w13.f19726j &= -257;
        }
        ((RecyclerView) obj).attachViewToParent(view, g13, layoutParams);
    }

    public final void c(int i13) {
        int f13 = f(i13);
        this.f19442b.f(f13);
        y1 y1Var = this.f19441a;
        View f14 = y1Var.f(f13);
        Object obj = y1Var.f19715a;
        if (f14 != null) {
            y2 w13 = RecyclerView.w1(f14);
            if (w13 != null) {
                if (w13.L() && !w13.d0()) {
                    StringBuilder sb3 = new StringBuilder("called detach on an already detached child ");
                    sb3.append(w13);
                    throw new IllegalArgumentException(cb.f((RecyclerView) obj, sb3));
                }
                w13.g(RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER);
            }
        } else {
            int[] iArr = RecyclerView.A0;
        }
        ((RecyclerView) obj).detachViewFromParent(f13);
    }

    public final View d(int i13) {
        return this.f19441a.f(f(i13));
    }

    public final int e() {
        return this.f19441a.g() - this.f19443c.size();
    }

    public final int f(int i13) {
        if (i13 < 0) {
            return -1;
        }
        int g13 = this.f19441a.g();
        int i14 = i13;
        while (i14 < g13) {
            h hVar = this.f19442b;
            int b13 = i13 - (i14 - hVar.b(i14));
            if (b13 == 0) {
                while (hVar.d(i14)) {
                    i14++;
                }
                return i14;
            }
            i14 += b13;
        }
        return -1;
    }

    public final void g(View view) {
        this.f19443c.add(view);
        y1 y1Var = this.f19441a;
        y1Var.getClass();
        y2 w13 = RecyclerView.w1(view);
        if (w13 != null) {
            RecyclerView recyclerView = (RecyclerView) y1Var.f19715a;
            int i13 = w13.f19733q;
            View view2 = w13.f19717a;
            if (i13 != -1) {
                w13.f19732p = i13;
            } else {
                WeakHashMap weakHashMap = q5.v0.f102521a;
                w13.f19732p = view2.getImportantForAccessibility();
            }
            if (recyclerView.V1()) {
                w13.f19733q = 4;
                recyclerView.f19257u0.add(w13);
            } else {
                WeakHashMap weakHashMap2 = q5.v0.f102521a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public final int h(View view) {
        int indexOfChild = ((RecyclerView) this.f19441a.f19715a).indexOfChild(view);
        if (indexOfChild == -1) {
            return -1;
        }
        h hVar = this.f19442b;
        if (hVar.d(indexOfChild)) {
            return -1;
        }
        return indexOfChild - hVar.b(indexOfChild);
    }

    public final boolean i(View view) {
        return this.f19443c.contains(view);
    }

    public final void j(int i13) {
        y1 y1Var = this.f19441a;
        int i14 = this.f19444d;
        if (i14 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i14 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int f13 = f(i13);
            View f14 = y1Var.f(f13);
            if (f14 == null) {
                this.f19444d = 0;
                this.f19445e = null;
                return;
            }
            this.f19444d = 1;
            this.f19445e = f14;
            if (this.f19442b.f(f13)) {
                l(f14);
            }
            y1Var.o(f13);
            this.f19444d = 0;
            this.f19445e = null;
        } catch (Throwable th3) {
            this.f19444d = 0;
            this.f19445e = null;
            throw th3;
        }
    }

    public final void k(View view) {
        int indexOfChild = ((RecyclerView) this.f19441a.f19715a).indexOfChild(view);
        if (indexOfChild < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        h hVar = this.f19442b;
        if (hVar.d(indexOfChild)) {
            hVar.a(indexOfChild);
            l(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public final void l(View view) {
        if (this.f19443c.remove(view)) {
            y1 y1Var = this.f19441a;
            y1Var.getClass();
            y2 w13 = RecyclerView.w1(view);
            if (w13 != null) {
                RecyclerView recyclerView = (RecyclerView) y1Var.f19715a;
                int i13 = w13.f19732p;
                if (recyclerView.V1()) {
                    w13.f19733q = i13;
                    recyclerView.f19257u0.add(w13);
                } else {
                    WeakHashMap weakHashMap = q5.v0.f102521a;
                    w13.f19717a.setImportantForAccessibility(i13);
                }
                w13.f19732p = 0;
            }
        }
    }

    public final String toString() {
        return this.f19442b.toString() + ", hidden list:" + this.f19443c.size();
    }
}
