package mk2;

import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import lb.l0;

/* loaded from: classes2.dex */
public final class z extends uj2.a0 {

    /* renamed from: d, reason: collision with root package name */
    public static final t f87432d;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f87433c;

    static {
        Executors.newScheduledThreadPool(0).shutdown();
        f87432d = new t("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public z() {
        AtomicReference atomicReference = new AtomicReference();
        this.f87433c = atomicReference;
        boolean z13 = x.f87425a;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, f87432d);
        if (x.f87425a && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            x.f87428d.put((ScheduledThreadPoolExecutor) newScheduledThreadPool, newScheduledThreadPool);
        }
        atomicReference.lazySet(newScheduledThreadPool);
    }

    @Override // uj2.a0
    public final uj2.z a() {
        return new y((ScheduledExecutorService) this.f87433c.get());
    }

    @Override // uj2.a0
    public final xj2.c c(Runnable runnable, long j13, TimeUnit timeUnit) {
        ck2.i.b(runnable, "run is null");
        v vVar = new v(runnable);
        AtomicReference atomicReference = this.f87433c;
        try {
            vVar.a(j13 <= 0 ? ((ScheduledExecutorService) atomicReference.get()).submit(vVar) : ((ScheduledExecutorService) atomicReference.get()).schedule(vVar, j13, timeUnit));
            return vVar;
        } catch (RejectedExecutionException e13) {
            l0.R0(e13);
            return bk2.d.INSTANCE;
        }
    }

    @Override // uj2.a0
    public final xj2.c d(Runnable runnable, long j13, long j14, TimeUnit timeUnit) {
        AtomicReference atomicReference = this.f87433c;
        if (j14 > 0) {
            u uVar = new u(runnable);
            try {
                uVar.a(((ScheduledExecutorService) atomicReference.get()).scheduleAtFixedRate(uVar, j13, j14, timeUnit));
                return uVar;
            } catch (RejectedExecutionException e13) {
                l0.R0(e13);
                return bk2.d.INSTANCE;
            }
        }
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) atomicReference.get();
        l lVar = new l(runnable, scheduledExecutorService);
        try {
            lVar.a(j13 <= 0 ? scheduledExecutorService.submit(lVar) : scheduledExecutorService.schedule(lVar, j13, timeUnit));
            return lVar;
        } catch (RejectedExecutionException e14) {
            l0.R0(e14);
            return bk2.d.INSTANCE;
        }
    }
}
