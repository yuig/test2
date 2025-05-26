package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import android.widget.Scroller;

/* loaded from: classes3.dex */
public final class d1 extends c3 {

    /* renamed from: d, reason: collision with root package name */
    public k1 f19357d;

    /* renamed from: e, reason: collision with root package name */
    public j1 f19358e;

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
            l1 n13 = n(l2Var);
            iArr[0] = ((n13.c(view) / 2) + n13.e(view)) - ((n13.l() / 2) + n13.k());
        } else {
            iArr[0] = 0;
        }
        if (l2Var.l()) {
            l1 o13 = o(l2Var);
            iArr[1] = ((o13.c(view) / 2) + o13.e(view)) - ((o13.l() / 2) + o13.k());
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.c3
    public final View h(l2 l2Var) {
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
        int P;
        View h10;
        int Z;
        int i15;
        PointF a13;
        int i16;
        int i17;
        if (!(l2Var instanceof u2) || (P = l2Var.P()) == 0 || (h10 = h(l2Var)) == null || (Z = l2.Z(h10)) == -1 || (a13 = ((u2) l2Var).a(P - 1)) == null) {
            return -1;
        }
        if (l2Var.k()) {
            i16 = l(l2Var, n(l2Var), i13, 0);
            if (a13.x < 0.0f) {
                i16 = -i16;
            }
        } else {
            i16 = 0;
        }
        if (l2Var.l()) {
            i17 = l(l2Var, o(l2Var), 0, i14);
            if (a13.y < 0.0f) {
                i17 = -i17;
            }
        } else {
            i17 = 0;
        }
        if (l2Var.l()) {
            i16 = i17;
        }
        if (i16 == 0) {
            return -1;
        }
        int i18 = Z + i16;
        int i19 = i18 >= 0 ? i18 : 0;
        return i19 >= P ? i15 : i19;
    }

    public final int l(l2 l2Var, l1 l1Var, int i13, int i14) {
        ((Scroller) this.f19351b).fling(0, 0, i13, i14, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        int[] iArr = {((Scroller) this.f19351b).getFinalX(), ((Scroller) this.f19351b).getFinalY()};
        int E = l2Var.E();
        float f13 = 1.0f;
        if (E != 0) {
            View view = null;
            int i15 = Integer.MIN_VALUE;
            int i16 = Integer.MAX_VALUE;
            View view2 = null;
            for (int i17 = 0; i17 < E; i17++) {
                View D = l2Var.D(i17);
                int Z = l2.Z(D);
                if (Z != -1) {
                    if (Z < i16) {
                        view = D;
                        i16 = Z;
                    }
                    if (Z > i15) {
                        view2 = D;
                        i15 = Z;
                    }
                }
            }
            if (view != null && view2 != null) {
                int max = Math.max(l1Var.b(view), l1Var.b(view2)) - Math.min(l1Var.e(view), l1Var.e(view2));
                if (max != 0) {
                    f13 = (max * 1.0f) / ((i15 - i16) + 1);
                }
            }
        }
        if (f13 <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(iArr[0]) > Math.abs(iArr[1]) ? iArr[0] : iArr[1]) / f13);
    }

    public final l1 n(l2 l2Var) {
        j1 j1Var = this.f19358e;
        if (j1Var == null || j1Var.f19490a != l2Var) {
            this.f19358e = new j1(l2Var);
        }
        return this.f19358e;
    }

    public final l1 o(l2 l2Var) {
        k1 k1Var = this.f19357d;
        if (k1Var == null || k1Var.f19490a != l2Var) {
            this.f19357d = new k1(l2Var);
        }
        return this.f19357d;
    }
}
