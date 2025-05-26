package com.google.common.util.concurrent;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class g0 extends d {

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f33562b;

    public g0(ExecutorService executorService) {
        executorService.getClass();
        this.f33562b = executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j13, TimeUnit timeUnit) {
        return this.f33562b.awaitTermination(j13, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f33562b.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f33562b.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f33562b.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f33562b.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.f33562b.shutdownNow();
    }

    public final String toString() {
        return super.toString() + "[" + this.f33562b + "]";
    }
}
