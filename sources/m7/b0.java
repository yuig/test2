package m7;

/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements d7.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86096a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f86097b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f86098c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f86099d;

    public /* synthetic */ b0(int i13, a7.u0 u0Var, a7.u0 u0Var2) {
        this.f86097b = i13;
        this.f86098c = u0Var;
        this.f86099d = u0Var2;
    }

    @Override // d7.r
    /* renamed from: invoke */
    public final void mo0invoke(Object obj) {
        int i13 = this.f86096a;
        int i14 = this.f86097b;
        Object obj2 = this.f86099d;
        Object obj3 = this.f86098c;
        switch (i13) {
            case 0:
                a7.t0 t0Var = (a7.t0) obj;
                t0Var.h3(i14);
                t0Var.N4(i14, (a7.u0) obj3, (a7.u0) obj2);
                break;
            default:
                ((n7.c) obj).E((n7.b) obj3, (a7.i0) obj2, i14);
                break;
        }
    }

    public /* synthetic */ b0(n7.b bVar, a7.i0 i0Var, int i13) {
        this.f86098c = bVar;
        this.f86099d = i0Var;
        this.f86097b = i13;
    }
}
