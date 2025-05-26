package cp;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52932a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f52933b;

    public /* synthetic */ h(n nVar, int i13) {
        this.f52932a = i13;
        this.f52933b = nVar;
    }

    @Override // gm1.a
    public final void h3(gm1.c cVar) {
        int i13 = this.f52932a;
        n nVar = this.f52933b;
        switch (i13) {
            case 0:
                nVar.f52962t0.onClick(nVar.f52963u0);
                break;
            default:
                int i14 = n.f52942w0;
                nVar.getClass();
                if (cVar instanceof cn1.q) {
                    String str = ((cn1.q) cVar).f28232c;
                    String trim = str == null ? "" : str.trim();
                    nVar.f52959q0 = trim;
                    nVar.f52957o0.g(trim);
                }
                if (cVar instanceof cn1.r) {
                    hf0.b.k(nVar.f52948f0);
                    break;
                }
                break;
        }
    }
}
