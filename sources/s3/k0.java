package s3;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import t3.e4;

/* loaded from: classes.dex */
public final class k0 implements i2.m, q3.f1, b2, k, z1 {

    /* renamed from: J, reason: collision with root package name */
    public static final f0 f110812J = new f0("Undefined intrinsics block and it is required");
    public static final e0 K = new e0();
    public static final i2.t L = new i2.t(1);
    public q3.l0 A;
    public q1 B;
    public boolean C;
    public u2.q D;
    public u2.q E;
    public Function1 F;
    public Function1 G;
    public boolean H;
    public boolean I;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f110813a;

    /* renamed from: b, reason: collision with root package name */
    public int f110814b;

    /* renamed from: c, reason: collision with root package name */
    public k0 f110815c;

    /* renamed from: d, reason: collision with root package name */
    public int f110816d;

    /* renamed from: e, reason: collision with root package name */
    public final g1 f110817e;

    /* renamed from: f, reason: collision with root package name */
    public k2.e f110818f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f110819g;

    /* renamed from: h, reason: collision with root package name */
    public k0 f110820h;

    /* renamed from: i, reason: collision with root package name */
    public a2 f110821i;

    /* renamed from: j, reason: collision with root package name */
    public p4.j f110822j;

    /* renamed from: k, reason: collision with root package name */
    public int f110823k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f110824l;

    /* renamed from: m, reason: collision with root package name */
    public z3.j f110825m;

    /* renamed from: n, reason: collision with root package name */
    public final k2.e f110826n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f110827o;

    /* renamed from: p, reason: collision with root package name */
    public q3.p0 f110828p;

    /* renamed from: q, reason: collision with root package name */
    public y f110829q;

    /* renamed from: r, reason: collision with root package name */
    public n4.b f110830r;

    /* renamed from: s, reason: collision with root package name */
    public n4.k f110831s;

    /* renamed from: t, reason: collision with root package name */
    public e4 f110832t;

    /* renamed from: u, reason: collision with root package name */
    public i2.d0 f110833u;

    /* renamed from: v, reason: collision with root package name */
    public i0 f110834v;

    /* renamed from: w, reason: collision with root package name */
    public i0 f110835w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f110836x;

    /* renamed from: y, reason: collision with root package name */
    public final j1 f110837y;

    /* renamed from: z, reason: collision with root package name */
    public final v0 f110838z;

    public k0(boolean z13, int i13, int i14) {
        this((i13 & 1) != 0 ? false : z13, z3.l.f140703a.addAndGet(1));
    }

    public static boolean Q(k0 k0Var) {
        t0 t0Var = k0Var.f110838z.f110984r;
        return k0Var.P(t0Var.f110938i ? new n4.a(t0Var.f102181d) : null);
    }

    public static void V(k0 k0Var, boolean z13, int i13) {
        if ((i13 & 1) != 0) {
            z13 = false;
        }
        boolean z14 = (i13 & 2) != 0;
        boolean z15 = (i13 & 4) != 0;
        if (k0Var.f110815c == null) {
            jk.r.y("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
            throw null;
        }
        a2 a2Var = k0Var.f110821i;
        if (a2Var == null || k0Var.f110824l || k0Var.f110813a) {
            return;
        }
        ((t3.c0) a2Var).A(k0Var, true, z13, z14);
        if (z15) {
            q0 q0Var = k0Var.f110838z.f110985s;
            Intrinsics.f(q0Var);
            q0Var.C0(z13);
        }
    }

    public static void Y(k0 k0Var, boolean z13, int i13) {
        a2 a2Var;
        k0 v13;
        if ((i13 & 1) != 0) {
            z13 = false;
        }
        boolean z14 = (i13 & 2) != 0;
        boolean z15 = (i13 & 4) != 0;
        if (k0Var.f110824l || k0Var.f110813a || (a2Var = k0Var.f110821i) == null) {
            return;
        }
        ((t3.c0) a2Var).A(k0Var, false, z13, z14);
        if (z15) {
            v0 v0Var = k0Var.f110838z.f110984r.H;
            k0 v14 = v0Var.f110967a.v();
            i0 i0Var = v0Var.f110967a.f110834v;
            if (v14 == null || i0Var == i0.NotUsed) {
                return;
            }
            while (v14.f110834v == i0Var && (v13 = v14.v()) != null) {
                v14 = v13;
            }
            int i14 = r0.f110914b[i0Var.ordinal()];
            if (i14 == 1) {
                Y(v14, z13, 6);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
                }
                v14.W(z13);
            }
        }
    }

