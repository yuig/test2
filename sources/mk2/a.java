package mk2;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class a extends AtomicReference implements xj2.c {

    /* renamed from: c, reason: collision with root package name */
    public static final FutureTask f87347c;

    /* renamed from: d, reason: collision with root package name */
    public static final FutureTask f87348d;

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f87349a;

    /* renamed from: b, reason: collision with root package name */
    public Thread f87350b;

    static {
        h6.r rVar = ck2.i.f27922b;
        f87347c = new FutureTask(rVar, null);
        f87348d = new FutureTask(rVar, null);
    }

    public a(Runnable runnable) {
        this.f87349a = runnable;
    }

    public final void a(Future future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 == f87347c) {
                return;
            }
            if (future2 == f87348d) {
                future.cancel(this.f87350b != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // xj2.c
    public final void dispose() {
        FutureTask futureTask;
        Future future = (Future) get();
        if (future == f87347c || future == (futureTask = f87348d) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.f87350b != Thread.currentThread());
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        Future future = (Future) get();
        return future == f87347c || future == f87348d;
    }
}
