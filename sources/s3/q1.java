package s3;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes.dex */
public abstract class q1 extends z0 implements q3.o0, q3.x, b2 {
    public static final b3.u0 G;
    public static final z H;
    public static final float[] I;

    /* renamed from: J, reason: collision with root package name */
    public static final vb0.i f110897J;
    public static final vb0.i K;
    public z A;
    public boolean D;
    public y1 E;
    public e3.d F;

    /* renamed from: l, reason: collision with root package name */
    public final k0 f110898l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f110899m;

    /* renamed from: n, reason: collision with root package name */
    public q1 f110900n;

    /* renamed from: o, reason: collision with root package name */
    public q1 f110901o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f110902p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f110903q;

    /* renamed from: r, reason: collision with root package name */
    public Function1 f110904r;

    /* renamed from: s, reason: collision with root package name */
    public n4.b f110905s;

    /* renamed from: t, reason: collision with root package name */
    public n4.k f110906t;

    /* renamed from: v, reason: collision with root package name */
    public q3.q0 f110908v;

    /* renamed from: w, reason: collision with root package name */
    public LinkedHashMap f110909w;

    /* renamed from: y, reason: collision with root package name */
    public float f110911y;

    /* renamed from: z, reason: collision with root package name */
    public a3.b f110912z;

    /* renamed from: u, reason: collision with root package name */
    public float f110907u = 0.8f;

    /* renamed from: x, reason: collision with root package name */
    public long f110910x = 0;
    public final p1.p1 B = new p1.p1(this, 7);
    public final androidx.activity.a0 C = new androidx.activity.a0(this, 14);

    static {
        b3.u0 u0Var = new b3.u0();
        u0Var.f21355b = 1.0f;
        u0Var.f21356c = 1.0f;
        u0Var.f21357d = 1.0f;
        long j13 = b3.e0.f21313a;
        u0Var.f21361h = j13;
        u0Var.f21362i = j13;
        u0Var.f21366m = 8.0f;
        u0Var.f21367n = b3.b1.f21304b;
        u0Var.f21368o = b3.s0.f21349a;
        u0Var.f21370q = 0;
        u0Var.f21371r = y2.h.f136670b;
        u0Var.f21372s = ao2.m0.a();
        u0Var.f21373t = n4.k.Ltr;
        G = u0Var;
        H = new z();
        I = b3.i0.a();
        f110897J = new vb0.i(0);
        K = new vb0.i(1);
    }

    public q1(k0 k0Var) {
        this.f110898l = k0Var;
        this.f110905s = k0Var.f110830r;
        this.f110906t = k0Var.f110831s;
    }

