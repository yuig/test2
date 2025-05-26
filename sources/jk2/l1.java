package jk2;

/* loaded from: classes2.dex */
public final class l1 extends a {

    /* renamed from: b, reason: collision with root package name */
    public final uj2.a0 f76572b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f76573c;

    /* renamed from: d, reason: collision with root package name */
    public final int f76574d;

    public l1(uj2.t tVar, uj2.a0 a0Var, int i13) {
        super(tVar);
        this.f76572b = a0Var;
        this.f76573c = false;
        this.f76574d = i13;
    }

    @Override // uj2.q
    public final void G(uj2.v vVar) {
        uj2.a0 a0Var = this.f76572b;
        boolean z13 = a0Var instanceof mk2.c0;
        uj2.t tVar = this.f76382a;
        if (z13) {
            tVar.d(vVar);
        } else {
            tVar.d(new k1(vVar, a0Var.a(), this.f76573c, this.f76574d));
        }
    }
}
