package gk2;

/* loaded from: classes2.dex */
public final class m2 implements uj2.k, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.m f65537a;

    /* renamed from: b, reason: collision with root package name */
    public xp2.c f65538b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f65539c;

    /* renamed from: d, reason: collision with root package name */
    public Object f65540d;

    public m2(uj2.m mVar) {
        this.f65537a = mVar;
    }

    @Override // xp2.b
    public final void a() {
        if (this.f65539c) {
            return;
        }
        this.f65539c = true;
        this.f65538b = ok2.g.CANCELLED;
        Object obj = this.f65540d;
        this.f65540d = null;
        uj2.m mVar = this.f65537a;
        if (obj == null) {
            mVar.a();
        } else {
            mVar.onSuccess(obj);
        }
    }

    @Override // xp2.b
    public final void c(Object obj) {
        if (this.f65539c) {
            return;
        }
        if (this.f65540d == null) {
            this.f65540d = obj;
            return;
        }
        this.f65539c = true;
        this.f65538b.cancel();
        this.f65538b = ok2.g.CANCELLED;
        this.f65537a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
    }

    @Override // xp2.b
    public final void d(xp2.c cVar) {
        if (ok2.g.validate(this.f65538b, cVar)) {
            this.f65538b = cVar;
            this.f65537a.b(this);
            cVar.request(Long.MAX_VALUE);
        }
    }

    @Override // xj2.c
    public final void dispose() {
        this.f65538b.cancel();
        this.f65538b = ok2.g.CANCELLED;
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f65538b == ok2.g.CANCELLED;
    }

    @Override // xp2.b
    public final void onError(Throwable th3) {
        if (this.f65539c) {
            lb.l0.R0(th3);
            return;
        }
        this.f65539c = true;
        this.f65538b = ok2.g.CANCELLED;
        this.f65537a.onError(th3);
    }
}
