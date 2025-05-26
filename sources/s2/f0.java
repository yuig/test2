package s2;

import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class f0 extends i {

    /* renamed from: e, reason: collision with root package name */
    public final i f110633e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f110634f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f110635g;

    /* renamed from: h, reason: collision with root package name */
    public Function1 f110636h;

    /* renamed from: i, reason: collision with root package name */
    public final long f110637i;

    public f0(i iVar, Function1 function1, boolean z13) {
        super(0, n.f110658e);
        Function1 f13;
        this.f110633e = iVar;
        this.f110634f = false;
        this.f110635g = z13;
        this.f110636h = p.l(function1, (iVar == null || (f13 = iVar.f()) == null) ? ((b) p.f110674i.get()).f110607e : f13, false);
        this.f110637i = tb.f.G();
    }

    @Override // s2.i
    public final void c() {
        i iVar;
        this.f110644c = true;
        if (!this.f110635g || (iVar = this.f110633e) == null) {
            return;
        }
        iVar.c();
    }

    @Override // s2.i
    public final int d() {
        return u().d();
    }

    @Override // s2.i
    public final n e() {
        return u().e();
    }

    @Override // s2.i
    public final Function1 f() {
        return this.f110636h;
    }

    @Override // s2.i
    public final boolean g() {
        return u().g();
    }

    @Override // s2.i
    public final Function1 i() {
        return null;
    }

    @Override // s2.i
    public final void k() {
        kg.p.f0();
        throw null;
    }

    @Override // s2.i
    public final void l() {
        kg.p.f0();
        throw null;
    }

    @Override // s2.i
    public final void m() {
        u().m();
    }

    @Override // s2.i
    public final void n(z zVar) {
        u().n(zVar);
    }

    @Override // s2.i
    public final i t(Function1 function1) {
        Function1 l13 = p.l(function1, this.f110636h, true);
        return !this.f110634f ? p.h(u().t(null), l13, true) : u().t(l13);
    }

    public final i u() {
        i iVar = this.f110633e;
        return iVar == null ? (i) p.f110674i.get() : iVar;
    }
}
