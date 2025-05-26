package mk2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import lb.l0;

/* loaded from: classes4.dex */
public final class l implements Callable, xj2.c {

    /* renamed from: f, reason: collision with root package name */
    public static final FutureTask f87388f = new FutureTask(ck2.i.f27922b, null);

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f87389a;

    /* renamed from: d, reason: collision with root package name */
    public final ExecutorService f87392d;

    /* renamed from: e, reason: collision with root package name */
    public Thread f87393e;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f87391c = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f87390b = new AtomicReference();

    public l(Runnable runnable, ScheduledExecutorService scheduledExecutorService) {
        this.f87389a = runnable;
        this.f87392d = scheduledExecutorService;
    }

    public final void a(Future future) {
        while (true) {
            AtomicReference atomicReference = this.f87391c;
            Future future2 = (Future) atomicReference.get();
            if (future2 == f87388f) {
                future.cancel(this.f87393e != Thread.currentThread());
                return;
            }
            while (!atomicReference.compareAndSet(future2, future)) {
                if (atomicReference.get() != future2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.f87393e = Thread.currentThread();
        try {
            this.f87389a.run();
            Future submit = this.f87392d.submit(this);
            loop0: while (true) {
                AtomicReference atomicReference = this.f87390b;
                Future future = (Future) atomicReference.get();
                if (future != f87388f) {
                    while (!atomicReference.compareAndSet(future, submit)) {
                        if (atomicReference.get() != future) {
                            break;
                        }
                    }
                    break loop0;
                }
                submit.cancel(this.f87393e != Thread.currentThread());
            }
            this.f87393e = null;
        } catch (Throwable th3) {
            this.f87393e = null;
            l0.R0(th3);
        }
        return null;
    }

    @Override // xj2.c
    public final void dispose() {
        AtomicReference atomicReference = this.f87391c;
        FutureTask futureTask = f87388f;
        Future future = (Future) atomicReference.getAndSet(futureTask);
        if (future != null && future != futureTask) {
            future.cancel(this.f87393e != Thread.currentThread());
        }
        Future future2 = (Future) this.f87390b.getAndSet(futureTask);
        if (future2 == null || future2 == futureTask) {
            return;
        }
        future2.cancel(this.f87393e != Thread.currentThread());
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f87391c.get() == f87388f;
    }
}
