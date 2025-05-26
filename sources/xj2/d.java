package xj2;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class d extends AtomicReference implements c {
    public abstract void a(Object obj);

    @Override // xj2.c
    public final void dispose() {
        Object andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        a(andSet);
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return get() == null;
    }
}
