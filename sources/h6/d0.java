package h6;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f67704a;

    /* renamed from: b, reason: collision with root package name */
    public g0 f67705b;

    public d0(int i13) {
        this.f67704a = new SparseArray(i13);
    }

    public final void a(g0 g0Var, int i13, int i14) {
        int a13 = g0Var.a(i13);
        SparseArray sparseArray = this.f67704a;
        d0 d0Var = sparseArray == null ? null : (d0) sparseArray.get(a13);
        if (d0Var == null) {
            d0Var = new d0(1);
            sparseArray.put(g0Var.a(i13), d0Var);
        }
        if (i14 > i13) {
            d0Var.a(g0Var, i13 + 1, i14);
        } else {
            d0Var.f67705b = g0Var;
        }
    }
}