    public static void Z(k0 k0Var) {
        int i13 = j0.f110803a[k0Var.f110838z.f110969c.ordinal()];
        v0 v0Var = k0Var.f110838z;
        if (i13 != 1) {
            throw new IllegalStateException("Unexpected state " + v0Var.f110969c);
        }
        if (v0Var.f110973g) {
            V(k0Var, true, 6);
            return;
        }
        if (v0Var.f110974h) {
            k0Var.U(true);
        }
        if (v0Var.f110970d) {
            Y(k0Var, true, 6);
        } else if (v0Var.f110971e) {
            k0Var.W(true);
        }
    }

    public final void A(int i13, k0 k0Var) {
        if (!(k0Var.f110820h == null)) {
            StringBuilder sb3 = new StringBuilder("Cannot insert ");
            sb3.append(k0Var);
            sb3.append(" because it already has a parent. This tree: ");
            sb3.append(h(0));
            sb3.append(" Other tree: ");
            k0 k0Var2 = k0Var.f110820h;
            sb3.append(k0Var2 != null ? k0Var2.h(0) : null);
            jk.r.y(sb3.toString());
            throw null;
        }
        if (k0Var.f110821i != null) {
            jk.r.y("Cannot insert " + k0Var + " because it already has an owner. This tree: " + h(0) + " Other tree: " + k0Var.h(0));
            throw null;
        }
        k0Var.f110820h = this;
        g1 g1Var = this.f110817e;
        g1Var.f110776a.a(i13, k0Var);
        g1Var.f110777b.invoke();
        O();
        if (k0Var.f110813a) {
            this.f110816d++;
        }
        F();
        a2 a2Var = this.f110821i;
        if (a2Var != null) {
            k0Var.e(a2Var);
        }
        if (k0Var.f110838z.f110980n > 0) {
            v0 v0Var = this.f110838z;
            v0Var.c(v0Var.f110980n + 1);
        }
    }

    public final void B() {
        if (this.C) {
            j1 j1Var = this.f110837y;
            q1 q1Var = j1Var.f110805b;
            q1 q1Var2 = j1Var.f110806c.f110901o;
            this.B = null;
            while (true) {
                if (Intrinsics.d(q1Var, q1Var2)) {
                    break;
                }
                if ((q1Var != null ? q1Var.E : null) != null) {
                    this.B = q1Var;
                    break;
                }
                q1Var = q1Var != null ? q1Var.f110901o : null;
            }
        }
        q1 q1Var3 = this.B;
        if (q1Var3 != null && q1Var3.E == null) {
            jk.r.z("layer was not set");
            throw null;
        }
        if (q1Var3 != null) {
            q1Var3.d1();
            return;
        }
        k0 v13 = v();
        if (v13 != null) {
            v13.B();
        }
    }

