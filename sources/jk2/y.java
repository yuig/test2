package jk2;

/* loaded from: classes2.dex */
public final class y extends ek2.b implements uj2.v {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.v f76758a;

    /* renamed from: b, reason: collision with root package name */
    public final ak2.a f76759b;

    /* renamed from: c, reason: collision with root package name */
    public xj2.c f76760c;

    /* renamed from: d, reason: collision with root package name */
    public dk2.d f76761d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f76762e;

    public y(uj2.v vVar, ak2.a aVar) {
        this.f76758a = vVar;
        this.f76759b = aVar;
    }

    @Override // uj2.v
    public final void a() {
        this.f76758a.a();
        d();
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        if (bk2.c.validate(this.f76760c, cVar)) {
            this.f76760c = cVar;
            if (cVar instanceof dk2.d) {
                this.f76761d = (dk2.d) cVar;
            }
            this.f76758a.b(this);
        }
    }

    @Override // uj2.v
    public final void c(Object obj) {
        this.f76758a.c(obj);
    }

    @Override // dk2.i
    public final void clear() {
        this.f76761d.clear();
    }

    public final void d() {
        if (compareAndSet(0, 1)) {
            try {
                this.f76759b.run();
            } catch (Throwable th3) {
                bp1.h.H(th3);
                lb.l0.R0(th3);
            }
        }
    }

    @Override // xj2.c
    public final void dispose() {
        this.f76760c.dispose();
        d();
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f76760c.isDisposed();
    }

    @Override // dk2.i
    public final boolean isEmpty() {
        return this.f76761d.isEmpty();
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        this.f76758a.onError(th3);
        d();
    }

    @Override // dk2.i
    public final Object poll() {
        Object poll = this.f76761d.poll();
        if (poll == null && this.f76762e) {
            d();
        }
        return poll;
    }

    @Override // dk2.e
    public final int requestFusion(int i13) {
        dk2.d dVar = this.f76761d;
        if (dVar == null || (i13 & 4) != 0) {
            return 0;
        }
        int requestFusion = dVar.requestFusion(i13);
        if (requestFusion != 0) {
            this.f76762e = requestFusion == 1;
        }
        return requestFusion;
    }
}
