package mk2;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class g extends AtomicReference implements Runnable, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final bk2.a f87374a;

    /* renamed from: b, reason: collision with root package name */
    public final bk2.a f87375b;

    public g(Runnable runnable) {
        super(runnable);
        this.f87374a = new bk2.a();
        this.f87375b = new bk2.a();
    }

    @Override // xj2.c
    public final void dispose() {
        if (getAndSet(null) != null) {
            this.f87374a.dispose();
            this.f87375b.dispose();
        }
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return get() == null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bk2.a aVar = this.f87375b;
        bk2.a aVar2 = this.f87374a;
        Runnable runnable = (Runnable) get();
        if (runnable != null) {
            try {
                runnable.run();
                lazySet(null);
                bk2.c cVar = bk2.c.DISPOSED;
                aVar2.lazySet(cVar);
                aVar.lazySet(cVar);
            } catch (Throwable th3) {
                lazySet(null);
                aVar2.lazySet(bk2.c.DISPOSED);
                aVar.lazySet(bk2.c.DISPOSED);
                throw th3;
            }
        }
    }
}
