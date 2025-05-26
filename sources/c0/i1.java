package c0;

/* loaded from: classes2.dex */
public final /* synthetic */ class i1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24264a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f24265b;

    public /* synthetic */ i1(p1 p1Var, int i13) {
        this.f24264a = i13;
        this.f24265b = p1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f24264a;
        p1 p1Var = this.f24265b;
        switch (i13) {
            case 0:
                p1Var.f24305g.cancel(true);
                break;
            case 1:
                p1Var.d();
                break;
            default:
                p1Var.d();
                break;
        }
    }
}
