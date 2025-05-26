package m7;

/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements d7.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86163a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f86164b;

    public /* synthetic */ g0(boolean z13, int i13) {
        this.f86163a = i13;
        this.f86164b = z13;
    }

    @Override // d7.r
    /* renamed from: invoke */
    public final void mo0invoke(Object obj) {
        int i13 = this.f86163a;
        boolean z13 = this.f86164b;
        a7.t0 t0Var = (a7.t0) obj;
        switch (i13) {
            case 0:
                t0Var.K0(z13);
                break;
            default:
                t0Var.R1(z13);
                break;
        }
    }
}
