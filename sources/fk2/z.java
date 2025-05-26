package fk2;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class z extends AtomicReference implements uj2.d, xj2.c, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.d f62493a;

    /* renamed from: b, reason: collision with root package name */
    public final bk2.a f62494b = new bk2.a();

    /* renamed from: c, reason: collision with root package name */
    public final uj2.f f62495c;

    public z(uj2.d dVar, uj2.f fVar) {
        this.f62493a = dVar;
        this.f62495c = fVar;
    }

    @Override // uj2.d
    public final void a() {
        this.f62493a.a();
    }

    @Override // uj2.d
    public final void b(xj2.c cVar) {
        bk2.c.setOnce(this, cVar);
    }

    @Override // xj2.c
    public final void dispose() {
        bk2.c.dispose(this);
        this.f62494b.dispose();
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return bk2.c.isDisposed((xj2.c) get());
    }

    @Override // uj2.d
    public final void onError(Throwable th3) {
        this.f62493a.onError(th3);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((uj2.b) this.f62495c).j(this);
    }
}
