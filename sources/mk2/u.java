package mk2;

import lb.l0;

/* loaded from: classes2.dex */
public final class u extends a implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        this.f87350b = Thread.currentThread();
        try {
            this.f87349a.run();
            this.f87350b = null;
        } catch (Throwable th3) {
            this.f87350b = null;
            lazySet(a.f87347c);
            l0.R0(th3);
        }
    }
}
