package l0;

/* loaded from: classes2.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f81252a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f81253b;

    public /* synthetic */ o(r rVar, int i13) {
        this.f81252a = i13;
        this.f81253b = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f81252a;
        r rVar = this.f81253b;
        switch (i13) {
            case 0:
                rVar.a();
                break;
            case 1:
                rVar.a();
                break;
            case 2:
                rVar.b();
                break;
            default:
                t tVar = rVar.f81266r;
                if (tVar != null) {
                    tVar.d();
                }
                if (rVar.f81265q == null) {
                    rVar.f81264p.c();
                    break;
                }
                break;
        }
    }
}
