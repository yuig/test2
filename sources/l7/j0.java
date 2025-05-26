package l7;

/* loaded from: classes3.dex */
public final class j0 implements h0, g0 {

    /* renamed from: a, reason: collision with root package name */
    public final f f81788a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f81789b;

    public j0(sp2.i iVar, x xVar, i0 i0Var, z0 z0Var) {
        this.f81788a = new f(iVar, xVar, i0Var, z0Var);
    }

    @Override // l7.g0
    public final void D() {
        if (this.f81789b) {
            this.f81788a.D();
        }
    }

    @Override // l7.h0
    public final synchronized void j(a7.t tVar, long j13) {
        if (this.f81789b) {
            this.f81788a.j(tVar, j13);
        }
    }

    @Override // l7.h0
    public final synchronized void m() {
        if (this.f81789b) {
            this.f81788a.m();
        }
    }

    @Override // l7.g0
    public final synchronized void n() {
        if (this.f81789b) {
            this.f81788a.n();
        }
    }

    @Override // l7.g0
    public final void z(a7.t tVar) {
        if (this.f81789b) {
            this.f81788a.z(tVar);
        }
    }
}
