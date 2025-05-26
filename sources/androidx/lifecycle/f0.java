package androidx.lifecycle;

/* loaded from: classes.dex */
public final class f0 extends g0 implements x {

    /* renamed from: e, reason: collision with root package name */
    public final z f18618e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h0 f18619f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(h0 h0Var, z zVar, m0 m0Var) {
        super(h0Var, m0Var);
        this.f18619f = h0Var;
        this.f18618e = zVar;
    }

    @Override // androidx.lifecycle.g0
    public final void b() {
        this.f18618e.getLifecycle().b(this);
    }

    @Override // androidx.lifecycle.x
    public final void c(z zVar, q qVar) {
        z zVar2 = this.f18618e;
        r rVar = ((b0) zVar2.getLifecycle()).f18588d;
        if (rVar == r.DESTROYED) {
            this.f18619f.j(this.f18621a);
            return;
        }
        r rVar2 = null;
        while (rVar2 != rVar) {
            a(e());
            rVar2 = rVar;
            rVar = ((b0) zVar2.getLifecycle()).f18588d;
        }
    }

    @Override // androidx.lifecycle.g0
    public final boolean d(z zVar) {
        return this.f18618e == zVar;
    }

    @Override // androidx.lifecycle.g0
    public final boolean e() {
        return ((b0) this.f18618e.getLifecycle()).f18588d.isAtLeast(r.STARTED);
    }
}
