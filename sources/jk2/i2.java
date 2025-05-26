package jk2;

/* loaded from: classes2.dex */
public final class i2 extends a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f76505b;

    /* renamed from: c, reason: collision with root package name */
    public final uj2.t f76506c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i2(uj2.t tVar, uj2.t tVar2, int i13) {
        super(tVar);
        this.f76505b = i13;
        this.f76506c = tVar2;
    }

    @Override // uj2.q
    public final void G(uj2.v vVar) {
        int i13 = this.f76505b;
        uj2.t tVar = this.f76382a;
        uj2.t tVar2 = this.f76506c;
        switch (i13) {
            case 0:
                h2 h2Var = new h2(vVar, tVar2);
                vVar.b(h2Var.f76495c);
                tVar.d(h2Var);
                break;
            default:
                m2 m2Var = new m2(vVar);
                vVar.b(m2Var);
                tVar2.d(m2Var.f76594c);
                tVar.d(m2Var);
                break;
        }
    }
}
