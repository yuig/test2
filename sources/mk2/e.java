package mk2;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import lb.l0;

/* loaded from: classes2.dex */
public final class e extends uj2.a0 {

    /* renamed from: d, reason: collision with root package name */
    public static final c f87368d;

    /* renamed from: e, reason: collision with root package name */
    public static final t f87369e;

    /* renamed from: f, reason: collision with root package name */
    public static final int f87370f;

    /* renamed from: g, reason: collision with root package name */
    public static final d f87371g;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f87372c;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int intValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (intValue > 0 && intValue <= availableProcessors) {
            availableProcessors = intValue;
        }
        f87370f = availableProcessors;
        d dVar = new d(new t("RxComputationShutdown"));
        f87371g = dVar;
        dVar.dispose();
        t tVar = new t("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f87369e = tVar;
        c cVar = new c(0, tVar);
        f87368d = cVar;
        for (d dVar2 : cVar.f87365b) {
            dVar2.dispose();
        }
    }

    public e() {
        AtomicReference atomicReference;
        c cVar = f87368d;
        this.f87372c = new AtomicReference(cVar);
        c cVar2 = new c(f87370f, f87369e);
        do {
            atomicReference = this.f87372c;
            if (atomicReference.compareAndSet(cVar, cVar2)) {
                return;
            }
        } while (atomicReference.get() == cVar);
        for (d dVar : cVar2.f87365b) {
            dVar.dispose();
        }
    }

    @Override // uj2.a0
    public final uj2.z a() {
        return new b(((c) this.f87372c.get()).a());
    }

    @Override // uj2.a0
    public final xj2.c c(Runnable runnable, long j13, TimeUnit timeUnit) {
        d a13 = ((c) this.f87372c.get()).a();
        a13.getClass();
        ck2.i.b(runnable, "run is null");
        v vVar = new v(runnable);
        ScheduledExecutorService scheduledExecutorService = a13.f87415a;
        try {
            vVar.a(j13 <= 0 ? scheduledExecutorService.submit(vVar) : scheduledExecutorService.schedule(vVar, j13, timeUnit));
            return vVar;
        } catch (RejectedExecutionException e13) {
            l0.R0(e13);
            return bk2.d.INSTANCE;
        }
    }

    @Override // uj2.a0
    public final xj2.c d(Runnable runnable, long j13, long j14, TimeUnit timeUnit) {
        d a13 = ((c) this.f87372c.get()).a();
        a13.getClass();
        if (j14 > 0) {
            u uVar = new u(runnable);
            try {
                uVar.a(a13.f87415a.scheduleAtFixedRate(uVar, j13, j14, timeUnit));
                return uVar;
            } catch (RejectedExecutionException e13) {
                l0.R0(e13);
                return bk2.d.INSTANCE;
            }
        }
        ScheduledExecutorService scheduledExecutorService = a13.f87415a;
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
