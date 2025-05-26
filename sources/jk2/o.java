package jk2;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class o implements uj2.v, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.v f76610a;

    /* renamed from: b, reason: collision with root package name */
    public final long f76611b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeUnit f76612c;

    /* renamed from: d, reason: collision with root package name */
    public final uj2.z f76613d;

    /* renamed from: e, reason: collision with root package name */
    public xj2.c f76614e;

    /* renamed from: f, reason: collision with root package name */
    public n f76615f;

    /* renamed from: g, reason: collision with root package name */
    public volatile long f76616g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f76617h;

    public o(rk2.d dVar, long j13, TimeUnit timeUnit, uj2.z zVar) {
        this.f76610a = dVar;
        this.f76611b = j13;
        this.f76612c = timeUnit;
        this.f76613d = zVar;
    }

    @Override // uj2.v
    public final void a() {
        if (this.f76617h) {
            return;
        }
        this.f76617h = true;
        n nVar = this.f76615f;
        if (nVar != null) {
            bk2.c.dispose(nVar);
        }
        if (nVar != null) {
            nVar.run();
        }
        this.f76610a.a();
        this.f76613d.dispose();
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        if (bk2.c.validate(this.f76614e, cVar)) {
            this.f76614e = cVar;
            this.f76610a.b(this);
        }
    }

    @Override // uj2.v
    public final void c(Object obj) {
        if (this.f76617h) {
            return;
        }
        long j13 = this.f76616g + 1;
        this.f76616g = j13;
        n nVar = this.f76615f;
        if (nVar != null) {
            bk2.c.dispose(nVar);
        }
        n nVar2 = new n(obj, j13, this);
        this.f76615f = nVar2;
        bk2.c.replace(nVar2, this.f76613d.c(nVar2, this.f76611b, this.f76612c));
    }

    @Override // xj2.c
    public final void dispose() {
        this.f76614e.dispose();
        this.f76613d.dispose();
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f76613d.isDisposed();
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        if (this.f76617h) {
            lb.l0.R0(th3);
            return;
        }
        n nVar = this.f76615f;
        if (nVar != null) {
            bk2.c.dispose(nVar);
        }
        this.f76617h = true;
        this.f76610a.onError(th3);
        this.f76613d.dispose();
    }
}
