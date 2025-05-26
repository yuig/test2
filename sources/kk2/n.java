package kk2;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class n extends AtomicReference implements uj2.d0, uj2.d, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.d f79963a;

    /* renamed from: b, reason: collision with root package name */
    public final ak2.f f79964b;

    public n(uj2.d dVar, ak2.f fVar) {
        this.f79963a = dVar;
        this.f79964b = fVar;
    }

    @Override // uj2.d
    public final void a() {
        this.f79963a.a();
    }

    @Override // uj2.d0
    public final void b(xj2.c cVar) {
        bk2.c.replace(this, cVar);
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
        this.f79963a.onError(th3);
    }

    @Override // uj2.d0
    public final void onSuccess(Object obj) {
        try {
            Object apply = this.f79964b.apply(obj);
            ck2.i.b(apply, "The mapper returned a null CompletableSource");
            uj2.f fVar = (uj2.f) apply;
            if (isDisposed()) {
                return;
            }
            ((uj2.b) fVar).j(this);
        } catch (Throwable th3) {
            bp1.h.H(th3);
            onError(th3);
        }
    }
}
