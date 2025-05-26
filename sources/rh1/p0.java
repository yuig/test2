package rh1;

/* loaded from: classes5.dex */
public final class p0 implements ca2.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0 f108265a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ca2.e f108266b;

    public p0(q0 q0Var, ca2.e eVar) {
        this.f108265a = q0Var;
        this.f108266b = eVar;
    }

    @Override // ca2.b
    public final void o2(int i13) {
        q0 q0Var = this.f108265a;
        if (i13 == 4) {
            int i14 = q0.B1;
            q0Var.P7();
        }
        if (i13 == 1) {
            q0Var.V8();
            q0Var.d9();
        }
        if (i13 == 3) {
            bs1.c.U1(q0Var.X8());
        }
        if (i13 == 6) {
            this.f108266b.a();
        }
    }
}
