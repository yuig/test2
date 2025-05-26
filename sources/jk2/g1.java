package jk2;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class g1 extends AtomicReference implements xj2.c, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.v f76478a;

    /* renamed from: b, reason: collision with root package name */
    public long f76479b;

    public g1(uj2.v vVar) {
        this.f76478a = vVar;
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
        if (get() != bk2.c.DISPOSED) {
            long j13 = this.f76479b;
            this.f76479b = 1 + j13;
            this.f76478a.c(Long.valueOf(j13));
        }
    }
}
