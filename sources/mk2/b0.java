package mk2;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import oi.o5;
import oi.o6;

/* loaded from: classes4.dex */
public final class b0 extends uj2.z {

    /* renamed from: a, reason: collision with root package name */
    public final PriorityBlockingQueue f87360a = new PriorityBlockingQueue();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f87361b = new AtomicInteger();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f87362c = new AtomicInteger();

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f87363d;

    @Override // uj2.z
    public final xj2.c b(Runnable runnable) {
        return e(runnable, uj2.z.a(TimeUnit.MILLISECONDS));
    }

    @Override // uj2.z
    public final xj2.c c(Runnable runnable, long j13, TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(j13) + uj2.z.a(TimeUnit.MILLISECONDS);
        return e(new o5(runnable, this, millis, 2), millis);
    }

    @Override // xj2.c
    public final void dispose() {
        this.f87363d = true;
    }

    public final xj2.c e(Runnable runnable, long j13) {
        if (this.f87363d) {
            return bk2.d.INSTANCE;
        }
        a0 a0Var = new a0(runnable, Long.valueOf(j13), this.f87362c.incrementAndGet());
        this.f87360a.add(a0Var);
        if (this.f87361b.getAndIncrement() != 0) {
            return new xj2.e(new o6(21, this, a0Var));
        }
        int i13 = 1;
        while (!this.f87363d) {
            a0 a0Var2 = (a0) this.f87360a.poll();
            if (a0Var2 == null) {
                i13 = this.f87361b.addAndGet(-i13);
                if (i13 == 0) {
                    return bk2.d.INSTANCE;
                }
            } else if (!a0Var2.f87354d) {
                a0Var2.f87351a.run();
            }
        }
        this.f87360a.clear();
        return bk2.d.INSTANCE;
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f87363d;
    }
}
