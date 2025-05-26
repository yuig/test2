package uj2;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class z implements xj2.c {
    public static long a(TimeUnit timeUnit) {
        return !a0.f122337a ? timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS) : timeUnit.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    public xj2.c b(Runnable runnable) {
        return c(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public abstract xj2.c c(Runnable runnable, long j13, TimeUnit timeUnit);

    public final xj2.c d(Runnable runnable, long j13, long j14, TimeUnit timeUnit) {
        bk2.a aVar = new bk2.a();
        bk2.a aVar2 = new bk2.a(aVar);
        long nanos = timeUnit.toNanos(j14);
        long a13 = a(TimeUnit.NANOSECONDS);
        xj2.c c13 = c(new y(this, timeUnit.toNanos(j13) + a13, runnable, a13, aVar2, nanos), j13, timeUnit);
        if (c13 == bk2.d.INSTANCE) {
            return c13;
        }
        bk2.c.replace(aVar, c13);
        return aVar2;
    }
}
