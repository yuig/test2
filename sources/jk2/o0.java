package jk2;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class o0 extends AtomicReference implements uj2.d, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f76618a;

    public o0(p0 p0Var) {
        this.f76618a = p0Var;
    }

    @Override // uj2.d
    public final void a() {
        p0 p0Var = this.f76618a;
        p0Var.f76630e.c(this);
        p0Var.a();
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
        p0 p0Var = this.f76618a;
        p0Var.f76630e.c(this);
        p0Var.onError(th3);
    }
}
