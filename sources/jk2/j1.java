package jk2;

/* loaded from: classes2.dex */
public final class j1 extends a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f76537b;

    /* renamed from: c, reason: collision with root package name */
    public final ak2.f f76538c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1(uj2.t tVar, ak2.f fVar, int i13) {
        super(tVar);
        this.f76537b = i13;
        this.f76538c = fVar;
    }

    @Override // uj2.q
    public final void G(uj2.v vVar) {
        int i13 = this.f76537b;
        uj2.t tVar = this.f76382a;
        ak2.f fVar = this.f76538c;
        switch (i13) {
            case 0:
                tVar.d(new w(vVar, fVar, 2));
                break;
            default:
                uk2.f fVar2 = new uk2.f();
                try {
                    Object apply = fVar.apply(fVar2);
                    ck2.i.b(apply, "The selector returned a null ObservableSource");
                    uj2.t tVar2 = (uj2.t) apply;
                    r1 r1Var = new r1(vVar, 0);
                    tVar2.d(r1Var);
                    tVar.d(new pn.d(fVar2, r1Var, 1));
                    break;
                } catch (Throwable th3) {
                    bp1.h.H(th3);
                    bk2.d.error(th3, vVar);
                }
        }
    }
}
