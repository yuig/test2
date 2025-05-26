package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends l2 implements u2 {
    public int A;
    public final i3 B;
    public int C;
    public boolean D;
    public boolean E;
    public SavedState F;
    public int G;
    public final Rect H;
    public final g3 I;

    /* renamed from: J */
    public boolean f19285J;
    public final boolean K;
    public int[] L;
    public final androidx.appcompat.app.z M;

    /* renamed from: p */
    public int f19286p;

    /* renamed from: q */
    public k3[] f19287q;

    /* renamed from: r */
    public final l1 f19288r;

    /* renamed from: s */
    public final l1 f19289s;

    /* renamed from: t */
    public final int f19290t;

    /* renamed from: u */
    public int f19291u;

    /* renamed from: v */
    public final w0 f19292v;

    /* renamed from: w */
    public boolean f19293w;

    /* renamed from: x */
    public boolean f19294x;

    /* renamed from: y */
    public BitSet f19295y;

    /* renamed from: z */
    public int f19296z;

    public static class LayoutParams extends RecyclerView.LayoutParams {

        /* renamed from: e */
        public k3 f19297e;

        /* renamed from: f */
        public boolean f19298f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes3.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new j3();

        /* renamed from: a */
        public int f19303a;

        /* renamed from: b */
        public int f19304b;

        /* renamed from: c */
        public int f19305c;

        /* renamed from: d */
        public int[] f19306d;

        /* renamed from: e */
        public int f19307e;

        /* renamed from: f */
        public int[] f19308f;

        /* renamed from: g */
        public List f19309g;

        /* renamed from: h */
        public boolean f19310h;

        /* renamed from: i */
        public boolean f19311i;

        /* renamed from: j */
        public boolean f19312j;

        public SavedState(SavedState savedState) {
            this.f19305c = savedState.f19305c;
            this.f19303a = savedState.f19303a;
            this.f19304b = savedState.f19304b;
            this.f19306d = savedState.f19306d;
            this.f19307e = savedState.f19307e;
            this.f19308f = savedState.f19308f;
            this.f19310h = savedState.f19310h;
            this.f19311i = savedState.f19311i;
            this.f19312j = savedState.f19312j;
            this.f19309g = savedState.f19309g;
        }

        public final void a() {
            this.f19306d = null;
            this.f19305c = 0;
            this.f19303a = -1;
            this.f19304b = -1;
        }

        public final void b() {
            this.f19306d = null;
            this.f19305c = 0;
            this.f19307e = 0;
            this.f19308f = null;
            this.f19309g = null;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.writeInt(this.f19303a);
            parcel.writeInt(this.f19304b);
            parcel.writeInt(this.f19305c);
            if (this.f19305c > 0) {
                parcel.writeIntArray(this.f19306d);
            }
            parcel.writeInt(this.f19307e);
            if (this.f19307e > 0) {
                parcel.writeIntArray(this.f19308f);
            }
            parcel.writeInt(this.f19310h ? 1 : 0);
            parcel.writeInt(this.f19311i ? 1 : 0);
            parcel.writeInt(this.f19312j ? 1 : 0);
            parcel.writeList(this.f19309g);
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i13, int i14) {
        this.f19286p = -1;
        this.f19293w = false;
        this.f19294x = false;
        this.f19296z = -1;
        this.A = Integer.MIN_VALUE;
        this.B = new i3();
        this.C = 2;
        this.H = new Rect();
        this.I = new g3(this);
        this.f19285J = false;
        this.K = true;
        this.M = new androidx.appcompat.app.z(this, 16);
        k2 a03 = l2.a0(context, attributeSet, i13, i14);
        int i15 = a03.f19462a;
        if (i15 != 0 && i15 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        h(null);
        if (i15 != this.f19290t) {
            this.f19290t = i15;
            l1 l1Var = this.f19288r;
            this.f19288r = this.f19289s;
            this.f19289s = l1Var;
            J0();
        }
        D1(a03.f19463b);
        boolean z13 = a03.f19464c;
        h(null);
        SavedState savedState = this.F;
        if (savedState != null && savedState.f19310h != z13) {
            savedState.f19310h = z13;
        }
        this.f19293w = z13;
        J0();
        this.f19292v = new w0();
        this.f19288r = l1.a(this, this.f19290t);
        this.f19289s = l1.a(this, 1 - this.f19290t);
    }

    public static int H1(int i13, int i14, int i15) {
        if (i14 == 0 && i15 == 0) {
            return i13;
        }
        int mode = View.MeasureSpec.getMode(i13);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i13) - i14) - i15), mode) : i13;
    }

    @Override // androidx.recyclerview.widget.l2
    public final RecyclerView.LayoutParams A() {
        return this.f19290t == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.l2
    public final Parcelable A0() {
        int q13;
        int k13;
        int[] iArr;
        SavedState savedState = this.F;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        savedState2.f19310h = this.f19293w;
        savedState2.f19311i = this.D;
        savedState2.f19312j = this.E;
        i3 i3Var = this.B;
        if (i3Var == null || (iArr = i3Var.f19454a) == null) {
            savedState2.f19307e = 0;
        } else {
            savedState2.f19308f = iArr;
            savedState2.f19307e = iArr.length;
            savedState2.f19309g = i3Var.f19455b;
        }
        if (E() > 0) {
            savedState2.f19303a = this.D ? m1() : l1();
            View f13 = this.f19294x ? f1(true) : g1(true);
            savedState2.f19304b = f13 != null ? l2.Z(f13) : -1;
            int i13 = this.f19286p;
            savedState2.f19305c = i13;
            savedState2.f19306d = new int[i13];
            for (int i14 = 0; i14 < this.f19286p; i14++) {
                if (this.D) {
                    q13 = this.f19287q[i14].m(Integer.MIN_VALUE);
                    if (q13 != Integer.MIN_VALUE) {
                        k13 = this.f19288r.g();
                        q13 -= k13;
                        savedState2.f19306d[i14] = q13;
                    } else {
                        savedState2.f19306d[i14] = q13;
                    }
                } else {
                    q13 = this.f19287q[i14].q(Integer.MIN_VALUE);
                    if (q13 != Integer.MIN_VALUE) {
                        k13 = this.f19288r.k();
                        q13 -= k13;
                        savedState2.f19306d[i14] = q13;
                    } else {
                        savedState2.f19306d[i14] = q13;
                    }
                }
            }
        } else {
            savedState2.f19303a = -1;
            savedState2.f19304b = -1;
            savedState2.f19305c = 0;
        }
        return savedState2;
    }

    public final void A1() {
        if (this.f19290t == 1 || !s1()) {
            this.f19294x = this.f19293w;
        } else {
            this.f19294x = !this.f19293w;
        }
    }

    @Override // androidx.recyclerview.widget.l2
    public final RecyclerView.LayoutParams B(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.l2
    public final void B0(int i13) {
        if (i13 == 0) {
            a1();
        }
    }

    public final int B1(int i13, q2 q2Var, w2 w2Var) {
        if (E() == 0 || i13 == 0) {
            return 0;
        }
        w1(i13, w2Var);
        w0 w0Var = this.f19292v;
        int e13 = e1(w0Var, q2Var, w2Var);
        if (w0Var.f19667b >= e13) {
            i13 = i13 < 0 ? -e13 : e13;
        }
        this.f19288r.p(-i13);
        this.D = this.f19294x;
        w0Var.f19667b = 0;
        x1(q2Var, w0Var);
        return i13;
    }

    @Override // androidx.recyclerview.widget.l2
    public final RecyclerView.LayoutParams C(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public final void C1(int i13) {
        w0 w0Var = this.f19292v;
        w0Var.f19670e = i13;
        w0Var.f19669d = this.f19294x != (i13 == -1) ? -1 : 1;
    }

    public final void D1(int i13) {
        h(null);
        if (i13 != this.f19286p) {
            this.B.b();
            J0();
            this.f19286p = i13;
            this.f19295y = new BitSet(this.f19286p);
            this.f19287q = new k3[this.f19286p];
            for (int i14 = 0; i14 < this.f19286p; i14++) {
                this.f19287q[i14] = new k3(this, i14);
            }
            J0();
        }
    }

    public final void E1(int i13, int i14) {
        for (int i15 = 0; i15 < this.f19286p; i15++) {
            if (!this.f19287q[i15].f19466a.isEmpty()) {
                G1(this.f19287q[i15], i13, i14);
            }
        }
    }

    public final void F1(int i13, w2 w2Var) {
        int i14;
        int i15;
        int i16;
        w0 w0Var = this.f19292v;
        boolean z13 = false;
        w0Var.f19667b = 0;
        w0Var.f19668c = i13;
        v2 v2Var = this.f19497e;
        if (!(v2Var != null && v2Var.d()) || (i16 = w2Var.f19677a) == -1) {
            i14 = 0;
            i15 = 0;
        } else {
            if (this.f19294x == (i16 < i13)) {
                i14 = this.f19288r.l();
                i15 = 0;
            } else {
                i15 = this.f19288r.l();
                i14 = 0;
            }
        }
        if (G()) {
            w0Var.f19671f = this.f19288r.k() - i15;
            w0Var.f19672g = this.f19288r.g() + i14;
        } else {
            w0Var.f19672g = this.f19288r.f() + i14;
            w0Var.f19671f = -i15;
        }
        w0Var.f19673h = false;
        w0Var.f19666a = true;
        if (this.f19288r.i() == 0 && this.f19288r.f() == 0) {
            z13 = true;
        }
        w0Var.f19674i = z13;
    }

    public final void G1(k3 k3Var, int i13, int i14) {
        int k13 = k3Var.k();
        int i15 = k3Var.f19470e;
        if (i13 == -1) {
            if (k3Var.p() + k13 <= i14) {
                this.f19295y.set(i15, false);
            }
        } else if (k3Var.l() - k13 >= i14) {
            this.f19295y.set(i15, false);
        }
    }

    @Override // androidx.recyclerview.widget.l2
    public final int L0(int i13, q2 q2Var, w2 w2Var) {
        return B1(i13, q2Var, w2Var);
    }

    @Override // androidx.recyclerview.widget.l2
    public final void M0(int i13) {
        SavedState savedState = this.F;
        if (savedState != null && savedState.f19303a != i13) {
            savedState.a();
        }
        this.f19296z = i13;
        this.A = Integer.MIN_VALUE;
        J0();
    }

    @Override // androidx.recyclerview.widget.l2
    public final int N0(int i13, q2 q2Var, w2 w2Var) {
        return B1(i13, q2Var, w2Var);
    }

    @Override // androidx.recyclerview.widget.l2
    public final void Q0(Rect rect, int i13, int i14) {
        int n13;
        int n14;
        int W = W() + V();
        int T = T() + Y();
        if (this.f19290t == 1) {
            n14 = l2.n(i14, rect.height() + T, R());
            n13 = l2.n(i13, (this.f19291u * this.f19286p) + W, S());
        } else {
            n13 = l2.n(i13, rect.width() + W, S());
            n14 = l2.n(i14, (this.f19291u * this.f19286p) + T, R());
        }
        this.f19494b.setMeasuredDimension(n13, n14);
    }

    @Override // androidx.recyclerview.widget.l2
    public final void W0(RecyclerView recyclerView, w2 w2Var, int i13) {
        c1 c1Var = new c1(recyclerView.getContext());
        c1Var.h(i13);
        X0(c1Var);
    }

    @Override // androidx.recyclerview.widget.l2
    public final boolean Y0() {
        return this.F == null;
    }

    public final int Z0(int i13) {
        if (E() == 0) {
            return this.f19294x ? 1 : -1;
        }
        return (i13 < l1()) != this.f19294x ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.u2
    public final PointF a(int i13) {
        int Z0 = Z0(i13);
        PointF pointF = new PointF();
        if (Z0 == 0) {
            return null;
        }
        if (this.f19290t == 0) {
            pointF.x = Z0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = Z0;
        }
        return pointF;
    }

    public final boolean a1() {
        int l13;
        int m13;
        if (E() == 0 || this.C == 0 || !this.f19499g) {
            return false;
        }
        if (this.f19294x) {
            l13 = m1();
            m13 = l1();
        } else {
            l13 = l1();
            m13 = m1();
        }
        i3 i3Var = this.B;
        if (l13 == 0 && r1() != null) {
            i3Var.b();
            this.f19498f = true;
            J0();
            return true;
        }
        if (!this.f19285J) {
            return false;
        }
        int i13 = this.f19294x ? -1 : 1;
        int i14 = m13 + 1;
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem e13 = i3Var.e(l13, i14, i13);
        if (e13 == null) {
            this.f19285J = false;
            i3Var.d(i14);
            return false;
        }
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem e14 = i3Var.e(l13, e13.f19299a, i13 * (-1));
        if (e14 == null) {
            i3Var.d(e13.f19299a);
        } else {
            i3Var.d(e14.f19299a + 1);
        }
        this.f19498f = true;
        J0();
        return true;
    }

    public final int b1(w2 w2Var) {
        if (E() == 0) {
            return 0;
        }
        l1 l1Var = this.f19288r;
        boolean z13 = this.K;
        return bs1.c.D(w2Var, l1Var, g1(!z13), f1(!z13), this, this.K);
    }

    public final int c1(w2 w2Var) {
        if (E() == 0) {
            return 0;
        }
        l1 l1Var = this.f19288r;
        boolean z13 = this.K;
        return bs1.c.E(w2Var, l1Var, g1(!z13), f1(!z13), this, this.K, this.f19294x);
    }

    @Override // androidx.recyclerview.widget.l2
    public final boolean d0() {
        return this.C != 0;
    }

    public final int d1(w2 w2Var) {
        if (E() == 0) {
            return 0;
        }
        l1 l1Var = this.f19288r;
        boolean z13 = this.K;
        return bs1.c.F(w2Var, l1Var, g1(!z13), f1(!z13), this, this.K);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x031f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e1(androidx.recyclerview.widget.w0 r20, androidx.recyclerview.widget.q2 r21, androidx.recyclerview.widget.w2 r22) {
        /*
            Method dump skipped, instructions count: 913
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.e1(androidx.recyclerview.widget.w0, androidx.recyclerview.widget.q2, androidx.recyclerview.widget.w2):int");
    }

    public final View f1(boolean z13) {
        int k13 = this.f19288r.k();
        int g13 = this.f19288r.g();
        View view = null;
        for (int E = E() - 1; E >= 0; E--) {
            View D = D(E);
            int e13 = this.f19288r.e(D);
            int b13 = this.f19288r.b(D);
            if (b13 > k13 && e13 < g13) {
                if (b13 <= g13 || !z13) {
                    return D;
                }
                if (view == null) {
                    view = D;
                }
            }
        }
        return view;
    }

    public final View g1(boolean z13) {
        int k13 = this.f19288r.k();
        int g13 = this.f19288r.g();
        int E = E();
        View view = null;
        for (int i13 = 0; i13 < E; i13++) {
            View D = D(i13);
            int e13 = this.f19288r.e(D);
            if (this.f19288r.b(D) > k13 && e13 < g13) {
                if (e13 >= k13 || !z13) {
                    return D;
                }
                if (view == null) {
                    view = D;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.l2
    public final void h(String str) {
        if (this.F == null) {
            super.h(str);
        }
    }

    public final int[] h1(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f19286p];
        } else if (iArr.length < this.f19286p) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f19286p + ", array size:" + iArr.length);
        }
        for (int i13 = 0; i13 < this.f19286p; i13++) {
            iArr[i13] = this.f19287q[i13].g();
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.l2
    public final void i0(int i13) {
        super.i0(i13);
        for (int i14 = 0; i14 < this.f19286p; i14++) {
            this.f19287q[i14].r(i13);
        }
    }

    public final int[] i1(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f19286p];
        } else if (iArr.length < this.f19286p) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f19286p + ", array size:" + iArr.length);
        }
        for (int i13 = 0; i13 < this.f19286p; i13++) {
            iArr[i13] = this.f19287q[i13].i();
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.l2
    public final void j0(int i13) {
        super.j0(i13);
        for (int i14 = 0; i14 < this.f19286p; i14++) {
            this.f19287q[i14].r(i13);
        }
    }

    public final void j1(q2 q2Var, w2 w2Var, boolean z13) {
        int g13;
        int n13 = n1(Integer.MIN_VALUE);
        if (n13 != Integer.MIN_VALUE && (g13 = this.f19288r.g() - n13) > 0) {
            int i13 = g13 - (-B1(-g13, q2Var, w2Var));
            if (!z13 || i13 <= 0) {
                return;
            }
            this.f19288r.p(i13);
        }
    }

    @Override // androidx.recyclerview.widget.l2
    public final boolean k() {
        return this.f19290t == 0;
    }

    @Override // androidx.recyclerview.widget.l2
    public final void k0() {
        this.B.b();
        for (int i13 = 0; i13 < this.f19286p; i13++) {
            this.f19287q[i13].e();
        }
    }

    public final void k1(q2 q2Var, w2 w2Var, boolean z13) {
        int k13;
        int o13 = o1(Integer.MAX_VALUE);
        if (o13 != Integer.MAX_VALUE && (k13 = o13 - this.f19288r.k()) > 0) {
            int B1 = k13 - B1(k13, q2Var, w2Var);
            if (!z13 || B1 <= 0) {
                return;
            }
            this.f19288r.p(-B1);
        }
    }

    @Override // androidx.recyclerview.widget.l2
    public final boolean l() {
        return this.f19290t == 1;
    }

    public final int l1() {
        if (E() == 0) {
            return 0;
        }
        return l2.Z(D(0));
    }

    @Override // androidx.recyclerview.widget.l2
    public final boolean m(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.l2
    public final void m0(RecyclerView recyclerView, q2 q2Var) {
        RecyclerView recyclerView2 = this.f19494b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.M);
        }
        for (int i13 = 0; i13 < this.f19286p; i13++) {
            this.f19287q[i13].e();
        }
        recyclerView.requestLayout();
    }

    public final int m1() {
        int E = E();
        if (E == 0) {
            return 0;
        }
        return l2.Z(D(E - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0039, code lost:
    
        if (r9.f19290t == 1) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x003e, code lost:
    
        if (r9.f19290t == 0) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x004b, code lost:
    
        if (s1() == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0058, code lost:
    
        if (s1() == false) goto L170;
     */
    @Override // androidx.recyclerview.widget.l2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View n0(android.view.View r10, int r11, androidx.recyclerview.widget.q2 r12, androidx.recyclerview.widget.w2 r13) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.n0(android.view.View, int, androidx.recyclerview.widget.q2, androidx.recyclerview.widget.w2):android.view.View");
    }

    public final int n1(int i13) {
        int m13 = this.f19287q[0].m(i13);
        for (int i14 = 1; i14 < this.f19286p; i14++) {
            int m14 = this.f19287q[i14].m(i13);
            if (m14 > m13) {
                m13 = m14;
            }
        }
        return m13;
    }

    @Override // androidx.recyclerview.widget.l2
    public final void o(int i13, int i14, w2 w2Var, g1.i iVar) {
        w0 w0Var;
        int m13;
        int i15;
        if (this.f19290t != 0) {
            i13 = i14;
        }
        if (E() == 0 || i13 == 0) {
            return;
        }
        w1(i13, w2Var);
        int[] iArr = this.L;
        if (iArr == null || iArr.length < this.f19286p) {
            this.L = new int[this.f19286p];
        }
        int i16 = 0;
        int i17 = 0;
        while (true) {
            int i18 = this.f19286p;
            w0Var = this.f19292v;
            if (i16 >= i18) {
                break;
            }
            if (w0Var.f19669d == -1) {
                m13 = w0Var.f19671f;
                i15 = this.f19287q[i16].q(m13);
            } else {
                m13 = this.f19287q[i16].m(w0Var.f19672g);
                i15 = w0Var.f19672g;
            }
            int i19 = m13 - i15;
            if (i19 >= 0) {
                this.L[i17] = i19;
                i17++;
            }
            i16++;
        }
        Arrays.sort(this.L, 0, i17);
        for (int i23 = 0; i23 < i17 && w0Var.a(w2Var); i23++) {
            iVar.b(w0Var.f19668c, this.L[i23]);
            w0Var.f19668c += w0Var.f19669d;
        }
    }

    @Override // androidx.recyclerview.widget.l2
    public final void o0(AccessibilityEvent accessibilityEvent) {
        super.o0(accessibilityEvent);
        if (E() > 0) {
            View g13 = g1(false);
            View f13 = f1(false);
            if (g13 == null || f13 == null) {
                return;
            }
            int Z = l2.Z(g13);
            int Z2 = l2.Z(f13);
            if (Z < Z2) {
                accessibilityEvent.setFromIndex(Z);
                accessibilityEvent.setToIndex(Z2);
            } else {
                accessibilityEvent.setFromIndex(Z2);
                accessibilityEvent.setToIndex(Z);
            }
        }
    }

    public final int o1(int i13) {
        int q13 = this.f19287q[0].q(i13);
        for (int i14 = 1; i14 < this.f19286p; i14++) {
            int q14 = this.f19287q[i14].q(i13);
            if (q14 < q13) {
                q13 = q14;
            }
        }
        return q13;
    }

    public final int p1() {
        return this.f19286p;
    }

    @Override // androidx.recyclerview.widget.l2
    public final int q(w2 w2Var) {
        return b1(w2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q1(int r8, int r9, int r10) {
        /*
            r7 = this;
            boolean r0 = r7.f19294x
            if (r0 == 0) goto L9
            int r0 = r7.m1()
            goto Ld
        L9:
            int r0 = r7.l1()
        Ld:
            r1 = 8
            if (r10 != r1) goto L1b
            if (r8 >= r9) goto L17
            int r2 = r9 + 1
        L15:
            r3 = r8
            goto L1e
        L17:
            int r2 = r8 + 1
            r3 = r9
            goto L1e
        L1b:
            int r2 = r8 + r9
            goto L15
        L1e:
            androidx.recyclerview.widget.i3 r4 = r7.B
            r4.g(r3)
            r5 = 1
            if (r10 == r5) goto L37
            r6 = 2
            if (r10 == r6) goto L33
            if (r10 == r1) goto L2c
            goto L3a
        L2c:
            r4.i(r8, r5)
            r4.h(r9, r5)
            goto L3a
        L33:
            r4.i(r8, r9)
            goto L3a
        L37:
            r4.h(r8, r9)
        L3a:
            if (r2 > r0) goto L3d
            return
        L3d:
            boolean r8 = r7.f19294x
            if (r8 == 0) goto L46
            int r8 = r7.l1()
            goto L4a
        L46:
            int r8 = r7.m1()
        L4a:
            if (r3 > r8) goto L4f
            r7.J0()
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.q1(int, int, int):void");
    }

    @Override // androidx.recyclerview.widget.l2
    public final int r(w2 w2Var) {
        return c1(w2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View r1() {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.r1():android.view.View");
    }

    @Override // androidx.recyclerview.widget.l2
    public final int s(w2 w2Var) {
        return d1(w2Var);
    }

    @Override // androidx.recyclerview.widget.l2
    public final void s0(RecyclerView recyclerView, int i13, int i14) {
        q1(i13, i14, 1);
    }

    public final boolean s1() {
        return Q() == 1;
    }

    @Override // androidx.recyclerview.widget.l2
    public final int t(w2 w2Var) {
        return b1(w2Var);
    }

    @Override // androidx.recyclerview.widget.l2
    public final void t0(RecyclerView recyclerView) {
        this.B.b();
        J0();
    }

    public final void t1(View view, int i13, int i14) {
        Rect rect = this.H;
        j(rect, view);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int H1 = H1(i13, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + rect.right);
        int H12 = H1(i14, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + rect.bottom);
        if (T0(view, H1, H12, layoutParams)) {
            view.measure(H1, H12);
        }
    }

    @Override // androidx.recyclerview.widget.l2
    public final int u(w2 w2Var) {
        return c1(w2Var);
    }

    @Override // androidx.recyclerview.widget.l2
    public final void u0(RecyclerView recyclerView, int i13, int i14) {
        q1(i13, i14, 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:227:0x039e, code lost:
    
        if (a1() != false) goto L478;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u1(androidx.recyclerview.widget.q2 r12, androidx.recyclerview.widget.w2 r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 956
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.u1(androidx.recyclerview.widget.q2, androidx.recyclerview.widget.w2, boolean):void");
    }

    @Override // androidx.recyclerview.widget.l2
    public final int v(w2 w2Var) {
        return d1(w2Var);
    }

    @Override // androidx.recyclerview.widget.l2
    public final void v0(RecyclerView recyclerView, int i13, int i14) {
        q1(i13, i14, 2);
    }

    public final boolean v1(int i13) {
        if (this.f19290t == 0) {
            return (i13 == -1) != this.f19294x;
        }
        return ((i13 == -1) == this.f19294x) == s1();
    }

    @Override // androidx.recyclerview.widget.l2
    public final void w0(RecyclerView recyclerView, int i13, int i14) {
        q1(i13, i14, 4);
    }

    public final void w1(int i13, w2 w2Var) {
        int l13;
        int i14;
        if (i13 > 0) {
            l13 = m1();
            i14 = 1;
        } else {
            l13 = l1();
            i14 = -1;
        }
        w0 w0Var = this.f19292v;
        w0Var.f19666a = true;
        F1(l13, w2Var);
        C1(i14);
        w0Var.f19668c = l13 + w0Var.f19669d;
        w0Var.f19667b = Math.abs(i13);
    }

    @Override // androidx.recyclerview.widget.l2
    public final void x0(q2 q2Var, w2 w2Var) {
        u1(q2Var, w2Var, true);
    }

    public final void x1(q2 q2Var, w0 w0Var) {
        if (!w0Var.f19666a || w0Var.f19674i) {
            return;
        }
        if (w0Var.f19667b == 0) {
            if (w0Var.f19670e == -1) {
                y1(w0Var.f19672g, q2Var);
                return;
            } else {
                z1(w0Var.f19671f, q2Var);
                return;
            }
        }
        int i13 = 1;
        if (w0Var.f19670e == -1) {
            int i14 = w0Var.f19671f;
            int q13 = this.f19287q[0].q(i14);
            while (i13 < this.f19286p) {
                int q14 = this.f19287q[i13].q(i14);
                if (q14 > q13) {
                    q13 = q14;
                }
                i13++;
            }
            int i15 = i14 - q13;
            y1(i15 < 0 ? w0Var.f19672g : w0Var.f19672g - Math.min(i15, w0Var.f19667b), q2Var);
            return;
        }
        int i16 = w0Var.f19672g;
        int m13 = this.f19287q[0].m(i16);
        while (i13 < this.f19286p) {
            int m14 = this.f19287q[i13].m(i16);
            if (m14 < m13) {
                m13 = m14;
            }
            i13++;
        }
        int i17 = m13 - w0Var.f19672g;
        z1(i17 < 0 ? w0Var.f19671f : Math.min(i17, w0Var.f19667b) + w0Var.f19671f, q2Var);
    }

    @Override // androidx.recyclerview.widget.l2
    public final void y0(w2 w2Var) {
        this.f19296z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.I.c();
    }

    public final void y1(int i13, q2 q2Var) {
        for (int E = E() - 1; E >= 0; E--) {
            View D = D(E);
            if (this.f19288r.e(D) < i13 || this.f19288r.o(D) < i13) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) D.getLayoutParams();
            if (layoutParams.f19298f) {
                for (int i14 = 0; i14 < this.f19286p; i14++) {
                    if (this.f19287q[i14].f19466a.size() == 1) {
                        return;
                    }
                }
                for (int i15 = 0; i15 < this.f19286p; i15++) {
                    this.f19287q[i15].s();
                }
            } else if (layoutParams.f19297e.f19466a.size() == 1) {
                return;
            } else {
                layoutParams.f19297e.s();
            }
            F0(D, q2Var);
        }
    }

    @Override // androidx.recyclerview.widget.l2
    public final void z0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.F = savedState;
            if (this.f19296z != -1) {
                savedState.a();
                this.F.b();
            }
            J0();
        }
    }

    public final void z1(int i13, q2 q2Var) {
        while (E() > 0) {
            View D = D(0);
            if (this.f19288r.b(D) > i13 || this.f19288r.n(D) > i13) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) D.getLayoutParams();
            if (layoutParams.f19298f) {
                for (int i14 = 0; i14 < this.f19286p; i14++) {
                    if (this.f19287q[i14].f19466a.size() == 1) {
                        return;
                    }
                }
                for (int i15 = 0; i15 < this.f19286p; i15++) {
                    this.f19287q[i15].t();
                }
            } else if (layoutParams.f19297e.f19466a.size() == 1) {
                return;
            } else {
                layoutParams.f19297e.t();
            }
            F0(D, q2Var);
        }
    }

    public StaggeredGridLayoutManager(int i13) {
        this.f19286p = -1;
        this.f19293w = false;
        this.f19294x = false;
        this.f19296z = -1;
        this.A = Integer.MIN_VALUE;
        this.B = new i3();
        this.C = 2;
        this.H = new Rect();
        this.I = new g3(this);
        this.f19285J = false;
        this.K = true;
        this.M = new androidx.appcompat.app.z(this, 16);
        this.f19290t = 1;
        D1(i13);
        this.f19292v = new w0();
        this.f19288r = l1.a(this, this.f19290t);
        this.f19289s = l1.a(this, 1 - this.f19290t);
    }
}
