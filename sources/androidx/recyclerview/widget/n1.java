package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;

/* loaded from: classes.dex */
public class n1 extends c3 {

    /* renamed from: d, reason: collision with root package name */
    public k1 f19524d;

    /* renamed from: e, reason: collision with root package name */
    public j1 f19525e;

    public static int l(View view, l1 l1Var) {
        return ((l1Var.c(view) / 2) + l1Var.e(view)) - ((l1Var.l() / 2) + l1Var.k());
    }

    public static View m(l2 l2Var, l1 l1Var) {
        int E = l2Var.E();
        View view = null;
        if (E == 0) {
            return null;
        }
        int l13 = (l1Var.l() / 2) + l1Var.k();
        int i13 = Integer.MAX_VALUE;
        for (int i14 = 0; i14 < E; i14++) {
            View D = l2Var.D(i14);
            int abs = Math.abs(((l1Var.c(D) / 2) + l1Var.e(D)) - l13);
            if (abs < i13) {
                view = D;
                i13 = abs;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.c3
    public final int[] c(l2 l2Var, View view) {
        int[] iArr = new int[2];
        if (l2Var.k()) {
            iArr[0] = l(view, n(l2Var));
        } else {
            iArr[0] = 0;
        }
        if (l2Var.l()) {
            iArr[1] = l(view, o(l2Var));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.c3
    public final m1 f(l2 l2Var) {
        if (!(l2Var instanceof u2)) {
            return null;
        }
        return new m1(0, ((RecyclerView) this.f19350a).getContext(), this);
    }

    @Override // androidx.recyclerview.widget.c3
    public View h(l2 l2Var) {
        if (l2Var.l()) {
            return m(l2Var, o(l2Var));
        }
        if (l2Var.k()) {
            return m(l2Var, n(l2Var));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.c3
    public final int i(l2 l2Var, int i13, int i14) {
        PointF a13;
        int P = l2Var.P();
        if (P == 0) {
            return -1;
        }
        View view = null;
        l1 o13 = l2Var.l() ? o(l2Var) : l2Var.k() ? n(l2Var) : null;
        if (o13 == null) {
            return -1;
        }
        int E = l2Var.E();
        boolean z13 = false;
        int i15 = Integer.MAX_VALUE;
        int i16 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i17 = 0; i17 < E; i17++) {
            View D = l2Var.D(i17);
            if (D != null) {
                int l13 = l(D, o13);
                if (l13 <= 0 && l13 > i16) {
                    view2 = D;
                    i16 = l13;
                }
                if (l13 >= 0 && l13 < i15) {
                    view = D;
                    i15 = l13;
                }
            }
        }
        boolean z14 = !l2Var.k() ? i14 <= 0 : i13 <= 0;
        if (z14 && view != null) {
            return l2.Z(view);
        }
        if (!z14 && view2 != null) {
            return l2.Z(view2);
        }
        if (z14) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int Z = l2.Z(view);
        int P2 = l2Var.P();
        if ((l2Var instanceof u2) && (a13 = ((u2) l2Var).a(P2 - 1)) != null && (a13.x < 0.0f || a13.y < 0.0f)) {
            z13 = true;
        }
        int i18 = Z + (z13 == z14 ? -1 : 1);
        if (i18 < 0 || i18 >= P) {
            return -1;
        }
        return i18;
    }

    public final l1 n(l2 l2Var) {
        j1 j1Var = this.f19525e;
        if (j1Var == null || j1Var.f19490a != l2Var) {
            this.f19525e = new j1(l2Var);
        }
        return this.f19525e;
    }

    public final l1 o(l2 l2Var) {
        k1 k1Var = this.f19524d;
        if (k1Var == null || k1Var.f19490a != l2Var) {
            this.f19524d = new k1(l2Var);
        }
        return this.f19524d;
    }
}
