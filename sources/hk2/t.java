package hk2;

/* loaded from: classes4.dex */
public final class t extends a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f69439b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(uj2.n nVar, int i13) {
        super(nVar);
        this.f69439b = i13;
    }

    @Override // uj2.l
    public final void g(uj2.m mVar) {
        int i13 = this.f69439b;
        uj2.n nVar = this.f69383a;
        switch (i13) {
            case 0:
                ((uj2.l) nVar).f(new s(mVar, 0));
                break;
            default:
                ((uj2.l) nVar).f(mVar);
                break;
        }
    }
}
