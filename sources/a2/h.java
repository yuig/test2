package a2;

import a.l9;
import b3.u;
import b3.w;
import b3.w0;
import b3.x;
import b4.g0;
import b4.o;
import b4.q0;
import java.util.List;
import java.util.Map;
import kh2.s0;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q3.s;
import s3.c0;
import s3.g2;
import s3.m0;
import s3.r;
import u2.p;
import w1.g1;
import z3.t;

/* loaded from: classes2.dex */
public final class h extends p implements c0, r, g2 {
    public d A;
    public g B;
    public f C;

    /* renamed from: n, reason: collision with root package name */
    public b4.g f428n;

    /* renamed from: o, reason: collision with root package name */
    public q0 f429o;

    /* renamed from: p, reason: collision with root package name */
    public g4.d f430p;

    /* renamed from: q, reason: collision with root package name */
    public Function1 f431q;

    /* renamed from: r, reason: collision with root package name */
    public int f432r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f433s;

    /* renamed from: t, reason: collision with root package name */
    public int f434t;

    /* renamed from: u, reason: collision with root package name */
    public int f435u;

    /* renamed from: v, reason: collision with root package name */
    public List f436v;

    /* renamed from: w, reason: collision with root package name */
    public Function1 f437w;

    /* renamed from: x, reason: collision with root package name */
    public x f438x;

    /* renamed from: y, reason: collision with root package name */
    public Function1 f439y;

    /* renamed from: z, reason: collision with root package name */
    public Map f440z;

    public h(b4.g gVar, q0 q0Var, g4.d dVar, Function1 function1, int i13, boolean z13, int i14, int i15, List list, Function1 function12, x xVar, Function1 function13) {
        this.f428n = gVar;
        this.f429o = q0Var;
        this.f430p = dVar;
        this.f431q = function1;
        this.f432r = i13;
        this.f433s = z13;
        this.f434t = i14;
        this.f435u = i15;
        this.f436v = list;
        this.f437w = function12;
        this.f438x = xVar;
        this.f439y = function13;
    }

    public final void M0(boolean z13, boolean z14, boolean z15, boolean z16) {
        if (z14 || z15 || z16) {
            d N0 = N0();
            b4.g gVar = this.f428n;
            q0 q0Var = this.f429o;
            g4.d dVar = this.f430p;
            int i13 = this.f432r;
            boolean z17 = this.f433s;
            int i14 = this.f434t;
            int i15 = this.f435u;
            List list = this.f436v;
            N0.f388a = gVar;
            N0.f389b = q0Var;
            N0.f390c = dVar;
            N0.f391d = i13;
            N0.f392e = z17;
            N0.f393f = i14;
            N0.f394g = i15;
            N0.f395h = list;
            N0.f399l = null;
            N0.f401n = null;
            N0.f403p = -1;
            N0.f402o = -1;
        }
        if (this.f120054m) {
            if (z14 || (z13 && this.B != null)) {
                com.bumptech.glide.c.m0(this);
            }
            if (z14 || z15 || z16) {
                com.bumptech.glide.c.l0(this);
                com.bumptech.glide.c.k0(this);
            }
            if (z13) {
                com.bumptech.glide.c.k0(this);
            }
        }
    }

    public final d N0() {
        if (this.A == null) {
            this.A = new d(this.f428n, this.f429o, this.f430p, this.f432r, this.f433s, this.f434t, this.f435u, this.f436v);
        }
        d dVar = this.A;
        Intrinsics.f(dVar);
        return dVar;
    }

    public final d O0(n4.b bVar) {
        d dVar;
        f fVar = this.C;
        if (fVar != null && fVar.f424c && (dVar = fVar.f425d) != null) {
            dVar.c(bVar);
            return dVar;
        }
        d N0 = N0();
        N0.c(bVar);
        return N0;
    }

    public final boolean P0(Function1 function1, Function1 function12, Function1 function13) {
        boolean z13;
        if (this.f431q != function1) {
            this.f431q = function1;
            z13 = true;
        } else {
            z13 = false;
        }
        if (this.f437w != function12) {
            this.f437w = function12;
            z13 = true;
        }
        if (!Intrinsics.d(null, null)) {
            z13 = true;
        }
        if (this.f439y == function13) {
            return z13;
        }
        this.f439y = function13;
        return true;
    }

    public final boolean Q0(q0 q0Var, List list, int i13, int i14, boolean z13, g4.d dVar, int i15) {
        boolean z14 = !this.f429o.d(q0Var);
        this.f429o = q0Var;
        if (!Intrinsics.d(this.f436v, list)) {
            this.f436v = list;
            z14 = true;
        }
        if (this.f435u != i13) {
            this.f435u = i13;
            z14 = true;
        }
        if (this.f434t != i14) {
            this.f434t = i14;
            z14 = true;
        }
        if (this.f433s != z13) {
            this.f433s = z13;
            z14 = true;
        }
        if (!Intrinsics.d(this.f430p, dVar)) {
            this.f430p = dVar;
            z14 = true;
        }
        if (s0.B(this.f432r, i15)) {
            return z14;
        }
        this.f432r = i15;
        return true;
    }

