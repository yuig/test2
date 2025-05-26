package ek2;

/* loaded from: classes2.dex */
public final class l implements uj2.d, xp2.c {

    /* renamed from: a, reason: collision with root package name */
    public final xp2.b f59439a;

    /* renamed from: b, reason: collision with root package name */
    public xj2.c f59440b;

    public l(xp2.b bVar) {
        this.f59439a = bVar;
    }

    @Override // uj2.d
    public final void a() {
        this.f59439a.a();
    }

    @Override // uj2.d
    public final void b(xj2.c cVar) {
        if (bk2.c.validate(this.f59440b, cVar)) {
            this.f59440b = cVar;
            this.f59439a.d(this);
        }
    }

    @Override // xp2.c
    public final void cancel() {
        this.f59440b.dispose();
    }

    @Override // uj2.d
    public final void onError(Throwable th3) {
        this.f59439a.onError(th3);
    }

    @Override // xp2.c
    public final void request(long j13) {
    }
}
