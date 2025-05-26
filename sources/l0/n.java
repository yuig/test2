package l0;

/* loaded from: classes2.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f81250a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f81251b;

    public /* synthetic */ n(s sVar, int i13) {
        this.f81250a = i13;
        this.f81251b = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f81250a;
        s sVar = this.f81251b;
        switch (i13) {
            case 0:
                sVar.getClass();
                l3.c.H0().execute(new n(sVar, 1));
                break;
            default:
                if (!sVar.f81280n) {
                    sVar.e();
                    break;
                }
                break;
        }
    }
}
