package s3;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f110757a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f110759c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f110760d;

    /* renamed from: h, reason: collision with root package name */
    public n4.a f110764h;

    /* renamed from: b, reason: collision with root package name */
    public final q f110758b = new q();

    /* renamed from: e, reason: collision with root package name */
    public final x1 f110761e = new x1();

    /* renamed from: f, reason: collision with root package name */
    public final k2.e f110762f = new k2.e(new z1[16]);

    /* renamed from: g, reason: collision with root package name */
    public final k2.e f110763g = new k2.e(new b1[16]);

    public d1(k0 k0Var) {
        this.f110757a = k0Var;
    }

    public static boolean b(k0 k0Var, n4.a aVar) {
        boolean L0;
        k0 k0Var2 = k0Var.f110815c;
        if (k0Var2 == null) {
            return false;
        }
        v0 v0Var = k0Var.f110838z;
        if (aVar != null) {
            if (k0Var2 != null) {
                q0 q0Var = v0Var.f110985s;
                Intrinsics.f(q0Var);
                L0 = q0Var.L0(aVar.f89168a);
            }
            L0 = false;
        } else {
            q0 q0Var2 = v0Var.f110985s;
            n4.a z03 = q0Var2 != null ? q0Var2.z0() : null;
            if (z03 != null && k0Var.f110815c != null) {
                q0 q0Var3 = v0Var.f110985s;
                Intrinsics.f(q0Var3);
                L0 = q0Var3.L0(z03.f89168a);
            }
            L0 = false;
        }
        k0 v13 = k0Var.v();
        if (L0 && v13 != null) {
            if (v13.f110815c == null) {
                k0.Y(v13, false, 3);
            } else if (k0Var.s() == i0.InMeasureBlock) {
                k0.V(v13, false, 3);
            } else if (k0Var.s() == i0.InLayoutBlock) {
                v13.U(false);
            }
        }
        return L0;
    }

    public static boolean c(k0 k0Var, n4.a aVar) {
        boolean P = aVar != null ? k0Var.P(aVar) : k0.Q(k0Var);
        k0 v13 = k0Var.v();
        if (P && v13 != null) {
            i0 i0Var = k0Var.f110838z.f110984r.f110940k;
            if (i0Var == i0.InMeasureBlock) {
                k0.Y(v13, false, 3);
            } else if (i0Var == i0.InLayoutBlock) {
                v13.W(false);
            }
        }
        return P;
    }

    public static boolean h(k0 k0Var) {
        return k0Var.f110838z.f110970d && j(k0Var);
    }

    public static boolean i(k0 k0Var) {
        return k0Var.f110838z.f110973g && k(k0Var);
    }

    public static boolean j(k0 k0Var) {
        t0 t0Var = k0Var.f110838z.f110984r;
        return t0Var.f110940k == i0.InMeasureBlock || t0Var.f110950u.f();
    }

    public static boolean k(k0 k0Var) {
        w0 w0Var;
        if (k0Var.s() == i0.InMeasureBlock) {
            return true;
        }
        q0 q0Var = k0Var.f110838z.f110985s;
        return (q0Var == null || (w0Var = q0Var.f110889r) == null || !w0Var.f()) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if (r3 < r6) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r6) {
        /*
            r5 = this;
            s3.x1 r0 = r5.f110761e
            if (r6 == 0) goto L9
            s3.k0 r6 = r5.f110757a
            r0.b(r6)
        L9:
            s3.w1 r6 = s3.w1.f110991a
            k2.e r1 = r0.f110998a
            r1.q(r6)
            int r6 = r1.f78184c
            s3.k0[] r2 = r0.f110999b
            if (r2 == 0) goto L19
            int r3 = r2.length
            if (r3 >= r6) goto L21
        L19:
            r2 = 16
            int r2 = java.lang.Math.max(r2, r6)
            s3.k0[] r2 = new s3.k0[r2]
        L21:
            r3 = 0
            r0.f110999b = r3
            r3 = 0
        L25:
            if (r3 >= r6) goto L30
            java.lang.Object[] r4 = r1.f78182a
            r4 = r4[r3]
            r2[r3] = r4
            int r3 = r3 + 1
            goto L25
        L30:
            r1.h()
            int r6 = r6 + (-1)
        L35:
            r1 = -1
            if (r1 >= r6) goto L47
            r1 = r2[r6]
            kotlin.jvm.internal.Intrinsics.f(r1)
            boolean r3 = r1.H
            if (r3 == 0) goto L44
            s3.x1.a(r1)
        L44:
            int r6 = r6 + (-1)
            goto L35
        L47:
            r0.f110999b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.d1.a(boolean):void");
    }

    public final void d() {
        k2.e eVar = this.f110763g;
        if (eVar.m()) {
            int i13 = eVar.f78184c;
            if (i13 > 0) {
                Object[] objArr = eVar.f78182a;
                int i14 = 0;
                do {
                    b1 b1Var = (b1) objArr[i14];
                    if (b1Var.a().G()) {
                        if (b1Var.c()) {
                            k0.V(b1Var.a(), b1Var.b(), 2);
                        } else {
                            k0.Y(b1Var.a(), b1Var.b(), 2);
                        }
                    }
                    i14++;
                } while (i14 < i13);
            }
            eVar.h();
        }
    }

    public final void e(k0 k0Var) {
        k2.e y13 = k0Var.y();
        int i13 = y13.f78184c;
        if (i13 > 0) {
            Object[] objArr = y13.f78182a;
            int i14 = 0;
            do {
                k0 k0Var2 = (k0) objArr[i14];
                if (Intrinsics.d(k0Var2.I(), Boolean.TRUE) && !k0Var2.I) {
                    if (this.f110758b.b(k0Var2, true)) {
                        k0Var2.J();
                    }
                    e(k0Var2);
                }
                i14++;
            } while (i14 < i13);
        }
    }

    public final void f(k0 k0Var, boolean z13) {
        q qVar = this.f110758b;
        if ((z13 ? qVar.f110875a : qVar.f110876b).f110861c.isEmpty()) {
            return;
        }
        if (!this.f110759c) {
            jk.r.y("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
            throw null;
        }
        if (!(z13 ? k0Var.f110838z.f110973g : k0Var.f110838z.f110970d)) {
            g(k0Var, z13);
        } else {
            jk.r.x("node not yet measured");
            throw null;
        }
    }

    public final void g(k0 k0Var, boolean z13) {
        k2.e y13 = k0Var.y();
        int i13 = y13.f78184c;
        q qVar = this.f110758b;
        if (i13 > 0) {
            Object[] objArr = y13.f78182a;
            int i14 = 0;
            do {
                k0 k0Var2 = (k0) objArr[i14];
                if ((!z13 && j(k0Var2)) || (z13 && k(k0Var2))) {
                    boolean t03 = com.bumptech.glide.c.t0(k0Var2);
                    v0 v0Var = k0Var2.f110838z;
                    if (t03 && !z13) {
                        if (v0Var.f110973g && qVar.b(k0Var2, true)) {
                            o(k0Var2, true, false);
                        } else {
                            f(k0Var2, true);
                        }
                    }
                    if ((z13 ? v0Var.f110973g : v0Var.f110970d) && qVar.b(k0Var2, z13)) {
                        o(k0Var2, z13, false);
                    }
                    if (!(z13 ? v0Var.f110973g : v0Var.f110970d)) {
                        g(k0Var2, z13);
                    }
                }
                i14++;
            } while (i14 < i13);
        }
        v0 v0Var2 = k0Var.f110838z;
        if ((z13 ? v0Var2.f110973g : v0Var2.f110970d) && qVar.b(k0Var, z13)) {
            o(k0Var, z13, false);
        }
    }

    public final boolean l(t3.z zVar) {
        boolean z13;
        k0 k0Var;
        q qVar = this.f110758b;
        k0 k0Var2 = this.f110757a;
        if (!k0Var2.G()) {
            jk.r.x("performMeasureAndLayout called with unattached root");
            throw null;
        }
        if (!k0Var2.H()) {
            jk.r.x("performMeasureAndLayout called with unplaced root");
            throw null;
        }
        if (!(!this.f110759c)) {
            jk.r.x("performMeasureAndLayout called during measure layout");
            throw null;
        }
        int i13 = 0;
        byte b13 = 0;
        byte b14 = 0;
        if (this.f110764h != null) {
            this.f110759c = true;
            this.f110760d = true;
            try {
                if (qVar.c()) {
                    z13 = false;
                    while (true) {
                        boolean c13 = qVar.c();
                        p pVar = qVar.f110875a;
                        if (!c13) {
                            break;
                        }
                        boolean z14 = !pVar.f110861c.isEmpty();
                        if (z14) {
                            k0Var = (k0) pVar.f110861c.first();
                        } else {
                            pVar = qVar.f110876b;
                            k0Var = (k0) pVar.f110861c.first();
                        }
                        pVar.d(k0Var);
                        boolean o13 = o(k0Var, z14, true);
                        if (k0Var == k0Var2 && o13) {
                            z13 = true;
                        }
                    }
                    if (zVar != null) {
                        zVar.invoke();
                    }
                } else {
                    z13 = false;
                }
            } finally {
                this.f110759c = false;
                this.f110760d = false;
            }
        } else {
            z13 = false;
        }
        k2.e eVar = this.f110762f;
        int i14 = eVar.f78184c;
        if (i14 > 0) {
            Object[] objArr = eVar.f78182a;
            do {
                ((k0) ((z1) objArr[i13])).N();
                i13++;
            } while (i13 < i14);
        }
        eVar.h();
        return z13;
    }

    public final void m(k0 k0Var, long j13) {
        if (k0Var.I) {
            return;
        }
        k0 k0Var2 = this.f110757a;
        if (!(!Intrinsics.d(k0Var, k0Var2))) {
            jk.r.x("measureAndLayout called on root");
            throw null;
        }
        if (!k0Var2.G()) {
            jk.r.x("performMeasureAndLayout called with unattached root");
            throw null;
        }
        if (!k0Var2.H()) {
            jk.r.x("performMeasureAndLayout called with unplaced root");
            throw null;
        }
        if (!(!this.f110759c)) {
            jk.r.x("performMeasureAndLayout called during measure layout");
            throw null;
        }
        int i13 = 0;
        if (this.f110764h != null) {
            this.f110759c = true;
            this.f110760d = false;
            try {
                q qVar = this.f110758b;
                qVar.f110875a.d(k0Var);
                qVar.f110876b.d(k0Var);
                boolean b13 = b(k0Var, new n4.a(j13));
                v0 v0Var = k0Var.f110838z;
                if ((b13 || v0Var.f110974h) && Intrinsics.d(k0Var.I(), Boolean.TRUE)) {
                    k0Var.J();
                }
                e(k0Var);
                c(k0Var, new n4.a(j13));
                if (v0Var.f110971e && k0Var.H()) {
                    k0Var.T();
                    this.f110761e.f110998a.b(k0Var);
                    k0Var.H = true;
                }
                d();
                this.f110759c = false;
                this.f110760d = false;
            } catch (Throwable th3) {
                this.f110759c = false;
                this.f110760d = false;
                throw th3;
            }
        }
        k2.e eVar = this.f110762f;
        int i14 = eVar.f78184c;
        if (i14 > 0) {
            Object[] objArr = eVar.f78182a;
            do {
                ((k0) ((z1) objArr[i13])).N();
                i13++;
            } while (i13 < i14);
        }
        eVar.h();
    }

    public final void n() {
        q qVar = this.f110758b;
        if (qVar.c()) {
            k0 k0Var = this.f110757a;
            if (!k0Var.G()) {
                jk.r.x("performMeasureAndLayout called with unattached root");
                throw null;
            }
            if (!k0Var.H()) {
                jk.r.x("performMeasureAndLayout called with unplaced root");
                throw null;
            }
            if (!(!this.f110759c)) {
                jk.r.x("performMeasureAndLayout called during measure layout");
                throw null;
            }
            if (this.f110764h != null) {
                this.f110759c = true;
                this.f110760d = false;
                try {
                    if (!qVar.f110875a.f110861c.isEmpty()) {
                        if (k0Var.f110815c != null) {
                            q(k0Var, true);
                        } else {
                            p(k0Var);
                        }
                    }
                    q(k0Var, false);
                    this.f110759c = false;
                    this.f110760d = false;
                } catch (Throwable th3) {
                    this.f110759c = false;
                    this.f110760d = false;
                    throw th3;
                }
            }
        }
    }

    public final boolean o(k0 k0Var, boolean z13, boolean z14) {
        n4.a aVar;
        q3.m0 m0Var;
        x xVar;
        k0 v13;
        if (k0Var.I) {
            return false;
        }
        boolean H = k0Var.H();
        v0 v0Var = k0Var.f110838z;
        if (H || v0Var.f110984r.f110949t || h(k0Var) || Intrinsics.d(k0Var.I(), Boolean.TRUE) || i(k0Var) || k0Var.l()) {
            k0 k0Var2 = this.f110757a;
            if (k0Var == k0Var2) {
                aVar = this.f110764h;
                Intrinsics.f(aVar);
            } else {
                aVar = null;
            }
            if (z13) {
                r1 = v0Var.f110973g ? b(k0Var, aVar) : false;
                if (z14 && ((r1 || k0Var.r()) && Intrinsics.d(k0Var.I(), Boolean.TRUE))) {
                    k0Var.J();
                }
            } else {
                boolean c13 = v0Var.f110970d ? c(k0Var, aVar) : false;
                if (z14 && v0Var.f110971e && (k0Var == k0Var2 || ((v13 = k0Var.v()) != null && v13.H() && v0Var.f110984r.f110949t))) {
                    if (k0Var == k0Var2) {
                        if (k0Var.f110834v == i0.NotUsed) {
                            k0Var.g();
                        }
                        k0 v14 = k0Var.v();
                        if (v14 == null || (xVar = v14.f110837y.f110805b) == null || (m0Var = xVar.f111015i) == null) {
                            t3.c0 c0Var = (t3.c0) n0.a(k0Var);
                            int i13 = q3.e1.f102202b;
                            m0Var = new q3.m0(c0Var, 1);
                        }
                        q3.b1.f(m0Var, v0Var.f110984r, 0, 0);
                    } else {
                        k0Var.T();
                    }
                    this.f110761e.f110998a.b(k0Var);
                    k0Var.H = true;
                }
                r1 = c13;
            }
            d();
        }
        return r1;
    }

    public final void p(k0 k0Var) {
        k2.e y13 = k0Var.y();
        int i13 = y13.f78184c;
        if (i13 > 0) {
            Object[] objArr = y13.f78182a;
            int i14 = 0;
            do {
                k0 k0Var2 = (k0) objArr[i14];
                if (j(k0Var2)) {
                    if (com.bumptech.glide.c.t0(k0Var2)) {
                        q(k0Var2, true);
                    } else {
                        p(k0Var2);
                    }
                }
                i14++;
            } while (i14 < i13);
        }
    }

    public final void q(k0 k0Var, boolean z13) {
        n4.a aVar;
        if (k0Var.I) {
            return;
        }
        if (k0Var == this.f110757a) {
            aVar = this.f110764h;
            Intrinsics.f(aVar);
        } else {
            aVar = null;
        }
        if (z13) {
            b(k0Var, aVar);
        } else {
            c(k0Var, aVar);
        }
    }

    public final boolean r(k0 k0Var, boolean z13) {
        int i13 = c1.f110745a[k0Var.f110838z.f110969c.ordinal()];
        if (i13 != 1) {
            if (i13 != 2) {
                if (i13 != 3) {
                    if (i13 != 4 && i13 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            v0 v0Var = k0Var.f110838z;
            if ((!v0Var.f110973g && !v0Var.f110974h) || z13) {
                v0Var.f110974h = true;
                v0Var.f110975i = true;
                v0Var.f110971e = true;
                v0Var.f110972f = true;
                if (!k0Var.I) {
                    k0 v13 = k0Var.v();
                    boolean d2 = Intrinsics.d(k0Var.I(), Boolean.TRUE);
                    q qVar = this.f110758b;
                    if (d2 && ((v13 == null || !v13.f110838z.f110973g) && (v13 == null || !v13.f110838z.f110974h))) {
                        qVar.a(k0Var, true);
                    } else if (k0Var.H() && ((v13 == null || !v13.f110838z.f110971e) && (v13 == null || !v13.f110838z.f110970d))) {
                        qVar.a(k0Var, false);
                    }
                    if (!this.f110760d) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean s(k0 k0Var, boolean z13) {
        k0 v13;
        k0 v14;
        if (k0Var.f110815c == null) {
            jk.r.y("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
            throw null;
        }
        v0 v0Var = k0Var.f110838z;
        int i13 = c1.f110745a[v0Var.f110969c.ordinal()];
        if (i13 != 1) {
            if (i13 == 2 || i13 == 3 || i13 == 4) {
                this.f110763g.b(new b1(k0Var, true, z13));
            } else {
                if (i13 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!v0Var.f110973g || z13) {
                    k0Var.K();
                    v0Var.f110970d = true;
                    if (!k0Var.I) {
                        boolean d2 = Intrinsics.d(k0Var.I(), Boolean.TRUE);
                        q qVar = this.f110758b;
                        if ((d2 || i(k0Var)) && ((v13 = k0Var.v()) == null || !v13.f110838z.f110973g)) {
                            qVar.a(k0Var, true);
                        } else if ((k0Var.H() || h(k0Var)) && ((v14 = k0Var.v()) == null || !v14.f110838z.f110970d)) {
                            qVar.a(k0Var, false);
                        }
                        if (!this.f110760d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean t(k0 k0Var, boolean z13) {
        int i13 = c1.f110745a[k0Var.f110838z.f110969c.ordinal()];
        if (i13 != 1 && i13 != 2) {
            if (i13 == 3 || i13 == 4) {
                this.f110763g.b(new b1(k0Var, false, z13));
            } else {
                if (i13 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                v0 v0Var = k0Var.f110838z;
                if (!v0Var.f110970d || z13) {
                    v0Var.f110970d = true;
                    if (!k0Var.I && (k0Var.H() || h(k0Var))) {
                        k0 v13 = k0Var.v();
                        if (v13 == null || !v13.f110838z.f110970d) {
                            this.f110758b.a(k0Var, false);
                        }
                        if (!this.f110760d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void u(long j13) {
        n4.a aVar = this.f110764h;
        if (aVar != null && n4.a.b(aVar.f89168a, j13)) {
            return;
        }
        if (!(!this.f110759c)) {
            jk.r.x("updateRootConstraints called while measuring");
            throw null;
        }
        this.f110764h = new n4.a(j13);
        k0 k0Var = this.f110757a;
        if (k0Var.f110815c != null) {
            k0Var.K();
        }
        k0Var.f110838z.f110970d = true;
        this.f110758b.a(k0Var, k0Var.f110815c != null);
    }
}
