package gk2;

/* loaded from: classes2.dex */
public final class w0 implements uj2.v, xp2.c {

    /* renamed from: a, reason: collision with root package name */
    public final xp2.b f65673a;

    /* renamed from: b, reason: collision with root package name */
    public xj2.c f65674b;

    public w0(xp2.b bVar) {
        this.f65673a = bVar;
    }

    @Override // uj2.v
    public final void a() {
        this.f65673a.a();
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        this.f65674b = cVar;
        this.f65673a.d(this);
    }

    @Override // uj2.v
    public final void c(Object obj) {
        this.f65673a.c(obj);
    }

    @Override // xp2.c
    public final void cancel() {
        this.f65674b.dispose();
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        this.f65673a.onError(th3);
    }

    @Override // xp2.c
    public final void request(long j13) {
    }
}
