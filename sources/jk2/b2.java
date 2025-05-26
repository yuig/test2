package jk2;

/* loaded from: classes2.dex */
public final class b2 implements uj2.v, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.m f76409a;

    /* renamed from: b, reason: collision with root package name */
    public xj2.c f76410b;

    /* renamed from: c, reason: collision with root package name */
    public Object f76411c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f76412d;

    public b2(uj2.m mVar) {
        this.f76409a = mVar;
    }

    @Override // uj2.v
    public final void a() {
        if (this.f76412d) {
            return;
        }
        this.f76412d = true;
        Object obj = this.f76411c;
        this.f76411c = null;
        uj2.m mVar = this.f76409a;
        if (obj == null) {
            mVar.a();
        } else {
            mVar.onSuccess(obj);
        }
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        if (bk2.c.validate(this.f76410b, cVar)) {
            this.f76410b = cVar;
            this.f76409a.b(this);
        }
    }

    @Override // uj2.v
    public final void c(Object obj) {
        if (this.f76412d) {
            return;
        }
        if (this.f76411c == null) {
            this.f76411c = obj;
            return;
        }
        this.f76412d = true;
        this.f76410b.dispose();
        this.f76409a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
    }

    @Override // xj2.c
    public final void dispose() {
        this.f76410b.dispose();
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f76410b.isDisposed();
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        if (this.f76412d) {
            lb.l0.R0(th3);
        } else {
            this.f76412d = true;
            this.f76409a.onError(th3);
        }
    }
}
