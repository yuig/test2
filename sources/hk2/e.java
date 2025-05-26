package hk2;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class e extends AtomicReference implements uj2.d, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.m f69401a;

    /* renamed from: b, reason: collision with root package name */
    public final uj2.n f69402b;

    public e(uj2.m mVar, uj2.n nVar) {
        this.f69401a = mVar;
        this.f69402b = nVar;
    }

    @Override // uj2.d
    public final void a() {
        ((uj2.l) this.f69402b).f(new d(this, this.f69401a, 0));
    }

    @Override // uj2.d
    public final void b(xj2.c cVar) {
        if (bk2.c.setOnce(this, cVar)) {
            this.f69401a.b(this);
        }
    }

    @Override // xj2.c
    public final void dispose() {
        bk2.c.dispose(this);
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return bk2.c.isDisposed((xj2.c) get());
    }

    @Override // uj2.d
    public final void onError(Throwable th3) {
        this.f69401a.onError(th3);
    }
}
