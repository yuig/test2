package hk2;

/* loaded from: classes4.dex */
public final class q implements uj2.d, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.m f69432a;

    /* renamed from: b, reason: collision with root package name */
    public xj2.c f69433b;

    public q(uj2.m mVar) {
        this.f69432a = mVar;
    }

    @Override // uj2.d
    public final void a() {
        this.f69433b = bk2.c.DISPOSED;
        this.f69432a.a();
    }

    @Override // uj2.d
    public final void b(xj2.c cVar) {
        if (bk2.c.validate(this.f69433b, cVar)) {
            this.f69433b = cVar;
            this.f69432a.b(this);
        }
    }

    @Override // xj2.c
    public final void dispose() {
        this.f69433b.dispose();
        this.f69433b = bk2.c.DISPOSED;
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f69433b.isDisposed();
    }

    @Override // uj2.d
    public final void onError(Throwable th3) {
        this.f69433b = bk2.c.DISPOSED;
        this.f69432a.onError(th3);
    }
}
