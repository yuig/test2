package jk2;

/* loaded from: classes4.dex */
public final class y0 implements uj2.k, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.v f76763a;

    /* renamed from: b, reason: collision with root package name */
    public xp2.c f76764b;

    public y0(uj2.v vVar) {
        this.f76763a = vVar;
    }

    @Override // xp2.b
    public final void a() {
        this.f76763a.a();
    }

    @Override // xp2.b
    public final void c(Object obj) {
        this.f76763a.c(obj);
    }

    @Override // xp2.b
    public final void d(xp2.c cVar) {
        if (ok2.g.validate(this.f76764b, cVar)) {
            this.f76764b = cVar;
            this.f76763a.b(this);
            cVar.request(Long.MAX_VALUE);
        }
    }

    @Override // xj2.c
    public final void dispose() {
        this.f76764b.cancel();
        this.f76764b = ok2.g.CANCELLED;
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f76764b == ok2.g.CANCELLED;
    }

    @Override // xp2.b
    public final void onError(Throwable th3) {
        this.f76763a.onError(th3);
    }
}
