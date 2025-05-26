package n7;

/* loaded from: classes.dex */
public final /* synthetic */ class t implements d7.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89575a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f89576b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f89577c;

    public /* synthetic */ t(b bVar, int i13, int i14) {
        this.f89575a = i14;
        this.f89576b = bVar;
        this.f89577c = i13;
    }

    @Override // d7.r
    /* renamed from: invoke */
    public final void mo0invoke(Object obj) {
        int i13 = this.f89575a;
        int i14 = this.f89577c;
        b bVar = this.f89576b;
        c cVar = (c) obj;
        switch (i13) {
            case 0:
                cVar.K(bVar, i14);
                break;
            case 1:
                cVar.P(bVar, i14);
                break;
            case 2:
                cVar.s(bVar, i14);
                break;
            default:
                cVar.Y(bVar, i14);
                break;
        }
    }
}