    public final void C() {
        j1 j1Var = this.f110837y;
        q1 q1Var = j1Var.f110806c;
        x xVar = j1Var.f110805b;
        while (q1Var != xVar) {
            Intrinsics.g(q1Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            d0 d0Var = (d0) q1Var;
            y1 y1Var = d0Var.E;
            if (y1Var != null) {
                y1Var.invalidate();
            }
            q1Var = d0Var.f110900n;
        }
        y1 y1Var2 = j1Var.f110805b.E;
        if (y1Var2 != null) {
            y1Var2.invalidate();
        }
    }

    public final void D() {
        if (this.f110815c != null) {
            V(this, false, 7);
        } else {
            Y(this, false, 7);
        }
    }

    public final void E() {
        this.f110825m = null;
        ((t3.c0) n0.a(this)).C();
    }

    public final void F() {
        k0 k0Var;
        if (this.f110816d > 0) {
            this.f110819g = true;
        }
        if (!this.f110813a || (k0Var = this.f110820h) == null) {
            return;
        }
        k0Var.F();
    }

    public final boolean G() {
        return this.f110821i != null;
    }

    public final boolean H() {
        return this.f110838z.f110984r.f110948s;
    }

    public final Boolean I() {
        q0 q0Var = this.f110838z.f110985s;
        if (q0Var != null) {
            return Boolean.valueOf(q0Var.z());
        }
        return null;
    }

    public final void J() {
        if (this.f110834v == i0.NotUsed) {
            g();
        }
        q0 q0Var = this.f110838z.f110985s;
        Intrinsics.f(q0Var);
        q0Var.M0();
    }

    public final void K() {
        this.f110838z.f110973g = true;
    }

    public final void L(int i13, int i14, int i15) {
        if (i13 == i14) {
            return;
        }
        for (int i16 = 0; i16 < i15; i16++) {
            int i17 = i13 > i14 ? i13 + i16 : i13;
            int i18 = i13 > i14 ? i14 + i16 : (i14 + i15) - 2;
            g1 g1Var = this.f110817e;
            Object o13 = g1Var.f110776a.o(i17);
            Function0 function0 = g1Var.f110777b;
            function0.invoke();
            g1Var.f110776a.a(i18, (k0) o13);
            function0.invoke();
        }
        O();
        F();
        D();
    }

    public final void M(k0 k0Var) {
        if (k0Var.f110838z.f110980n > 0) {
            this.f110838z.c(r0.f110980n - 1);
        }
        if (this.f110821i != null) {
            k0Var.i();
        }
        k0Var.f110820h = null;
        k0Var.f110837y.f110806c.f110901o = null;
        if (k0Var.f110813a) {
            this.f110816d--;
            k2.e eVar = k0Var.f110817e.f110776a;
            int i13 = eVar.f78184c;
            if (i13 > 0) {
                Object[] objArr = eVar.f78182a;
                int i14 = 0;
                do {
                    ((k0) objArr[i14]).f110837y.f110806c.f110901o = null;
                    i14++;
                } while (i14 < i13);
            }
        }
        F();
        O();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
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
    public final void N() {
        u2.p pVar;
        j1 j1Var = this.f110837y;
        x xVar = j1Var.f110805b;
        boolean h10 = r1.h(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
        if (h10) {
            pVar = xVar.L;
        } else {
            pVar = xVar.L.f120046e;
            if (pVar == null) {
                return;
            }
        }
        b3.u0 u0Var = q1.G;
        for (u2.p Z0 = xVar.Z0(h10); Z0 != null && (Z0.f120045d & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0; Z0 = Z0.f120047f) {
            if ((Z0.f120044c & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0) {
                n nVar = Z0;
                ?? r63 = 0;
                while (nVar != 0) {
                    if (nVar instanceof a0) {
                        ((a0) nVar).N(j1Var.f110805b);
                    } else if ((nVar.f120044c & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 && (nVar instanceof n)) {
                        u2.p pVar2 = nVar.f110843o;
                        int i13 = 0;
                        nVar = nVar;
                        r63 = r63;
                        while (pVar2 != null) {
                            if ((pVar2.f120044c & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0) {
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
            if (Z0 == pVar) {
                return;
            }
        }
    }

    public final void O() {
        if (!this.f110813a) {
            this.f110827o = true;
            return;
        }
        k0 v13 = v();
        if (v13 != null) {
            v13.O();
        }
    }

    public final boolean P(n4.a aVar) {
        if (aVar == null) {
            return false;
        }
        if (this.f110834v == i0.NotUsed) {
            f();
        }
        return this.f110838z.f110984r.G0(aVar.f89168a);
    }

    public final void R() {
        g1 g1Var = this.f110817e;
        int i13 = g1Var.f110776a.f78184c;
        while (true) {
            i13--;
            k2.e eVar = g1Var.f110776a;
            if (-1 >= i13) {
                eVar.h();
                g1Var.f110777b.invoke();
                return;
            }
            M((k0) eVar.f78182a[i13]);
        }
    }

    public final void S(int i13, int i14) {
        if (i14 < 0) {
            jk.r.x("count (" + i14 + ") must be greater than 0");
            throw null;
        }
        int i15 = (i14 + i13) - 1;
        if (i13 > i15) {
            return;
        }
        while (true) {
            g1 g1Var = this.f110817e;
            M((k0) g1Var.f110776a.f78182a[i15]);
            Object o13 = g1Var.f110776a.o(i15);
            g1Var.f110777b.invoke();
            if (i15 == i13) {
                return;
            } else {
                i15--;
            }
        }
    }

    public final void T() {
        k0 v13;
        if (this.f110834v == i0.NotUsed) {
            g();
        }
        t0 t0Var = this.f110838z.f110984r;
        t0Var.getClass();
        try {
            t0Var.f110935f = true;
            if (!t0Var.f110939j) {
                jk.r.y("replace called on unplaced item");
                throw null;
            }
            boolean z13 = t0Var.f110948s;
            t0Var.E0(t0Var.f110942m, t0Var.f110945p, t0Var.f110943n, t0Var.f110944o);
            if (z13 && !t0Var.A && (v13 = t0Var.H.f110967a.v()) != null) {
                v13.W(false);
            }
        } finally {
            t0Var.f110935f = false;
        }
    }

    public final void U(boolean z13) {
        a2 a2Var;
        if (this.f110813a || (a2Var = this.f110821i) == null) {
            return;
        }
        ((t3.c0) a2Var).B(this, true, z13);
    }

    public final void W(boolean z13) {
        a2 a2Var;
        if (this.f110813a || (a2Var = this.f110821i) == null) {
            return;
        }
        ((t3.c0) a2Var).B(this, false, z13);
    }

    @Override // s3.b2
    public final boolean X() {
        return G();
    }

    @Override // i2.m
    public final void a() {
        p4.j jVar = this.f110822j;
        if (jVar != null) {
            jVar.a();
        }
        q3.l0 l0Var = this.A;
        if (l0Var != null) {
            l0Var.i(true);
        }
        this.I = true;
        j1 j1Var = this.f110837y;
        for (u2.p pVar = j1Var.f110807d; pVar != null; pVar = pVar.f120046e) {
            if (pVar.f120054m) {
                pVar.G0();
            }
        }
        u2.p pVar2 = j1Var.f110807d;
        for (u2.p pVar3 = pVar2; pVar3 != null; pVar3 = pVar3.f120046e) {
            if (pVar3.f120054m) {
                pVar3.I0();
            }
        }
        while (pVar2 != null) {
            if (pVar2.f120054m) {
                pVar2.C0();
            }
            pVar2 = pVar2.f120046e;
        }
        if (G()) {
            E();
        }
    }

    public final void a0() {
        k2.e y13 = y();
        int i13 = y13.f78184c;
        if (i13 > 0) {
            Object[] objArr = y13.f78182a;
            int i14 = 0;
            do {
                k0 k0Var = (k0) objArr[i14];
                i0 i0Var = k0Var.f110835w;
                k0Var.f110834v = i0Var;
                if (i0Var != i0.NotUsed) {
                    k0Var.a0();
                }
                i14++;
            } while (i14 < i13);
        }
    }

    @Override // i2.m
    public final void b() {
        if (!G()) {
            jk.r.x("onReuse is only expected on attached node");
            throw null;
        }
        p4.j jVar = this.f110822j;
        if (jVar != null) {
            jVar.b();
        }
        q3.l0 l0Var = this.A;
        if (l0Var != null) {
            l0Var.i(false);
        }
        boolean z13 = this.I;
        j1 j1Var = this.f110837y;
        if (z13) {
            this.I = false;
            E();
        } else {
            for (u2.p pVar = j1Var.f110807d; pVar != null; pVar = pVar.f120046e) {
                if (pVar.f120054m) {
                    pVar.G0();
                }
            }
            u2.p pVar2 = j1Var.f110807d;
            for (u2.p pVar3 = pVar2; pVar3 != null; pVar3 = pVar3.f120046e) {
                if (pVar3.f120054m) {
                    pVar3.I0();
                }
            }
            while (pVar2 != null) {
                if (pVar2.f120054m) {
                    pVar2.C0();
                }
                pVar2 = pVar2.f120046e;
            }
        }
        this.f110814b = z3.l.f140703a.addAndGet(1);
        for (u2.p pVar4 = j1Var.f110808e; pVar4 != null; pVar4 = pVar4.f120047f) {
            pVar4.B0();
        }
        j1Var.e();
        Z(this);
    }

    public final void b0(n4.b bVar) {
        if (Intrinsics.d(this.f110830r, bVar)) {
            return;
        }
        this.f110830r = bVar;
        D();
        k0 v13 = v();
        if (v13 != null) {
            v13.B();
        }
        C();
        for (u2.p pVar = this.f110837y.f110808e; pVar != null; pVar = pVar.f120047f) {
            if ((pVar.f120044c & 16) != 0) {
                ((f2) pVar).i0();
            } else if (pVar instanceof y2.b) {
                ((y2.c) ((y2.b) pVar)).M0();
            }
        }
    }

    @Override // i2.m
    public final void c() {
        p4.j jVar = this.f110822j;
        if (jVar != null) {
            jVar.c();
        }
        q3.l0 l0Var = this.A;
        if (l0Var != null) {
            l0Var.c();
        }
        j1 j1Var = this.f110837y;
        q1 q1Var = j1Var.f110805b.f110900n;
        for (q1 q1Var2 = j1Var.f110806c; !Intrinsics.d(q1Var2, q1Var) && q1Var2 != null; q1Var2 = q1Var2.f110900n) {
            q1Var2.f110902p = true;
            q1Var2.C.invoke();
            if (q1Var2.E != null) {
                if (q1Var2.F != null) {
                    q1Var2.F = null;
                }
                q1Var2.t1(null, false);
                q1Var2.f110898l.W(false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final void c0(n4.k kVar) {
        if (this.f110831s != kVar) {
            this.f110831s = kVar;
            D();
            k0 v13 = v();
            if (v13 != null) {
                v13.B();
            }
            C();
            u2.p pVar = this.f110837y.f110808e;
            if ((pVar.f120045d & 4) != 0) {
                while (pVar != null) {
                    if ((pVar.f120044c & 4) != 0) {
                        n nVar = pVar;
                        ?? r23 = 0;
                        while (nVar != 0) {
                            if (nVar instanceof r) {
                                r rVar = (r) nVar;
                                if (rVar instanceof y2.b) {
                                    ((y2.c) ((y2.b) rVar)).M0();
                                }
                            } else if ((nVar.f120044c & 4) != 0 && (nVar instanceof n)) {
                                u2.p pVar2 = nVar.f110843o;
                                int i13 = 0;
                                nVar = nVar;
                                r23 = r23;
                                while (pVar2 != null) {
                                    if ((pVar2.f120044c & 4) != 0) {
                                        i13++;
                                        r23 = r23;
                                        if (i13 == 1) {
                                            nVar = pVar2;
                                        } else {
                                            if (r23 == 0) {
                                                r23 = new k2.e(new u2.p[16]);
                                            }
                                            if (nVar != 0) {
                                                r23.b(nVar);
                                                nVar = 0;
                                            }
                                            r23.b(pVar2);
                                        }
                                    }
                                    pVar2 = pVar2.f120047f;
                                    nVar = nVar;
                                    r23 = r23;
                                }
                                if (i13 == 1) {
                                }
                            }
                            nVar = com.bumptech.glide.c.g(r23);
                        }
                    }
                    if ((pVar.f120045d & 4) == 0) {
                        return;
                    } else {
                        pVar = pVar.f120047f;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ad, code lost:
    
        r4 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b3, code lost:
    
        if (r3 >= r1) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b5, code lost:
    
        if (r8 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b7, code lost:
    
        if (r4 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00bb, code lost:
    
        if (r5.E == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00bd, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00be, code lost:
    
        r6.f(r3, r8, r9, r4, r0 ^ 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ca, code lost:
    
        jk.r.z("structuralUpdate requires a non-null tail");
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00cf, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d0, code lost:
    
        jk.r.z("expected prior modifier list to be non-empty");
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d3, code lost:
    
        throw null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0147  */
    /* JADX WARN: Type inference failed for: r1v13, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v0, types: [s3.j1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(u2.q r15) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.k0.d(u2.q):void");
    }

    public final void d0(k0 k0Var) {
        if (Intrinsics.d(k0Var, this.f110815c)) {
            return;
        }
        this.f110815c = k0Var;
        if (k0Var != null) {
            this.f110838z.a();
            j1 j1Var = this.f110837y;
            q1 q1Var = j1Var.f110805b.f110900n;
            for (q1 q1Var2 = j1Var.f110806c; !Intrinsics.d(q1Var2, q1Var) && q1Var2 != null; q1Var2 = q1Var2.f110900n) {
                q1Var2.R0();
            }
        }
        D();
    }

    public final void e(a2 a2Var) {
        k0 k0Var;
        if (!(this.f110821i == null)) {
            jk.r.y("Cannot attach " + this + " as it already is attached.  Tree: " + h(0));
            throw null;
        }
        k0 k0Var2 = this.f110820h;
        if (k0Var2 != null && !Intrinsics.d(k0Var2.f110821i, a2Var)) {
            StringBuilder sb3 = new StringBuilder("Attaching to a different owner(");
            sb3.append(a2Var);
            sb3.append(") than the parent's owner(");
            k0 v13 = v();
            sb3.append(v13 != null ? v13.f110821i : null);
            sb3.append("). This tree: ");
            sb3.append(h(0));
            sb3.append(" Parent tree: ");
            k0 k0Var3 = this.f110820h;
            sb3.append(k0Var3 != null ? k0Var3.h(0) : null);
            jk.r.y(sb3.toString());
            throw null;
        }
        k0 v14 = v();
        v0 v0Var = this.f110838z;
        if (v14 == null) {
            v0Var.f110984r.f110948s = true;
            q0 q0Var = v0Var.f110985s;
            if (q0Var != null) {
                q0Var.f110888q = true;
            }
        }
        j1 j1Var = this.f110837y;
        j1Var.f110806c.f110901o = v14 != null ? v14.f110837y.f110805b : null;
        this.f110821i = a2Var;
        this.f110823k = (v14 != null ? v14.f110823k : -1) + 1;
        u2.q qVar = this.E;
        if (qVar != null) {
            d(qVar);
        }
        this.E = null;
        if (j1Var.d(8)) {
            E();
        }
        a2Var.getClass();
        k0 k0Var4 = this.f110820h;
        if (k0Var4 == null || (k0Var = k0Var4.f110815c) == null) {
            k0Var = this.f110815c;
        }
        d0(k0Var);
        if (this.f110815c == null && j1Var.d(BitmapUtils.BITMAP_TO_JPEG_SIZE)) {
            d0(this);
        }
        if (!this.I) {
            for (u2.p pVar = j1Var.f110808e; pVar != null; pVar = pVar.f120047f) {
                pVar.B0();
            }
        }
        k2.e eVar = this.f110817e.f110776a;
        int i13 = eVar.f78184c;
        if (i13 > 0) {
            Object[] objArr = eVar.f78182a;
            int i14 = 0;
            do {
                ((k0) objArr[i14]).e(a2Var);
                i14++;
            } while (i14 < i13);
        }
        if (!this.I) {
            j1Var.e();
        }
        D();
        if (v14 != null) {
            v14.D();
        }
        q1 q1Var = j1Var.f110805b.f110900n;
        for (q1 q1Var2 = j1Var.f110806c; !Intrinsics.d(q1Var2, q1Var) && q1Var2 != null; q1Var2 = q1Var2.f110900n) {
            q1Var2.t1(q1Var2.f110904r, true);
            y1 y1Var = q1Var2.E;
            if (y1Var != null) {
                y1Var.invalidate();
            }
        }
        Function1 function1 = this.F;
        if (function1 != null) {
            function1.invoke(a2Var);
        }
        v0Var.i();
        if (this.I) {
            return;
        }
        u2.p pVar2 = j1Var.f110808e;
        if ((pVar2.f120045d & 7168) != 0) {
            while (pVar2 != null) {
                int i15 = pVar2.f120044c;
                if (((i15 & 4096) != 0) | ((i15 & 1024) != 0) | ((i15 & 2048) != 0)) {
                    r1.a(pVar2);
                }
                pVar2 = pVar2.f120047f;
            }
        }
    }

    public final void e0(q3.p0 p0Var) {
        if (Intrinsics.d(this.f110828p, p0Var)) {
            return;
        }
        this.f110828p = p0Var;
        y yVar = this.f110829q;
        if (yVar != null) {
            yVar.j(p0Var);
        }
        D();
    }

    public final void f() {
        this.f110835w = this.f110834v;
        this.f110834v = i0.NotUsed;
        k2.e y13 = y();
        int i13 = y13.f78184c;
        if (i13 > 0) {
            Object[] objArr = y13.f78182a;
            int i14 = 0;
            do {
                k0 k0Var = (k0) objArr[i14];
                if (k0Var.f110834v != i0.NotUsed) {
                    k0Var.f();
                }
                i14++;
            } while (i14 < i13);
        }
    }

    public final void f0(u2.q qVar) {
        if (!(!this.f110813a || t() == u2.n.f120041b)) {
            jk.r.x("Modifiers are not supported on virtual LayoutNodes");
            throw null;
        }
        if (!(!this.I)) {
            jk.r.x("modifier is updated when deactivated");
            throw null;
        }
        if (G()) {
            d(qVar);
        } else {
            this.E = qVar;
        }
    }

    public final void g() {
        this.f110835w = this.f110834v;
        this.f110834v = i0.NotUsed;
        k2.e y13 = y();
        int i13 = y13.f78184c;
        if (i13 > 0) {
            Object[] objArr = y13.f78182a;
            int i14 = 0;
            do {
                k0 k0Var = (k0) objArr[i14];
                if (k0Var.f110834v == i0.InLayoutBlock) {
                    k0Var.g();
                }
                i14++;
            } while (i14 < i13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void g0(e4 e4Var) {
        if (Intrinsics.d(this.f110832t, e4Var)) {
            return;
        }
        this.f110832t = e4Var;
        u2.p pVar = this.f110837y.f110808e;
        if ((pVar.f120045d & 16) != 0) {
            while (pVar != null) {
                if ((pVar.f120044c & 16) != 0) {
                    n nVar = pVar;
                    ?? r33 = 0;
                    while (nVar != 0) {
                        if (nVar instanceof f2) {
                            ((f2) nVar).w0();
                        } else if ((nVar.f120044c & 16) != 0 && (nVar instanceof n)) {
                            u2.p pVar2 = nVar.f110843o;
                            int i13 = 0;
                            nVar = nVar;
                            r33 = r33;
                            while (pVar2 != null) {
                                if ((pVar2.f120044c & 16) != 0) {
                                    i13++;
                                    r33 = r33;
                                    if (i13 == 1) {
                                        nVar = pVar2;
                                    } else {
                                        if (r33 == 0) {
                                            r33 = new k2.e(new u2.p[16]);
                                        }
                                        if (nVar != 0) {
                                            r33.b(nVar);
                                            nVar = 0;
                                        }
                                        r33.b(pVar2);
                                    }
                                }
                                pVar2 = pVar2.f120047f;
                                nVar = nVar;
                                r33 = r33;
                            }
                            if (i13 == 1) {
                            }
                        }
                        nVar = com.bumptech.glide.c.g(r33);
                    }
                }
                if ((pVar.f120045d & 16) == 0) {
                    return;
                } else {
                    pVar = pVar.f120047f;
                }
            }
        }
    }

    public final String h(int i13) {
        StringBuilder sb3 = new StringBuilder();
        for (int i14 = 0; i14 < i13; i14++) {
            sb3.append("  ");
        }
        sb3.append("|-");
        sb3.append(toString());
        sb3.append('\n');
        k2.e y13 = y();
        int i15 = y13.f78184c;
        if (i15 > 0) {
            Object[] objArr = y13.f78182a;
            int i16 = 0;
            do {
                sb3.append(((k0) objArr[i16]).h(i13 + 1));
                i16++;
            } while (i16 < i15);
        }
        String sb4 = sb3.toString();
        if (i13 != 0) {
            return sb4;
        }
        String substring = sb4.substring(0, sb4.length() - 1);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final void h0() {
        if (this.f110816d <= 0 || !this.f110819g) {
            return;
        }
        int i13 = 0;
        this.f110819g = false;
        k2.e eVar = this.f110818f;
        if (eVar == null) {
            eVar = new k2.e(new k0[16]);
            this.f110818f = eVar;
        }
        eVar.h();
        k2.e eVar2 = this.f110817e.f110776a;
        int i14 = eVar2.f78184c;
        if (i14 > 0) {
            Object[] objArr = eVar2.f78182a;
            do {
                k0 k0Var = (k0) objArr[i13];
                if (k0Var.f110813a) {
                    eVar.d(eVar.f78184c, k0Var.y());
                } else {
                    eVar.b(k0Var);
                }
                i13++;
            } while (i13 < i14);
        }
        v0 v0Var = this.f110838z;
        v0Var.f110984r.f110952w = true;
        q0 q0Var = v0Var.f110985s;
        if (q0Var != null) {
            q0Var.f110891t = true;
        }
    }

    public final void i() {
        a c13;
        a2 a2Var = this.f110821i;
        if (a2Var == null) {
            StringBuilder sb3 = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            k0 v13 = v();
            sb3.append(v13 != null ? v13.h(0) : null);
            jk.r.z(sb3.toString());
            throw null;
        }
        k0 v14 = v();
        v0 v0Var = this.f110838z;
        if (v14 != null) {
            v14.B();
            v14.D();
            t0 t0Var = v0Var.f110984r;
            i0 i0Var = i0.NotUsed;
            t0Var.f110940k = i0Var;
            q0 q0Var = v0Var.f110985s;
            if (q0Var != null) {
                q0Var.N0(i0Var);
            }
        }
        l0 l0Var = v0Var.f110984r.f110950u;
        l0Var.f110724b = true;
        l0Var.f110725c = false;
        l0Var.f110727e = false;
        l0Var.f110726d = false;
        l0Var.f110728f = false;
        l0Var.f110729g = false;
        l0Var.f110730h = null;
        q0 q0Var2 = v0Var.f110985s;
        if (q0Var2 != null && (c13 = q0Var2.c()) != null) {
            c13.f110724b = true;
            c13.f110725c = false;
            c13.f110727e = false;
            c13.f110726d = false;
            c13.f110728f = false;
            c13.f110729g = false;
            c13.f110730h = null;
        }
        Function1 function1 = this.G;
        if (function1 != null) {
            function1.invoke(a2Var);
        }
        j1 j1Var = this.f110837y;
        if (j1Var.d(8)) {
            E();
        }
        u2.p pVar = j1Var.f110807d;
        for (u2.p pVar2 = pVar; pVar2 != null; pVar2 = pVar2.f120046e) {
            if (pVar2.f120054m) {
                pVar2.I0();
            }
        }
        this.f110824l = true;
        k2.e eVar = this.f110817e.f110776a;
        int i13 = eVar.f78184c;
        if (i13 > 0) {
            Object[] objArr = eVar.f78182a;
            int i14 = 0;
            do {
                ((k0) objArr[i14]).i();
                i14++;
            } while (i14 < i13);
        }
        this.f110824l = false;
        while (pVar != null) {
            if (pVar.f120054m) {
                pVar.C0();
            }
            pVar = pVar.f120046e;
        }
        t3.c0 c0Var = (t3.c0) a2Var;
        d1 d1Var = c0Var.G;
        q qVar = d1Var.f110758b;
        qVar.f110875a.d(this);
        qVar.f110876b.d(this);
        d1Var.f110761e.f110998a.n(this);
        c0Var.f115917y = true;
        this.f110821i = null;
        d0(null);
        this.f110823k = 0;
        t0 t0Var2 = v0Var.f110984r;
        t0Var2.f110937h = Integer.MAX_VALUE;
        t0Var2.f110936g = Integer.MAX_VALUE;
        t0Var2.f110948s = false;
        q0 q0Var3 = v0Var.f110985s;
        if (q0Var3 != null) {
            q0Var3.I0();
        }
    }

    public final void j(b3.u uVar, e3.d dVar) {
        this.f110837y.f110806c.O0(uVar, dVar);
    }

    public final void k() {
        if (this.f110815c != null) {
            V(this, false, 5);
        } else {
            Y(this, false, 5);
        }
        t0 t0Var = this.f110838z.f110984r;
        n4.a aVar = t0Var.f110938i ? new n4.a(t0Var.f102181d) : null;
        if (aVar != null) {
            a2 a2Var = this.f110821i;
            if (a2Var != null) {
                ((t3.c0) a2Var).v(this, aVar.f89168a);
                return;
            }
            return;
        }
        a2 a2Var2 = this.f110821i;
        if (a2Var2 != null) {
            ((t3.c0) a2Var2).u(true);
        }
    }

    public final boolean l() {
        a c13;
        v0 v0Var = this.f110838z;
        if (v0Var.f110984r.f110950u.f()) {
            return true;
        }
        q0 q0Var = v0Var.f110985s;
        return (q0Var == null || (c13 = q0Var.c()) == null || !c13.f()) ? false : true;
    }

    public final List m() {
        q0 q0Var = this.f110838z.f110985s;
        Intrinsics.f(q0Var);
        return q0Var.y0();
    }

    public final List n() {
        return this.f110838z.f110984r.y0();
    }

    public final List o() {
        return y().f();
    }

    public final z3.j p() {
        if (!G() || this.I) {
            return null;
        }
        if (!this.f110837y.d(8) || this.f110825m != null) {
            return this.f110825m;
        }
        kotlin.jvm.internal.j0 j0Var = new kotlin.jvm.internal.j0();
        j0Var.f80434a = new z3.j();
        t3.c0 c0Var = (t3.c0) n0.a(this);
        i2.j2 j2Var = new i2.j2(1, this, j0Var);
        c2 c2Var = c0Var.A;
        c2Var.b(this, c2Var.f110749d, j2Var);
        z3.j jVar = (z3.j) j0Var.f80434a;
        this.f110825m = jVar;
        return jVar;
    }

    public final List q() {
        return this.f110817e.f110776a.f();
    }

    public final boolean r() {
        return this.f110838z.f110974h;
    }

    public final i0 s() {
        i0 B0;
        q0 q0Var = this.f110838z.f110985s;
        return (q0Var == null || (B0 = q0Var.B0()) == null) ? i0.NotUsed : B0;
    }

    public final u2.q t() {
        return this.D;
    }

    public final String toString() {
        return androidx.compose.ui.platform.a.i(this) + " children: " + o().size() + " measurePolicy: " + this.f110828p;
    }

    public final y u() {
        y yVar = this.f110829q;
        if (yVar != null) {
            return yVar;
        }
        y yVar2 = new y(this, this.f110828p);
        this.f110829q = yVar2;
        return yVar2;
    }

    public final k0 v() {
        k0 k0Var = this.f110820h;
        while (k0Var != null && k0Var.f110813a) {
            k0Var = k0Var.f110820h;
        }
        return k0Var;
    }

    public final int w() {
        return this.f110838z.f110984r.f110937h;
    }

    public final k2.e x() {
        boolean z13 = this.f110827o;
        k2.e eVar = this.f110826n;
        if (z13) {
            eVar.h();
            eVar.d(eVar.f78184c, y());
            eVar.q(L);
            this.f110827o = false;
        }
        return eVar;
    }

    public final k2.e y() {
        h0();
        if (this.f110816d == 0) {
            return this.f110817e.f110776a;
        }
        k2.e eVar = this.f110818f;
        Intrinsics.f(eVar);
        return eVar;
    }

    public final void z(long j13, v vVar, boolean z13, boolean z14) {
        j1 j1Var = this.f110837y;
        q1 q1Var = j1Var.f110806c;
        b3.u0 u0Var = q1.G;
        j1Var.f110806c.b1(q1.f110897J, q1Var.T0(j13, true), vVar, z13, z14);
    }

    public k0(boolean z13, int i13) {
        this.f110813a = z13;
        this.f110814b = i13;
        this.f110817e = new g1(new k2.e(new k0[16]), new androidx.activity.a0(this, 11));
        this.f110826n = new k2.e(new k0[16]);
        this.f110827o = true;
        this.f110828p = f110812J;
        this.f110830r = n0.f110844a;
        this.f110831s = n4.k.Ltr;
        this.f110832t = K;
        i2.d0.f71088yo.getClass();
        this.f110833u = i2.c0.f71083b;
        i0 i0Var = i0.NotUsed;
        this.f110834v = i0Var;
        this.f110835w = i0Var;
        this.f110837y = new j1(this);
        this.f110838z = new v0(this);
        this.C = true;
        this.D = u2.n.f120041b;
    }
}
