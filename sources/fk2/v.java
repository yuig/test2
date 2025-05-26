package fk2;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class v extends AtomicReference implements uj2.d, xj2.c, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.d f62477a;

    /* renamed from: b, reason: collision with root package name */
    public final uj2.a0 f62478b;

    /* renamed from: c, reason: collision with root package name */
    public Throwable f62479c;

    public v(uj2.d dVar, uj2.a0 a0Var) {
        this.f62477a = dVar;
        this.f62478b = a0Var;
    }

    @Override // uj2.d
    public final void a() {
        bk2.c.replace(this, this.f62478b.b(this));
    }

    @Override // uj2.d
    public final void b(xj2.c cVar) {
        if (bk2.c.setOnce(this, cVar)) {
            this.f62477a.b(this);
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
        this.f62479c = th3;
        bk2.c.replace(this, this.f62478b.b(this));
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th3 = this.f62479c;
        uj2.d dVar = this.f62477a;
        if (th3 == null) {
            dVar.a();
        } else {
            this.f62479c = null;
            dVar.onError(th3);
        }
    }
}
