package l7;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f81773a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f81774b;

    public /* synthetic */ e(i0 i0Var, int i13) {
        this.f81773a = i13;
        this.f81774b = i0Var;
    }

    @Override // l7.y0
    public final void run() {
        int i13 = this.f81773a;
        i0 i0Var = this.f81774b;
        switch (i13) {
            case 0:
                i0Var.flush();
                break;
            case 1:
                i0Var.c();
                break;
            default:
                i0Var.c();
                break;
        }
    }
}
