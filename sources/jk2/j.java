package jk2;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class j extends AtomicInteger implements uj2.v, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.v f76507a;

    /* renamed from: b, reason: collision with root package name */
    public final ak2.f f76508b;

    /* renamed from: c, reason: collision with root package name */
    public final int f76509c;

    /* renamed from: d, reason: collision with root package name */
    public final pk2.c f76510d = new pk2.c();

    /* renamed from: e, reason: collision with root package name */
    public final i f76511e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f76512f;

    /* renamed from: g, reason: collision with root package name */
    public dk2.i f76513g;

    /* renamed from: h, reason: collision with root package name */
    public xj2.c f76514h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f76515i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f76516j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f76517k;

    /* renamed from: l, reason: collision with root package name */
    public int f76518l;

    public j(int i13, uj2.v vVar, ak2.f fVar, boolean z13) {
        this.f76507a = vVar;
        this.f76508b = fVar;
        this.f76509c = i13;
        this.f76512f = z13;
        this.f76511e = new i(vVar, this);
    }

    @Override // uj2.v
    public final void a() {
        this.f76516j = true;
        d();
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        if (bk2.c.validate(this.f76514h, cVar)) {
            this.f76514h = cVar;
            if (cVar instanceof dk2.d) {
                dk2.d dVar = (dk2.d) cVar;
                int requestFusion = dVar.requestFusion(3);
                if (requestFusion == 1) {
                    this.f76518l = requestFusion;
                    this.f76513g = dVar;
                    this.f76516j = true;
                    this.f76507a.b(this);
                    d();
                    return;
                }
                if (requestFusion == 2) {
                    this.f76518l = requestFusion;
                    this.f76513g = dVar;
                    this.f76507a.b(this);
                    return;
                }
            }
            this.f76513g = new lk2.c(this.f76509c);
            this.f76507a.b(this);
        }
    }

    @Override // uj2.v
    public final void c(Object obj) {
        if (this.f76518l == 0) {
            this.f76513g.offer(obj);
        }
        d();
    }

    public final void d() {
        if (getAndIncrement() != 0) {
            return;
        }
        uj2.v vVar = this.f76507a;
        dk2.i iVar = this.f76513g;
        pk2.c cVar = this.f76510d;
        while (true) {
            if (!this.f76515i) {
                if (this.f76517k) {
                    iVar.clear();
                    return;
                }
                if (!this.f76512f && ((Throwable) cVar.get()) != null) {
                    iVar.clear();
                    this.f76517k = true;
                    vVar.onError(pk2.h.b(cVar));
                    return;
                }
                boolean z13 = this.f76516j;
                try {
                    Object poll = iVar.poll();
                    boolean z14 = poll == null;
                    if (z13 && z14) {
                        this.f76517k = true;
                        cVar.getClass();
                        Throwable b13 = pk2.h.b(cVar);
                        if (b13 != null) {
                            vVar.onError(b13);
                            return;
                        } else {
                            vVar.a();
                            return;
                        }
                    }
                    if (!z14) {
                        try {
                            Object apply = this.f76508b.apply(poll);
                            ck2.i.b(apply, "The mapper returned a null ObservableSource");
                            uj2.t tVar = (uj2.t) apply;
                            if (tVar instanceof Callable) {
                                try {
                                    Object call = ((Callable) tVar).call();
                                    if (call != null && !this.f76517k) {
                                        vVar.c(call);
                                    }
                                } catch (Throwable th3) {
                                    bp1.h.H(th3);
                                    cVar.getClass();
                                    pk2.h.a(cVar, th3);
                                }
                            } else {
                                this.f76515i = true;
                                tVar.d(this.f76511e);
                            }
                        } catch (Throwable th4) {
                            bp1.h.H(th4);
                            this.f76517k = true;
                            this.f76514h.dispose();
                            iVar.clear();
                            cVar.getClass();
                            pk2.h.a(cVar, th4);
                            vVar.onError(pk2.h.b(cVar));
                            return;
                        }
                    }
                } catch (Throwable th5) {
                    bp1.h.H(th5);
                    this.f76517k = true;
                    this.f76514h.dispose();
                    cVar.getClass();
                    pk2.h.a(cVar, th5);
                    vVar.onError(pk2.h.b(cVar));
                    return;
                }
            }
            if (decrementAndGet() == 0) {
                return;
            }
        }
    }

    @Override // xj2.c
    public final void dispose() {
        this.f76517k = true;
        this.f76514h.dispose();
        i iVar = this.f76511e;
        iVar.getClass();
        bk2.c.dispose(iVar);
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f76517k;
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        pk2.c cVar = this.f76510d;
        cVar.getClass();
        if (!pk2.h.a(cVar, th3)) {
            lb.l0.R0(th3);
        } else {
            this.f76516j = true;
            d();
        }
    }
}
