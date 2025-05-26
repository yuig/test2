package a2;

import b3.u;
import b3.w;
import b3.w0;
import b3.x;
import b4.g0;
import b4.q0;
import c4.z;
import d0.o;
import i1.a0;
import java.util.LinkedHashMap;
import java.util.Map;
import kh2.s0;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import q3.c1;
import q3.o0;
import q3.q;
import q3.r0;
import q3.s;
import s3.c0;
import s3.g2;
import s3.m0;
import s3.r;
import u2.p;
import w1.g1;
import z3.t;

/* loaded from: classes2.dex */
public final class k extends p implements c0, r, g2 {

    /* renamed from: n, reason: collision with root package name */
    public String f447n;

    /* renamed from: o, reason: collision with root package name */
    public q0 f448o;

    /* renamed from: p, reason: collision with root package name */
    public g4.d f449p;

    /* renamed from: q, reason: collision with root package name */
    public int f450q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f451r;

    /* renamed from: s, reason: collision with root package name */
    public int f452s;

    /* renamed from: t, reason: collision with root package name */
    public int f453t;

    /* renamed from: u, reason: collision with root package name */
    public x f454u;

    /* renamed from: v, reason: collision with root package name */
    public Map f455v;

    /* renamed from: w, reason: collision with root package name */
    public e f456w;

    /* renamed from: x, reason: collision with root package name */
    public j f457x;

    /* renamed from: y, reason: collision with root package name */
    public i f458y;

    public final e M0() {
        if (this.f456w == null) {
            this.f456w = new e(this.f447n, this.f448o, this.f449p, this.f450q, this.f451r, this.f452s, this.f453t);
        }
        e eVar = this.f456w;
        Intrinsics.f(eVar);
        return eVar;
    }

    public final e N0(n4.b bVar) {
        e eVar;
        i iVar = this.f458y;
        if (iVar != null && iVar.f443c && (eVar = iVar.f444d) != null) {
            eVar.c(bVar);
            return eVar;
        }
        e M0 = M0();
        M0.c(bVar);
        return M0;
    }

    @Override // s3.c0
    public final int a(s sVar, q3.r rVar, int i13) {
        return g1.o(N0(sVar).d(sVar.getLayoutDirection()).c());
    }

    @Override // s3.c0
    public final int d(s sVar, q3.r rVar, int i13) {
        return N0(sVar).a(i13, sVar.getLayoutDirection());
    }

    @Override // s3.c0
    public final int e(s sVar, q3.r rVar, int i13) {
        return N0(sVar).a(i13, sVar.getLayoutDirection());
    }

