package s7;

/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111322a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f111323b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f111324c;

    public /* synthetic */ k(m mVar, n nVar, int i13) {
        this.f111322a = i13;
        this.f111323b = mVar;
        this.f111324c = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f111322a;
        n nVar = this.f111324c;
        m mVar = this.f111323b;
        switch (i13) {
            case 0:
                nVar.b(mVar.f111327a, mVar.f111328b);
                break;
            case 1:
                nVar.j(mVar.f111327a, mVar.f111328b);
                break;
            case 2:
                nVar.h(mVar.f111327a, mVar.f111328b);
                break;
            default:
                nVar.m(mVar.f111327a, mVar.f111328b);
                break;
        }
    }
}
