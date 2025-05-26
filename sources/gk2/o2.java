package gk2;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class o2 implements uj2.k, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.d0 f65565a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f65566b;

    /* renamed from: c, reason: collision with root package name */
    public xp2.c f65567c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f65568d;

    /* renamed from: e, reason: collision with root package name */
    public Object f65569e;

    public o2(uj2.d0 d0Var, Object obj) {
        this.f65565a = d0Var;
        this.f65566b = obj;
    }

    @Override // xp2.b
    public final void a() {
        if (this.f65568d) {
            return;
        }
        this.f65568d = true;
        this.f65567c = ok2.g.CANCELLED;
        Object obj = this.f65569e;
        this.f65569e = null;
        if (obj == null) {
            obj = this.f65566b;
        }
        uj2.d0 d0Var = this.f65565a;
        if (obj != null) {
            d0Var.onSuccess(obj);
        } else {
            d0Var.onError(new NoSuchElementException());
        }
    }

    @Override // xp2.b
    public final void c(Object obj) {
        if (this.f65568d) {
            return;
        }
        if (this.f65569e == null) {
            this.f65569e = obj;
            return;
        }
        this.f65568d = true;
        this.f65567c.cancel();
        this.f65567c = ok2.g.CANCELLED;
        this.f65565a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
    }

    @Override // xp2.b
    public final void d(xp2.c cVar) {
        if (ok2.g.validate(this.f65567c, cVar)) {
            this.f65567c = cVar;
            this.f65565a.b(this);
            cVar.request(Long.MAX_VALUE);
        }
    }

    @Override // xj2.c
    public final void dispose() {
        this.f65567c.cancel();
        this.f65567c = ok2.g.CANCELLED;
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f65567c == ok2.g.CANCELLED;
    }

    @Override // xp2.b
    public final void onError(Throwable th3) {
        if (this.f65568d) {
            lb.l0.R0(th3);
            return;
        }
        this.f65568d = true;
        this.f65567c = ok2.g.CANCELLED;
        this.f65565a.onError(th3);
    }
}
