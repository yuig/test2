package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends l2 implements p0, u2 {
    public final x0 A;
    public final y0 B;
    public final int C;
    public final int[] D;

    /* renamed from: p */
    public int f19157p;

    /* renamed from: q */
    public z0 f19158q;

    /* renamed from: r */
    public l1 f19159r;

    /* renamed from: s */
    public boolean f19160s;

    /* renamed from: t */
    public final boolean f19161t;

    /* renamed from: u */
    public boolean f19162u;

    /* renamed from: v */
    public boolean f19163v;

    /* renamed from: w */
    public final boolean f19164w;

    /* renamed from: x */
    public int f19165x;

    /* renamed from: y */
    public int f19166y;

    /* renamed from: z */
    public SavedState f19167z;

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes3.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a1();

        /* renamed from: a */
        public int f19168a;

        /* renamed from: b */
        public int f19169b;

        /* renamed from: c */
        public boolean f19170c;

        public SavedState(SavedState savedState) {
            this.f19168a = savedState.f19168a;
            this.f19169b = savedState.f19169b;
            this.f19170c = savedState.f19170c;
        }

        public final boolean a() {
            return this.f19168a >= 0;
        }

        public final void b() {
            this.f19168a = -1;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.writeInt(this.f19168a);
            parcel.writeInt(this.f19169b);
            parcel.writeInt(this.f19170c ? 1 : 0);
        }
    }

    public LinearLayoutManager() {
        this(1, false);
    }

    @Override // androidx.recyclerview.widget.l2
    public RecyclerView.LayoutParams A() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.l2
    public final Parcelable A0() {
        SavedState savedState = this.f19167z;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        if (E() > 0) {
            f1();
            boolean z13 = this.f19160s ^ this.f19162u;
            savedState2.f19170c = z13;
            if (z13) {
                View r13 = r1();
                savedState2.f19169b = this.f19159r.g() - this.f19159r.b(r13);
                savedState2.f19168a = l2.Z(r13);
            } else {
                View s13 = s1();
                savedState2.f19168a = l2.Z(s13);
                savedState2.f19169b = this.f19159r.e(s13) - this.f19159r.k();
            }
        } else {
            savedState2.b();
        }
        return savedState2;
    }

    public final int A1(int i13, q2 q2Var, w2 w2Var) {
        if (E() == 0 || i13 == 0) {
            return 0;
        }
        f1();
        this.f19158q.f19741a = true;
        int i14 = i13 > 0 ? 1 : -1;
        int abs = Math.abs(i13);
        F1(i14, abs, true, w2Var);
        z0 z0Var = this.f19158q;
        int g13 = g1(q2Var, z0Var, w2Var, false) + z0Var.f19747g;
        if (g13 < 0) {
            return 0;
        }
        if (abs > g13) {
            i13 = i14 * g13;
        }
        this.f19159r.p(-i13);
        this.f19158q.f19750j = i13;
        return i13;
    }

    public final void B1(int i13, int i14) {
        this.f19165x = i13;
        this.f19166y = i14;
        SavedState savedState = this.f19167z;
        if (savedState != null) {
            savedState.b();
        }
        J0();
    }

    public final void C1(int i13) {
        if (i13 != 0 && i13 != 1) {
            throw new IllegalArgumentException(a.a.d("invalid orientation:", i13));
        }
        h(null);
        if (i13 != this.f19157p || this.f19159r == null) {
            l1 a13 = l1.a(this, i13);
            this.f19159r = a13;
            this.A.f19694a = a13;
            this.f19157p = i13;
            J0();
        }
    }

    public void D1(boolean z13) {
        h(null);
        if (this.f19163v == z13) {
            return;
        }
        this.f19163v = z13;
        J0();
    }

    public final boolean E1(q2 q2Var, w2 w2Var, x0 x0Var) {
        View o13;
        View focusedChild;
        boolean z13 = false;
        if (E() == 0) {
            return false;
        }
        RecyclerView recyclerView = this.f19494b;
        View view = null;
        if (recyclerView != null && (focusedChild = recyclerView.getFocusedChild()) != null && !this.f19493a.i(focusedChild)) {
            view = focusedChild;
        }
        if (view != null) {
            x0Var.getClass();
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            if (!layoutParams.f19268a.z() && layoutParams.f19268a.m() >= 0 && layoutParams.f19268a.m() < w2Var.b()) {
                x0Var.c(view, l2.Z(view));
                return true;
            }
        }
        boolean z14 = this.f19160s;
        boolean z15 = this.f19163v;
        if (z14 != z15 || (o13 = o1(q2Var, w2Var, x0Var.f19697d, z15)) == null) {
            return false;
        }
        x0Var.b(o13, l2.Z(o13));
        if (!w2Var.f19683g && Y0()) {
            int e13 = this.f19159r.e(o13);
            int b13 = this.f19159r.b(o13);
            int k13 = this.f19159r.k();
            int g13 = this.f19159r.g();
            boolean z16 = b13 <= k13 && e13 < k13;
            if (e13 >= g13 && b13 > g13) {
                z13 = true;
            }
            if (z16 || z13) {
                if (x0Var.f19697d) {
                    k13 = g13;
                }
                x0Var.f19696c = k13;
            }
        }
        return true;
    }

    public final void F1(int i13, int i14, boolean z13, w2 w2Var) {
        int k13;
        this.f19158q.f19752l = this.f19159r.i() == 0 && this.f19159r.f() == 0;
        this.f19158q.f19746f = i13;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        Z0(w2Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z14 = i13 == 1;
        z0 z0Var = this.f19158q;
        int i15 = z14 ? max2 : max;
        z0Var.f19748h = i15;
        if (!z14) {
            max = max2;
        }
        z0Var.f19749i = max;
        if (z14) {
            z0Var.f19748h = this.f19159r.h() + i15;
            View r13 = r1();
            z0 z0Var2 = this.f19158q;
            z0Var2.f19745e = this.f19162u ? -1 : 1;
            int Z = l2.Z(r13);
            z0 z0Var3 = this.f19158q;
            z0Var2.f19744d = Z + z0Var3.f19745e;
            z0Var3.f19742b = this.f19159r.b(r13);
            k13 = this.f19159r.b(r13) - this.f19159r.g();
        } else {
            View s13 = s1();
            z0 z0Var4 = this.f19158q;
            z0Var4.f19748h = this.f19159r.k() + z0Var4.f19748h;
            z0 z0Var5 = this.f19158q;
            z0Var5.f19745e = this.f19162u ? 1 : -1;
            int Z2 = l2.Z(s13);
            z0 z0Var6 = this.f19158q;
            z0Var5.f19744d = Z2 + z0Var6.f19745e;
            z0Var6.f19742b = this.f19159r.e(s13);
            k13 = (-this.f19159r.e(s13)) + this.f19159r.k();
        }
        z0 z0Var7 = this.f19158q;
        z0Var7.f19743c = i14;
        if (z13) {
            z0Var7.f19743c = i14 - k13;
        }
        z0Var7.f19747g = k13;
    }

    public final void G1(int i13, int i14) {
        this.f19158q.f19743c = this.f19159r.g() - i14;
        z0 z0Var = this.f19158q;
        z0Var.f19745e = this.f19162u ? -1 : 1;
        z0Var.f19744d = i13;
        z0Var.f19746f = 1;
        z0Var.f19742b = i14;
        z0Var.f19747g = Integer.MIN_VALUE;
    }

    public final void H1(int i13, int i14) {
        this.f19158q.f19743c = i14 - this.f19159r.k();
        z0 z0Var = this.f19158q;
        z0Var.f19744d = i13;
        z0Var.f19745e = this.f19162u ? 1 : -1;
        z0Var.f19746f = -1;
        z0Var.f19742b = i14;
        z0Var.f19747g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.l2
    public int L0(int i13, q2 q2Var, w2 w2Var) {
        if (this.f19157p == 1) {
            return 0;
        }
        return A1(i13, q2Var, w2Var);
    }

    @Override // androidx.recyclerview.widget.l2
    public final void M0(int i13) {
        this.f19165x = i13;
        this.f19166y = Integer.MIN_VALUE;
        SavedState savedState = this.f19167z;
        if (savedState != null) {
            savedState.b();
        }
        J0();
    }

    @Override // androidx.recyclerview.widget.l2
    public int N0(int i13, q2 q2Var, w2 w2Var) {
        if (this.f19157p == 0) {
            return 0;
        }
        return A1(i13, q2Var, w2Var);
    }

    @Override // androidx.recyclerview.widget.l2
    public final boolean U0() {
        if (this.f19505m == 1073741824 || this.f19504l == 1073741824) {
            return false;
        }
        int E = E();
        for (int i13 = 0; i13 < E; i13++) {
            ViewGroup.LayoutParams layoutParams = D(i13).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.l2
    public void W0(RecyclerView recyclerView, w2 w2Var, int i13) {
        c1 c1Var = new c1(recyclerView.getContext());
        c1Var.h(i13);
        X0(c1Var);
    }

    @Override // androidx.recyclerview.widget.l2
    public boolean Y0() {
        return this.f19167z == null && this.f19160s == this.f19163v;
    }

    public void Z0(w2 w2Var, int[] iArr) {
        int i13;
        int t13 = t1(w2Var);
        if (this.f19158q.f19746f == -1) {
            i13 = 0;
        } else {
            i13 = t13;
            t13 = 0;
        }
        iArr[0] = t13;
        iArr[1] = i13;
    }

    @Override // androidx.recyclerview.widget.u2
    public final PointF a(int i13) {
        if (E() == 0) {
            return null;
        }
        int i14 = (i13 < l2.Z(D(0))) != this.f19162u ? -1 : 1;
        return this.f19157p == 0 ? new PointF(i14, 0.0f) : new PointF(0.0f, i14);
    }

    public void a1(w2 w2Var, z0 z0Var, g1.i iVar) {
        int i13 = z0Var.f19744d;
        if (i13 < 0 || i13 >= w2Var.b()) {
            return;
        }
        iVar.b(i13, Math.max(0, z0Var.f19747g));
    }

    public final int b1(w2 w2Var) {
        if (E() == 0) {
            return 0;
        }
        f1();
        l1 l1Var = this.f19159r;
        boolean z13 = !this.f19164w;
        return bs1.c.D(w2Var, l1Var, j1(z13), i1(z13), this, this.f19164w);
    }

    public final int c1(w2 w2Var) {
        if (E() == 0) {
            return 0;
        }
        f1();
        l1 l1Var = this.f19159r;
        boolean z13 = !this.f19164w;
        return bs1.c.E(w2Var, l1Var, j1(z13), i1(z13), this, this.f19164w, this.f19162u);
    }

    @Override // androidx.recyclerview.widget.l2
    public final boolean d0() {
        return true;
    }

    public final int d1(w2 w2Var) {
        if (E() == 0) {
            return 0;
        }
        f1();
        l1 l1Var = this.f19159r;
        boolean z13 = !this.f19164w;
        return bs1.c.F(w2Var, l1Var, j1(z13), i1(z13), this, this.f19164w);
    }

    public final int e1(int i13) {
        return i13 != 1 ? i13 != 2 ? i13 != 17 ? i13 != 33 ? i13 != 66 ? (i13 == 130 && this.f19157p == 1) ? 1 : Integer.MIN_VALUE : this.f19157p == 0 ? 1 : Integer.MIN_VALUE : this.f19157p == 1 ? -1 : Integer.MIN_VALUE : this.f19157p == 0 ? -1 : Integer.MIN_VALUE : (this.f19157p != 1 && u1()) ? -1 : 1 : (this.f19157p != 1 && u1()) ? 1 : -1;
    }

    public final void f1() {
        if (this.f19158q == null) {
            z0 z0Var = new z0();
            z0Var.f19741a = true;
            z0Var.f19748h = 0;
            z0Var.f19749i = 0;
            z0Var.f19751k = null;
            this.f19158q = z0Var;
        }
    }

    public final int g1(q2 q2Var, z0 z0Var, w2 w2Var, boolean z13) {
        int i13;
        int i14 = z0Var.f19743c;
        int i15 = z0Var.f19747g;
        if (i15 != Integer.MIN_VALUE) {
            if (i14 < 0) {
                z0Var.f19747g = i15 + i14;
            }
            x1(q2Var, z0Var);
        }
        int i16 = z0Var.f19743c + z0Var.f19748h;
        while (true) {
            if ((!z0Var.f19752l && i16 <= 0) || (i13 = z0Var.f19744d) < 0 || i13 >= w2Var.b()) {
                break;
            }
            y0 y0Var = this.B;
            y0Var.f19711a = 0;
            y0Var.f19712b = false;
            y0Var.f19713c = false;
            y0Var.f19714d = false;
            v1(q2Var, w2Var, z0Var, y0Var);
            if (!y0Var.f19712b) {
                int i17 = z0Var.f19742b;
                int i18 = y0Var.f19711a;
                z0Var.f19742b = (z0Var.f19746f * i18) + i17;
                if (!y0Var.f19713c || z0Var.f19751k != null || !w2Var.f19683g) {
                    z0Var.f19743c -= i18;
                    i16 -= i18;
                }
                int i19 = z0Var.f19747g;
                if (i19 != Integer.MIN_VALUE) {
                    int i23 = i19 + i18;
                    z0Var.f19747g = i23;
                    int i24 = z0Var.f19743c;
                    if (i24 < 0) {
                        z0Var.f19747g = i23 + i24;
                    }
                    x1(q2Var, z0Var);
                }
                if (z13 && y0Var.f19714d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i14 - z0Var.f19743c;
    }

    @Override // androidx.recyclerview.widget.l2
    public final void h(String str) {
        if (this.f19167z == null) {
            super.h(str);
        }
    }

    public final int h1() {
        View n13 = n1(0, E(), true, false);
        if (n13 == null) {
            return -1;
        }
        return l2.Z(n13);
    }

    public final View i1(boolean z13) {
        return this.f19162u ? n1(0, E(), z13, true) : n1(E() - 1, -1, z13, true);
    }

    public final View j1(boolean z13) {
        return this.f19162u ? n1(E() - 1, -1, z13, true) : n1(0, E(), z13, true);
    }

    @Override // androidx.recyclerview.widget.l2
    public boolean k() {
        return this.f19157p == 0;
    }

    public final int k1() {
        View n13 = n1(0, E(), false, true);
        if (n13 == null) {
            return -1;
        }
        return l2.Z(n13);
    }

    @Override // androidx.recyclerview.widget.l2
    public boolean l() {
        return this.f19157p == 1;
    }

    public final int l1() {
        View n13 = n1(E() - 1, -1, false, true);
        if (n13 == null) {
            return -1;
        }
        return l2.Z(n13);
    }

    @Override // androidx.recyclerview.widget.l2
    public void m0(RecyclerView recyclerView, q2 q2Var) {
    }

    public final View m1(int i13, int i14) {
        int i15;
        int i16;
        f1();
        if (i14 <= i13 && i14 >= i13) {
            return D(i13);
        }
        if (this.f19159r.e(D(i13)) < this.f19159r.k()) {
            i15 = 16644;
            i16 = 16388;
        } else {
            i15 = 4161;
            i16 = 4097;
        }
        return this.f19157p == 0 ? this.f19495c.g(i13, i14, i15, i16) : this.f19496d.g(i13, i14, i15, i16);
    }

    @Override // androidx.recyclerview.widget.l2
    public View n0(View view, int i13, q2 q2Var, w2 w2Var) {
        int e13;
        z1();
        if (E() == 0 || (e13 = e1(i13)) == Integer.MIN_VALUE) {
            return null;
        }
        f1();
        F1(e13, (int) (this.f19159r.l() * 0.33333334f), false, w2Var);
        z0 z0Var = this.f19158q;
        z0Var.f19747g = Integer.MIN_VALUE;
        z0Var.f19741a = false;
        g1(q2Var, z0Var, w2Var, true);
        View m13 = e13 == -1 ? this.f19162u ? m1(E() - 1, -1) : m1(0, E()) : this.f19162u ? m1(0, E()) : m1(E() - 1, -1);
        View s13 = e13 == -1 ? s1() : r1();
        if (!s13.hasFocusable()) {
            return m13;
        }
        if (m13 == null) {
            return null;
        }
        return s13;
    }

    public final View n1(int i13, int i14, boolean z13, boolean z14) {
        f1();
        int i15 = z13 ? 24579 : 320;
        int i16 = z14 ? 320 : 0;
        return this.f19157p == 0 ? this.f19495c.g(i13, i14, i15, i16) : this.f19496d.g(i13, i14, i15, i16);
    }

    @Override // androidx.recyclerview.widget.l2
    public final void o(int i13, int i14, w2 w2Var, g1.i iVar) {
        if (this.f19157p != 0) {
            i13 = i14;
        }
        if (E() == 0 || i13 == 0) {
            return;
        }
        f1();
        F1(i13 > 0 ? 1 : -1, Math.abs(i13), true, w2Var);
        a1(w2Var, this.f19158q, iVar);
    }

    @Override // androidx.recyclerview.widget.l2
    public final void o0(AccessibilityEvent accessibilityEvent) {
        super.o0(accessibilityEvent);
        if (E() > 0) {
            accessibilityEvent.setFromIndex(k1());
            accessibilityEvent.setToIndex(l1());
        }
    }

    public View o1(q2 q2Var, w2 w2Var, boolean z13, boolean z14) {
        int i13;
        int i14;
        int i15;
        f1();
        int E = E();
        if (z14) {
            i14 = E() - 1;
            i13 = -1;
            i15 = -1;
        } else {
            i13 = E;
            i14 = 0;
            i15 = 1;
        }
        int b13 = w2Var.b();
        int k13 = this.f19159r.k();
        int g13 = this.f19159r.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i14 != i13) {
            View D = D(i14);
            int Z = l2.Z(D);
            int e13 = this.f19159r.e(D);
            int b14 = this.f19159r.b(D);
            if (Z >= 0 && Z < b13) {
                if (!((RecyclerView.LayoutParams) D.getLayoutParams()).f19268a.z()) {
                    boolean z15 = b14 <= k13 && e13 < k13;
                    boolean z16 = e13 >= g13 && b14 > g13;
                    if (!z15 && !z16) {
                        return D;
                    }
                    if (z13) {
                        if (!z16) {
                            if (view != null) {
                            }
                            view = D;
                        }
                        view2 = D;
                    } else {
                        if (!z15) {
                            if (view != null) {
                            }
                            view = D;
                        }
                        view2 = D;
                    }
                } else if (view3 == null) {
                    view3 = D;
                }
            }
            i14 += i15;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.l2
    public final void p(int i13, g1.i iVar) {
        boolean z13;
        int i14;
        SavedState savedState = this.f19167z;
        if (savedState == null || !savedState.a()) {
            z1();
            z13 = this.f19162u;
            i14 = this.f19165x;
            if (i14 == -1) {
                i14 = z13 ? i13 - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.f19167z;
            z13 = savedState2.f19170c;
            i14 = savedState2.f19168a;
        }
        int i15 = z13 ? -1 : 1;
        for (int i16 = 0; i16 < this.C && i14 >= 0 && i14 < i13; i16++) {
            iVar.b(i14, 0);
            i14 += i15;
        }
    }

    public final int p1(int i13, q2 q2Var, w2 w2Var, boolean z13) {
        int g13;
        int g14 = this.f19159r.g() - i13;
        if (g14 <= 0) {
            return 0;
        }
        int i14 = -A1(-g14, q2Var, w2Var);
        int i15 = i13 + i14;
        if (!z13 || (g13 = this.f19159r.g() - i15) <= 0) {
            return i14;
        }
        this.f19159r.p(g13);
        return g13 + i14;
    }

    @Override // androidx.recyclerview.widget.l2
    public final int q(w2 w2Var) {
        return b1(w2Var);
    }

    public final int q1(int i13, q2 q2Var, w2 w2Var, boolean z13) {
        int k13;
        int k14 = i13 - this.f19159r.k();
        if (k14 <= 0) {
            return 0;
        }
        int i14 = -A1(k14, q2Var, w2Var);
        int i15 = i13 + i14;
        if (!z13 || (k13 = i15 - this.f19159r.k()) <= 0) {
            return i14;
        }
        this.f19159r.p(-k13);
        return i14 - k13;
    }

    @Override // androidx.recyclerview.widget.l2
    public int r(w2 w2Var) {
        return c1(w2Var);
    }

    public final View r1() {
        return D(this.f19162u ? 0 : E() - 1);
    }

    @Override // androidx.recyclerview.widget.l2
    public int s(w2 w2Var) {
        return d1(w2Var);
    }

    public final View s1() {
        return D(this.f19162u ? E() - 1 : 0);
    }

    @Override // androidx.recyclerview.widget.l2
    public final int t(w2 w2Var) {
        return b1(w2Var);
    }

    public int t1(w2 w2Var) {
        if (w2Var.f19677a != -1) {
            return this.f19159r.l();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.l2
    public int u(w2 w2Var) {
        return c1(w2Var);
    }

    public final boolean u1() {
        return Q() == 1;
    }

    @Override // androidx.recyclerview.widget.l2
    public int v(w2 w2Var) {
        return d1(w2Var);
    }

    public void v1(q2 q2Var, w2 w2Var, z0 z0Var, y0 y0Var) {
        View f13;
        int i13;
        int i14;
        int i15;
        int i16;
        if (z0Var.f19751k != null) {
            f13 = z0Var.c();
        } else {
            f13 = q2Var.f(z0Var.f19744d);
            z0Var.f19744d += z0Var.f19745e;
        }
        if (f13 == null) {
            y0Var.f19712b = true;
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) f13.getLayoutParams();
        if (z0Var.f19751k == null) {
            if (this.f19162u == (z0Var.f19746f == -1)) {
                f(f13);
            } else {
                g(f13, 0, false);
            }
        } else {
            if (this.f19162u == (z0Var.f19746f == -1)) {
                d(f13);
            } else {
                e(f13);
            }
        }
        g0(f13);
        y0Var.f19711a = this.f19159r.c(f13);
        if (this.f19157p == 1) {
            if (u1()) {
                i16 = this.f19506n - W();
                i13 = i16 - this.f19159r.d(f13);
            } else {
                i13 = V();
                i16 = this.f19159r.d(f13) + i13;
            }
            if (z0Var.f19746f == -1) {
                i14 = z0Var.f19742b;
                i15 = i14 - y0Var.f19711a;
            } else {
                i15 = z0Var.f19742b;
                i14 = y0Var.f19711a + i15;
            }
        } else {
            int Y = Y();
            int d2 = this.f19159r.d(f13) + Y;
            if (z0Var.f19746f == -1) {
                int i17 = z0Var.f19742b;
                int i18 = i17 - y0Var.f19711a;
                i16 = i17;
                i14 = d2;
                i13 = i18;
                i15 = Y;
            } else {
                int i19 = z0Var.f19742b;
                int i23 = y0Var.f19711a + i19;
                i13 = i19;
                i14 = d2;
                i15 = Y;
                i16 = i23;
            }
        }
        l2.f0(f13, i13, i15, i16, i14);
        if (layoutParams.f19268a.z() || layoutParams.f19268a.T()) {
            y0Var.f19713c = true;
        }
        y0Var.f19714d = f13.hasFocusable();
    }

    public void w1(q2 q2Var, w2 w2Var, x0 x0Var, int i13) {
    }

    @Override // androidx.recyclerview.widget.l2
    public void x0(q2 q2Var, w2 w2Var) {
        View focusedChild;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int p13;
        int i18;
        View z13;
        int e13;
        int i19;
        int i23 = -1;
        if (!(this.f19167z == null && this.f19165x == -1) && w2Var.b() == 0) {
            D0(q2Var);
            return;
        }
        SavedState savedState = this.f19167z;
        if (savedState != null && savedState.a()) {
            this.f19165x = this.f19167z.f19168a;
        }
        f1();
        this.f19158q.f19741a = false;
        z1();
        RecyclerView recyclerView = this.f19494b;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f19493a.i(focusedChild)) {
            focusedChild = null;
        }
        x0 x0Var = this.A;
        if (!x0Var.f19698e || this.f19165x != -1 || this.f19167z != null) {
            x0Var.d();
            x0Var.f19697d = this.f19162u ^ this.f19163v;
            if (!w2Var.f19683g && (i13 = this.f19165x) != -1) {
                if (i13 < 0 || i13 >= w2Var.b()) {
                    this.f19165x = -1;
                    this.f19166y = Integer.MIN_VALUE;
                } else {
                    x0Var.f19695b = this.f19165x;
                    SavedState savedState2 = this.f19167z;
                    if (savedState2 != null && savedState2.a()) {
                        boolean z14 = this.f19167z.f19170c;
                        x0Var.f19697d = z14;
                        if (z14) {
                            x0Var.f19696c = this.f19159r.g() - this.f19167z.f19169b;
                        } else {
                            x0Var.f19696c = this.f19159r.k() + this.f19167z.f19169b;
                        }
                    } else if (this.f19166y == Integer.MIN_VALUE) {
                        View z15 = z(this.f19165x);
                        if (z15 == null) {
                            if (E() > 0) {
                                x0Var.f19697d = (this.f19165x < l2.Z(D(0))) == this.f19162u;
                            }
                            x0Var.a();
                        } else if (this.f19159r.c(z15) > this.f19159r.l()) {
                            x0Var.a();
                        } else if (this.f19159r.e(z15) - this.f19159r.k() < 0) {
                            x0Var.f19696c = this.f19159r.k();
                            x0Var.f19697d = false;
                        } else if (this.f19159r.g() - this.f19159r.b(z15) < 0) {
                            x0Var.f19696c = this.f19159r.g();
                            x0Var.f19697d = true;
                        } else {
                            x0Var.f19696c = x0Var.f19697d ? this.f19159r.m() + this.f19159r.b(z15) : this.f19159r.e(z15);
                        }
                    } else {
                        boolean z16 = this.f19162u;
                        x0Var.f19697d = z16;
                        if (z16) {
                            x0Var.f19696c = this.f19159r.g() - this.f19166y;
                        } else {
                            x0Var.f19696c = this.f19159r.k() + this.f19166y;
                        }
                    }
                    x0Var.f19698e = true;
                }
            }
            if (!E1(q2Var, w2Var, x0Var)) {
                x0Var.a();
                x0Var.f19695b = this.f19163v ? w2Var.b() - 1 : 0;
            }
            x0Var.f19698e = true;
        } else if (focusedChild != null && (this.f19159r.e(focusedChild) >= this.f19159r.g() || this.f19159r.b(focusedChild) <= this.f19159r.k())) {
            x0Var.c(focusedChild, l2.Z(focusedChild));
        }
        z0 z0Var = this.f19158q;
        z0Var.f19746f = z0Var.f19750j >= 0 ? 1 : -1;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        Z0(w2Var, iArr);
        int k13 = this.f19159r.k() + Math.max(0, iArr[0]);
        int h10 = this.f19159r.h() + Math.max(0, iArr[1]);
        if (w2Var.f19683g && (i18 = this.f19165x) != -1 && this.f19166y != Integer.MIN_VALUE && (z13 = z(i18)) != null) {
            if (this.f19162u) {
                i19 = this.f19159r.g() - this.f19159r.b(z13);
                e13 = this.f19166y;
            } else {
                e13 = this.f19159r.e(z13) - this.f19159r.k();
                i19 = this.f19166y;
            }
            int i24 = i19 - e13;
            if (i24 > 0) {
                k13 += i24;
            } else {
                h10 -= i24;
            }
        }
        if (!x0Var.f19697d ? !this.f19162u : this.f19162u) {
            i23 = 1;
        }
        w1(q2Var, w2Var, x0Var, i23);
        w(q2Var);
        this.f19158q.f19752l = this.f19159r.i() == 0 && this.f19159r.f() == 0;
        this.f19158q.getClass();
        this.f19158q.f19749i = 0;
        if (x0Var.f19697d) {
            H1(x0Var.f19695b, x0Var.f19696c);
            z0 z0Var2 = this.f19158q;
            z0Var2.f19748h = k13;
            g1(q2Var, z0Var2, w2Var, false);
            z0 z0Var3 = this.f19158q;
            i15 = z0Var3.f19742b;
            int i25 = z0Var3.f19744d;
            int i26 = z0Var3.f19743c;
            if (i26 > 0) {
                h10 += i26;
            }
            G1(x0Var.f19695b, x0Var.f19696c);
            z0 z0Var4 = this.f19158q;
            z0Var4.f19748h = h10;
            z0Var4.f19744d += z0Var4.f19745e;
            g1(q2Var, z0Var4, w2Var, false);
            z0 z0Var5 = this.f19158q;
            i14 = z0Var5.f19742b;
            int i27 = z0Var5.f19743c;
            if (i27 > 0) {
                H1(i25, i15);
                z0 z0Var6 = this.f19158q;
                z0Var6.f19748h = i27;
                g1(q2Var, z0Var6, w2Var, false);
                i15 = this.f19158q.f19742b;
            }
        } else {
            G1(x0Var.f19695b, x0Var.f19696c);
            z0 z0Var7 = this.f19158q;
            z0Var7.f19748h = h10;
            g1(q2Var, z0Var7, w2Var, false);
            z0 z0Var8 = this.f19158q;
            i14 = z0Var8.f19742b;
            int i28 = z0Var8.f19744d;
            int i29 = z0Var8.f19743c;
            if (i29 > 0) {
                k13 += i29;
            }
            H1(x0Var.f19695b, x0Var.f19696c);
            z0 z0Var9 = this.f19158q;
            z0Var9.f19748h = k13;
            z0Var9.f19744d += z0Var9.f19745e;
            g1(q2Var, z0Var9, w2Var, false);
            z0 z0Var10 = this.f19158q;
            int i33 = z0Var10.f19742b;
            int i34 = z0Var10.f19743c;
            if (i34 > 0) {
                G1(i28, i14);
                z0 z0Var11 = this.f19158q;
                z0Var11.f19748h = i34;
                g1(q2Var, z0Var11, w2Var, false);
                i14 = this.f19158q.f19742b;
            }
            i15 = i33;
        }
        if (E() > 0) {
            if (this.f19162u ^ this.f19163v) {
                int p14 = p1(i14, q2Var, w2Var, true);
                i16 = i15 + p14;
                i17 = i14 + p14;
                p13 = q1(i16, q2Var, w2Var, false);
            } else {
                int q13 = q1(i15, q2Var, w2Var, true);
                i16 = i15 + q13;
                i17 = i14 + q13;
                p13 = p1(i17, q2Var, w2Var, false);
            }
            i15 = i16 + p13;
            i14 = i17 + p13;
        }
        if (w2Var.f19687k && E() != 0 && !w2Var.f19683g && Y0()) {
            List d2 = q2Var.d();
            int size = d2.size();
            int Z = l2.Z(D(0));
            int i35 = 0;
            int i36 = 0;
            for (int i37 = 0; i37 < size; i37++) {
                y2 y2Var = (y2) d2.get(i37);
                if (!y2Var.z()) {
                    boolean z17 = y2Var.m() < Z;
                    boolean z18 = this.f19162u;
                    View view = y2Var.f19717a;
                    if (z17 != z18) {
                        i35 += this.f19159r.c(view);
                    } else {
                        i36 += this.f19159r.c(view);
                    }
                }
            }
            this.f19158q.f19751k = d2;
            if (i35 > 0) {
                H1(l2.Z(s1()), i15);
                z0 z0Var12 = this.f19158q;
                z0Var12.f19748h = i35;
                z0Var12.f19743c = 0;
                z0Var12.a();
                g1(q2Var, this.f19158q, w2Var, false);
            }
            if (i36 > 0) {
                G1(l2.Z(r1()), i14);
                z0 z0Var13 = this.f19158q;
                z0Var13.f19748h = i36;
                z0Var13.f19743c = 0;
                z0Var13.a();
                g1(q2Var, this.f19158q, w2Var, false);
            }
            this.f19158q.f19751k = null;
        }
        if (w2Var.f19683g) {
            x0Var.d();
        } else {
            l1 l1Var = this.f19159r;
            l1Var.f19491b = l1Var.l();
        }
        this.f19160s = this.f19163v;
    }

    public final void x1(q2 q2Var, z0 z0Var) {
        if (!z0Var.f19741a || z0Var.f19752l) {
            return;
        }
        int i13 = z0Var.f19747g;
        int i14 = z0Var.f19749i;
        if (z0Var.f19746f == -1) {
            int E = E();
            if (i13 < 0) {
                return;
            }
            int f13 = (this.f19159r.f() - i13) + i14;
            if (this.f19162u) {
                for (int i15 = 0; i15 < E; i15++) {
                    View D = D(i15);
                    if (this.f19159r.e(D) < f13 || this.f19159r.o(D) < f13) {
                        y1(q2Var, 0, i15);
                        return;
                    }
                }
                return;
            }
            int i16 = E - 1;
            for (int i17 = i16; i17 >= 0; i17--) {
                View D2 = D(i17);
                if (this.f19159r.e(D2) < f13 || this.f19159r.o(D2) < f13) {
                    y1(q2Var, i16, i17);
                    return;
                }
            }
            return;
        }
        if (i13 < 0) {
            return;
        }
        int i18 = i13 - i14;
        int E2 = E();
        if (!this.f19162u) {
            for (int i19 = 0; i19 < E2; i19++) {
                View D3 = D(i19);
                if (this.f19159r.b(D3) > i18 || this.f19159r.n(D3) > i18) {
                    y1(q2Var, 0, i19);
                    return;
                }
            }
            return;
        }
        int i23 = E2 - 1;
        for (int i24 = i23; i24 >= 0; i24--) {
            View D4 = D(i24);
            if (this.f19159r.b(D4) > i18 || this.f19159r.n(D4) > i18) {
                y1(q2Var, i23, i24);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.l2
    public void y0(w2 w2Var) {
        this.f19167z = null;
        this.f19165x = -1;
        this.f19166y = Integer.MIN_VALUE;
        this.A.d();
    }

    public final void y1(q2 q2Var, int i13, int i14) {
        if (i13 == i14) {
            return;
        }
        if (i14 <= i13) {
            while (i13 > i14) {
                G0(i13, q2Var);
                i13--;
            }
        } else {
            for (int i15 = i14 - 1; i15 >= i13; i15--) {
                G0(i15, q2Var);
            }
        }
    }

    @Override // androidx.recyclerview.widget.l2
    public final View z(int i13) {
        int E = E();
        if (E == 0) {
            return null;
        }
        int Z = i13 - l2.Z(D(0));
        if (Z >= 0 && Z < E) {
            View D = D(Z);
            if (l2.Z(D) == i13) {
                return D;
            }
        }
        return super.z(i13);
    }

    @Override // androidx.recyclerview.widget.l2
    public final void z0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f19167z = savedState;
            if (this.f19165x != -1) {
                savedState.b();
            }
            J0();
        }
    }

    public final void z1() {
        if (this.f19157p == 1 || !u1()) {
            this.f19162u = this.f19161t;
        } else {
            this.f19162u = !this.f19161t;
        }
    }

    public LinearLayoutManager(int i13, boolean z13) {
        this.f19157p = 1;
        this.f19161t = false;
        this.f19162u = false;
        this.f19163v = false;
        this.f19164w = true;
        this.f19165x = -1;
        this.f19166y = Integer.MIN_VALUE;
        this.f19167z = null;
        this.A = new x0();
        this.B = new y0();
        this.C = 2;
        this.D = new int[2];
        C1(i13);
        h(null);
        if (z13 == this.f19161t) {
            return;
        }
        this.f19161t = z13;
        J0();
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i13, int i14) {
        this.f19157p = 1;
        this.f19161t = false;
        this.f19162u = false;
        this.f19163v = false;
        this.f19164w = true;
        this.f19165x = -1;
        this.f19166y = Integer.MIN_VALUE;
        this.f19167z = null;
        this.A = new x0();
        this.B = new y0();
        this.C = 2;
        this.D = new int[2];
        k2 a03 = l2.a0(context, attributeSet, i13, i14);
        C1(a03.f19462a);
        boolean z13 = a03.f19464c;
        h(null);
        if (z13 != this.f19161t) {
            this.f19161t = z13;
            J0();
        }
        D1(a03.f19465d);
    }
}
