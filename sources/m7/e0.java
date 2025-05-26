package m7;

/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements d7.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86148a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f86149b;

    public /* synthetic */ e0(int i13, int i14) {
        this.f86148a = i14;
        this.f86149b = i13;
    }

    @Override // d7.r
    /* renamed from: invoke */
    public final void mo0invoke(Object obj) {
        int i13 = this.f86148a;
        int i14 = this.f86149b;
        a7.t0 t0Var = (a7.t0) obj;
        switch (i13) {
            case 0:
                t0Var.m5(i14);
                break;
            default:
                t0Var.o0(i14);
                break;
        }
    }
}
