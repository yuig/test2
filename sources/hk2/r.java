package hk2;

/* loaded from: classes4.dex */
public final class r implements uj2.d0, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.m f69434a;

    /* renamed from: b, reason: collision with root package name */
    public xj2.c f69435b;

    public r(uj2.m mVar) {
        this.f69434a = mVar;
    }

    @Override // uj2.d0
    public final void b(xj2.c cVar) {
        if (bk2.c.validate(this.f69435b, cVar)) {
            this.f69435b = cVar;
            this.f69434a.b(this);
        }
    }

    @Override // xj2.c
    public final void dispose() {
        this.f69435b.dispose();
        this.f69435b = bk2.c.DISPOSED;
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f69435b.isDisposed();
    }

    @Override // uj2.d0
    public final void onError(Throwable th3) {
        this.f69435b = bk2.c.DISPOSED;
        this.f69434a.onError(th3);
    }

    @Override // uj2.d0
    public final void onSuccess(Object obj) {
        this.f69435b = bk2.c.DISPOSED;
        this.f69434a.onSuccess(obj);
    }
}
