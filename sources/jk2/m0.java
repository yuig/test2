package jk2;

/* loaded from: classes4.dex */
public final class m0 extends ek2.b implements uj2.v {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.v f76579a;

    /* renamed from: c, reason: collision with root package name */
    public final ak2.f f76581c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f76582d;

    /* renamed from: f, reason: collision with root package name */
    public xj2.c f76584f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f76585g;

    /* renamed from: b, reason: collision with root package name */
    public final pk2.c f76580b = new pk2.c();

    /* renamed from: e, reason: collision with root package name */
    public final xj2.b f76583e = new xj2.b();

    public m0(uj2.v vVar, ak2.f fVar, boolean z13) {
        this.f76579a = vVar;
        this.f76581c = fVar;
        this.f76582d = z13;
        lazySet(1);
    }

    @Override // uj2.v
    public final void a() {
        if (decrementAndGet() == 0) {
            pk2.c cVar = this.f76580b;
            cVar.getClass();
            Throwable b13 = pk2.h.b(cVar);
            uj2.v vVar = this.f76579a;
            if (b13 != null) {
                vVar.onError(b13);
            } else {
                vVar.a();
            }
        }
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        if (bk2.c.validate(this.f76584f, cVar)) {
            this.f76584f = cVar;
            this.f76579a.b(this);
        }
    }

    @Override // uj2.v
    public final void c(Object obj) {
        try {
            Object apply = this.f76581c.apply(obj);
            ck2.i.b(apply, "The mapper returned a null CompletableSource");
            uj2.f fVar = (uj2.f) apply;
            getAndIncrement();
            l0 l0Var = new l0(this);
            if (this.f76585g || !this.f76583e.a(l0Var)) {
                return;
            }
            ((uj2.b) fVar).j(l0Var);
        } catch (Throwable th3) {
            bp1.h.H(th3);
            this.f76584f.dispose();
            onError(th3);
        }
    }

    @Override // dk2.i
    public final void clear() {
    }

    @Override // xj2.c
    public final void dispose() {
        this.f76585g = true;
        this.f76584f.dispose();
        this.f76583e.dispose();
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f76584f.isDisposed();
    }

    @Override // dk2.i
    public final boolean isEmpty() {
        return true;
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        pk2.c cVar = this.f76580b;
        cVar.getClass();
        if (!pk2.h.a(cVar, th3)) {
            lb.l0.R0(th3);
            return;
        }
        boolean z13 = this.f76582d;
        uj2.v vVar = this.f76579a;
        if (z13) {
            if (decrementAndGet() == 0) {
                cVar.getClass();
                vVar.onError(pk2.h.b(cVar));
                return;
            }
            return;
        }
        dispose();
        if (getAndSet(0) > 0) {
            cVar.getClass();
            vVar.onError(pk2.h.b(cVar));
        }
    }

    @Override // dk2.i
    public final Object poll() {
        return null;
    }

    @Override // dk2.e
    public final int requestFusion(int i13) {
        return 2;
    }
}
