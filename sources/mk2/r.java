package mk2;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import lb.l0;

/* loaded from: classes2.dex */
public class r extends uj2.z {

    /* renamed from: a */
    public final ScheduledExecutorService f87415a;

    /* renamed from: b */
    public volatile boolean f87416b;

    public r(ThreadFactory threadFactory) {
        boolean z13 = x.f87425a;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (x.f87425a && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            x.f87428d.put((ScheduledThreadPoolExecutor) newScheduledThreadPool, newScheduledThreadPool);
        }
        this.f87415a = newScheduledThreadPool;
    }

    @Override // uj2.z
    public final xj2.c b(Runnable runnable) {
        return c(runnable, 0L, null);
    }

    @Override // uj2.z
    public final xj2.c c(Runnable runnable, long j13, TimeUnit timeUnit) {
        return this.f87416b ? bk2.d.INSTANCE : e(runnable, j13, timeUnit, null);
    }

    @Override // xj2.c
    public final void dispose() {
        if (this.f87416b) {
            return;
        }
        this.f87416b = true;
        this.f87415a.shutdownNow();
    }

    public final w e(Runnable runnable, long j13, TimeUnit timeUnit, bk2.b bVar) {
        ck2.i.b(runnable, "run is null");
        w wVar = new w(runnable, bVar);
        if (bVar != null && !bVar.a(wVar)) {
            return wVar;
        }
        ScheduledExecutorService scheduledExecutorService = this.f87415a;
        try {
            wVar.a(j13 <= 0 ? scheduledExecutorService.submit((Callable) wVar) : scheduledExecutorService.schedule((Callable) wVar, j13, timeUnit));
        } catch (RejectedExecutionException e13) {
            if (bVar != null) {
                bVar.b(wVar);
            }
            l0.R0(e13);
        }
        return wVar;
    }

    public final void f() {
        if (this.f87416b) {
            return;
        }
        this.f87416b = true;
        this.f87415a.shutdown();
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f87416b;
    }
}