    public static q1 p1(q3.x xVar) {
        q1 M0;
        q3.n0 n0Var = xVar instanceof q3.n0 ? (q3.n0) xVar : null;
        if (n0Var != null && (M0 = n0Var.f102254a.M0()) != null) {
            return M0;
        }
        Intrinsics.g(xVar, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (q1) xVar;
    }

    @Override // s3.z0
    public final z0 A0() {
        return this.f110900n;
    }

    @Override // q3.x
    public final long B(long j13) {
        if (X0().f120054m) {
            return W(androidx.compose.ui.layout.b.e(this), ((t3.c0) n0.a(this.f110898l)).G(j13));
        }
        jk.r.y("LayoutCoordinate operations are only valid when isAttached is true");
        throw null;
    }

    @Override // s3.z0
    public final q3.x B0() {
        return this;
    }

    @Override // s3.z0
    public final boolean C0() {
        return this.f110908v != null;
    }

    @Override // s3.z0
    public final k0 D0() {
        return this.f110898l;
    }

    @Override // q3.x
    public final long E(long j13) {
        long c03 = c0(j13);
        t3.c0 c0Var = (t3.c0) n0.a(this.f110898l);
        c0Var.D();
        return b3.i0.b(c03, c0Var.L);
    }

    @Override // s3.z0
    public final q3.q0 E0() {
        q3.q0 q0Var = this.f110908v;
        if (q0Var != null) {
            return q0Var;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier".toString());
    }

    @Override // s3.z0
    public final z0 F0() {
        return this.f110901o;
    }

    @Override // s3.z0
    public final long G0() {
        return this.f110910x;
    }

    @Override // q3.x
    public final a3.d J(q3.x xVar, boolean z13) {
        if (!X0().f120054m) {
            jk.r.y("LayoutCoordinate operations are only valid when isAttached is true");
            throw null;
        }
        if (!xVar.h()) {
            jk.r.y("LayoutCoordinates " + xVar + " is not attached!");
            throw null;
        }
        q1 p13 = p1(xVar);
        p13.f1();
        q1 S0 = S0(p13);
        a3.b bVar = this.f110912z;
        if (bVar == null) {
            bVar = new a3.b();
            bVar.f478a = 0.0f;
            bVar.f479b = 0.0f;
            bVar.f480c = 0.0f;
            bVar.f481d = 0.0f;
            this.f110912z = bVar;
        }
        bVar.f478a = 0.0f;
        bVar.f479b = 0.0f;
        bVar.f480c = (int) (xVar.j() >> 32);
        bVar.f481d = (int) (xVar.j() & 4294967295L);
        while (p13 != S0) {
            p13.m1(bVar, z13, false);
            if (bVar.b()) {
                return a3.d.f483e;
            }
            p13 = p13.f110901o;
            Intrinsics.f(p13);
        }
        K0(S0, bVar, z13);
        return new a3.d(bVar.f478a, bVar.f479b, bVar.f480c, bVar.f481d);
    }

    @Override // s3.z0
    public final void J0() {
        e3.d dVar = this.F;
        if (dVar != null) {
            k1(this.f110910x, this.f110911y, dVar);
        } else {
            u0(this.f110910x, this.f110911y, this.f110904r);
        }
    }

    public final void K0(q1 q1Var, a3.b bVar, boolean z13) {
        if (q1Var == this) {
            return;
        }
        q1 q1Var2 = this.f110901o;
        if (q1Var2 != null) {
            q1Var2.K0(q1Var, bVar, z13);
        }
        U0(bVar, z13);
    }

    @Override // q3.x
    public final void L(float[] fArr) {
        a2 a13 = n0.a(this.f110898l);
        s1(p1(androidx.compose.ui.layout.b.e(this)), fArr);
        t3.c0 c0Var = (t3.c0) a13;
        c0Var.D();
        b3.i0.g(fArr, c0Var.L);
        float d2 = a3.c.d(c0Var.P);
        float e13 = a3.c.e(c0Var.P);
        float[] fArr2 = c0Var.K;
        b3.i0.d(fArr2);
        b3.i0.h(fArr2, d2, e13, 0.0f);
        t3.d1.c(fArr, fArr2);
    }

    public final long L0(q1 q1Var, long j13) {
        if (q1Var == this) {
            return j13;
        }
        q1 q1Var2 = this.f110901o;
        return (q1Var2 == null || Intrinsics.d(q1Var, q1Var2)) ? T0(j13, true) : T0(q1Var2.L0(q1Var, j13), true);
    }

    public final long M0(long j13) {
        return bs1.c.c(Math.max(0.0f, (a3.f.d(j13) - i0()) / 2.0f), Math.max(0.0f, (a3.f.b(j13) - e0()) / 2.0f));
    }

    public final float N0(long j13, long j14) {
        if (i0() >= a3.f.d(j14) && e0() >= a3.f.b(j14)) {
            return Float.POSITIVE_INFINITY;
        }
        long M0 = M0(j14);
        float d2 = a3.f.d(M0);
        float b13 = a3.f.b(M0);
        float d13 = a3.c.d(j13);
        float max = Math.max(0.0f, d13 < 0.0f ? -d13 : d13 - i0());
        float e13 = a3.c.e(j13);
        long d14 = com.bumptech.glide.c.d(max, Math.max(0.0f, e13 < 0.0f ? -e13 : e13 - e0()));
        if ((d2 <= 0.0f && b13 <= 0.0f) || a3.c.d(d14) > d2 || a3.c.e(d14) > b13) {
            return Float.POSITIVE_INFINITY;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (d14 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (d14 & 4294967295L));
        return (intBitsToFloat2 * intBitsToFloat2) + (intBitsToFloat * intBitsToFloat);
    }

    public final void O0(b3.u uVar, e3.d dVar) {
        y1 y1Var = this.E;
        if (y1Var != null) {
            y1Var.e(uVar, dVar);
            return;
        }
        long j13 = this.f110910x;
        float f13 = (int) (j13 >> 32);
        float f14 = (int) (j13 & 4294967295L);
        uVar.f(f13, f14);
        Q0(uVar, dVar);
        uVar.f(-f13, -f14);
    }

    public final void P0(b3.u uVar, b3.i iVar) {
        long j13 = this.f102180c;
        uVar.getClass();
        uVar.a(0.5f, 0.5f, ((int) (j13 >> 32)) - 0.5f, ((int) (j13 & 4294967295L)) - 0.5f, iVar);
    }

    public final void Q0(b3.u uVar, e3.d dVar) {
        u2.p Y0 = Y0(4);
        if (Y0 == null) {
            j1(uVar, dVar);
            return;
        }
        k0 k0Var = this.f110898l;
        k0Var.getClass();
        t3.c0 c0Var = (t3.c0) n0.a(k0Var);
        long y13 = lb.l0.y1(this.f102180c);
        m0 m0Var = c0Var.f115873c;
        m0Var.getClass();
        k2.e eVar = null;
        while (Y0 != null) {
            if (Y0 instanceof r) {
                m0Var.c(uVar, y13, this, (r) Y0, dVar);
            } else if ((Y0.f120044c & 4) != 0 && (Y0 instanceof n)) {
                int i13 = 0;
                for (u2.p pVar = ((n) Y0).f110843o; pVar != null; pVar = pVar.f120047f) {
                    if ((pVar.f120044c & 4) != 0) {
                        i13++;
                        if (i13 == 1) {
                            Y0 = pVar;
                        } else {
                            if (eVar == null) {
                                eVar = new k2.e(new u2.p[16]);
                            }
                            if (Y0 != null) {
                                eVar.b(Y0);
                                Y0 = null;
                            }
                            eVar.b(pVar);
                        }
                    }
                }
                if (i13 == 1) {
                }
            }
            Y0 = com.bumptech.glide.c.g(eVar);
        }
    }

    public abstract void R0();

    public final q1 S0(q1 q1Var) {
        k0 k0Var = q1Var.f110898l;
        k0 k0Var2 = this.f110898l;
        if (k0Var == k0Var2) {
            u2.p X0 = q1Var.X0();
            u2.p pVar = X0().f120042a;
            if (!pVar.f120054m) {
                jk.r.y("visitLocalAncestors called on an unattached node");
                throw null;
            }
            for (u2.p pVar2 = pVar.f120046e; pVar2 != null; pVar2 = pVar2.f120046e) {
                if ((pVar2.f120044c & 2) != 0 && pVar2 == X0) {
                    return q1Var;
                }
            }
            return this;
        }
        while (k0Var.f110823k > k0Var2.f110823k) {
            k0Var = k0Var.v();
            Intrinsics.f(k0Var);
        }
        k0 k0Var3 = k0Var2;
        while (k0Var3.f110823k > k0Var.f110823k) {
            k0Var3 = k0Var3.v();
            Intrinsics.f(k0Var3);
        }
        while (k0Var != k0Var3) {
            k0Var = k0Var.v();
            k0Var3 = k0Var3.v();
            if (k0Var == null || k0Var3 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        return k0Var3 == k0Var2 ? this : k0Var == q1Var.f110898l ? q1Var : k0Var.f110837y.f110805b;
    }

    public final long T0(long j13, boolean z13) {
        if (z13 || !this.f111012f) {
            long j14 = this.f110910x;
            j13 = com.bumptech.glide.c.d(a3.c.d(j13) - ((int) (j14 >> 32)), a3.c.e(j13) - ((int) (j14 & 4294967295L)));
        }
        y1 y1Var = this.E;
        return y1Var != null ? y1Var.c(j13, true) : j13;
    }

    public final void U0(a3.b bVar, boolean z13) {
        long j13 = this.f110910x;
        float f13 = (int) (j13 >> 32);
        bVar.f478a -= f13;
        bVar.f480c -= f13;
        float f14 = (int) (j13 & 4294967295L);
        bVar.f479b -= f14;
        bVar.f481d -= f14;
        y1 y1Var = this.E;
        if (y1Var != null) {
            y1Var.k(bVar, true);
            if (this.f110903q && z13) {
                long j14 = this.f102180c;
                bVar.a(0.0f, 0.0f, (int) (j14 >> 32), (int) (j14 & 4294967295L));
            }
        }
    }

    @Override // q3.x
    public final q3.x V() {
        if (X0().f120054m) {
            f1();
            return this.f110898l.f110837y.f110806c.f110901o;
        }
        jk.r.y("LayoutCoordinate operations are only valid when isAttached is true");
        throw null;
    }

    public abstract a1 V0();

    @Override // q3.x
    public final long W(q3.x xVar, long j13) {
        if (xVar instanceof q3.n0) {
            ((q3.n0) xVar).f102254a.f110732l.f1();
            return xVar.W(this, j13 ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        q1 p13 = p1(xVar);
        p13.f1();
        q1 S0 = S0(p13);
        while (p13 != S0) {
            j13 = p13.q1(j13, true);
            p13 = p13.f110901o;
            Intrinsics.f(p13);
        }
        return L0(S0, j13);
    }

    public final long W0() {
        return this.f110905s.v0(this.f110898l.f110832t.d());
    }

    @Override // s3.b2
    public final boolean X() {
        return (this.E == null || this.f110902p || !this.f110898l.G()) ? false : true;
    }

    public abstract u2.p X0();

    public final u2.p Y0(int i13) {
        boolean h10 = r1.h(i13);
        u2.p X0 = X0();
        if (!h10 && (X0 = X0.f120046e) == null) {
            return null;
        }
        for (u2.p Z0 = Z0(h10); Z0 != null && (Z0.f120045d & i13) != 0; Z0 = Z0.f120047f) {
            if ((Z0.f120044c & i13) != 0) {
                return Z0;
            }
            if (Z0 == X0) {
                return null;
            }
        }
        return null;
    }

    public final u2.p Z0(boolean z13) {
        u2.p X0;
        j1 j1Var = this.f110898l.f110837y;
        if (j1Var.f110806c == this) {
            return j1Var.f110808e;
        }
        if (z13) {
            q1 q1Var = this.f110901o;
            if (q1Var != null && (X0 = q1Var.X0()) != null) {
                return X0.f120047f;
            }
        } else {
            q1 q1Var2 = this.f110901o;
            if (q1Var2 != null) {
                return q1Var2.X0();
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // q3.s0, q3.r
    public final Object a() {
        k0 k0Var = this.f110898l;
        if (!k0Var.f110837y.d(64)) {
            return null;
        }
        X0();
        Object obj = null;
        for (u2.p pVar = k0Var.f110837y.f110807d; pVar != null; pVar = pVar.f120046e) {
            if ((pVar.f120044c & 64) != 0) {
                n nVar = pVar;
                ?? r63 = 0;
                while (nVar != 0) {
                    if (nVar instanceof d2) {
                        obj = ((d2) nVar).J(k0Var.f110830r, obj);
                    } else if ((nVar.f120044c & 64) != 0 && (nVar instanceof n)) {
                        u2.p pVar2 = nVar.f110843o;
                        int i13 = 0;
                        nVar = nVar;
                        r63 = r63;
                        while (pVar2 != null) {
                            if ((pVar2.f120044c & 64) != 0) {
                                i13++;
                                r63 = r63;
                                if (i13 == 1) {
                                    nVar = pVar2;
                                } else {
                                    if (r63 == 0) {
                                        r63 = new k2.e(new u2.p[16]);
                                    }
                                    if (nVar != 0) {
                                        r63.b(nVar);
                                        nVar = 0;
                                    }
                                    r63.b(pVar2);
                                }
                            }
                            pVar2 = pVar2.f120047f;
                            nVar = nVar;
                            r63 = r63;
                        }
                        if (i13 == 1) {
                        }
                    }
                    nVar = com.bumptech.glide.c.g(r63);
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void a1(u2.p pVar, m1 m1Var, long j13, v vVar, boolean z13, boolean z14) {
        if (pVar == null) {
            c1(m1Var, j13, vVar, z13, z14);
            return;
        }
        vVar.c(pVar, -1.0f, z14, new o1(this, pVar, m1Var, j13, vVar, z13, z14));
        q1 q1Var = pVar.f120049h;
        if (q1Var != null) {
            u2.p Z0 = q1Var.Z0(r1.h(16));
            if (Z0 != null && Z0.f120054m) {
                u2.p pVar2 = Z0.f120042a;
                if (!pVar2.f120054m) {
                    jk.r.y("visitLocalDescendants called on an unattached node");
                    throw null;
                }
                if ((pVar2.f120045d & 16) != 0) {
                    while (pVar2 != null) {
                        if ((pVar2.f120044c & 16) != 0) {
                            n nVar = pVar2;
                            ?? r53 = 0;
                            while (nVar != 0) {
                                if (nVar instanceof f2) {
                                    if (((f2) nVar).u0()) {
                                        return;
                                    }
                                } else if ((nVar.f120044c & 16) != 0 && (nVar instanceof n)) {
                                    u2.p pVar3 = nVar.f110843o;
                                    int i13 = 0;
                                    nVar = nVar;
                                    r53 = r53;
                                    while (pVar3 != null) {
                                        if ((pVar3.f120044c & 16) != 0) {
                                            i13++;
                                            r53 = r53;
                                            if (i13 == 1) {
                                                nVar = pVar3;
                                            } else {
                                                if (r53 == 0) {
                                                    r53 = new k2.e(new u2.p[16]);
                                                }
                                                if (nVar != 0) {
                                                    r53.b(nVar);
                                                    nVar = 0;
                                                }
                                                r53.b(pVar3);
                                            }
                                        }
                                        pVar3 = pVar3.f120047f;
                                        nVar = nVar;
                                        r53 = r53;
                                    }
                                    if (i13 == 1) {
                                    }
                                }
                                nVar = com.bumptech.glide.c.g(r53);
                            }
                        }
                        pVar2 = pVar2.f120047f;
                    }
                }
            }
            vVar.f110966e = false;
        }
    }

    @Override // n4.b
    public final float b() {
        return this.f110898l.f110830r.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0105, code lost:
    
        if (kh2.d.n(r21.b(), kh2.j.g(r15, r23)) > 0) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b1(s3.m1 r18, long r19, s3.v r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.q1.b1(s3.m1, long, s3.v, boolean, boolean):void");
    }

    @Override // q3.x
    public final long c0(long j13) {
        if (!X0().f120054m) {
            jk.r.y("LayoutCoordinate operations are only valid when isAttached is true");
            throw null;
        }
        f1();
        for (q1 q1Var = this; q1Var != null; q1Var = q1Var.f110901o) {
            j13 = q1Var.q1(j13, true);
        }
        return j13;
    }

    public void c1(m1 m1Var, long j13, v vVar, boolean z13, boolean z14) {
        q1 q1Var = this.f110900n;
        if (q1Var != null) {
            q1Var.b1(m1Var, q1Var.T0(j13, true), vVar, z13, z14);
        }
    }

    public final void d1() {
        y1 y1Var = this.E;
        if (y1Var != null) {
            y1Var.invalidate();
            return;
        }
        q1 q1Var = this.f110901o;
        if (q1Var != null) {
            q1Var.d1();
        }
    }

    @Override // q3.x
    public final long e(q3.x xVar, long j13) {
        return W(xVar, j13);
    }

    public final boolean e1() {
        if (this.E != null && this.f110907u <= 0.0f) {
            return true;
        }
        q1 q1Var = this.f110901o;
        if (q1Var != null) {
            return q1Var.e1();
        }
        return false;
    }

    public final void f1() {
        v0 v0Var = this.f110898l.f110838z;
        g0 g0Var = v0Var.f110967a.f110838z.f110969c;
        if (g0Var == g0.LayingOut || g0Var == g0.LookaheadLayingOut) {
            if (v0Var.f110984r.f110953x) {
                v0Var.f(true);
            } else {
                v0Var.e(true);
            }
        }
        if (g0Var == g0.LookaheadLayingOut) {
            q0 q0Var = v0Var.f110985s;
            if (q0Var == null || !q0Var.A0()) {
                v0Var.g(true);
            } else {
                v0Var.h(true);
            }
        }
    }

    public final void g1() {
        y1 y1Var = this.E;
        if (y1Var != null) {
            y1Var.invalidate();
        }
    }

    @Override // q3.s
    public final n4.k getLayoutDirection() {
        return this.f110898l.f110831s;
    }

    @Override // q3.x
    public final boolean h() {
        return X0().f120054m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r7v7, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void h1() {
        u2.p pVar;
        u2.p Z0 = Z0(r1.h(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN));
        if (Z0 == null || (Z0.f120042a.f120045d & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0) {
            return;
        }
        s2.i P = bk.f.P();
        Function1 f13 = P != null ? P.f() : null;
        s2.i X = bk.f.X(P);
        try {
            boolean h10 = r1.h(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
            if (h10) {
                pVar = X0();
            } else {
                pVar = X0().f120046e;
                if (pVar == null) {
                    Unit unit = Unit.f80348a;
                    bk.f.c0(P, X, f13);
                }
            }
            for (u2.p Z02 = Z0(h10); Z02 != null && (Z02.f120045d & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0; Z02 = Z02.f120047f) {
                if ((Z02.f120044c & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0) {
                    ?? r83 = 0;
                    n nVar = Z02;
                    while (nVar != 0) {
                        if (nVar instanceof a0) {
                            ((a0) nVar).n(this.f102180c);
                        } else if ((nVar.f120044c & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 && (nVar instanceof n)) {
                            u2.p pVar2 = nVar.f110843o;
                            int i13 = 0;
                            nVar = nVar;
                            r83 = r83;
                            while (pVar2 != null) {
                                if ((pVar2.f120044c & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0) {
                                    i13++;
                                    r83 = r83;
                                    if (i13 == 1) {
                                        nVar = pVar2;
                                    } else {
                                        if (r83 == 0) {
                                            r83 = new k2.e(new u2.p[16]);
                                        }
                                        if (nVar != 0) {
                                            r83.b(nVar);
                                            nVar = 0;
                                        }
                                        r83.b(pVar2);
                                    }
                                }
                                pVar2 = pVar2.f120047f;
                                nVar = nVar;
                                r83 = r83;
                            }
                            if (i13 == 1) {
                            }
                        }
                        nVar = com.bumptech.glide.c.g(r83);
                    }
                }
                if (Z02 == pVar) {
                    break;
                }
            }
            Unit unit2 = Unit.f80348a;
            bk.f.c0(P, X, f13);
        } catch (Throwable th3) {
            bk.f.c0(P, X, f13);
            throw th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void i1() {
        boolean h10 = r1.h(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
        u2.p X0 = X0();
        if (!h10 && (X0 = X0.f120046e) == null) {
            return;
        }
        for (u2.p Z0 = Z0(h10); Z0 != null && (Z0.f120045d & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0; Z0 = Z0.f120047f) {
            if ((Z0.f120044c & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0) {
                n nVar = Z0;
                ?? r53 = 0;
                while (nVar != 0) {
                    if (nVar instanceof a0) {
                        ((a0) nVar).N(this);
                    } else if ((nVar.f120044c & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 && (nVar instanceof n)) {
                        u2.p pVar = nVar.f110843o;
                        int i13 = 0;
                        nVar = nVar;
                        r53 = r53;
                        while (pVar != null) {
                            if ((pVar.f120044c & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0) {
                                i13++;
                                r53 = r53;
                                if (i13 == 1) {
                                    nVar = pVar;
                                } else {
                                    if (r53 == 0) {
                                        r53 = new k2.e(new u2.p[16]);
                                    }
                                    if (nVar != 0) {
                                        r53.b(nVar);
                                        nVar = 0;
                                    }
                                    r53.b(pVar);
                                }
                            }
                            pVar = pVar.f120047f;
                            nVar = nVar;
                            r53 = r53;
                        }
                        if (i13 == 1) {
                        }
                    }
                    nVar = com.bumptech.glide.c.g(r53);
                }
            }
            if (Z0 == X0) {
                return;
            }
        }
    }

    @Override // q3.x
    public final long j() {
        return this.f102180c;
    }

    @Override // n4.b
    public final float j0() {
        return this.f110898l.f110830r.j0();
    }

    public abstract void j1(b3.u uVar, e3.d dVar);

    public abstract void k1(long j13, float f13, e3.d dVar);

    @Override // q3.x
    public final long l(long j13) {
        if (!X0().f120054m) {
            jk.r.y("LayoutCoordinate operations are only valid when isAttached is true");
            throw null;
        }
        q3.x e13 = androidx.compose.ui.layout.b.e(this);
        t3.c0 c0Var = (t3.c0) n0.a(this.f110898l);
        c0Var.D();
        return W(e13, a3.c.g(b3.i0.b(j13, c0Var.M), e13.c0(0L)));
    }

    public final void l1(long j13, float f13, Function1 function1, e3.d dVar) {
        k0 k0Var = this.f110898l;
        if (dVar == null) {
            if (this.F != null) {
                this.F = null;
                t1(null, false);
            }
            t1(function1, false);
        } else {
            if (function1 != null) {
                jk.r.x("both ways to create layers shouldn't be used together");
                throw null;
            }
            if (this.F != dVar) {
                this.F = null;
                t1(null, false);
                this.F = dVar;
            }
            if (this.E == null) {
                t3.c0 c0Var = (t3.c0) n0.a(k0Var);
                p1.p1 p1Var = this.B;
                androidx.activity.a0 a0Var = this.C;
                y1 h10 = c0Var.h(p1Var, a0Var, dVar);
                h10.d(this.f102180c);
                h10.i(j13);
                this.E = h10;
                k0Var.C = true;
                a0Var.invoke();
            }
        }
        if (!n4.h.a(this.f110910x, j13)) {
            this.f110910x = j13;
            k0Var.f110838z.f110984r.B0();
            y1 y1Var = this.E;
            if (y1Var != null) {
                y1Var.i(j13);
            } else {
                q1 q1Var = this.f110901o;
                if (q1Var != null) {
                    q1Var.d1();
                }
            }
            z0.H0(this);
            a2 a2Var = k0Var.f110821i;
            if (a2Var != null) {
                ((t3.c0) a2Var).z(k0Var);
            }
        }
        this.f110911y = f13;
        if (this.f111014h) {
            return;
        }
        z0(new e2(E0(), this));
    }

    public final void m1(a3.b bVar, boolean z13, boolean z14) {
        y1 y1Var = this.E;
        if (y1Var != null) {
            if (this.f110903q) {
                if (z14) {
                    long W0 = W0();
                    float d2 = a3.f.d(W0) / 2.0f;
                    float b13 = a3.f.b(W0) / 2.0f;
                    long j13 = this.f102180c;
                    bVar.a(-d2, -b13, ((int) (j13 >> 32)) + d2, ((int) (j13 & 4294967295L)) + b13);
                } else if (z13) {
                    long j14 = this.f102180c;
                    bVar.a(0.0f, 0.0f, (int) (j14 >> 32), (int) (j14 & 4294967295L));
                }
                if (bVar.b()) {
                    return;
                }
            }
            y1Var.k(bVar, false);
        }
        long j15 = this.f110910x;
        float f13 = (int) (j15 >> 32);
        bVar.f478a += f13;
        bVar.f480c += f13;
        float f14 = (int) (j15 & 4294967295L);
        bVar.f479b += f14;
        bVar.f481d += f14;
    }

    @Override // q3.x
    public final void n(q3.x xVar, float[] fArr) {
        q1 p13 = p1(xVar);
        p13.f1();
        q1 S0 = S0(p13);
        b3.i0.d(fArr);
        p13.s1(S0, fArr);
        r1(S0, fArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void n1(q3.q0 q0Var) {
        q1 q1Var;
        q3.q0 q0Var2 = this.f110908v;
        if (q0Var != q0Var2) {
            this.f110908v = q0Var;
            k0 k0Var = this.f110898l;
            if (q0Var2 == null || q0Var.j() != q0Var2.j() || q0Var.i() != q0Var2.i()) {
                int j13 = q0Var.j();
                int i13 = q0Var.i();
                y1 y1Var = this.E;
                if (y1Var != null) {
                    y1Var.d(lb.l0.d(j13, i13));
                } else if (k0Var.H() && (q1Var = this.f110901o) != null) {
                    q1Var.d1();
                }
                w0(lb.l0.d(j13, i13));
                if (this.f110904r != null) {
                    u1(false);
                }
                boolean h10 = r1.h(4);
                u2.p X0 = X0();
                if (h10 || (X0 = X0.f120046e) != null) {
                    for (u2.p Z0 = Z0(h10); Z0 != null && (Z0.f120045d & 4) != 0; Z0 = Z0.f120047f) {
                        if ((Z0.f120044c & 4) != 0) {
                            n nVar = Z0;
                            ?? r83 = 0;
                            while (nVar != 0) {
                                if (nVar instanceof r) {
                                    ((r) nVar).e0();
                                } else if ((nVar.f120044c & 4) != 0 && (nVar instanceof n)) {
                                    u2.p pVar = nVar.f110843o;
                                    int i14 = 0;
                                    nVar = nVar;
                                    r83 = r83;
                                    while (pVar != null) {
                                        if ((pVar.f120044c & 4) != 0) {
                                            i14++;
                                            r83 = r83;
                                            if (i14 == 1) {
                                                nVar = pVar;
                                            } else {
                                                if (r83 == 0) {
                                                    r83 = new k2.e(new u2.p[16]);
                                                }
                                                if (nVar != 0) {
                                                    r83.b(nVar);
                                                    nVar = 0;
                                                }
                                                r83.b(pVar);
                                            }
                                        }
                                        pVar = pVar.f120047f;
                                        nVar = nVar;
                                        r83 = r83;
                                    }
                                    if (i14 == 1) {
                                    }
                                }
                                nVar = com.bumptech.glide.c.g(r83);
                            }
                        }
                        if (Z0 == X0) {
                            break;
                        }
                    }
                }
                a2 a2Var = k0Var.f110821i;
                if (a2Var != null) {
                    ((t3.c0) a2Var).z(k0Var);
                }
            }
            LinkedHashMap linkedHashMap = this.f110909w;
            if (((linkedHashMap == null || linkedHashMap.isEmpty()) && !(!q0Var.c().isEmpty())) || Intrinsics.d(q0Var.c(), this.f110909w)) {
                return;
            }
            k0Var.f110838z.f110984r.f110950u.g();
            LinkedHashMap linkedHashMap2 = this.f110909w;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                this.f110909w = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(q0Var.c());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void o1(u2.p pVar, m1 m1Var, long j13, v vVar, boolean z13, boolean z14, float f13) {
        if (pVar == null) {
            c1(m1Var, j13, vVar, z13, z14);
            return;
        }
        vb0.i iVar = (vb0.i) m1Var;
        int i13 = 16;
        switch (iVar.f125465a) {
            case 0:
                n nVar = pVar;
                ?? r53 = 0;
                while (nVar != 0) {
                    if (nVar instanceof f2) {
                        ((f2) nVar).D();
                    } else if ((nVar.f120044c & 16) != 0 && (nVar instanceof n)) {
                        u2.p pVar2 = nVar.f110843o;
                        int i14 = 0;
                        nVar = nVar;
                        r53 = r53;
                        while (pVar2 != null) {
                            if ((pVar2.f120044c & 16) != 0) {
                                i14++;
                                r53 = r53;
                                if (i14 == 1) {
                                    nVar = pVar2;
                                } else {
                                    if (r53 == 0) {
                                        r53 = new k2.e(new u2.p[16]);
                                    }
                                    if (nVar != 0) {
                                        r53.b(nVar);
                                        nVar = 0;
                                    }
                                    r53.b(pVar2);
                                }
                            }
                            pVar2 = pVar2.f120047f;
                            nVar = nVar;
                            r53 = r53;
                        }
                        if (i14 == 1) {
                        }
                    }
                    nVar = com.bumptech.glide.c.g(r53);
                }
                break;
        }
        switch (iVar.f125465a) {
            case 0:
                break;
            default:
                i13 = 8;
                break;
        }
        o1(kh2.r.h(pVar, i13), m1Var, j13, vVar, z13, z14, f13);
    }

    public final long q1(long j13, boolean z13) {
        y1 y1Var = this.E;
        if (y1Var != null) {
            j13 = y1Var.c(j13, false);
        }
        if (!z13 && this.f111012f) {
            return j13;
        }
        long j14 = this.f110910x;
        return com.bumptech.glide.c.d(a3.c.d(j13) + ((int) (j14 >> 32)), a3.c.e(j13) + ((int) (j14 & 4294967295L)));
    }

    public final void r1(q1 q1Var, float[] fArr) {
        if (Intrinsics.d(q1Var, this)) {
            return;
        }
        q1 q1Var2 = this.f110901o;
        Intrinsics.f(q1Var2);
        q1Var2.r1(q1Var, fArr);
        if (!n4.h.a(this.f110910x, 0L)) {
            float[] fArr2 = I;
            b3.i0.d(fArr2);
            long j13 = this.f110910x;
            b3.i0.h(fArr2, -((int) (j13 >> 32)), -((int) (j13 & 4294967295L)), 0.0f);
            b3.i0.g(fArr, fArr2);
        }
        y1 y1Var = this.E;
        if (y1Var != null) {
            y1Var.h(fArr);
        }
    }

    public final void s1(q1 q1Var, float[] fArr) {
        q1 q1Var2 = this;
        while (!Intrinsics.d(q1Var2, q1Var)) {
            y1 y1Var = q1Var2.E;
            if (y1Var != null) {
                y1Var.a(fArr);
            }
            if (!n4.h.a(q1Var2.f110910x, 0L)) {
                float[] fArr2 = I;
                b3.i0.d(fArr2);
                b3.i0.h(fArr2, (int) (r1 >> 32), (int) (r1 & 4294967295L), 0.0f);
                b3.i0.g(fArr, fArr2);
            }
            q1Var2 = q1Var2.f110901o;
            Intrinsics.f(q1Var2);
        }
    }

    public final void t1(Function1 function1, boolean z13) {
        a2 a2Var;
        if (!(function1 == null || this.F == null)) {
            jk.r.x("layerBlock can't be provided when explicitLayer is provided");
            throw null;
        }
        k0 k0Var = this.f110898l;
        boolean z14 = (!z13 && this.f110904r == function1 && Intrinsics.d(this.f110905s, k0Var.f110830r) && this.f110906t == k0Var.f110831s) ? false : true;
        this.f110905s = k0Var.f110830r;
        this.f110906t = k0Var.f110831s;
        boolean G2 = k0Var.G();
        androidx.activity.a0 a0Var = this.C;
        if (!G2 || function1 == null) {
            this.f110904r = null;
            y1 y1Var = this.E;
            if (y1Var != null) {
                y1Var.destroy();
                k0Var.C = true;
                a0Var.invoke();
                if (X0().f120054m && (a2Var = k0Var.f110821i) != null) {
                    ((t3.c0) a2Var).z(k0Var);
                }
            }
            this.E = null;
            this.D = false;
            return;
        }
        this.f110904r = function1;
        if (this.E != null) {
            if (z14) {
                u1(true);
                return;
            }
            return;
        }
        y1 h10 = ((t3.c0) n0.a(k0Var)).h(this.B, a0Var, null);
        h10.d(this.f102180c);
        h10.i(this.f110910x);
        this.E = h10;
        u1(true);
        k0Var.C = true;
        a0Var.invoke();
    }

    public final void u1(boolean z13) {
        a2 a2Var;
        if (this.F != null) {
            return;
        }
        y1 y1Var = this.E;
        if (y1Var == null) {
            if (this.f110904r == null) {
                return;
            }
            jk.r.y("null layer with a non-null layerBlock");
            throw null;
        }
        Function1 function1 = this.f110904r;
        if (function1 == null) {
            jk.r.z("updateLayerParameters requires a non-null layerBlock");
            throw null;
        }
        b3.u0 u0Var = G;
        u0Var.l(1.0f);
        u0Var.n(1.0f);
        u0Var.f(1.0f);
        u0Var.E(0.0f);
        u0Var.F(0.0f);
        u0Var.x(0.0f);
        long j13 = b3.e0.f21313a;
        u0Var.h(j13);
        u0Var.B(j13);
        if (u0Var.f21363j != 0.0f) {
            u0Var.f21354a |= RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
            u0Var.f21363j = 0.0f;
        }
        if (u0Var.f21364k != 0.0f) {
            u0Var.f21354a |= BitmapUtils.BITMAP_TO_JPEG_SIZE;
            u0Var.f21364k = 0.0f;
        }
        u0Var.j(0.0f);
        if (u0Var.f21366m != 8.0f) {
            u0Var.f21354a |= 2048;
            u0Var.f21366m = 8.0f;
        }
        u0Var.D(b3.b1.f21304b);
        u0Var.z(b3.s0.f21349a);
        u0Var.i(false);
        if (!Intrinsics.d(null, null)) {
            u0Var.f21354a |= 131072;
        }
        if (!b3.s0.b(u0Var.f21370q, 0)) {
            u0Var.f21354a |= 32768;
            u0Var.f21370q = 0;
        }
        u0Var.f21371r = y2.h.f136670b;
        u0Var.f21374u = null;
        u0Var.f21354a = 0;
        k0 k0Var = this.f110898l;
        u0Var.f21372s = k0Var.f110830r;
        u0Var.f21373t = k0Var.f110831s;
        u0Var.f21371r = lb.l0.y1(this.f102180c);
        ((t3.c0) n0.a(k0Var)).A.b(this, s0.f110921o, new androidx.activity.a0(function1, 15));
        z zVar = this.A;
        if (zVar == null) {
            zVar = new z();
            this.A = zVar;
        }
        zVar.f111003a = u0Var.f21355b;
        zVar.f111004b = u0Var.f21356c;
        zVar.f111005c = u0Var.f21358e;
        zVar.f111006d = u0Var.f21359f;
        zVar.f111007e = u0Var.f21363j;
        zVar.f111008f = u0Var.f21364k;
        zVar.f111009g = u0Var.f21365l;
        zVar.f111010h = u0Var.f21366m;
        zVar.f111011i = u0Var.f21367n;
        y1Var.g(u0Var);
        this.f110903q = u0Var.f21369p;
        this.f110907u = u0Var.f21357d;
        if (!z13 || (a2Var = k0Var.f110821i) == null) {
            return;
        }
        ((t3.c0) a2Var).z(k0Var);
    }
}
