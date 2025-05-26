package ao2;

/* loaded from: classes2.dex */
public final class t1 extends r1 {

    /* renamed from: e, reason: collision with root package name */
    public final a2 f20208e;

    /* renamed from: f, reason: collision with root package name */
    public final u1 f20209f;

    /* renamed from: g, reason: collision with root package name */
    public final t f20210g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f20211h;

    public t1(a2 a2Var, u1 u1Var, t tVar, Object obj) {
        this.f20208e = a2Var;
        this.f20209f = u1Var;
        this.f20210g = tVar;
        this.f20211h = obj;
    }

    @Override // ao2.r1
    public final boolean i() {
        return false;
    }

    @Override // ao2.r1
    public final void j(Throwable th3) {
        a2 a2Var = this.f20208e;
        a2Var.getClass();
        t tVar = this.f20210g;
        t T = a2.T(tVar);
        u1 u1Var = this.f20209f;
        Object obj = this.f20211h;
        if (T == null || !a2Var.d0(u1Var, T, obj)) {
            f2 f2Var = u1Var.f20217a;
            f2Var.getClass();
            f2Var.c(new ho2.j(2), 2);
            t T2 = a2.T(tVar);
            if (T2 == null || !a2Var.d0(u1Var, T2, obj)) {
                a2Var.t(a2Var.E(u1Var, obj));
            }
        }
    }
}
