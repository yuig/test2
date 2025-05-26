package jk2;

/* loaded from: classes4.dex */
public final class d2 implements uj2.v, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.v f76437a;

    /* renamed from: b, reason: collision with root package name */
    public long f76438b;

    /* renamed from: c, reason: collision with root package name */
    public xj2.c f76439c;

    public d2(uj2.v vVar, long j13) {
        this.f76437a = vVar;
        this.f76438b = j13;
    }

    @Override // uj2.v
    public final void a() {
        this.f76437a.a();
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        if (bk2.c.validate(this.f76439c, cVar)) {
            this.f76439c = cVar;
            this.f76437a.b(this);
        }
    }

    @Override // uj2.v
    public final void c(Object obj) {
        long j13 = this.f76438b;
        if (j13 != 0) {
            this.f76438b = j13 - 1;
        } else {
            this.f76437a.c(obj);
        }
    }

    @Override // xj2.c
    public final void dispose() {
        this.f76439c.dispose();
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f76439c.isDisposed();
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        this.f76437a.onError(th3);
    }
}
