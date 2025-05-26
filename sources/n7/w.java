package n7;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements d7.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89583a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f89584b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f89585c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f89586d;

    public /* synthetic */ w(int i13, int i14, b bVar, boolean z13) {
        this.f89583a = i14;
        this.f89584b = bVar;
        this.f89585c = z13;
        this.f89586d = i13;
    }

    @Override // d7.r
    /* renamed from: invoke */
    public final void mo0invoke(Object obj) {
        c cVar = (c) obj;
        switch (this.f89583a) {
            case 0:
                cVar.getClass();
                break;
            default:
                cVar.b0(this.f89584b, this.f89585c, this.f89586d);
                break;
        }
    }
}
