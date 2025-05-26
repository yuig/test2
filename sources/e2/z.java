package e2;

import c2.n1;
import c2.o1;
import kotlin.jvm.functions.Function0;
import lb.l0;
import s3.m0;

/* loaded from: classes2.dex */
public abstract class z extends u2.p implements s3.l, s3.r, s3.a0 {

    /* renamed from: n, reason: collision with root package name */
    public final o1.k f56921n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f56922o;

    /* renamed from: p, reason: collision with root package name */
    public final float f56923p;

    /* renamed from: q, reason: collision with root package name */
    public final b3.x f56924q;

    /* renamed from: r, reason: collision with root package name */
    public final Function0 f56925r;

    /* renamed from: s, reason: collision with root package name */
    public g0 f56926s;

    /* renamed from: t, reason: collision with root package name */
    public float f56927t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f56929v;

    /* renamed from: u, reason: collision with root package name */
    public long f56928u = 0;

    /* renamed from: w, reason: collision with root package name */
    public final g1.a0 f56930w = new g1.a0();

    public z(o1.k kVar, boolean z13, float f13, n1 n1Var, o1 o1Var) {
        this.f56921n = kVar;
        this.f56922o = z13;
        this.f56923p = f13;
        this.f56924q = n1Var;
        this.f56925r = o1Var;
    }

    @Override // u2.p
    public final boolean A0() {
        return false;
    }

    @Override // u2.p
    public final void D0() {
        kotlin.jvm.internal.j.z(z0(), null, null, new y(this, null), 3);
    }

    public abstract void M0(o1.n nVar, long j13, float f13);

    public abstract void N0(d3.h hVar);

    public final void O0(o1.p pVar) {
        if (pVar instanceof o1.n) {
            M0((o1.n) pVar, this.f56928u, this.f56927t);
        } else if (pVar instanceof o1.o) {
            P0(((o1.o) pVar).f92767a);
        } else if (pVar instanceof o1.m) {
            P0(((o1.m) pVar).f92765a);
        }
    }

    public abstract void P0(o1.n nVar);

    @Override // s3.r
    public final void f(d3.e eVar) {
        m0 m0Var = (m0) eVar;
        m0Var.a();
        g0 g0Var = this.f56926s;
        if (g0Var != null) {
            g0Var.d(m0Var, this.f56927t, this.f56924q.a());
        }
        N0(m0Var);
    }

    @Override // s3.a0
    public final void n(long j13) {
        this.f56929v = true;
        n4.b bVar = com.bumptech.glide.c.U0(this).f110830r;
        this.f56928u = l0.y1(j13);
        float f13 = this.f56923p;
        this.f56927t = Float.isNaN(f13) ? r.a(bVar, this.f56922o, this.f56928u) : bVar.l0(f13);
        g1.a0 a0Var = this.f56930w;
        Object[] objArr = a0Var.f63228a;
        int i13 = a0Var.f63229b;
        for (int i14 = 0; i14 < i13; i14++) {
            O0((o1.p) objArr[i14]);
        }
        kotlin.collections.z.o(0, a0Var.f63229b, null, a0Var.f63228a);
        a0Var.f63229b = 0;
    }
}
