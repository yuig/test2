package jk2;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class l extends AtomicInteger implements uj2.v, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.v f76561a;

    /* renamed from: b, reason: collision with root package name */
    public final ak2.f f76562b;

    /* renamed from: c, reason: collision with root package name */
    public final k f76563c;

    /* renamed from: d, reason: collision with root package name */
    public final int f76564d;

    /* renamed from: e, reason: collision with root package name */
    public dk2.i f76565e;

    /* renamed from: f, reason: collision with root package name */
    public xj2.c f76566f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f76567g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f76568h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f76569i;

    /* renamed from: j, reason: collision with root package name */
    public int f76570j;

    public l(rk2.d dVar, ak2.f fVar, int i13) {
        this.f76561a = dVar;
        this.f76562b = fVar;
        this.f76564d = i13;
        this.f76563c = new k(dVar, this);
    }

    @Override // uj2.v
    public final void a() {
        if (this.f76569i) {
            return;
        }
        this.f76569i = true;
        d();
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        if (bk2.c.validate(this.f76566f, cVar)) {
            this.f76566f = cVar;
            if (cVar instanceof dk2.d) {
                dk2.d dVar = (dk2.d) cVar;
                int requestFusion = dVar.requestFusion(3);
                if (requestFusion == 1) {
                    this.f76570j = requestFusion;
                    this.f76565e = dVar;
                    this.f76569i = true;
                    this.f76561a.b(this);
                    d();
                    return;
                }
                if (requestFusion == 2) {
                    this.f76570j = requestFusion;
                    this.f76565e = dVar;
                    this.f76561a.b(this);
                    return;
                }
            }
            this.f76565e = new lk2.c(this.f76564d);
            this.f76561a.b(this);
        }
    }

    @Override // uj2.v
    public final void c(Object obj) {
        if (this.f76569i) {
            return;
        }
        if (this.f76570j == 0) {
            this.f76565e.offer(obj);
        }
        d();
    }

    public final void d() {
        if (getAndIncrement() != 0) {
            return;
        }
        while (!this.f76568h) {
            if (!this.f76567g) {
                boolean z13 = this.f76569i;
                try {
                    Object poll = this.f76565e.poll();
                    boolean z14 = poll == null;
                    if (z13 && z14) {
                        this.f76568h = true;
                        this.f76561a.a();
                        return;
                    }
                    if (!z14) {
                        try {
                            Object apply = this.f76562b.apply(poll);
                            ck2.i.b(apply, "The mapper returned a null ObservableSource");
                            uj2.t tVar = (uj2.t) apply;
                            this.f76567g = true;
                            tVar.d(this.f76563c);
                        } catch (Throwable th3) {
                            bp1.h.H(th3);
                            dispose();
                            this.f76565e.clear();
                            this.f76561a.onError(th3);
                            return;
                        }
                    }
                } catch (Throwable th4) {
                    bp1.h.H(th4);
                    dispose();
                    this.f76565e.clear();
                    this.f76561a.onError(th4);
                    return;
                }
            }
            if (decrementAndGet() == 0) {
                return;
            }
        }
        this.f76565e.clear();
    }

    @Override // xj2.c
    public final void dispose() {
        this.f76568h = true;
        k kVar = this.f76563c;
        kVar.getClass();
        bk2.c.dispose(kVar);
        this.f76566f.dispose();
        if (getAndIncrement() == 0) {
            this.f76565e.clear();
        }
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f76568h;
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        if (this.f76569i) {
            lb.l0.R0(th3);
            return;
        }
        this.f76569i = true;
        dispose();
        this.f76561a.onError(th3);
    }
}
