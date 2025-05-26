package fk2;

/* loaded from: classes2.dex */
public final class p implements uj2.k, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.d f62464a;

    /* renamed from: b, reason: collision with root package name */
    public xp2.c f62465b;

    public p(uj2.d dVar) {
        this.f62464a = dVar;
    }

    @Override // xp2.b
    public final void a() {
        this.f62464a.a();
    }

    @Override // xp2.b
    public final void c(Object obj) {
    }

    @Override // xp2.b
    public final void d(xp2.c cVar) {
        if (ok2.g.validate(this.f62465b, cVar)) {
            this.f62465b = cVar;
            this.f62464a.b(this);
            cVar.request(Long.MAX_VALUE);
        }
    }

    @Override // xj2.c
    public final void dispose() {
        this.f62465b.cancel();
        this.f62465b = ok2.g.CANCELLED;
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f62465b == ok2.g.CANCELLED;
    }

    @Override // xp2.b
    public final void onError(Throwable th3) {
        this.f62464a.onError(th3);
    }
}
