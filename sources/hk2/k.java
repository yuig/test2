package hk2;

/* loaded from: classes4.dex */
public final class k extends a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f69417b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f69418c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(uj2.n nVar, Object obj, int i13) {
        super(nVar);
        this.f69417b = i13;
        this.f69418c = obj;
    }

    @Override // uj2.l
    public final void g(uj2.m mVar) {
        int i13 = this.f69417b;
        int i14 = 0;
        uj2.n nVar = this.f69383a;
        Object obj = this.f69418c;
        switch (i13) {
            case 0:
                ((uj2.l) nVar).f(new j(i14, mVar, (ak2.g) obj));
                break;
            case 1:
                ((uj2.l) nVar).f(new b(mVar, (ak2.f) obj));
                break;
            case 2:
                ((uj2.l) nVar).f(new w(mVar, (uj2.a0) obj));
                break;
            default:
                ((uj2.l) nVar).f(new a0(i14, mVar, (uj2.n) obj));
                break;
        }
    }
}
