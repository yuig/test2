package jk2;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class n2 extends AtomicReference implements uj2.v, xj2.c, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.v f76603a;

    /* renamed from: b, reason: collision with root package name */
    public final long f76604b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeUnit f76605c;

    /* renamed from: d, reason: collision with root package name */
    public final uj2.z f76606d;

    /* renamed from: e, reason: collision with root package name */
    public xj2.c f76607e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f76608f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f76609g;

    public n2(rk2.d dVar, long j13, TimeUnit timeUnit, uj2.z zVar) {
        this.f76603a = dVar;
        this.f76604b = j13;
        this.f76605c = timeUnit;
        this.f76606d = zVar;
    }

    @Override // uj2.v
    public final void a() {
        if (this.f76609g) {
            return;
        }
        this.f76609g = true;
        this.f76603a.a();
        this.f76606d.dispose();
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        if (bk2.c.validate(this.f76607e, cVar)) {
            this.f76607e = cVar;
            this.f76603a.b(this);
        }
    }

    @Override // uj2.v
    public final void c(Object obj) {
        if (this.f76608f || this.f76609g) {
            return;
        }
        this.f76608f = true;
        this.f76603a.c(obj);
        xj2.c cVar = (xj2.c) get();
        if (cVar != null) {
            cVar.dispose();
        }
        bk2.c.replace(this, this.f76606d.c(this, this.f76604b, this.f76605c));
    }

    @Override // xj2.c
    public final void dispose() {
        this.f76607e.dispose();
        this.f76606d.dispose();
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f76606d.isDisposed();
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        if (this.f76609g) {
            lb.l0.R0(th3);
            return;
        }
        this.f76609g = true;
        this.f76603a.onError(th3);
        this.f76606d.dispose();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76608f = false;
    }
}
