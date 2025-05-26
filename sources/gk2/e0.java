package gk2;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class e0 implements uj2.k, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.d0 f65383a;

    /* renamed from: b, reason: collision with root package name */
    public final long f65384b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f65385c;

    /* renamed from: d, reason: collision with root package name */
    public xp2.c f65386d;

    /* renamed from: e, reason: collision with root package name */
    public long f65387e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f65388f;

    public e0(uj2.d0 d0Var, long j13, Object obj) {
        this.f65383a = d0Var;
        this.f65384b = j13;
        this.f65385c = obj;
    }

    @Override // xp2.b
    public final void a() {
        this.f65386d = ok2.g.CANCELLED;
        if (this.f65388f) {
            return;
        }
        this.f65388f = true;
        uj2.d0 d0Var = this.f65383a;
        Object obj = this.f65385c;
        if (obj != null) {
            d0Var.onSuccess(obj);
        } else {
            d0Var.onError(new NoSuchElementException());
        }
    }

    @Override // xp2.b
    public final void c(Object obj) {
        if (this.f65388f) {
            return;
        }
        long j13 = this.f65387e;
        if (j13 != this.f65384b) {
            this.f65387e = j13 + 1;
            return;
        }
        this.f65388f = true;
        this.f65386d.cancel();
        this.f65386d = ok2.g.CANCELLED;
        this.f65383a.onSuccess(obj);
    }

    @Override // xp2.b
    public final void d(xp2.c cVar) {
        if (ok2.g.validate(this.f65386d, cVar)) {
            this.f65386d = cVar;
            this.f65383a.b(this);
            cVar.request(Long.MAX_VALUE);
        }
    }

    @Override // xj2.c
    public final void dispose() {
        this.f65386d.cancel();
        this.f65386d = ok2.g.CANCELLED;
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f65386d == ok2.g.CANCELLED;
    }

    @Override // xp2.b
    public final void onError(Throwable th3) {
        if (this.f65388f) {
            lb.l0.R0(th3);
            return;
        }
        this.f65388f = true;
        this.f65386d = ok2.g.CANCELLED;
        this.f65383a.onError(th3);
    }
}
