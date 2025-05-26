package fk2;

/* loaded from: classes2.dex */
public final class q implements uj2.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.d f62466a;

    public q(uj2.d dVar) {
        this.f62466a = dVar;
    }

    @Override // uj2.d0
    public final void b(xj2.c cVar) {
        this.f62466a.b(cVar);
    }

    @Override // uj2.d0
    public final void onError(Throwable th3) {
        this.f62466a.onError(th3);
    }

    @Override // uj2.d0
    public final void onSuccess(Object obj) {
        this.f62466a.a();
    }
}
