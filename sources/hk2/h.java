package hk2;

/* loaded from: classes2.dex */
public final class h extends a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f69410b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f69411c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(uj2.n nVar, Object obj, int i13) {
        super(nVar);
        this.f69410b = i13;
        this.f69411c = obj;
    }

    @Override // uj2.l
    public final void g(uj2.m mVar) {
        int i13 = this.f69410b;
        uj2.n nVar = this.f69383a;
        Object obj = this.f69411c;
        switch (i13) {
            case 0:
                ((uj2.l) nVar).f(new g(mVar, (ak2.e) obj, 0));
                break;
            case 1:
                ((uj2.l) nVar).f(new g(mVar, (ak2.f) obj, 1));
                break;
            default:
                m mVar2 = new m(mVar);
                mVar.b(mVar2);
                bk2.a aVar = (bk2.a) mVar2.f69423b;
                xj2.c b13 = ((uj2.a0) obj).b(new lb.x(mVar2, nVar, 12));
                aVar.getClass();
                bk2.c.replace(aVar, b13);
                break;
        }
    }
}
