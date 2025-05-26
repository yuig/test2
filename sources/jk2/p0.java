package jk2;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class p0 extends AtomicInteger implements xj2.c, uj2.v {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.d f76626a;

    /* renamed from: c, reason: collision with root package name */
    public final ak2.f f76628c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f76629d;

    /* renamed from: f, reason: collision with root package name */
    public xj2.c f76631f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f76632g;

    /* renamed from: b, reason: collision with root package name */
    public final pk2.c f76627b = new pk2.c();

    /* renamed from: e, reason: collision with root package name */
    public final xj2.b f76630e = new xj2.b();

    public p0(uj2.d dVar, ak2.f fVar, boolean z13) {
        this.f76626a = dVar;
        this.f76628c = fVar;
        this.f76629d = z13;
        lazySet(1);
    }

    @Override // uj2.v
    public final void a() {
        if (decrementAndGet() == 0) {
            pk2.c cVar = this.f76627b;
            cVar.getClass();
            Throwable b13 = pk2.h.b(cVar);
            uj2.d dVar = this.f76626a;
            if (b13 != null) {
                dVar.onError(b13);
            } else {
                dVar.a();
            }
        }
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        if (bk2.c.validate(this.f76631f, cVar)) {
            this.f76631f = cVar;
            this.f76626a.b(this);
        }
    }

    @Override // uj2.v
    public final void c(Object obj) {
        try {
            Object apply = this.f76628c.apply(obj);
            ck2.i.b(apply, "The mapper returned a null CompletableSource");
            uj2.f fVar = (uj2.f) apply;
            getAndIncrement();
            o0 o0Var = new o0(this);
            if (this.f76632g || !this.f76630e.a(o0Var)) {
                return;
            }
            ((uj2.b) fVar).j(o0Var);
        } catch (Throwable th3) {
            bp1.h.H(th3);
            this.f76631f.dispose();
            onError(th3);
        }
    }

    @Override // xj2.c
    public final void dispose() {
        this.f76632g = true;
        this.f76631f.dispose();
        this.f76630e.dispose();
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f76631f.isDisposed();
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        pk2.c cVar = this.f76627b;
        cVar.getClass();
        if (!pk2.h.a(cVar, th3)) {
            lb.l0.R0(th3);
            return;
        }
        boolean z13 = this.f76629d;
        uj2.d dVar = this.f76626a;
        if (z13) {
            if (decrementAndGet() == 0) {
                cVar.getClass();
                dVar.onError(pk2.h.b(cVar));
                return;
            }
            return;
        }
        dispose();
        if (getAndSet(0) > 0) {
            cVar.getClass();
            dVar.onError(pk2.h.b(cVar));
        }
    }
}