    @Override // s3.r
    public final void f(d3.e eVar) {
        if (this.f120054m) {
            e N0 = N0(eVar);
            b4.b bVar = N0.f413j;
            if (bVar == null) {
                throw new IllegalArgumentException(("no paragraph (layoutCache=" + this.f456w + ", textSubstitution=" + this.f458y + ')').toString());
            }
            u a13 = ((m0) eVar).f110840a.f53652b.a();
            boolean z13 = N0.f414k;
            if (z13) {
                long j13 = N0.f415l;
                a13.j();
                a13.e(0.0f, 0.0f, (int) (j13 >> 32), (int) (j13 & 4294967295L), 1);
            }
            try {
                g0 g0Var = this.f448o.f21648a;
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
                b3.s c13 = g0Var.f21575a.c();
                if (c13 != null) {
                    float a14 = this.f448o.f21648a.f21575a.a();
                    d3.h.Qn.getClass();
                    bVar.g(a13, c13, a14, w0Var2, kVar2, iVar2, d3.g.f53658b);
                } else {
                    x xVar = this.f454u;
                    long a15 = xVar != null ? xVar.a() : w.f21390n;
                    if (a15 == 16) {
                        a15 = this.f448o.b() != 16 ? this.f448o.b() : w.f21378b;
                    }
                    long j14 = a15;
                    d3.h.Qn.getClass();
                    bVar.f(a13, j14, w0Var2, kVar2, iVar2, d3.g.f53658b);
                }
                if (z13) {
                    a13.restore();
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
        return g1.o(N0(sVar).d(sVar.getLayoutDirection()).b());
    }

    @Override // s3.c0
    public final q3.q0 i(r0 r0Var, o0 o0Var, long j13) {
        long j14;
        boolean z13;
        b4.u uVar;
        e N0 = N0(r0Var);
        n4.k layoutDirection = r0Var.getLayoutDirection();
        if (N0.f410g > 1) {
            b bVar = N0.f416m;
            q0 q0Var = N0.f405b;
            n4.b bVar2 = N0.f412i;
            Intrinsics.f(bVar2);
            b i13 = o.i(bVar, layoutDirection, q0Var, bVar2, N0.f406c);
            N0.f416m = i13;
            j14 = i13.a(N0.f410g, j13);
        } else {
            j14 = j13;
        }
        b4.b bVar3 = N0.f413j;
        if (bVar3 == null || (uVar = N0.f417n) == null || uVar.a() || layoutDirection != N0.f418o || (!n4.a.b(j14, N0.f419p) && (n4.a.h(j14) != n4.a.h(N0.f419p) || n4.a.g(j14) < bVar3.b() || bVar3.f21510d.f25688d))) {
            b4.b b13 = N0.b(j14, layoutDirection);
            N0.f419p = j14;
            long G = bs1.c.G(j14, l0.d(g1.o(b13.d()), g1.o(b13.b())));
            N0.f415l = G;
            N0.f414k = !s0.B(N0.f407d, 3) && (((float) ((int) (G >> 32))) < b13.d() || ((float) ((int) (G & 4294967295L))) < b13.b());
            N0.f413j = b13;
            z13 = true;
        } else {
            if (!n4.a.b(j14, N0.f419p)) {
                b4.b bVar4 = N0.f413j;
                Intrinsics.f(bVar4);
                long G2 = bs1.c.G(j14, l0.d(g1.o(Math.min(bVar4.f21507a.f74567i.b(), bVar4.d())), g1.o(bVar4.b())));
                N0.f415l = G2;
                N0.f414k = !s0.B(N0.f407d, 3) && (((float) ((int) (G2 >> 32))) < bVar4.d() || ((float) ((int) (G2 & 4294967295L))) < bVar4.b());
                N0.f419p = j14;
            }
            z13 = false;
        }
        b4.u uVar2 = N0.f417n;
        if (uVar2 != null) {
            uVar2.a();
        }
        Unit unit = Unit.f80348a;
        b4.b bVar5 = N0.f413j;
        Intrinsics.f(bVar5);
        long j15 = N0.f415l;
        if (z13) {
            com.bumptech.glide.c.S0(this, 2).d1();
            Map map = this.f455v;
            if (map == null) {
                map = new LinkedHashMap(2);
            }
            q qVar = q3.d.f102183a;
            z zVar = bVar5.f21510d;
            map.put(qVar, Integer.valueOf(Math.round(zVar.d(0))));
            map.put(q3.d.f102184b, Integer.valueOf(Math.round(zVar.d(zVar.f25691g - 1))));
            this.f455v = map;
        }
        int i14 = (int) (j15 >> 32);
        int i15 = (int) (j15 & 4294967295L);
        int min = Math.min(i14, 262142);
        int min2 = i14 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i14, 262142);
        int g13 = bs1.c.g(min2 == Integer.MAX_VALUE ? min : min2);
        c1 Q = o0Var.Q(bs1.c.a(min, min2, Math.min(g13, i15), i15 != Integer.MAX_VALUE ? Math.min(g13, i15) : Integer.MAX_VALUE));
        Map map2 = this.f455v;
        Intrinsics.f(map2);
        return r0Var.s0(i14, i15, map2, new a0(Q, 7));
    }

    @Override // s3.g2
    public final void m0(z3.j jVar) {
        j jVar2 = this.f457x;
        if (jVar2 == null) {
            jVar2 = new j(this, 0);
            this.f457x = jVar2;
        }
        b4.g gVar = new b4.g(this.f447n, null, 6);
        rl2.u[] uVarArr = z3.w.f140760a;
        jVar.e(t.f140753v, e0.b(gVar));
        i iVar = this.f458y;
        if (iVar != null) {
            boolean z13 = iVar.f443c;
            z3.x xVar = t.f140755x;
            rl2.u[] uVarArr2 = z3.w.f140760a;
            rl2.u uVar = uVarArr2[15];
            Boolean valueOf = Boolean.valueOf(z13);
            xVar.getClass();
            jVar.e(xVar, valueOf);
            b4.g gVar2 = new b4.g(iVar.f442b, null, 6);
            z3.x xVar2 = t.f140754w;
            rl2.u uVar2 = uVarArr2[14];
            xVar2.getClass();
            jVar.e(xVar2, gVar2);
        }
        jVar.e(z3.i.f140683j, new z3.a(null, new j(this, 1)));
        jVar.e(z3.i.f140684k, new z3.a(null, new j(this, 2)));
        jVar.e(z3.i.f140685l, new z3.a(null, new j1.q0(this, 17)));
        z3.w.c(jVar, jVar2);
    }
}
