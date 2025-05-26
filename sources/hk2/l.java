package hk2;

/* loaded from: classes4.dex */
public final class l implements uj2.d0, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.m f69419a;

    /* renamed from: b, reason: collision with root package name */
    public final ak2.g f69420b;

    /* renamed from: c, reason: collision with root package name */
    public xj2.c f69421c;

    public l(uj2.m mVar, ak2.g gVar) {
        this.f69419a = mVar;
        this.f69420b = gVar;
    }

    @Override // uj2.d0
    public final void b(xj2.c cVar) {
        if (bk2.c.validate(this.f69421c, cVar)) {
            this.f69421c = cVar;
            this.f69419a.b(this);
        }
    }

    @Override // xj2.c
    public final void dispose() {
        xj2.c cVar = this.f69421c;
        this.f69421c = bk2.c.DISPOSED;
        cVar.dispose();
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f69421c.isDisposed();
    }

    @Override // uj2.d0
    public final void onError(Throwable th3) {
        this.f69419a.onError(th3);
    }

    @Override // uj2.d0
    public final void onSuccess(Object obj) {
        uj2.m mVar = this.f69419a;
        try {
            if (this.f69420b.test(obj)) {
                mVar.onSuccess(obj);
            } else {
                mVar.a();
            }
        } catch (Throwable th3) {
            bp1.h.H(th3);
            mVar.onError(th3);
        }
    }
}
