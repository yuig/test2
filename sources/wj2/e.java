package wj2;

import android.os.Handler;
import lb.l0;

/* loaded from: classes2.dex */
public final class e implements Runnable, xj2.c {

    /* renamed from: a */
    public final Handler f130038a;

    /* renamed from: b */
    public final Runnable f130039b;

    /* renamed from: c */
    public volatile boolean f130040c;

    public e(Handler handler, Runnable runnable) {
        this.f130038a = handler;
        this.f130039b = runnable;
    }

    @Override // xj2.c
    public final void dispose() {
        this.f130038a.removeCallbacks(this);
        this.f130040c = true;
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f130040c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f130039b.run();
        } catch (Throwable th3) {
            l0.R0(th3);
        }
    }
}
