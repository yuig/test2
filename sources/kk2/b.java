package kk2;

/* loaded from: classes2.dex */
public final class b extends uj2.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f79913a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f79914b;

    public b(Object obj, int i13) {
        this.f79913a = i13;
        this.f79914b = obj;
    }

    @Override // uj2.b0
    public final void q(uj2.d0 d0Var) {
        int i13 = this.f79913a;
        Object obj = this.f79914b;
        switch (i13) {
            case 0:
                a aVar = new a(d0Var);
                d0Var.b(aVar);
                try {
                    ((uj2.e0) obj).g(aVar);
                    break;
                } catch (Throwable th3) {
                    bp1.h.H(th3);
                    aVar.a(th3);
                    return;
                }
            default:
                d0Var.b(bk2.d.INSTANCE);
                d0Var.onSuccess(obj);
                break;
        }
    }
}
