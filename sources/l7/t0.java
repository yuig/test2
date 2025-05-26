package l7;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class t0 extends u0 {

    /* renamed from: d, reason: collision with root package name */
    public d0 f81876d;

    /* renamed from: e, reason: collision with root package name */
    public final sp2.i f81877e;

    public t0(sp2.i iVar, z0 z0Var) {
        super(z0Var);
        this.f81877e = iVar;
    }

    @Override // l7.g0
    public final void D() {
        this.f81876d.getClass();
        d0 d0Var = this.f81876d;
        Objects.requireNonNull(d0Var);
        this.f81881a.e(new p(d0Var, 4), true);
    }

    @Override // l7.u0
    public final synchronized void b() {
        d0 d0Var = this.f81876d;
        d0Var.getClass();
        d0Var.n();
        super.b();
    }

    @Override // l7.u0
    public final int d() {
        int size;
        d0 d0Var = this.f81876d;
        d0Var.getClass();
        synchronized (d0Var) {
            size = d0Var.f81771d.size();
        }
        return size;
    }

    @Override // l7.u0
    public final void f() {
    }

    @Override // l7.u0
    public final void h(a7.s sVar, boolean z13) {
    }

    @Override // l7.u0
    public final void i(m mVar) {
        this.f81876d = new d0(this.f81877e, mVar, this.f81881a);
    }

    @Override // l7.u0
    public final void j() {
        this.f81881a.e(new p(this, 3), true);
    }

    @Override // l7.g0
    public final void z(a7.t tVar) {
        this.f81881a.e(new d(4, this, tVar), true);
    }
}
