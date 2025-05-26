package n7;

/* loaded from: classes3.dex */
public final /* synthetic */ class j implements d7.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89464a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f89465b;

    public /* synthetic */ j(b bVar, int i13) {
        this.f89464a = i13;
        this.f89465b = bVar;
    }

    @Override // d7.r
    /* renamed from: invoke */
    public final void mo0invoke(Object obj) {
        int i13 = this.f89464a;
        b bVar = this.f89465b;
        c cVar = (c) obj;
        switch (i13) {
            case 0:
                cVar.getClass();
                break;
            case 1:
                cVar.C(bVar);
                break;
            case 2:
                cVar.m(bVar);
                break;
            case 3:
                cVar.M(bVar);
                break;
            default:
                cVar.Z(bVar);
                break;
        }
    }
}
