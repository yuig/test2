package kk2;

import java.util.concurrent.atomic.AtomicReference;
import uj2.f0;

/* loaded from: classes2.dex */
public final class u extends AtomicReference implements uj2.d0, xj2.c, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.d0 f79981a;

    /* renamed from: b, reason: collision with root package name */
    public final bk2.a f79982b = new bk2.a();

    /* renamed from: c, reason: collision with root package name */
    public final f0 f79983c;

    public u(uj2.d0 d0Var, f0 f0Var) {
        this.f79981a = d0Var;
        this.f79983c = f0Var;
    }

    @Override // uj2.d0
    public final void b(xj2.c cVar) {
        bk2.c.setOnce(this, cVar);
    }

    @Override // xj2.c
    public final void dispose() {
        bk2.c.dispose(this);
        this.f79982b.dispose();
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return bk2.c.isDisposed((xj2.c) get());
    }

    @Override // uj2.d0
    public final void onError(Throwable th3) {
        this.f79981a.onError(th3);
    }

    @Override // uj2.d0
    public final void onSuccess(Object obj) {
        this.f79981a.onSuccess(obj);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((uj2.b0) this.f79983c).p(this);
    }
}
