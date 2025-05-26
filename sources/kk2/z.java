package kk2;

/* loaded from: classes2.dex */
public final class z extends ok2.c implements uj2.d0 {

    /* renamed from: c, reason: collision with root package name */
    public xj2.c f79999c;

    @Override // uj2.d0
    public final void b(xj2.c cVar) {
        if (bk2.c.validate(this.f79999c, cVar)) {
            this.f79999c = cVar;
            this.f95468a.d(this);
        }
    }

    @Override // xp2.c
    public final void cancel() {
        set(4);
        this.f95469b = null;
        this.f79999c.dispose();
    }

    @Override // uj2.d0
    public final void onError(Throwable th3) {
        this.f95468a.onError(th3);
    }
}
