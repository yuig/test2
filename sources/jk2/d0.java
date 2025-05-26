package jk2;

/* loaded from: classes4.dex */
public final class d0 implements uj2.v, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.m f76431a;

    /* renamed from: b, reason: collision with root package name */
    public final long f76432b;

    /* renamed from: c, reason: collision with root package name */
    public xj2.c f76433c;

    /* renamed from: d, reason: collision with root package name */
    public long f76434d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f76435e;

    public d0(uj2.m mVar, long j13) {
        this.f76431a = mVar;
        this.f76432b = j13;
    }

    @Override // uj2.v
    public final void a() {
        if (this.f76435e) {
            return;
        }
        this.f76435e = true;
        this.f76431a.a();
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        if (bk2.c.validate(this.f76433c, cVar)) {
            this.f76433c = cVar;
            this.f76431a.b(this);
        }
    }

    @Override // uj2.v
    public final void c(Object obj) {
        if (this.f76435e) {
            return;
        }
        long j13 = this.f76434d;
        if (j13 != this.f76432b) {
            this.f76434d = j13 + 1;
            return;
        }
        this.f76435e = true;
        this.f76433c.dispose();
        this.f76431a.onSuccess(obj);
    }

    @Override // xj2.c
    public final void dispose() {
        this.f76433c.dispose();
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f76433c.isDisposed();
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        if (this.f76435e) {
            lb.l0.R0(th3);
        } else {
            this.f76435e = true;
            this.f76431a.onError(th3);
        }
    }
}
