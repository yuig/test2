package jk2;

/* loaded from: classes4.dex */
public final class u0 extends a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f76707b;

    /* renamed from: c, reason: collision with root package name */
    public final ak2.f f76708c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(uj2.t tVar, ak2.f fVar, int i13) {
        super(tVar);
        this.f76707b = i13;
        this.f76708c = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [uk2.m] */
    /* JADX WARN: Type inference failed for: r2v4, types: [uk2.m] */
    /* JADX WARN: Type inference failed for: r7v0, types: [uj2.v] */
    @Override // uj2.q
    public final void G(uj2.v vVar) {
        int i13 = this.f76707b;
        int i14 = 0;
        int i15 = 1;
        uj2.t tVar = this.f76382a;
        ak2.f fVar = this.f76708c;
        switch (i13) {
            case 0:
                tVar.d(new t0(vVar, fVar, i14));
                break;
            case 1:
                tVar.d(new t0(vVar, fVar, i15));
                break;
            case 2:
                uk2.f fVar2 = new uk2.f();
                if (!(fVar2 instanceof uk2.m)) {
                    fVar2 = new uk2.m(fVar2);
                }
                try {
                    Object apply = fVar.apply(fVar2);
                    ck2.i.b(apply, "The handler returned a null ObservableSource");
                    uj2.t tVar2 = (uj2.t) apply;
                    x1 x1Var = new x1(vVar, fVar2, tVar, 0);
                    vVar.b(x1Var);
                    tVar2.d(x1Var.f76753i);
                    x1Var.d();
                    break;
                } catch (Throwable th3) {
                    bp1.h.H(th3);
                    bk2.d.error(th3, (uj2.v) vVar);
                    return;
                }
            default:
                uk2.f fVar3 = new uk2.f();
                if (!(fVar3 instanceof uk2.m)) {
                    fVar3 = new uk2.m(fVar3);
                }
                try {
                    Object apply2 = fVar.apply(fVar3);
                    ck2.i.b(apply2, "The handler returned a null ObservableSource");
                    uj2.t tVar3 = (uj2.t) apply2;
                    x1 x1Var2 = new x1(vVar, fVar3, tVar, 1);
                    vVar.b(x1Var2);
                    tVar3.d(x1Var2.f76753i);
                    x1Var2.d();
                    break;
                } catch (Throwable th4) {
                    bp1.h.H(th4);
                    bk2.d.error(th4, (uj2.v) vVar);
                }
        }
    }
}
