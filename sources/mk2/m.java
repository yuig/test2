package mk2;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final long f87394a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f87395b;

    /* renamed from: c, reason: collision with root package name */
    public final xj2.b f87396c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f87397d;

    /* renamed from: e, reason: collision with root package name */
    public final ScheduledFuture f87398e;

    /* renamed from: f, reason: collision with root package name */
    public final ThreadFactory f87399f;

    public m(long j13, TimeUnit timeUnit, ThreadFactory threadFactory) {
        ScheduledExecutorService scheduledExecutorService;
        ScheduledFuture<?> scheduledFuture;
        long nanos = timeUnit != null ? timeUnit.toNanos(j13) : 0L;
        this.f87394a = nanos;
        this.f87395b = new ConcurrentLinkedQueue();
        this.f87396c = new xj2.b();
        this.f87399f = threadFactory;
        if (timeUnit != null) {
            scheduledExecutorService = Executors.newScheduledThreadPool(1, p.f87406e);
            scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
        } else {
            scheduledExecutorService = null;
            scheduledFuture = null;
        }
        this.f87397d = scheduledExecutorService;
        this.f87398e = scheduledFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f87395b;
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        long nanoTime = System.nanoTime();
        Iterator it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            if (oVar.f87404c > nanoTime) {
                return;
            }
            if (concurrentLinkedQueue.remove(oVar)) {
                this.f87396c.b(oVar);
            }
        }
    }
}
