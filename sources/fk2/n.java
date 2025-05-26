package fk2;

/* loaded from: classes4.dex */
public final class n extends uj2.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f62460a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f62461b;

    public n(Object obj, int i13) {
        this.f62460a = i13;
        this.f62461b = obj;
    }

    @Override // uj2.b
    public final void k(uj2.d dVar) {
        int i13 = this.f62460a;
        Object obj = this.f62461b;
        switch (i13) {
            case 0:
                bk2.d.error((Throwable) obj, dVar);
                break;
            case 1:
                ((uj2.t) obj).d(new o(dVar, 0));
                break;
            default:
                ((uj2.b) ((uj2.f) obj)).j(dVar);
                break;
        }
    }
}
