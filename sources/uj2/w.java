package uj2;

/* loaded from: classes2.dex */
public final class w implements xj2.c, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f122343a;

    /* renamed from: b, reason: collision with root package name */
    public final z f122344b;

    /* renamed from: c, reason: collision with root package name */
    public Thread f122345c;

    public w(Runnable runnable, z zVar) {
        this.f122343a = runnable;
        this.f122344b = zVar;
    }

    @Override // xj2.c
    public final void dispose() {
        Thread thread = this.f122345c;
        Thread currentThread = Thread.currentThread();
        z zVar = this.f122344b;
        if (thread == currentThread && (zVar instanceof mk2.r)) {
            ((mk2.r) zVar).f();
        } else {
            zVar.dispose();
        }
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f122344b.isDisposed();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f122345c = Thread.currentThread();
        try {
            this.f122343a.run();
        } finally {
            dispose();
            this.f122345c = null;
        }
    }
}
