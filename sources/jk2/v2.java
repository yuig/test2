package jk2;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class v2 extends AtomicReference implements xj2.c, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.v f76728a;

    public v2(uj2.v vVar) {
        this.f76728a = vVar;
    }

    @Override // xj2.c
    public final void dispose() {
        bk2.c.dispose(this);
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return get() == bk2.c.DISPOSED;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (isDisposed()) {
            return;
        }
        uj2.v vVar = this.f76728a;
        vVar.c(0L);
        lazySet(bk2.d.INSTANCE);
        vVar.a();
    }
}
