package fk2;

/* loaded from: classes4.dex */
public final class e0 extends ek2.c implements uj2.d {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.v f62430a;

    /* renamed from: b, reason: collision with root package name */
    public xj2.c f62431b;

    public e0(uj2.v vVar) {
        this.f62430a = vVar;
    }

    @Override // uj2.d
    public final void a() {
        this.f62430a.a();
    }

    @Override // uj2.d
    public final void b(xj2.c cVar) {
        if (bk2.c.validate(this.f62431b, cVar)) {
            this.f62431b = cVar;
            this.f62430a.b(this);
        }
    }

    @Override // dk2.i
    public final void clear() {
    }

    @Override // xj2.c
    public final void dispose() {
        this.f62431b.dispose();
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f62431b.isDisposed();
    }

    @Override // dk2.i
    public final boolean isEmpty() {
        return true;
    }

    @Override // uj2.d
    public final void onError(Throwable th3) {
        this.f62430a.onError(th3);
    }

    @Override // dk2.i
    public final /* bridge */ /* synthetic */ Object poll() {
        return null;
    }

    @Override // dk2.e
    public final int requestFusion(int i13) {
        return 2;
    }
}
