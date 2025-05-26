package s2;

import g1.g0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class e0 extends c {

    /* renamed from: o, reason: collision with root package name */
    public final c f110627o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f110628p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f110629q;

    /* renamed from: r, reason: collision with root package name */
    public Function1 f110630r;

    /* renamed from: s, reason: collision with root package name */
    public Function1 f110631s;

    /* renamed from: t, reason: collision with root package name */
    public final long f110632t;

    public e0(c cVar, Function1 function1, Function1 function12, boolean z13, boolean z14) {
        super(0, n.f110658e, p.l(function1, (cVar == null || (r1 = cVar.f()) == null) ? ((b) p.f110674i.get()).f110607e : r1, z13), p.b(function12, (cVar == null || (r1 = cVar.i()) == null) ? ((b) p.f110674i.get()).f110608f : r1));
        Function1 i13;
        Function1 f13;
        this.f110627o = cVar;
        this.f110628p = z13;
        this.f110629q = z14;
        this.f110630r = this.f110607e;
        this.f110631s = this.f110608f;
        this.f110632t = tb.f.G();
    }

    @Override // s2.c
    public final void C(g0 g0Var) {
        kg.p.f0();
        throw null;
    }

    @Override // s2.c
    public final c D(Function1 function1, Function1 function12) {
        Function1 l13 = p.l(function1, this.f110630r, true);
        Function1 b13 = p.b(function12, this.f110631s);
        return !this.f110628p ? new e0(E().D(null, b13), l13, b13, false, true) : E().D(l13, b13);
    }

    public final c E() {
        c cVar = this.f110627o;
        return cVar == null ? (c) p.f110674i.get() : cVar;
    }

    @Override // s2.c, s2.i
    public final void c() {
        c cVar;
        this.f110644c = true;
        if (!this.f110629q || (cVar = this.f110627o) == null) {
            return;
        }
        cVar.c();
    }

    @Override // s2.i
    public final int d() {
        return E().d();
    }

    @Override // s2.i
    public final n e() {
        return E().e();
    }

    @Override // s2.c, s2.i
    public final Function1 f() {
        return this.f110630r;
    }

    @Override // s2.c, s2.i
    public final boolean g() {
        return E().g();
    }

    @Override // s2.c, s2.i
    public final int h() {
        return E().h();
    }

    @Override // s2.c, s2.i
    public final Function1 i() {
        return this.f110631s;
    }

    @Override // s2.c, s2.i
    public final void k() {
        kg.p.f0();
        throw null;
    }

    @Override // s2.c, s2.i
    public final void l() {
        kg.p.f0();
        throw null;
    }

    @Override // s2.c, s2.i
    public final void m() {
        E().m();
    }

    @Override // s2.c, s2.i
    public final void n(z zVar) {
        E().n(zVar);
    }

    @Override // s2.i
    public final void q(int i13) {
        kg.p.f0();
        throw null;
    }

    @Override // s2.i
    public final void r(n nVar) {
        kg.p.f0();
        throw null;
    }

    @Override // s2.c, s2.i
    public final void s(int i13) {
        E().s(i13);
    }

    @Override // s2.c, s2.i
    public final i t(Function1 function1) {
        Function1 l13 = p.l(function1, this.f110630r, true);
        return !this.f110628p ? p.h(E().t(null), l13, true) : E().t(l13);
    }

    @Override // s2.c
    public final bs1.c w() {
        return E().w();
    }

    @Override // s2.c
    public final g0 y() {
        return E().y();
    }

    @Override // s2.c
    /* renamed from: z */
    public final Function1 f() {
        return this.f110630r;
    }
}
