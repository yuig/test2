package n7;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements d7.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89429a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f89430b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f89431c;

    public /* synthetic */ g(b bVar, boolean z13, int i13) {
        this.f89429a = i13;
        this.f89430b = bVar;
        this.f89431c = z13;
    }

    @Override // d7.r
    /* renamed from: invoke */
    public final void mo0invoke(Object obj) {
        int i13 = this.f89429a;
        boolean z13 = this.f89431c;
        b bVar = this.f89430b;
        c cVar = (c) obj;
        switch (i13) {
            case 0:
                cVar.W(bVar, z13);
                break;
            default:
                cVar.H(bVar, z13);
                break;
        }
    }
}
