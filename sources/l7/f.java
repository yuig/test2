package l7;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class f implements g0, h0 {

    /* renamed from: a */
    public final i0 f81775a;

    /* renamed from: b */
    public final d0 f81776b;

    /* renamed from: c */
    public final z0 f81777c;

    public f(sp2.i iVar, i0 i0Var, i0 i0Var2, z0 z0Var) {
        this.f81775a = i0Var;
        this.f81776b = new d0(iVar, i0Var2, z0Var);
        this.f81777c = z0Var;
    }

    @Override // l7.g0
    public final synchronized void D() {
        this.f81776b.D();
    }

    @Override // l7.h0
    public final synchronized void j(a7.t tVar, long j13) {
        this.f81776b.a(tVar, j13);
    }

    @Override // l7.h0
    public final synchronized void m() {
        this.f81776b.b();
    }

    @Override // l7.g0
    public final synchronized void n() {
        this.f81776b.n();
        z0 z0Var = this.f81777c;
        i0 i0Var = this.f81775a;
        Objects.requireNonNull(i0Var);
        z0Var.e(new e(i0Var, 0), true);
    }

    @Override // l7.g0
    public final void z(a7.t tVar) {
        this.f81777c.e(new d(0, this, tVar), true);
    }
}
