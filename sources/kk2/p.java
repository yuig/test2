package kk2;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class p extends AtomicReference implements uj2.d0, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.m f79971a;

    /* renamed from: b, reason: collision with root package name */
    public final ak2.f f79972b;

    public p(uj2.m mVar, ak2.f fVar) {
        this.f79971a = mVar;
        this.f79972b = fVar;
    }

    @Override // uj2.d0
    public final void b(xj2.c cVar) {
        if (bk2.c.setOnce(this, cVar)) {
            this.f79971a.b(this);
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
        this.f79971a.onError(th3);
    }

    @Override // uj2.d0
    public final void onSuccess(Object obj) {
        try {
            Object apply = this.f79972b.apply(obj);
            ck2.i.b(apply, "The mapper returned a null MaybeSource");
            uj2.n nVar = (uj2.n) apply;
            if (isDisposed()) {
                return;
            }
            ((uj2.l) nVar).f(new hk2.d(this, this.f79971a, 3));
        } catch (Throwable th3) {
            bp1.h.H(th3);
            onError(th3);
        }
    }
}
