package mk2;

import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import lb.l0;

/* loaded from: classes4.dex */
public final class y extends uj2.z {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f87429a;

    /* renamed from: b, reason: collision with root package name */
    public final xj2.b f87430b = new xj2.b();

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f87431c;

    public y(ScheduledExecutorService scheduledExecutorService) {
        this.f87429a = scheduledExecutorService;
    }

    @Override // uj2.z
    public final xj2.c c(Runnable runnable, long j13, TimeUnit timeUnit) {
        if (this.f87431c) {
            return bk2.d.INSTANCE;
        }
        ck2.i.b(runnable, "run is null");
        w wVar = new w(runnable, this.f87430b);
        this.f87430b.a(wVar);
        try {
            wVar.a(j13 <= 0 ? this.f87429a.submit((Callable) wVar) : this.f87429a.schedule((Callable) wVar, j13, timeUnit));
            return wVar;
        } catch (RejectedExecutionException e13) {
            dispose();
            l0.R0(e13);
            return bk2.d.INSTANCE;
        }
    }

    @Override // xj2.c
    public final void dispose() {
        if (this.f87431c) {
            return;
        }
        this.f87431c = true;
        this.f87430b.dispose();
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f87431c;
    }
}
