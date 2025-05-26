package hk2;

/* loaded from: classes2.dex */
public final class c0 extends ok2.c implements uj2.m {

    /* renamed from: c, reason: collision with root package name */
    public xj2.c f69396c;

    @Override // uj2.m
    public final void a() {
        this.f95468a.a();
    }

    @Override // uj2.m
    public final void b(xj2.c cVar) {
        if (bk2.c.validate(this.f69396c, cVar)) {
            this.f69396c = cVar;
            this.f95468a.d(this);
        }
    }

    @Override // xp2.c
    public final void cancel() {
        set(4);
        this.f95469b = null;
        this.f69396c.dispose();
    }

    @Override // uj2.m
    public final void onError(Throwable th3) {
        this.f95468a.onError(th3);
    }
}
