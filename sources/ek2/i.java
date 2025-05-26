package ek2;

import io.reactivex.exceptions.OnErrorNotImplementedException;
import java.util.concurrent.atomic.AtomicReference;
import lb.l0;

/* loaded from: classes4.dex */
public final class i extends AtomicReference implements uj2.d, xj2.c {
    @Override // uj2.d
    public final void a() {
        lazySet(bk2.c.DISPOSED);
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
        return get() == bk2.c.DISPOSED;
    }

    @Override // uj2.d
    public final void onError(Throwable th3) {
        lazySet(bk2.c.DISPOSED);
        l0.R0(new OnErrorNotImplementedException(th3));
    }
}
