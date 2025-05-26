package mk2;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class h extends AtomicBoolean implements Runnable, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f87376a;

    public h(Runnable runnable) {
        this.f87376a = runnable;
    }

    @Override // xj2.c
    public final void dispose() {
        lazySet(true);
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return get();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get()) {
            return;
        }
        try {
            this.f87376a.run();
        } finally {
            lazySet(true);
        }
    }
}