    public final boolean R0(b4.g gVar) {
        boolean z13 = true;
        boolean z14 = !Intrinsics.d(this.f428n.f21571a, gVar.f21571a);
        boolean z15 = !Intrinsics.d(this.f428n.b(), gVar.b());
        Object obj = this.f428n.f21573c;
        if (obj == null) {
            obj = kotlin.collections.q0.f80391a;
        }
        Object obj2 = gVar.f21573c;
        if (obj2 == null) {
            obj2 = kotlin.collections.q0.f80391a;
        }
        boolean z16 = !Intrinsics.d(obj, obj2);
        boolean z17 = !Intrinsics.d(this.f428n.f21574d, gVar.f21574d);
        if (!z14 && !z15 && !z16 && !z17) {
            z13 = false;
        }
        if (z13) {
            this.f428n = gVar;
        }
        if (z14) {
            this.C = null;
        }
        return z13;
    }

    @Override // s3.c0
    public final int a(s sVar, q3.r rVar, int i13) {
        return g1.o(O0(sVar).d(sVar.getLayoutDirection()).c());
    }

    @Override // s3.c0
    public final int d(s sVar, q3.r rVar, int i13) {
        return O0(sVar).a(i13, sVar.getLayoutDirection());
    }

    @Override // s3.c0
    public final int e(s sVar, q3.r rVar, int i13) {
        return O0(sVar).a(i13, sVar.getLayoutDirection());
    }

    @Override // s3.r
    public final void f(d3.e eVar) {
        List list;
        if (this.f120054m) {
            u a13 = ((m0) eVar).f110840a.f53652b.a();
            b4.m0 m0Var = O0(eVar).f401n;
            if (m0Var == null) {
                throw new IllegalStateException("You must call layoutWithConstraints first");
            }
            long j13 = m0Var.f21617c;
            float f13 = (int) (j13 >> 32);
            o oVar = m0Var.f21616b;
            boolean z13 = ((f13 > oVar.f21628d ? 1 : (f13 == oVar.f21628d ? 0 : -1)) < 0 || oVar.f21627c || (((float) ((int) (j13 & 4294967295L))) > oVar.f21629e ? 1 : (((float) ((int) (j13 & 4294967295L))) == oVar.f21629e ? 0 : -1)) < 0) && !s0.B(this.f432r, 3);
            if (z13) {
                a3.d c13 = com.bumptech.glide.d.c(0L, bs1.c.c((int) (j13 >> 32), (int) (j13 & 4294967295L)));
                a13.j();
                u.c(a13, c13);
            }
            try {
                g0 g0Var = this.f429o.f21648a;
                m4.k kVar = g0Var.f21587m;
                if (kVar == null) {
                    kVar = m4.k.f85798b;
                }
                m4.k kVar2 = kVar;
                w0 w0Var = g0Var.f21588n;
                if (w0Var == null) {
                    w0Var = w0.f21393d;
                }
                w0 w0Var2 = w0Var;
                d3.i iVar = g0Var.f21590p;
                if (iVar == null) {
                    iVar = d3.k.f53660a;
                }
                d3.i iVar2 = iVar;
                b3.s c14 = g0Var.f21575a.c();
                o oVar2 = m0Var.f21616b;
                if (c14 != null) {
                    o.h(oVar2, a13, c14, this.f429o.f21648a.f21575a.a(), w0Var2, kVar2, iVar2);
                } else {
                    x xVar = this.f438x;
                    long a14 = xVar != null ? xVar.a() : w.f21390n;
                    if (a14 == 16) {
                        a14 = this.f429o.b() != 16 ? this.f429o.b() : w.f21378b;
                    }
                    o.g(oVar2, a13, a14, w0Var2, kVar2, iVar2);
                }
                if (z13) {
                    a13.restore();
                }
                f fVar = this.C;
                if (((fVar == null || !fVar.f424c) && l9.i(this.f428n)) || !((list = this.f436v) == null || list.isEmpty())) {
                    ((m0) eVar).a();
                }
            } catch (Throwable th3) {
                if (z13) {
                    a13.restore();
                }
                throw th3;
            }
        }
    }

    @Override // s3.c0
    public final int h(s sVar, q3.r rVar, int i13) {
        return g1.o(O0(sVar).d(sVar.getLayoutDirection()).b());
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0122  */
    @Override // s3.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final q3.q0 i(q3.r0 r8, q3.o0 r9, long r10) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.h.i(q3.r0, q3.o0, long):q3.q0");
    }

    @Override // s3.g2
    public final void m0(z3.j jVar) {
        g gVar = this.B;
        if (gVar == null) {
            gVar = new g(this, 0);
            this.B = gVar;
        }
        b4.g gVar2 = this.f428n;
        rl2.u[] uVarArr = z3.w.f140760a;
        jVar.e(t.f140753v, e0.b(gVar2));
        f fVar = this.C;
        if (fVar != null) {
            b4.g gVar3 = fVar.f423b;
            z3.x xVar = t.f140754w;
            rl2.u[] uVarArr2 = z3.w.f140760a;
            rl2.u uVar = uVarArr2[14];
            xVar.getClass();
            jVar.e(xVar, gVar3);
            boolean z13 = fVar.f424c;
            z3.x xVar2 = t.f140755x;
            rl2.u uVar2 = uVarArr2[15];
            Boolean valueOf = Boolean.valueOf(z13);
            xVar2.getClass();
            jVar.e(xVar2, valueOf);
        }
        jVar.e(z3.i.f140683j, new z3.a(null, new g(this, 1)));
        jVar.e(z3.i.f140684k, new z3.a(null, new g(this, 2)));
        jVar.e(z3.i.f140685l, new z3.a(null, new j1.q0(this, 16)));
        z3.w.c(jVar, gVar);
    }

    @Override // s3.g2
    public final boolean z() {
        return true;
    }
}
