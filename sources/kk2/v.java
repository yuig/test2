package kk2;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class v extends AtomicReference implements uj2.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.d0 f79984a;

    public v(uj2.d0 d0Var) {
        this.f79984a = d0Var;
    }

    @Override // uj2.d0
    public final void b(xj2.c cVar) {
        bk2.c.setOnce(this, cVar);
    }

    @Override // uj2.d0
    public final void onError(Throwable th3) {
        this.f79984a.onError(th3);
    }

    @Override // uj2.d0
    public final void onSuccess(Object obj) {
        this.f79984a.onSuccess(obj);
    }
}
