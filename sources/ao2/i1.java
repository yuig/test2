package ao2;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.CoroutineContext;
import oi.o6;

/* loaded from: classes2.dex */
public final class i1 extends h1 implements r0 {

    /* renamed from: c, reason: collision with root package name */
    public final Executor f20164c;

    public i1(Executor executor) {
        this.f20164c = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    public static void w(CoroutineContext coroutineContext, RejectedExecutionException rejectedExecutionException) {
        CancellationException c13 = kh2.u2.c("The task was rejected", rejectedExecutionException);
        o1 o1Var = (o1) coroutineContext.get(g0.f20154b);
        if (o1Var != null) {
            o1Var.cancel(c13);
        }
    }

    @Override // ao2.r0
    public final x0 a(long j13, Runnable runnable, CoroutineContext coroutineContext) {
        Executor executor = this.f20164c;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(runnable, j13, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e13) {
                w(coroutineContext, e13);
            }
        }
        return scheduledFuture != null ? new w0(scheduledFuture) : n0.f20177j.a(j13, runnable, coroutineContext);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f20164c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof i1) && ((i1) obj).f20164c == this.f20164c;
    }

    @Override // ao2.r0
    public final void f(long j13, o oVar) {
        Executor executor = this.f20164c;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(new o6(this, oVar, 22), j13, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e13) {
                w(oVar.f20185e, e13);
            }
        }
        if (scheduledFuture != null) {
            lb.l0.E0(oVar, new j(scheduledFuture));
        } else {
            n0.f20177j.f(j13, oVar);
        }
    }

    @Override // ao2.f0
    public final void g(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            this.f20164c.execute(runnable);
        } catch (RejectedExecutionException e13) {
            w(coroutineContext, e13);
            ko2.f fVar = v0.f20219a;
            ko2.e.f80326c.g(coroutineContext, runnable);
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f20164c);
    }

    @Override // ao2.h1
    public final Executor o() {
        return this.f20164c;
    }

    @Override // ao2.f0
    public final String toString() {
        return this.f20164c.toString();
    }
}
