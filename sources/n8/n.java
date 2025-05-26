package n8;

/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89855a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f89856b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j0 f89857c;

    public /* synthetic */ n(o oVar, j0 j0Var, int i13) {
        this.f89855a = i13;
        this.f89856b = oVar;
        this.f89857c = j0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f89855a;
        j0 j0Var = this.f89857c;
        this.f89856b.getClass();
        switch (i13) {
            case 0:
                j0Var.c();
                break;
            default:
                j0Var.v();
                break;
        }
    }
}
