package q01;

/* loaded from: classes5.dex */
public final class o implements ca2.b, xc1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f101827a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yq0.b0 f101828b;

    public /* synthetic */ o(yq0.b0 b0Var, int i13) {
        this.f101827a = i13;
        this.f101828b = b0Var;
    }

    @Override // ca2.b
    public void M0(String str) {
        int i13 = this.f101827a;
        yq0.b0 b0Var = this.f101828b;
        switch (i13) {
            case 0:
                p pVar = (p) b0Var;
                p01.i iVar = pVar.C0;
                if (iVar != null) {
                    iVar.v3();
                }
                pVar.D5();
                break;
            case 1:
                ((uv1.l) b0Var).D5();
                break;
            default:
                ((uv1.q) b0Var).D5();
                break;
        }
    }
}
