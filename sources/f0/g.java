package f0;

import android.os.Handler;
import android.os.SystemClock;
import g0.o;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class g extends AbstractExecutorService implements ScheduledExecutorService {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f60736a;

    static {
        new a.g(4);
    }

    public g(Handler handler) {
        this.f60736a = handler;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j13, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(g.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Handler handler = this.f60736a;
        if (handler.post(runnable)) {
            return;
        }
        throw new RejectedExecutionException(handler + " is shutting down");
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j13, TimeUnit timeUnit) {
        return schedule(new e(0, this, runnable), j13, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j13, long j14, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(g.class.getSimpleName().concat(" does not yet support fixed-rate scheduling."));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j13, long j14, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(g.class.getSimpleName().concat(" does not yet support fixed-delay scheduling."));
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException(g.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException(g.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j13, TimeUnit timeUnit) {
        long convert = TimeUnit.MILLISECONDS.convert(j13, timeUnit) + SystemClock.uptimeMillis();
        Handler handler = this.f60736a;
        f fVar = new f(handler, convert, callable);
        if (handler.postAtTime(fVar, convert)) {
            return fVar;
        }
        return new o(new RejectedExecutionException(handler + " is shutting down"));
    }
}
