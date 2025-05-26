package v;

/* loaded from: classes2.dex */
public final /* synthetic */ class f3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123456a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0.c1 f123457b;

    public /* synthetic */ f3(c0.c1 c1Var, int i13) {
        this.f123456a = i13;
        this.f123457b = c1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f123456a;
        c0.c1 c1Var = this.f123457b;
        switch (i13) {
            case 0:
                c1Var.a();
                break;
            case 1:
                c1Var.a();
                break;
            case 2:
                c1Var.a();
                break;
            default:
                if (c1Var != null) {
                    c1Var.a();
                    break;
                }
                break;
        }
    }
}
