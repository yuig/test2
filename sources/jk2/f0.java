package jk2;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class f0 implements uj2.v, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.d0 f76451a;

    /* renamed from: b, reason: collision with root package name */
    public final long f76452b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f76453c;

    /* renamed from: d, reason: collision with root package name */
    public xj2.c f76454d;

    /* renamed from: e, reason: collision with root package name */
    public long f76455e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f76456f;

    public f0(uj2.d0 d0Var, long j13, Object obj) {
        this.f76451a = d0Var;
        this.f76452b = j13;
        this.f76453c = obj;
    }

    @Override // uj2.v
    public final void a() {
        if (this.f76456f) {
            return;
        }
        this.f76456f = true;
        uj2.d0 d0Var = this.f76451a;
        Object obj = this.f76453c;
        if (obj != null) {
            d0Var.onSuccess(obj);
        } else {
            d0Var.onError(new NoSuchElementException());
        }
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        if (bk2.c.validate(this.f76454d, cVar)) {
            this.f76454d = cVar;
            this.f76451a.b(this);
        }
    }

    @Override // uj2.v
    public final void c(Object obj) {
        if (this.f76456f) {
            return;
        }
        long j13 = this.f76455e;
        if (j13 != this.f76452b) {
            this.f76455e = j13 + 1;
            return;
        }
        this.f76456f = true;
        this.f76454d.dispose();
        this.f76451a.onSuccess(obj);
    }

    @Override // xj2.c
    public final void dispose() {
        this.f76454d.dispose();
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f76454d.isDisposed();
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        if (this.f76456f) {
            lb.l0.R0(th3);
        } else {
            this.f76456f = true;
            this.f76451a.onError(th3);
        }
    }
}
