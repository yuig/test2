package c0;

/* loaded from: classes2.dex */
public final /* synthetic */ class g1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24239a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o1 f24240b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f24241c;

    public /* synthetic */ g1(o1 o1Var, k kVar, int i13) {
        this.f24239a = i13;
        this.f24240b = o1Var;
        this.f24241c = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f24239a;
        k kVar = this.f24241c;
        o1 o1Var = this.f24240b;
        switch (i13) {
            case 0:
                o1Var.i(kVar);
                break;
            default:
                o1Var.i(kVar);
                break;
        }
    }
}
