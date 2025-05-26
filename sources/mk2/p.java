package mk2;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class p extends uj2.a0 {

    /* renamed from: d, reason: collision with root package name */
    public static final t f87405d;

    /* renamed from: e, reason: collision with root package name */
    public static final t f87406e;

    /* renamed from: h, reason: collision with root package name */
    public static final o f87409h;

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f87410i;

    /* renamed from: j, reason: collision with root package name */
    public static final m f87411j;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f87412c;

    /* renamed from: g, reason: collision with root package name */
    public static final TimeUnit f87408g = TimeUnit.SECONDS;

    /* renamed from: f, reason: collision with root package name */
    public static final long f87407f = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    static {
        o oVar = new o(new t("RxCachedThreadSchedulerShutdown"));
        f87409h = oVar;
        oVar.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        t tVar = new t("RxCachedThreadScheduler", max, false);
        f87405d = tVar;
        f87406e = new t("RxCachedWorkerPoolEvictor", max, false);
        f87410i = Boolean.getBoolean("rx2.io-scheduled-release");
        m mVar = new m(0L, null, tVar);
        f87411j = mVar;
        mVar.f87396c.dispose();
        ScheduledFuture scheduledFuture = mVar.f87398e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = mVar.f87397d;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public p() {
        AtomicReference atomicReference;
        m mVar = f87411j;
        this.f87412c = new AtomicReference(mVar);
        m mVar2 = new m(f87407f, f87408g, f87405d);
        do {
            atomicReference = this.f87412c;
            if (atomicReference.compareAndSet(mVar, mVar2)) {
                return;
            }
        } while (atomicReference.get() == mVar);
        mVar2.f87396c.dispose();
        ScheduledFuture scheduledFuture = mVar2.f87398e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = mVar2.f87397d;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    @Override // uj2.a0
    public final uj2.z a() {
        return new n((m) this.f87412c.get());
    }
}
