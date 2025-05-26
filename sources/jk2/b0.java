package jk2;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class b0 implements uj2.v, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.v f76400a;

    /* renamed from: b, reason: collision with root package name */
    public final long f76401b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f76402c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f76403d;

    /* renamed from: e, reason: collision with root package name */
    public xj2.c f76404e;

    /* renamed from: f, reason: collision with root package name */
    public long f76405f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f76406g;

    public b0(uj2.v vVar, long j13, Object obj, boolean z13) {
        this.f76400a = vVar;
        this.f76401b = j13;
        this.f76402c = obj;
        this.f76403d = z13;
    }

    @Override // uj2.v
    public final void a() {
        if (this.f76406g) {
            return;
        }
        this.f76406g = true;
        uj2.v vVar = this.f76400a;
        Object obj = this.f76402c;
        if (obj == null && this.f76403d) {
            vVar.onError(new NoSuchElementException());
            return;
        }
        if (obj != null) {
            vVar.c(obj);
        }
        vVar.a();
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        if (bk2.c.validate(this.f76404e, cVar)) {
            this.f76404e = cVar;
            this.f76400a.b(this);
        }
    }

    @Override // uj2.v
    public final void c(Object obj) {
        if (this.f76406g) {
            return;
        }
        long j13 = this.f76405f;
        if (j13 != this.f76401b) {
            this.f76405f = j13 + 1;
            return;
        }
        this.f76406g = true;
        this.f76404e.dispose();
        uj2.v vVar = this.f76400a;
        vVar.c(obj);
        vVar.a();
    }

    @Override // xj2.c
    public final void dispose() {
        this.f76404e.dispose();
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f76404e.isDisposed();
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        if (this.f76406g) {
            lb.l0.R0(th3);
        } else {
            this.f76406g = true;
            this.f76400a.onError(th3);
        }
    }
}
