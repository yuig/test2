package oi;

/* loaded from: classes3.dex */
public final class e6 extends l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f94740e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d6 f94741f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e6(d6 d6Var, d5 d5Var, int i13) {
        super(d5Var);
        this.f94740e = i13;
        this.f94741f = d6Var;
    }

    @Override // oi.l
    public final void c() {
        int i13 = this.f94740e;
        d6 d6Var = this.f94741f;
        switch (i13) {
            case 0:
                d6Var.p();
                if (d6Var.G()) {
                    d6Var.zzj().f95276n.c("Inactivity, disconnecting from the service");
                    d6Var.F();
                    break;
                }
                break;
            default:
                d6Var.zzj().f95271i.c("Tasks have been queued for a long time");
                break;
        }
    }
}
