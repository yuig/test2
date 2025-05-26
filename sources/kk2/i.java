package kk2;

import java.util.concurrent.atomic.AtomicInteger;
import lb.l0;

/* loaded from: classes2.dex */
public final class i extends AtomicInteger implements uj2.d0, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.d0 f79949a;

    /* renamed from: b, reason: collision with root package name */
    public final ak2.a f79950b;

    /* renamed from: c, reason: collision with root package name */
    public xj2.c f79951c;

    public i(uj2.d0 d0Var, ak2.a aVar) {
        this.f79949a = d0Var;
        this.f79950b = aVar;
    }

    public final void a() {
        if (compareAndSet(0, 1)) {
            try {
                this.f79950b.run();
            } catch (Throwable th3) {
                bp1.h.H(th3);
                l0.R0(th3);
            }
        }
    }

    @Override // uj2.d0
    public final void b(xj2.c cVar) {
        if (bk2.c.validate(this.f79951c, cVar)) {
            this.f79951c = cVar;
            this.f79949a.b(this);
        }
    }

    @Override // xj2.c
    public final void dispose() {
        this.f79951c.dispose();
        a();
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f79951c.isDisposed();
    }

    @Override // uj2.d0
    public final void onError(Throwable th3) {
        this.f79949a.onError(th3);
        a();
    }

    @Override // uj2.d0
    public final void onSuccess(Object obj) {
        this.f79949a.onSuccess(obj);
        a();
    }
}
