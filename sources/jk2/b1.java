package jk2;

/* loaded from: classes4.dex */
public final class b1 implements uj2.v, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.v f76407a;

    /* renamed from: b, reason: collision with root package name */
    public xj2.c f76408b;

    public b1(uj2.v vVar) {
        this.f76407a = vVar;
    }

    @Override // uj2.v
    public final void a() {
        this.f76407a.a();
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        this.f76408b = cVar;
        this.f76407a.b(this);
    }

    @Override // uj2.v
    public final void c(Object obj) {
    }

    @Override // xj2.c
    public final void dispose() {
        this.f76408b.dispose();
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f76408b.isDisposed();
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        this.f76407a.onError(th3);
    }
}
