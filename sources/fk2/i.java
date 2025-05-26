package fk2;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class i extends AtomicReference implements uj2.d, Runnable, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.d f62442a;

    /* renamed from: b, reason: collision with root package name */
    public final long f62443b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeUnit f62444c;

    /* renamed from: d, reason: collision with root package name */
    public final uj2.a0 f62445d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f62446e;

    /* renamed from: f, reason: collision with root package name */
    public Throwable f62447f;

    public i(uj2.d dVar, long j13, TimeUnit timeUnit, uj2.a0 a0Var, boolean z13) {
        this.f62442a = dVar;
        this.f62443b = j13;
        this.f62444c = timeUnit;
        this.f62445d = a0Var;
        this.f62446e = z13;
    }

    @Override // uj2.d
    public final void a() {
        bk2.c.replace(this, this.f62445d.c(this, this.f62443b, this.f62444c));
    }

    @Override // uj2.d
    public final void b(xj2.c cVar) {
        if (bk2.c.setOnce(this, cVar)) {
            this.f62442a.b(this);
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
        this.f62447f = th3;
        bk2.c.replace(this, this.f62445d.c(this, this.f62446e ? this.f62443b : 0L, this.f62444c));
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th3 = this.f62447f;
        this.f62447f = null;
        uj2.d dVar = this.f62442a;
        if (th3 != null) {
            dVar.onError(th3);
        } else {
            dVar.a();
        }
    }
}
