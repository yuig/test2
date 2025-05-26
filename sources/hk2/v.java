package hk2;

/* loaded from: classes4.dex */
public final class v extends uj2.l implements dk2.g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f69441a;

    public v(Object obj) {
        this.f69441a = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f69441a;
    }

    @Override // uj2.l
    public final void g(uj2.m mVar) {
        mVar.b(bk2.d.INSTANCE);
        mVar.onSuccess(this.f69441a);
    }
}
