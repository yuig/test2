package kk2;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class s extends AtomicReference implements uj2.d0, xj2.c, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.d0 f79974a;

    /* renamed from: b, reason: collision with root package name */
    public final uj2.a0 f79975b;

    /* renamed from: c, reason: collision with root package name */
    public Object f79976c;

    /* renamed from: d, reason: collision with root package name */
    public Throwable f79977d;

    public s(uj2.d0 d0Var, uj2.a0 a0Var) {
        this.f79974a = d0Var;
        this.f79975b = a0Var;
    }

    @Override // uj2.d0
    public final void b(xj2.c cVar) {
        if (bk2.c.setOnce(this, cVar)) {
            this.f79974a.b(this);
        }
    }

    @Override // xj2.c
    public final void dispose() {
        bk2.c.dispose(this);
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return bk2.c.isDisposed((xj2.c) get());
    }

    @Override // uj2.d0
    public final void onError(Throwable th3) {
        this.f79977d = th3;
        bk2.c.replace(this, this.f79975b.b(this));
    }

    @Override // uj2.d0
    public final void onSuccess(Object obj) {
        this.f79976c = obj;
        bk2.c.replace(this, this.f79975b.b(this));
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th3 = this.f79977d;
        uj2.d0 d0Var = this.f79974a;
        if (th3 != null) {
            d0Var.onError(th3);
        } else {
            d0Var.onSuccess(this.f79976c);
        }
    }
}
