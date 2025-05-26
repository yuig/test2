package s3;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t0 extends q3.c1 implements q3.o0, b, f1 {
    public boolean A;
    public Function1 B;
    public e3.d C;
    public float E;
    public final i2.j2 F;
    public boolean G;
    public final /* synthetic */ v0 H;

    /* renamed from: f, reason: collision with root package name */
    public boolean f110935f;

    /* renamed from: i, reason: collision with root package name */
    public boolean f110938i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f110939j;

    /* renamed from: l, reason: collision with root package name */
    public boolean f110941l;

    /* renamed from: n, reason: collision with root package name */
    public Function1 f110943n;

    /* renamed from: o, reason: collision with root package name */
    public e3.d f110944o;

    /* renamed from: p, reason: collision with root package name */
    public float f110945p;

    /* renamed from: r, reason: collision with root package name */
    public Object f110947r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f110948s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f110949t;

    /* renamed from: x, reason: collision with root package name */
    public boolean f110953x;

    /* renamed from: z, reason: collision with root package name */
    public float f110955z;

    /* renamed from: g, reason: collision with root package name */
    public int f110936g = Integer.MAX_VALUE;

    /* renamed from: h, reason: collision with root package name */
    public int f110937h = Integer.MAX_VALUE;

    /* renamed from: k, reason: collision with root package name */
    public i0 f110940k = i0.NotUsed;

    /* renamed from: m, reason: collision with root package name */
    public long f110942m = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f110946q = true;

    /* renamed from: u, reason: collision with root package name */
    public final l0 f110950u = new l0(this);

    /* renamed from: v, reason: collision with root package name */
    public final k2.e f110951v = new k2.e(new t0[16]);

    /* renamed from: w, reason: collision with root package name */
    public boolean f110952w = true;

    /* renamed from: y, reason: collision with root package name */
    public final androidx.activity.a0 f110954y = new androidx.activity.a0(this, 12);
    public long D = 0;

    public t0(v0 v0Var) {
        this.H = v0Var;
        this.F = new i2.j2(2, v0Var, this);
    }

    public final void A0() {
        if (this.f110948s) {
            int i13 = 0;
            this.f110948s = false;
            v0 v0Var = this.H;
            j1 j1Var = v0Var.f110967a.f110837y;
            q1 q1Var = j1Var.f110805b.f110900n;
            for (q1 q1Var2 = j1Var.f110806c; !Intrinsics.d(q1Var2, q1Var) && q1Var2 != null; q1Var2 = q1Var2.f110900n) {
                if (q1Var2.E != null) {
                    if (q1Var2.F != null) {
                        q1Var2.F = null;
                    }
                    q1Var2.t1(null, false);
                    q1Var2.f110898l.W(false);
                }
            }
            k2.e y13 = v0Var.f110967a.y();
            int i14 = y13.f78184c;
            if (i14 > 0) {
                Object[] objArr = y13.f78182a;
                do {
                    ((k0) objArr[i13]).f110838z.f110984r.A0();
                    i13++;
                } while (i13 < i14);
            }
        }
    }

    public final void B0() {
        k2.e y13;
        int i13;
        v0 v0Var = this.H;
        if (v0Var.f110980n <= 0 || (i13 = (y13 = v0Var.f110967a.y()).f78184c) <= 0) {
            return;
        }
        Object[] objArr = y13.f78182a;
        int i14 = 0;
        do {
            k0 k0Var = (k0) objArr[i14];
            v0 v0Var2 = k0Var.f110838z;
            if ((v0Var2.f110978l || v0Var2.f110979m) && !v0Var2.f110971e) {
                k0Var.W(false);
            }
            v0Var2.f110984r.B0();
            i14++;
        } while (i14 < i13);
    }

    public final void C0() {
        v0 v0Var = this.H;
        k0.Y(v0Var.f110967a, false, 7);
        k0 k0Var = v0Var.f110967a;
        k0 v13 = k0Var.v();
        if (v13 == null || k0Var.f110834v != i0.NotUsed) {
            return;
        }
        int i13 = r0.f110913a[v13.f110838z.f110969c.ordinal()];
        k0Var.f110834v = i13 != 1 ? i13 != 2 ? v13.f110834v : i0.InLayoutBlock : i0.InMeasureBlock;
    }

    @Override // q3.r
    public final int D(int i13) {
        C0();
        return this.H.b().D(i13);
    }

    public final void D0() {
        this.A = true;
        v0 v0Var = this.H;
        k0 v13 = v0Var.f110967a.v();
        float f13 = F().f110911y;
        j1 j1Var = v0Var.f110967a.f110837y;
        q1 q1Var = j1Var.f110806c;
        while (q1Var != j1Var.f110805b) {
            Intrinsics.g(q1Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            d0 d0Var = (d0) q1Var;
            f13 += d0Var.f110911y;
            q1Var = d0Var.f110900n;
        }
        if (f13 != this.f110955z) {
            this.f110955z = f13;
            if (v13 != null) {
                v13.O();
            }
            if (v13 != null) {
                v13.B();
            }
        }
        if (!this.f110948s) {
            if (v13 != null) {
                v13.B();
            }
            z0();
            if (this.f110935f && v13 != null) {
                v13.W(false);
            }
        }
        if (v13 == null) {
            this.f110937h = 0;
        } else if (!this.f110935f) {
            v0 v0Var2 = v13.f110838z;
            if (v0Var2.f110969c == g0.LayingOut) {
                if (this.f110937h != Integer.MAX_VALUE) {
                    jk.r.y("Place was called on a node which was placed already");
                    throw null;
                }
                int i13 = v0Var2.f110977k;
                this.f110937h = i13;
                v0Var2.f110977k = i13 + 1;
            }
        }
        x();
    }

    public final void E0(long j13, float f13, Function1 function1, e3.d dVar) {
        v0 v0Var = this.H;
        k0 k0Var = v0Var.f110967a;
        if (!(!k0Var.I)) {
            jk.r.x("place is called on a deactivated node");
            throw null;
        }
        v0Var.f110969c = g0.LayingOut;
        this.f110942m = j13;
        this.f110945p = f13;
        this.f110943n = function1;
        this.f110944o = dVar;
        this.f110939j = true;
        this.A = false;
        a2 a13 = n0.a(k0Var);
        if (v0Var.f110971e || !this.f110948s) {
            this.f110950u.f110729g = false;
            v0Var.e(false);
            this.B = function1;
            this.D = j13;
            this.E = f13;
            this.C = dVar;
            c2 c2Var = ((t3.c0) a13).A;
            c2Var.b(v0Var.f110967a, c2Var.f110751f, this.F);
        } else {
            q1 b13 = v0Var.b();
            b13.l1(n4.h.c(j13, b13.f102182e), f13, function1, dVar);
            D0();
        }
        v0Var.f110969c = g0.Idle;
    }

    @Override // s3.b
    public final x F() {
        return this.H.f110967a.f110837y.f110805b;
    }

    public final void F0(long j13, float f13, Function1 function1, e3.d dVar) {
        q3.m0 m0Var;
        this.f110949t = true;
        boolean a13 = n4.h.a(j13, this.f110942m);
        boolean z13 = false;
        v0 v0Var = this.H;
        if (!a13 || this.G) {
            if (v0Var.f110979m || v0Var.f110978l || this.G) {
                v0Var.f110971e = true;
                this.G = false;
            }
            B0();
        }
        if (com.bumptech.glide.c.t0(v0Var.f110967a)) {
            q1 q1Var = v0Var.b().f110901o;
            k0 k0Var = v0Var.f110967a;
            if (q1Var == null || (m0Var = q1Var.f111015i) == null) {
                t3.c0 c0Var = (t3.c0) n0.a(k0Var);
                int i13 = q3.e1.f102202b;
                m0Var = new q3.m0(c0Var, 1);
            }
            q0 q0Var = v0Var.f110985s;
            Intrinsics.f(q0Var);
            k0 v13 = k0Var.v();
            if (v13 != null) {
                v13.f110838z.f110976j = 0;
            }
            q0Var.f110879h = Integer.MAX_VALUE;
            q3.b1.d(m0Var, q0Var, (int) (j13 >> 32), (int) (4294967295L & j13));
        }
        q0 q0Var2 = v0Var.f110985s;
        if (q0Var2 != null && !q0Var2.f110882k) {
            z13 = true;
        }
        if (true ^ z13) {
            E0(j13, f13, function1, dVar);
        } else {
            jk.r.y("Error: Placement happened before lookahead.");
            throw null;
        }
    }

    public final boolean G0(long j13) {
        v0 v0Var = this.H;
        k0 k0Var = v0Var.f110967a;
        boolean z13 = true;
        if (!(!k0Var.I)) {
            jk.r.x("measure is called on a deactivated node");
            throw null;
        }
        a2 a13 = n0.a(k0Var);
        k0 k0Var2 = v0Var.f110967a;
        k0 v13 = k0Var2.v();
        k0Var2.f110836x = k0Var2.f110836x || (v13 != null && v13.f110836x);
        if (!k0Var2.f110838z.f110970d && n4.a.b(this.f102181d, j13)) {
            ((t3.c0) a13).j(k0Var2, false);
            k0Var2.a0();
            return false;
        }
        this.f110950u.f110728f = false;
        Z(s0.f110918l);
        this.f110938i = true;
        long j14 = v0Var.b().f102180c;
        x0(j13);
        g0 g0Var = v0Var.f110969c;
        g0 g0Var2 = g0.Idle;
        if (g0Var != g0Var2) {
            jk.r.y("layout state is not idle before measure starts");
            throw null;
        }
        g0 g0Var3 = g0.Measuring;
        v0Var.f110969c = g0Var3;
        v0Var.f110970d = false;
        v0Var.f110986t = j13;
        c2 c2Var = ((t3.c0) n0.a(k0Var2)).A;
        c2Var.b(k0Var2, c2Var.f110748c, v0Var.f110987u);
        if (v0Var.f110969c == g0Var3) {
            v0Var.f110971e = true;
            v0Var.f110972f = true;
            v0Var.f110969c = g0Var2;
        }
        if (n4.j.a(v0Var.b().f102180c, j14) && v0Var.b().f102178a == this.f102178a && v0Var.b().f102179b == this.f102179b) {
            z13 = false;
        }
        w0(lb.l0.d(v0Var.b().f102178a, v0Var.b().f102179b));
        return z13;
    }

    @Override // q3.r
    public final int N(int i13) {
        C0();
        return this.H.b().N(i13);
    }

    @Override // q3.r
    public final int P(int i13) {
        C0();
        return this.H.b().P(i13);
    }

    @Override // q3.o0
    public final q3.c1 Q(long j13) {
        i0 i0Var;
        v0 v0Var = this.H;
        k0 k0Var = v0Var.f110967a;
        i0 i0Var2 = k0Var.f110834v;
        i0 i0Var3 = i0.NotUsed;
        if (i0Var2 == i0Var3) {
            k0Var.f();
        }
        if (com.bumptech.glide.c.t0(v0Var.f110967a)) {
            q0 q0Var = v0Var.f110985s;
            Intrinsics.f(q0Var);
            q0Var.N0(i0Var3);
            q0Var.Q(j13);
        }
        k0 k0Var2 = v0Var.f110967a;
        k0 v13 = k0Var2.v();
        if (v13 == null) {
            this.f110940k = i0Var3;
        } else {
            if (this.f110940k != i0Var3 && !k0Var2.f110836x) {
                jk.r.y("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
                throw null;
            }
            v0 v0Var2 = v13.f110838z;
            int i13 = r0.f110913a[v0Var2.f110969c.ordinal()];
            if (i13 == 1) {
                i0Var = i0.InMeasureBlock;
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + v0Var2.f110969c);
                }
                i0Var = i0.InLayoutBlock;
            }
            this.f110940k = i0Var;
        }
        G0(j13);
        return this;
    }

    @Override // s3.b
    public final void Z(Function1 function1) {
        k2.e y13 = this.H.f110967a.y();
        int i13 = y13.f78184c;
        if (i13 > 0) {
            Object[] objArr = y13.f78182a;
            int i14 = 0;
            do {
                function1.invoke(((k0) objArr[i14]).f110838z.f110984r);
                i14++;
            } while (i14 < i13);
        }
    }

    @Override // q3.s0, q3.r
    public final Object a() {
        return this.f110947r;
    }

    @Override // s3.f1
    public final void b0(boolean z13) {
        v0 v0Var = this.H;
        boolean z14 = v0Var.b().f111012f;
        if (z13 != z14) {
            v0Var.b().f111012f = z14;
            this.G = true;
        }
    }

    @Override // s3.b
    public final a c() {
        return this.f110950u;
    }

    @Override // q3.r
    public final int d(int i13) {
        C0();
        return this.H.b().d(i13);
    }

    @Override // s3.b
    public final void d0() {
        k0.Y(this.H.f110967a, false, 7);
    }

    @Override // s3.b
    public final b f() {
        v0 v0Var;
        k0 v13 = this.H.f110967a.v();
        if (v13 == null || (v0Var = v13.f110838z) == null) {
            return null;
        }
        return v0Var.f110984r;
    }

    @Override // q3.s0
    public final int i(q3.a aVar) {
        v0 v0Var = this.H;
        k0 v13 = v0Var.f110967a.v();
        g0 g0Var = v13 != null ? v13.f110838z.f110969c : null;
        g0 g0Var2 = g0.Measuring;
        l0 l0Var = this.f110950u;
        if (g0Var == g0Var2) {
            l0Var.f110725c = true;
        } else {
            k0 v14 = v0Var.f110967a.v();
            if ((v14 != null ? v14.f110838z.f110969c : null) == g0.LayingOut) {
                l0Var.f110726d = true;
            }
        }
        this.f110941l = true;
        int i13 = v0Var.b().i(aVar);
        this.f110941l = false;
        return i13;
    }

    @Override // s3.b
    public final void requestLayout() {
        this.H.f110967a.W(false);
    }

    @Override // q3.c1
    public final void u0(long j13, float f13, Function1 function1) {
        F0(j13, f13, function1, null);
    }

    @Override // s3.b
    public final void x() {
        k2.e y13;
        int i13;
        this.f110953x = true;
        l0 l0Var = this.f110950u;
        l0Var.i();
        v0 v0Var = this.H;
        boolean z13 = v0Var.f110971e;
        k0 k0Var = v0Var.f110967a;
        if (z13 && (i13 = (y13 = k0Var.y()).f78184c) > 0) {
            Object[] objArr = y13.f78182a;
            int i14 = 0;
            do {
                k0 k0Var2 = (k0) objArr[i14];
                v0 v0Var2 = k0Var2.f110838z;
                if (v0Var2.f110970d && v0Var2.f110984r.f110940k == i0.InMeasureBlock && k0.Q(k0Var2)) {
                    k0.Y(k0Var, false, 7);
                }
                i14++;
            } while (i14 < i13);
        }
        if (v0Var.f110972f || (!this.f110941l && !F().f111014h && v0Var.f110971e)) {
            v0Var.f110971e = false;
            g0 g0Var = v0Var.f110969c;
            v0Var.f110969c = g0.LayingOut;
            v0Var.f(false);
            c2 c2Var = ((t3.c0) n0.a(k0Var)).A;
            c2Var.b(k0Var, c2Var.f110750e, this.f110954y);
            v0Var.f110969c = g0Var;
            if (F().f111014h && v0Var.f110978l) {
                requestLayout();
            }
            v0Var.f110972f = false;
        }
        if (l0Var.f110726d) {
            l0Var.f110727e = true;
        }
        if (l0Var.f110724b && l0Var.f()) {
            l0Var.h();
        }
        this.f110953x = false;
    }

    public final List y0() {
        v0 v0Var = this.H;
        v0Var.f110967a.h0();
        boolean z13 = this.f110952w;
        k2.e eVar = this.f110951v;
        if (!z13) {
            return eVar.f();
        }
        k0 k0Var = v0Var.f110967a;
        k2.e y13 = k0Var.y();
        int i13 = y13.f78184c;
        if (i13 > 0) {
            Object[] objArr = y13.f78182a;
            int i14 = 0;
            do {
                k0 k0Var2 = (k0) objArr[i14];
                if (eVar.f78184c <= i14) {
                    eVar.b(k0Var2.f110838z.f110984r);
                } else {
                    t0 t0Var = k0Var2.f110838z.f110984r;
                    Object[] objArr2 = eVar.f78182a;
                    Object obj = objArr2[i14];
                    objArr2[i14] = t0Var;
                }
                i14++;
            } while (i14 < i13);
        }
        eVar.p(k0Var.o().size(), eVar.f78184c);
        this.f110952w = false;
        return eVar.f();
    }

    @Override // s3.b
    public final boolean z() {
        return this.f110948s;
    }

    public final void z0() {
        boolean z13 = this.f110948s;
        this.f110948s = true;
        k0 k0Var = this.H.f110967a;
        if (!z13) {
            v0 v0Var = k0Var.f110838z;
            if (v0Var.f110970d) {
                k0.Y(k0Var, true, 6);
            } else if (v0Var.f110973g) {
                k0.V(k0Var, true, 6);
            }
        }
        j1 j1Var = k0Var.f110837y;
        q1 q1Var = j1Var.f110805b.f110900n;
        for (q1 q1Var2 = j1Var.f110806c; !Intrinsics.d(q1Var2, q1Var) && q1Var2 != null; q1Var2 = q1Var2.f110900n) {
            if (q1Var2.D) {
                q1Var2.d1();
            }
        }
        k2.e y13 = k0Var.y();
        int i13 = y13.f78184c;
        if (i13 > 0) {
            Object[] objArr = y13.f78182a;
            int i14 = 0;
            do {
                k0 k0Var2 = (k0) objArr[i14];
                if (k0Var2.w() != Integer.MAX_VALUE) {
                    k0Var2.f110838z.f110984r.z0();
                    k0.Z(k0Var2);
                }
                i14++;
            } while (i14 < i13);
        }
    }
}
