package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean E;
    public int F;
    public int[] G;
    public View[] H;
    public final SparseIntArray I;

    /* renamed from: J */
    public final SparseIntArray f19154J;
    public j0 K;
    public final Rect L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i13, int i14) {
        super(context, attributeSet, i13, i14);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.f19154J = new SparseIntArray();
        this.K = new i0(0);
        this.L = new Rect();
        R1(l2.a0(context, attributeSet, i13, i14).f19463b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.l2
    public final RecyclerView.LayoutParams A() {
        return this.f19157p == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.l2
    public final RecyclerView.LayoutParams B(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.l2
    public final RecyclerView.LayoutParams C(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void D1(boolean z13) {
        if (z13) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.D1(false);
    }

    @Override // androidx.recyclerview.widget.l2
    public final int H(q2 q2Var, w2 w2Var) {
        if (this.f19157p == 1) {
            return this.F;
        }
        if (w2Var.b() < 1) {
            return 0;
        }
        return M1(w2Var.b() - 1, q2Var, w2Var) + 1;
    }

    public final void I1(int i13) {
        int i14;
        int[] iArr = this.G;
        int i15 = this.F;
        if (iArr == null || iArr.length != i15 + 1 || iArr[iArr.length - 1] != i13) {
            iArr = new int[i15 + 1];
        }
        int i16 = 0;
        iArr[0] = 0;
        int i17 = i13 / i15;
        int i18 = i13 % i15;
        int i19 = 0;
        for (int i23 = 1; i23 <= i15; i23++) {
            i16 += i18;
            if (i16 <= 0 || i15 - i16 >= i18) {
                i14 = i17;
            } else {
                i14 = i17 + 1;
                i16 -= i15;
            }
            i19 += i14;
            iArr[i23] = i19;
        }
        this.G = iArr;
    }

    public final void J1() {
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    public final int K1(int i13, int i14) {
        if (this.f19157p != 1 || !u1()) {
            int[] iArr = this.G;
            return iArr[i14 + i13] - iArr[i13];
        }
        int[] iArr2 = this.G;
        int i15 = this.F;
        return iArr2[i15 - i13] - iArr2[(i15 - i13) - i14];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.l2
    public final int L0(int i13, q2 q2Var, w2 w2Var) {
        S1();
        J1();
        return super.L0(i13, q2Var, w2Var);
    }

    public final int L1() {
        return this.F;
    }

    public final int M1(int i13, q2 q2Var, w2 w2Var) {
        if (!w2Var.f19683g) {
            return this.K.a(i13, this.F);
        }
        int b13 = q2Var.b(i13);
        if (b13 != -1) {
            return this.K.a(b13, this.F);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i13);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.l2
    public final int N0(int i13, q2 q2Var, w2 w2Var) {
        S1();
        J1();
        return super.N0(i13, q2Var, w2Var);
    }

    public final int N1(int i13, q2 q2Var, w2 w2Var) {
        if (!w2Var.f19683g) {
            return this.K.b(i13, this.F);
        }
        int i14 = this.f19154J.get(i13, -1);
        if (i14 != -1) {
            return i14;
        }
        int b13 = q2Var.b(i13);
        if (b13 != -1) {
            return this.K.b(b13, this.F);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i13);
        return 0;
    }

    public final int O1(int i13, q2 q2Var, w2 w2Var) {
        if (!w2Var.f19683g) {
            return this.K.c(i13);
        }
        int i14 = this.I.get(i13, -1);
        if (i14 != -1) {
            return i14;
        }
        int b13 = q2Var.b(i13);
        if (b13 != -1) {
            return this.K.c(b13);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i13);
        return 1;
    }

    public final j0 P1() {
        return this.K;
    }

    @Override // androidx.recyclerview.widget.l2
    public final void Q0(Rect rect, int i13, int i14) {
        int n13;
        int n14;
        if (this.G == null) {
            super.Q0(rect, i13, i14);
        }
        int W = W() + V();
        int T = T() + Y();
        if (this.f19157p == 1) {
            n14 = l2.n(i14, rect.height() + T, R());
            int[] iArr = this.G;
            n13 = l2.n(i13, iArr[iArr.length - 1] + W, S());
        } else {
            n13 = l2.n(i13, rect.width() + W, S());
            int[] iArr2 = this.G;
            n14 = l2.n(i14, iArr2[iArr2.length - 1] + T, R());
        }
        this.f19494b.setMeasuredDimension(n13, n14);
    }

    public final void Q1(View view, int i13, boolean z13) {
        int i14;
        int i15;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.f19269b;
        int i16 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        int i17 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int K1 = K1(layoutParams.f19155e, layoutParams.f19156f);
        if (this.f19157p == 1) {
            i15 = l2.F(false, K1, i13, i17, ((ViewGroup.MarginLayoutParams) layoutParams).width);
            i14 = l2.F(true, this.f19159r.l(), this.f19505m, i16, ((ViewGroup.MarginLayoutParams) layoutParams).height);
        } else {
            int F = l2.F(false, K1, i13, i16, ((ViewGroup.MarginLayoutParams) layoutParams).height);
            int F2 = l2.F(true, this.f19159r.l(), this.f19504l, i17, ((ViewGroup.MarginLayoutParams) layoutParams).width);
            i14 = F;
            i15 = F2;
        }
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (z13 ? V0(view, i15, i14, layoutParams2) : T0(view, i15, i14, layoutParams2)) {
            view.measure(i15, i14);
        }
    }

    public final void R1(int i13) {
        if (i13 == this.F) {
            return;
        }
        this.E = true;
        if (i13 < 1) {
            throw new IllegalArgumentException(a.a.d("Span count should be at least 1. Provided ", i13));
        }
        this.F = i13;
        this.K.e();
        J0();
    }

    public final void S1() {
        int T;
        int Y;
        if (this.f19157p == 1) {
            T = this.f19506n - W();
            Y = V();
        } else {
            T = this.f19507o - T();
            Y = Y();
        }
        I1(T - Y);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.l2
    public final boolean Y0() {
        return this.f19167z == null && !this.E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void a1(w2 w2Var, z0 z0Var, g1.i iVar) {
        int i13;
        int i14 = this.F;
        for (int i15 = 0; i15 < this.F && (i13 = z0Var.f19744d) >= 0 && i13 < w2Var.b() && i14 > 0; i15++) {
            int i16 = z0Var.f19744d;
            iVar.b(i16, Math.max(0, z0Var.f19747g));
            i14 -= this.K.c(i16);
            z0Var.f19744d += z0Var.f19745e;
        }
    }

    @Override // androidx.recyclerview.widget.l2
    public final int b0(q2 q2Var, w2 w2Var) {
        if (this.f19157p == 0) {
            return this.F;
        }
        if (w2Var.b() < 1) {
            return 0;
        }
        return M1(w2Var.b() - 1, q2Var, w2Var) + 1;
    }

    @Override // androidx.recyclerview.widget.l2
    public final boolean m(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c9, code lost:
    
        if (r13 == (r2 > r15)) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f5, code lost:
    
        if (r13 == (r2 > r8 ? r9 : false)) goto L164;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0110  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.l2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View n0(android.view.View r23, int r24, androidx.recyclerview.widget.q2 r25, androidx.recyclerview.widget.w2 r26) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.n0(android.view.View, int, androidx.recyclerview.widget.q2, androidx.recyclerview.widget.w2):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View o1(q2 q2Var, w2 w2Var, boolean z13, boolean z14) {
        int i13;
        int i14;
        int E = E();
        int i15 = 1;
        if (z14) {
            i14 = E() - 1;
            i13 = -1;
            i15 = -1;
        } else {
            i13 = E;
            i14 = 0;
        }
        int b13 = w2Var.b();
        f1();
        int k13 = this.f19159r.k();
        int g13 = this.f19159r.g();
        View view = null;
        View view2 = null;
        while (i14 != i13) {
            View D = D(i14);
            int Z = l2.Z(D);
            if (Z >= 0 && Z < b13 && N1(Z, q2Var, w2Var) == 0) {
                if (((RecyclerView.LayoutParams) D.getLayoutParams()).f19268a.z()) {
                    if (view2 == null) {
                        view2 = D;
                    }
                } else {
                    if (this.f19159r.e(D) < g13 && this.f19159r.b(D) >= k13) {
                        return D;
                    }
                    if (view == null) {
                        view = D;
                    }
                }
            }
            i14 += i15;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.l2
    public final void p0(q2 q2Var, w2 w2Var, r5.e eVar) {
        super.p0(q2Var, w2Var, eVar);
        eVar.r(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.l2
    public final int r(w2 w2Var) {
        return c1(w2Var);
    }

    @Override // androidx.recyclerview.widget.l2
    public final void r0(q2 q2Var, w2 w2Var, View view, r5.e eVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            q0(view, eVar);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int M1 = M1(layoutParams2.f19268a.m(), q2Var, w2Var);
        if (this.f19157p == 0) {
            eVar.u(y1.j(layoutParams2.b(), layoutParams2.c(), M1, 1, false, false));
        } else {
            eVar.u(y1.j(M1, 1, layoutParams2.b(), layoutParams2.c(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.l2
    public final int s(w2 w2Var) {
        return d1(w2Var);
    }

    @Override // androidx.recyclerview.widget.l2
    public final void s0(RecyclerView recyclerView, int i13, int i14) {
        this.K.e();
        this.K.d();
    }

    @Override // androidx.recyclerview.widget.l2
    public final void t0(RecyclerView recyclerView) {
        this.K.e();
        this.K.d();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.l2
    public final int u(w2 w2Var) {
        return c1(w2Var);
    }

    @Override // androidx.recyclerview.widget.l2
    public final void u0(RecyclerView recyclerView, int i13, int i14) {
        this.K.e();
        this.K.d();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.l2
    public final int v(w2 w2Var) {
        return d1(w2Var);
    }

    @Override // androidx.recyclerview.widget.l2
    public final void v0(RecyclerView recyclerView, int i13, int i14) {
        this.K.e();
        this.K.d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
    
        r22.f19712b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a0, code lost:
    
        return;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v1(androidx.recyclerview.widget.q2 r19, androidx.recyclerview.widget.w2 r20, androidx.recyclerview.widget.z0 r21, androidx.recyclerview.widget.y0 r22) {
        /*
            Method dump skipped, instructions count: 621
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.v1(androidx.recyclerview.widget.q2, androidx.recyclerview.widget.w2, androidx.recyclerview.widget.z0, androidx.recyclerview.widget.y0):void");
    }

    @Override // androidx.recyclerview.widget.l2
    public final void w0(RecyclerView recyclerView, int i13, int i14) {
        this.K.e();
        this.K.d();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void w1(q2 q2Var, w2 w2Var, x0 x0Var, int i13) {
        S1();
        if (w2Var.b() > 0 && !w2Var.f19683g) {
            boolean z13 = i13 == 1;
            int N1 = N1(x0Var.f19695b, q2Var, w2Var);
            if (z13) {
                while (N1 > 0) {
                    int i14 = x0Var.f19695b;
                    if (i14 <= 0) {
                        break;
                    }
                    int i15 = i14 - 1;
                    x0Var.f19695b = i15;
                    N1 = N1(i15, q2Var, w2Var);
                }
            } else {
                int b13 = w2Var.b() - 1;
                int i16 = x0Var.f19695b;
                while (i16 < b13) {
                    int i17 = i16 + 1;
                    int N12 = N1(i17, q2Var, w2Var);
                    if (N12 <= N1) {
                        break;
                    }
                    i16 = i17;
                    N1 = N12;
                }
                x0Var.f19695b = i16;
            }
        }
        J1();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.l2
    public void x0(q2 q2Var, w2 w2Var) {
        boolean z13 = w2Var.f19683g;
        SparseIntArray sparseIntArray = this.f19154J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z13) {
            int E = E();
            for (int i13 = 0; i13 < E; i13++) {
                LayoutParams layoutParams = (LayoutParams) D(i13).getLayoutParams();
                int m13 = layoutParams.f19268a.m();
                sparseIntArray2.put(m13, layoutParams.c());
                sparseIntArray.put(m13, layoutParams.b());
            }
        }
        super.x0(q2Var, w2Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.l2
    public void y0(w2 w2Var) {
        super.y0(w2Var);
        this.E = false;
    }

    /* loaded from: classes3.dex */
    public static class LayoutParams extends RecyclerView.LayoutParams {

        /* renamed from: e */
        public int f19155e;

        /* renamed from: f */
        public int f19156f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f19155e = -1;
            this.f19156f = 0;
        }

        public final int b() {
            return this.f19155e;
        }

        public final int c() {
            return this.f19156f;
        }

        public LayoutParams(int i13, int i14) {
            super(i13, i14);
            this.f19155e = -1;
            this.f19156f = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f19155e = -1;
            this.f19156f = 0;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f19155e = -1;
            this.f19156f = 0;
        }
    }

    public GridLayoutManager(int i13) {
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.f19154J = new SparseIntArray();
        this.K = new i0(0);
        this.L = new Rect();
        R1(i13);
    }

    public GridLayoutManager(int i13, int i14, boolean z13) {
        super(i14, z13);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.f19154J = new SparseIntArray();
        this.K = new i0(0);
        this.L = new Rect();
        R1(i13);
    }
}
