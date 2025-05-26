package uj2;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class a0 {

    /* renamed from: a */
    public static final boolean f122337a = Boolean.getBoolean("rx2.scheduler.use-nanotime");

    /* renamed from: b */
    public static final long f122338b = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    public abstract z a();

    public xj2.c b(Runnable runnable) {
        return c(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public xj2.c c(Runnable runnable, long j13, TimeUnit timeUnit) {
        z a13 = a();
        ck2.i.b(runnable, "run is null");
        w wVar = new w(runnable, a13);
        a13.c(wVar, j13, timeUnit);
        return wVar;
    }

    public xj2.c d(Runnable runnable, long j13, long j14, TimeUnit timeUnit) {
        z a13 = a();
        x xVar = new x(runnable, a13);
        xj2.c d2 = a13.d(xVar, j13, j14, timeUnit);
        return d2 == bk2.d.INSTANCE ? d2 : xVar;
    }
}
