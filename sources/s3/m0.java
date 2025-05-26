package s3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m0 implements d3.h, d3.e {

    /* renamed from: a, reason: collision with root package name */
    public final d3.c f110840a = new d3.c();

    /* renamed from: b, reason: collision with root package name */
    public r f110841b;

    public static void d(r rVar, b3.u uVar, e3.d dVar) {
        q1 S0 = com.bumptech.glide.c.S0(rVar, 4);
        long y13 = lb.l0.y1(S0.f102180c);
        k0 k0Var = S0.f110898l;
        k0Var.getClass();
        ((t3.c0) n0.a(k0Var)).f115873c.c(uVar, y13, S0, rVar, dVar);
    }

    @Override // n4.b
    public final long A(float f13) {
        return this.f110840a.A(f13);
    }

    @Override // d3.h
    public final void G(b3.f0 f0Var, long j13, long j14, long j15, long j16, float f13, d3.i iVar, b3.p pVar, int i13, int i14) {
        this.f110840a.G(f0Var, j13, j14, j15, j16, f13, iVar, pVar, i13, i14);
    }

    @Override // d3.h
    public final void H(long j13, float f13, long j14, float f14, d3.i iVar, b3.p pVar, int i13) {
        this.f110840a.H(j13, f13, j14, f14, iVar, pVar, i13);
    }

    @Override // d3.h
    public final void I(long j13, long j14, long j15, float f13, int i13, b3.p0 p0Var, float f14, b3.p pVar, int i14) {
        this.f110840a.I(j13, j14, j15, f13, i13, p0Var, f14, pVar, i14);
    }

    @Override // d3.h
    public final void M(long j13, long j14, long j15, float f13, d3.i iVar, b3.p pVar, int i13) {
        this.f110840a.M(j13, j14, j15, f13, iVar, pVar, i13);
    }

    @Override // n4.b
    public final int R(float f13) {
        return this.f110840a.R(f13);
    }

    @Override // d3.h
    public final void S(b3.s sVar, long j13, long j14, long j15, float f13, d3.i iVar, b3.p pVar, int i13) {
        this.f110840a.S(sVar, j13, j14, j15, f13, iVar, pVar, i13);
    }

    @Override // n4.b
    public final float T(long j13) {
        return this.f110840a.T(j13);
    }

    @Override // d3.h
    public final void U(b3.s sVar, long j13, long j14, float f13, int i13, b3.p0 p0Var, float f14, b3.p pVar, int i14) {
        this.f110840a.U(sVar, j13, j14, f13, i13, p0Var, f14, pVar, i14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [u2.p] */
    public final void a() {
        n nVar;
        d3.c cVar = this.f110840a;
        b3.u a13 = cVar.f53652b.a();
        m mVar = this.f110841b;
        Intrinsics.f(mVar);
        u2.p pVar = (u2.p) mVar;
        u2.p pVar2 = pVar.f120042a.f120047f;
        if (pVar2 != null) {
            int i13 = pVar2.f120045d & 4;
            nVar = pVar2;
            if (i13 != 0) {
                while (nVar != 0) {
                    int i14 = nVar.f120044c;
                    if ((i14 & 2) != 0) {
                        break;
                    } else if ((i14 & 4) != 0) {
                        break;
                    } else {
                        nVar = nVar.f120047f;
                    }
                }
            }
        }
        nVar = 0;
        if (nVar == 0) {
            q1 S0 = com.bumptech.glide.c.S0(mVar, 4);
            if (S0.X0() == pVar.f120042a) {
                S0 = S0.f110900n;
                Intrinsics.f(S0);
            }
            S0.j1(a13, cVar.f53652b.f53649b);
            return;
        }
        ?? r23 = 0;
        while (nVar != 0) {
            if (nVar instanceof r) {
                d((r) nVar, a13, cVar.f53652b.f53649b);
            } else if ((nVar.f120044c & 4) != 0 && (nVar instanceof n)) {
                u2.p pVar3 = nVar.f110843o;
                int i15 = 0;
                r23 = r23;
                nVar = nVar;
                while (pVar3 != null) {
                    if ((pVar3.f120044c & 4) != 0) {
                        i15++;
                        r23 = r23;
                        if (i15 == 1) {
                            nVar = pVar3;
                        } else {
                            if (r23 == 0) {
                                r23 = new k2.e(new u2.p[16]);
                            }
                            if (nVar != 0) {
                                r23.b(nVar);
                                nVar = 0;
                            }
                            r23.b(pVar3);
                        }
                    }
                    pVar3 = pVar3.f120047f;
                    r23 = r23;
                    nVar = nVar;
                }
                if (i15 == 1) {
                }
            }
            nVar = com.bumptech.glide.c.g(r23);
        }
    }

    @Override // n4.b
    public final float b() {
        return this.f110840a.b();
    }

    public final void c(b3.u uVar, long j13, q1 q1Var, r rVar, e3.d dVar) {
        r rVar2 = this.f110841b;
        this.f110841b = rVar;
        n4.k kVar = q1Var.f110898l.f110831s;
        d3.c cVar = this.f110840a;
        n4.b b13 = cVar.f53652b.b();
        d3.b bVar = cVar.f53652b;
        n4.k d2 = bVar.d();
        b3.u a13 = bVar.a();
        long e13 = bVar.e();
        e3.d dVar2 = bVar.f53649b;
        bVar.g(q1Var);
        bVar.i(kVar);
        bVar.f(uVar);
        bVar.j(j13);
        bVar.f53649b = dVar;
        uVar.j();
        try {
            rVar.f(this);
            uVar.restore();
            bVar.g(b13);
            bVar.i(d2);
            bVar.f(a13);
            bVar.j(e13);
            bVar.f53649b = dVar2;
            this.f110841b = rVar2;
        } catch (Throwable th3) {
            uVar.restore();
            bVar.g(b13);
            bVar.i(d2);
            bVar.f(a13);
            bVar.j(e13);
            bVar.f53649b = dVar2;
            throw th3;
        }
    }

    @Override // n4.b
    public final float f0(int i13) {
        return this.f110840a.f0(i13);
    }

    @Override // d3.h
    public final long g() {
        return this.f110840a.g();
    }

    @Override // n4.b
    public final float g0(float f13) {
        return this.f110840a.g0(f13);
    }

    @Override // d3.h
    public final n4.k getLayoutDirection() {
        return this.f110840a.f53651a.f53645b;
    }

    @Override // n4.b
    public final float j0() {
        return this.f110840a.j0();
    }

    @Override // n4.b
    public final float l0(float f13) {
        return this.f110840a.b() * f13;
    }

    @Override // d3.h
    public final void n0(b3.s sVar, long j13, long j14, float f13, d3.i iVar, b3.p pVar, int i13) {
        this.f110840a.n0(sVar, j13, j14, f13, iVar, pVar, i13);
    }

    @Override // n4.b
    public final long o(float f13) {
        return this.f110840a.o(f13);
    }

    @Override // n4.b
    public final long p(long j13) {
        return this.f110840a.p(j13);
    }

    @Override // d3.h
    public final d3.b p0() {
        return this.f110840a.f53652b;
    }

    @Override // d3.h
    public final void r(long j13, long j14, long j15, long j16, d3.i iVar, float f13, b3.p pVar, int i13) {
        this.f110840a.r(j13, j14, j15, j16, iVar, f13, pVar, i13);
    }

    @Override // d3.h
    public final void r0(b3.f0 f0Var, long j13, float f13, d3.i iVar, b3.p pVar, int i13) {
        this.f110840a.r0(f0Var, j13, f13, iVar, pVar, i13);
    }

    @Override // d3.h
    public final void s(b3.o0 o0Var, long j13, float f13, d3.i iVar, b3.p pVar, int i13) {
        this.f110840a.s(o0Var, j13, f13, iVar, pVar, i13);
    }

    @Override // n4.b
    public final float t(long j13) {
        return this.f110840a.t(j13);
    }

    @Override // d3.h
    public final long t0() {
        return this.f110840a.t0();
    }

    @Override // n4.b
    public final long v0(long j13) {
        return this.f110840a.v0(j13);
    }

    @Override // d3.h
    public final void y(b3.o0 o0Var, b3.s sVar, float f13, d3.i iVar, b3.p pVar, int i13) {
        this.f110840a.y(o0Var, sVar, f13, iVar, pVar, i13);
    }
}
