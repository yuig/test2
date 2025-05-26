package gk2;

/* loaded from: classes4.dex */
public final class d1 extends uj2.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65373a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f65374b;

    public d1(Object obj, int i13) {
        this.f65373a = i13;
        this.f65374b = obj;
    }

    @Override // uj2.l
    public final void g(uj2.m mVar) {
        int i13 = this.f65373a;
        Object obj = this.f65374b;
        switch (i13) {
            case 0:
                ((xp2.a) obj).b(new c1(mVar));
                break;
            case 1:
                mVar.b(bk2.d.INSTANCE);
                mVar.onError((Throwable) obj);
                break;
            case 2:
                ((uj2.b) ((uj2.f) obj)).j(new hk2.q(mVar));
                break;
            default:
                ((uj2.b0) ((uj2.f0) obj)).p(new hk2.r(mVar));
                break;
        }
    }
}
