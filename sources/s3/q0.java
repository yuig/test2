package s3;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class q0 extends q3.c1 implements q3.o0, b, f1 {

    /* renamed from: f, reason: collision with root package name */
    public boolean f110877f;

    /* renamed from: j, reason: collision with root package name */
    public boolean f110881j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f110882k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f110883l;

    /* renamed from: m, reason: collision with root package name */
    public n4.a f110884m;

    /* renamed from: o, reason: collision with root package name */
    public Function1 f110886o;

    /* renamed from: p, reason: collision with root package name */
    public e3.d f110887p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f110888q;

    /* renamed from: u, reason: collision with root package name */
    public boolean f110892u;

    /* renamed from: w, reason: collision with root package name */
    public Object f110894w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f110895x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ v0 f110896y;

    /* renamed from: g, reason: collision with root package name */
    public int f110878g = Integer.MAX_VALUE;

    /* renamed from: h, reason: collision with root package name */
    public int f110879h = Integer.MAX_VALUE;

    /* renamed from: i, reason: collision with root package name */
    public i0 f110880i = i0.NotUsed;

    /* renamed from: n, reason: collision with root package name */
    public long f110885n = 0;

    /* renamed from: r, reason: collision with root package name */
    public final w0 f110889r = new w0(this);

    /* renamed from: s, reason: collision with root package name */
    public final k2.e f110890s = new k2.e(new q0[16]);

    /* renamed from: t, reason: collision with root package name */
    public boolean f110891t = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f110893v = true;

    public q0(v0 v0Var) {
        this.f110896y = v0Var;
        this.f110894w = v0Var.f110984r.f110947r;
    }

    public final boolean A0() {
        return this.f110892u;
    }

    public final i0 B0() {
        return this.f110880i;
    }

    public final void C0(boolean z13) {
        k0 v13;
        v0 v0Var = this.f110896y;
        k0 v14 = v0Var.f110967a.v();
        i0 i0Var = v0Var.f110967a.f110834v;
        if (v14 == null || i0Var == i0.NotUsed) {
            return;
        }
        while (v14.f110834v == i0Var && (v13 = v14.v()) != null) {
            v14 = v13;
        }
        int i13 = o0.f110851b[i0Var.ordinal()];
        if (i13 == 1) {
            if (v14.f110815c != null) {
                k0.V(v14, z13, 6);
                return;
            } else {
                k0.Y(v14, z13, 6);
                return;
            }
        }
        if (i13 != 2) {
            throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
        }
        if (v14.f110815c != null) {
            v14.U(z13);
        } else {
            v14.W(z13);
        }
    }

    @Override // q3.r
    public final int D(int i13) {
        H0();
        a1 V0 = this.f110896y.b().V0();
        Intrinsics.f(V0);
        return ((w) V0).D(i13);
    }

    public final void D0() {
        this.f110893v = true;
    }

    public final void E0() {
        boolean z13 = this.f110888q;
        this.f110888q = true;
        v0 v0Var = this.f110896y;
        if (!z13 && v0Var.f110973g) {
            k0.V(v0Var.f110967a, true, 6);
        }
        k2.e y13 = v0Var.f110967a.y();
        int i13 = y13.f78184c;
        if (i13 > 0) {
            Object[] objArr = y13.f78182a;
            int i14 = 0;
            do {
                k0 k0Var = (k0) objArr[i14];
                q0 q0Var = k0Var.f110838z.f110985s;
                if (q0Var == null) {
                    throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.".toString());
                }
                if (q0Var.f110879h != Integer.MAX_VALUE) {
                    q0Var.E0();
                    k0.Z(k0Var);
                }
                i14++;
            } while (i14 < i13);
        }
    }

    @Override // s3.b
    public final x F() {
        return this.f110896y.f110967a.f110837y.f110805b;
    }

    public final void F0() {
        if (this.f110888q) {
            int i13 = 0;
            this.f110888q = false;
            k2.e y13 = this.f110896y.f110967a.y();
            int i14 = y13.f78184c;
            if (i14 > 0) {
                Object[] objArr = y13.f78182a;
                do {
                    q0 q0Var = ((k0) objArr[i13]).f110838z.f110985s;
                    Intrinsics.f(q0Var);
                    q0Var.F0();
                    i13++;
                } while (i13 < i14);
            }
        }
    }

    public final void G0() {
        k2.e y13;
        int i13;
        v0 v0Var = this.f110896y;
        if (v0Var.f110983q <= 0 || (i13 = (y13 = v0Var.f110967a.y()).f78184c) <= 0) {
            return;
        }
        Object[] objArr = y13.f78182a;
        int i14 = 0;
        do {
            k0 k0Var = (k0) objArr[i14];
            v0 v0Var2 = k0Var.f110838z;
            if ((v0Var2.f110981o || v0Var2.f110982p) && !v0Var2.f110974h) {
                k0Var.U(false);
            }
            q0 q0Var = v0Var2.f110985s;
            if (q0Var != null) {
                q0Var.G0();
            }
            i14++;
        } while (i14 < i13);
    }

    public final void H0() {
        v0 v0Var = this.f110896y;
        k0.V(v0Var.f110967a, false, 7);
        k0 k0Var = v0Var.f110967a;
        k0 v13 = k0Var.v();
        if (v13 == null || k0Var.f110834v != i0.NotUsed) {
            return;
        }
        int i13 = o0.f110850a[v13.f110838z.f110969c.ordinal()];
        k0Var.f110834v = i13 != 2 ? i13 != 3 ? v13.f110834v : i0.InLayoutBlock : i0.InMeasureBlock;
    }

    public final void I0() {
        this.f110879h = Integer.MAX_VALUE;
        this.f110878g = Integer.MAX_VALUE;
        this.f110888q = false;
    }

    public final void J0() {
        v0 v0Var;
        g0 g0Var;
        this.f110895x = true;
        k0 v13 = this.f110896y.f110967a.v();
        if (!this.f110888q) {
            E0();
            if (this.f110877f && v13 != null) {
                v13.U(false);
            }
        }
        if (v13 == null) {
            this.f110879h = 0;
        } else if (!this.f110877f && ((g0Var = (v0Var = v13.f110838z).f110969c) == g0.LayingOut || g0Var == g0.LookaheadLayingOut)) {
            if (this.f110879h != Integer.MAX_VALUE) {
                jk.r.y("Place was called on a node which was placed already");
                throw null;
            }
            int i13 = v0Var.f110976j;
            this.f110879h = i13;
            v0Var.f110976j = i13 + 1;
        }
        x();
    }

    public final void K0(long j13, Function1 function1, e3.d dVar) {
        v0 v0Var = this.f110896y;
        if (!(!v0Var.f110967a.I)) {
            jk.r.x("place is called on a deactivated node");
            throw null;
        }
        v0Var.f110969c = g0.LookaheadLayingOut;
        this.f110882k = true;
        this.f110895x = false;
        if (!n4.h.a(j13, this.f110885n)) {
            if (v0Var.f110982p || v0Var.f110981o) {
                v0Var.f110974h = true;
            }
            G0();
        }
        a2 a13 = n0.a(v0Var.f110967a);
        if (v0Var.f110974h || !this.f110888q) {
            v0Var.g(false);
            this.f110889r.f110729g = false;
            k0 k0Var = v0Var.f110967a;
            p0 p0Var = new p0(v0Var, a13, j13, 0);
            c2 c2Var = ((t3.c0) a13).A;
            c2Var.getClass();
            if (k0Var.f110815c != null) {
                c2Var.b(k0Var, c2Var.f110752g, p0Var);
            } else {
                c2Var.b(k0Var, c2Var.f110751f, p0Var);
            }
        } else {
            a1 V0 = v0Var.b().V0();
            Intrinsics.f(V0);
            V0.N0(n4.h.c(j13, V0.f102182e));
            J0();
        }
        this.f110885n = j13;
        this.f110886o = function1;
        this.f110887p = dVar;
        v0Var.f110969c = g0.Idle;
    }

    public final boolean L0(long j13) {
        n4.a aVar;
        v0 v0Var = this.f110896y;
        k0 k0Var = v0Var.f110967a;
        if (!(!k0Var.I)) {
            jk.r.x("measure is called on a deactivated node");
            throw null;
        }
        k0 v13 = k0Var.v();
        k0 k0Var2 = v0Var.f110967a;
        int i13 = 0;
        k0Var2.f110836x = k0Var2.f110836x || (v13 != null && v13.f110836x);
        if (!k0Var2.f110838z.f110973g && (aVar = this.f110884m) != null && n4.a.b(aVar.f89168a, j13)) {
            a2 a2Var = k0Var2.f110821i;
            if (a2Var != null) {
                ((t3.c0) a2Var).j(k0Var2, true);
            }
            k0Var2.a0();
            return false;
        }
        this.f110884m = new n4.a(j13);
        x0(j13);
        this.f110889r.f110728f = false;
        Z(e.f110768m);
        long d2 = this.f110883l ? this.f102180c : lb.l0.d(Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f110883l = true;
        a1 V0 = v0Var.b().V0();
        if (V0 == null) {
            jk.r.y("Lookahead result from lookaheadRemeasure cannot be null");
            throw null;
        }
        v0Var.f110969c = g0.LookaheadMeasuring;
        v0Var.f110973g = false;
        t3.c0 c0Var = (t3.c0) n0.a(k0Var2);
        u0 u0Var = new u0(v0Var, j13, i13);
        c2 c2Var = c0Var.A;
        c2Var.getClass();
        if (k0Var2.f110815c != null) {
            c2Var.b(k0Var2, c2Var.f110747b, u0Var);
        } else {
            c2Var.b(k0Var2, c2Var.f110748c, u0Var);
        }
        v0Var.f110974h = true;
        v0Var.f110975i = true;
        if (com.bumptech.glide.c.t0(k0Var2)) {
            v0Var.f110971e = true;
            v0Var.f110972f = true;
        } else {
            v0Var.f110970d = true;
        }
        v0Var.f110969c = g0.Idle;
        w0(lb.l0.d(V0.f102178a, V0.f102179b));
        return (((int) (d2 >> 32)) == V0.f102178a && ((int) (4294967295L & d2)) == V0.f102179b) ? false : true;
    }

    public final void M0() {
        k0 v13;
        try {
            this.f110877f = true;
            if (!this.f110882k) {
                jk.r.y("replace() called on item that was not placed");
                throw null;
            }
            this.f110895x = false;
            boolean z13 = this.f110888q;
            K0(this.f110885n, this.f110886o, this.f110887p);
            if (z13 && !this.f110895x && (v13 = this.f110896y.f110967a.v()) != null) {
                v13.U(false);
            }
        } finally {
            this.f110877f = false;
        }
    }

    @Override // q3.r
    public final int N(int i13) {
        H0();
        a1 V0 = this.f110896y.b().V0();
        Intrinsics.f(V0);
        return ((w) V0).N(i13);
    }

    public final void N0(i0 i0Var) {
        this.f110880i = i0Var;
    }

    public final boolean O0() {
        Object obj = this.f110894w;
        v0 v0Var = this.f110896y;
        if (obj == null) {
            a1 V0 = v0Var.b().V0();
            Intrinsics.f(V0);
            if (V0.f110732l.a() == null) {
                return false;
            }
        }
        if (!this.f110893v) {
            return false;
        }
        this.f110893v = false;
        a1 V02 = v0Var.b().V0();
        Intrinsics.f(V02);
        this.f110894w = V02.f110732l.a();
        return true;
    }

    @Override // q3.r
    public final int P(int i13) {
        H0();
        a1 V0 = this.f110896y.b().V0();
        Intrinsics.f(V0);
        return ((w) V0).P(i13);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if ((r1 != null ? r1.f110838z.f110969c : null) == s3.g0.LookaheadLayingOut) goto L14;
     */
    @Override // q3.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final q3.c1 Q(long r7) {
        /*
            r6 = this;
            s3.v0 r0 = r6.f110896y
            s3.k0 r1 = r0.f110967a
            s3.k0 r1 = r1.v()
            r2 = 0
            if (r1 == 0) goto L10
            s3.v0 r1 = r1.f110838z
            s3.g0 r1 = r1.f110969c
            goto L11
        L10:
            r1 = r2
        L11:
            s3.g0 r3 = s3.g0.LookaheadMeasuring
            if (r1 == r3) goto L27
            s3.k0 r1 = r0.f110967a
            s3.k0 r1 = r1.v()
            if (r1 == 0) goto L22
            s3.v0 r1 = r1.f110838z
            s3.g0 r1 = r1.f110969c
            goto L23
        L22:
            r1 = r2
        L23:
            s3.g0 r3 = s3.g0.LookaheadLayingOut
            if (r1 != r3) goto L2a
        L27:
            r1 = 0
            r0.f110968b = r1
        L2a:
            s3.k0 r1 = r0.f110967a
            s3.k0 r3 = r1.v()
            if (r3 == 0) goto L7a
            s3.i0 r4 = r6.f110880i
            s3.i0 r5 = s3.i0.NotUsed
            if (r4 == r5) goto L43
            boolean r1 = r1.f110836x
            if (r1 == 0) goto L3d
            goto L43
        L3d:
            java.lang.String r7 = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"
            jk.r.y(r7)
            throw r2
        L43:
            s3.v0 r1 = r3.f110838z
            s3.g0 r2 = r1.f110969c
            int[] r3 = s3.o0.f110850a
            int r2 = r2.ordinal()
            r2 = r3[r2]
            r3 = 1
            if (r2 == r3) goto L75
            r3 = 2
            if (r2 == r3) goto L75
            r3 = 3
            if (r2 == r3) goto L72
            r3 = 4
            if (r2 != r3) goto L5c
            goto L72
        L5c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Measurable could be only measured from the parent's measure or layout block. Parents state is "
            r8.<init>(r0)
            s3.g0 r0 = r1.f110969c
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L72:
            s3.i0 r1 = s3.i0.InLayoutBlock
            goto L77
        L75:
            s3.i0 r1 = s3.i0.InMeasureBlock
        L77:
            r6.f110880i = r1
            goto L7e
        L7a:
            s3.i0 r1 = s3.i0.NotUsed
            r6.f110880i = r1
        L7e:
            s3.k0 r0 = r0.f110967a
            s3.i0 r1 = r0.f110834v
            s3.i0 r2 = s3.i0.NotUsed
            if (r1 != r2) goto L89
            r0.f()
        L89:
            r6.L0(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.q0.Q(long):q3.c1");
    }

    @Override // s3.b
    public final void Z(Function1 function1) {
        k2.e y13 = this.f110896y.f110967a.y();
        int i13 = y13.f78184c;
        if (i13 > 0) {
            Object[] objArr = y13.f78182a;
            int i14 = 0;
            do {
                q0 q0Var = ((k0) objArr[i14]).f110838z.f110985s;
                Intrinsics.f(q0Var);
                function1.invoke(q0Var);
                i14++;
            } while (i14 < i13);
        }
    }

    @Override // q3.s0, q3.r
    public final Object a() {
        return this.f110894w;
    }

    @Override // s3.f1
    public final void b0(boolean z13) {
        a1 V0;
        v0 v0Var = this.f110896y;
        a1 V02 = v0Var.b().V0();
        if (Intrinsics.d(Boolean.valueOf(z13), V02 != null ? Boolean.valueOf(V02.f111012f) : null) || (V0 = v0Var.b().V0()) == null) {
            return;
        }
        V0.f111012f = z13;
    }

    @Override // s3.b
    public final a c() {
        return this.f110889r;
    }

    @Override // q3.r
    public final int d(int i13) {
        H0();
        a1 V0 = this.f110896y.b().V0();
        Intrinsics.f(V0);
        return ((w) V0).d(i13);
    }

    @Override // s3.b
    public final void d0() {
        k0.V(this.f110896y.f110967a, false, 7);
    }

    @Override // s3.b
    public final b f() {
        v0 v0Var;
        k0 v13 = this.f110896y.f110967a.v();
        if (v13 == null || (v0Var = v13.f110838z) == null) {
            return null;
        }
        return v0Var.f110985s;
    }

    @Override // q3.s0
    public final int i(q3.a aVar) {
        v0 v0Var = this.f110896y;
        k0 v13 = v0Var.f110967a.v();
        g0 g0Var = v13 != null ? v13.f110838z.f110969c : null;
        g0 g0Var2 = g0.LookaheadMeasuring;
        w0 w0Var = this.f110889r;
        if (g0Var == g0Var2) {
            w0Var.f110725c = true;
        } else {
            k0 v14 = v0Var.f110967a.v();
            if ((v14 != null ? v14.f110838z.f110969c : null) == g0.LookaheadLayingOut) {
                w0Var.f110726d = true;
            }
        }
        this.f110881j = true;
        a1 V0 = v0Var.b().V0();
        Intrinsics.f(V0);
        int i13 = V0.i(aVar);
        this.f110881j = false;
        return i13;
    }

    @Override // s3.b
    public final void requestLayout() {
        this.f110896y.f110967a.U(false);
    }

    @Override // q3.c1
    public final void u0(long j13, float f13, Function1 function1) {
        K0(j13, function1, null);
    }

    @Override // s3.b
    public final void x() {
        k2.e y13;
        int i13;
        this.f110892u = true;
        w0 w0Var = this.f110889r;
        w0Var.i();
        v0 v0Var = this.f110896y;
        boolean z13 = v0Var.f110974h;
        k0 k0Var = v0Var.f110967a;
        if (z13 && (i13 = (y13 = k0Var.y()).f78184c) > 0) {
            Object[] objArr = y13.f78182a;
            int i14 = 0;
            do {
                k0 k0Var2 = (k0) objArr[i14];
                if (k0Var2.f110838z.f110973g && k0Var2.s() == i0.InMeasureBlock) {
                    v0 v0Var2 = k0Var2.f110838z;
                    q0 q0Var = v0Var2.f110985s;
                    Intrinsics.f(q0Var);
                    q0 q0Var2 = v0Var2.f110985s;
                    n4.a z03 = q0Var2 != null ? q0Var2.z0() : null;
                    Intrinsics.f(z03);
                    if (q0Var.L0(z03.f89168a)) {
                        k0.V(k0Var, false, 7);
                    }
                }
                i14++;
            } while (i14 < i13);
        }
        a1 a1Var = F().M;
        Intrinsics.f(a1Var);
        if (v0Var.f110975i || (!this.f110881j && !a1Var.f111014h && v0Var.f110974h)) {
            v0Var.f110974h = false;
            g0 g0Var = v0Var.f110969c;
            v0Var.f110969c = g0.LookaheadLayingOut;
            a2 a13 = n0.a(k0Var);
            v0Var.h(false);
            k1.q qVar = new k1.q(this, a1Var, v0Var, 5);
            c2 c2Var = ((t3.c0) a13).A;
            c2Var.getClass();
            if (k0Var.f110815c != null) {
                c2Var.b(k0Var, c2Var.f110753h, qVar);
            } else {
                c2Var.b(k0Var, c2Var.f110750e, qVar);
            }
            v0Var.f110969c = g0Var;
            if (v0Var.f110981o && a1Var.f111014h) {
                requestLayout();
            }
            v0Var.f110975i = false;
        }
        if (w0Var.f110726d) {
            w0Var.f110727e = true;
        }
        if (w0Var.f110724b && w0Var.f()) {
            w0Var.h();
        }
        this.f110892u = false;
    }

    public final List y0() {
        v0 v0Var = this.f110896y;
        v0Var.f110967a.o();
        boolean z13 = this.f110891t;
        k2.e eVar = this.f110890s;
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
                    q0 q0Var = k0Var2.f110838z.f110985s;
                    Intrinsics.f(q0Var);
                    eVar.b(q0Var);
                } else {
                    q0 q0Var2 = k0Var2.f110838z.f110985s;
                    Intrinsics.f(q0Var2);
                    Object[] objArr2 = eVar.f78182a;
                    Object obj = objArr2[i14];
                    objArr2[i14] = q0Var2;
                }
                i14++;
            } while (i14 < i13);
        }
        eVar.p(k0Var.o().size(), eVar.f78184c);
        this.f110891t = false;
        return eVar.f();
    }

    @Override // s3.b
    public final boolean z() {
        return this.f110888q;
    }

    public final n4.a z0() {
        return this.f110884m;
    }
}
