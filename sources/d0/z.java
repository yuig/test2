package d0;

/* loaded from: classes2.dex */
public final /* synthetic */ class z implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53585a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f53586b;

    public /* synthetic */ z(a0 a0Var, int i13) {
        this.f53585a = i13;
        this.f53586b = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f53585a;
        a0 a0Var = this.f53586b;
        switch (i13) {
            case 0:
                a0Var.f53488d = null;
                a0Var.c();
                break;
            default:
                a0Var.c();
                break;
        }
    }
}
