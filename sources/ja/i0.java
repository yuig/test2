package ja;

/* loaded from: classes3.dex */
public final class i0 implements ak2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f75242a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f75243b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f75244c;

    public i0(j51.d0 d0Var, j51.w wVar) {
        this.f75243b = d0Var;
        this.f75244c = wVar;
    }

    @Override // ak2.a
    public final void run() {
        int i13 = this.f75242a;
        Object obj = this.f75244c;
        Object obj2 = this.f75243b;
        switch (i13) {
            case 0:
                ((d0) ((sp2.i) obj).f114929c).f75182e.d((p) obj2);
                break;
            default:
                ((j51.d0) obj2).B8((j51.w) obj);
                break;
        }
    }

    public i0(sp2.i iVar, r rVar) {
        this.f75244c = iVar;
        this.f75243b = rVar;
    }
}
