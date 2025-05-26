package jk2;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class l0 extends AtomicReference implements uj2.d, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0 f76571a;

    public l0(m0 m0Var) {
        this.f76571a = m0Var;
    }

    @Override // uj2.d
    public final void a() {
        m0 m0Var = this.f76571a;
        m0Var.f76583e.c(this);
        m0Var.a();
    }

    @Override // uj2.d
    public final void b(xj2.c cVar) {
        bk2.c.setOnce(this, cVar);
    }

    @Override // xj2.c
    public final void dispose() {
        bk2.c.dispose(this);
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return bk2.c.isDisposed((xj2.c) get());
    }

    @Override // uj2.d
    public final void onError(Throwable th3) {
        m0 m0Var = this.f76571a;
        m0Var.f76583e.c(this);
        m0Var.onError(th3);
    }
}
