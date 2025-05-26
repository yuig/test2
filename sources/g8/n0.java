package g8;

/* loaded from: classes3.dex */
public final /* synthetic */ class n0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f64354a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f64355b;

    public /* synthetic */ n0(t0 t0Var, int i13) {
        this.f64354a = i13;
        this.f64355b = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f64354a;
        t0 t0Var = this.f64355b;
        switch (i13) {
            case 0:
                t0Var.K = true;
                break;
            case 1:
                t0Var.y();
                break;
            default:
                if (!t0Var.Q) {
                    b0 b0Var = t0Var.f64423t;
                    b0Var.getClass();
                    b0Var.i(t0Var);
                    break;
                }
                break;
        }
    }
}
