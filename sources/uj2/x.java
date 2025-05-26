package uj2;

/* loaded from: classes4.dex */
public final class x implements xj2.c, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f122346a;

    /* renamed from: b, reason: collision with root package name */
    public final z f122347b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f122348c;

    public x(Runnable runnable, z zVar) {
        this.f122346a = runnable;
        this.f122347b = zVar;
    }

    @Override // xj2.c
    public final void dispose() {
        this.f122348c = true;
        this.f122347b.dispose();
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f122348c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f122348c) {
            return;
        }
        try {
            this.f122346a.run();
        } catch (Throwable th3) {
            bp1.h.H(th3);
            this.f122347b.dispose();
            throw pk2.h.d(th3);
        }
    }
}
