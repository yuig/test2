package gk2;

/* loaded from: classes2.dex */
public final class r2 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final uj2.a0 f65607c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f65608d;

    public r2(uj2.h hVar, uj2.a0 a0Var, boolean z13) {
        super(hVar);
        this.f65607c = a0Var;
        this.f65608d = z13;
    }

    @Override // uj2.h
    public final void m(xp2.b bVar) {
        uj2.z a13 = this.f65607c.a();
        q2 q2Var = new q2(bVar, a13, this.f65321b, this.f65608d);
        bVar.d(q2Var);
        a13.b(q2Var);
    }
}
