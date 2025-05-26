package j1;

/* loaded from: classes.dex */
public final class k2 implements i2.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74133a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f74134b;

    public /* synthetic */ k2(Object obj, int i13) {
        this.f74133a = i13;
        this.f74134b = obj;
    }

    @Override // i2.s0
    public final void dispose() {
        int i13 = this.f74133a;
        Object obj = this.f74134b;
        switch (i13) {
            case 0:
                g2 g2Var = (g2) obj;
                g2Var.i();
                g2Var.f74075a.getClass();
                break;
            case 1:
                g2 g2Var2 = (g2) obj;
                g2Var2.i();
                g2Var2.f74075a.getClass();
                break;
            default:
                ((t3.j2) obj).f116044a.invoke();
                break;
        }
    }
}
