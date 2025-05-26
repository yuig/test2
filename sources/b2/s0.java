package b2;

import w1.l1;

/* loaded from: classes2.dex */
public final class s0 implements k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t0 f21212a;

    public s0(t0 t0Var) {
        this.f21212a = t0Var;
    }

    @Override // b2.k
    public final boolean a(long j13, r rVar) {
        l1 l1Var;
        t0 t0Var = this.f21212a;
        if (!t0Var.j() || t0Var.l().f67559a.f21571a.length() == 0 || (l1Var = t0Var.f21219d) == null || l1Var.d() == null) {
            return false;
        }
        z2.s sVar = t0Var.f21225j;
        if (sVar != null) {
            sVar.a(z2.m.f140632l);
        }
        t0Var.f21228m = j13;
        t0Var.f21233r = -1;
        t0Var.h(true);
        d(t0Var.l(), t0Var.f21228m, true, rVar);
        return true;
    }

    @Override // b2.k
    public final void b() {
    }

    @Override // b2.k
    public final boolean c(long j13, r rVar) {
        l1 l1Var;
        t0 t0Var = this.f21212a;
        if (!t0Var.j() || t0Var.l().f67559a.f21571a.length() == 0 || (l1Var = t0Var.f21219d) == null || l1Var.d() == null) {
            return false;
        }
        d(t0Var.l(), j13, false, rVar);
        return true;
    }

    public final void d(h4.f0 f0Var, long j13, boolean z13, r rVar) {
        this.f21212a.r(b4.p0.b(t0.c(this.f21212a, f0Var, j13, z13, false, rVar, false)) ? w1.w0.Cursor : w1.w0.Selection);
    }
}
