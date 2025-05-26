package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class j0 extends g0 implements e0 {

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f33572c;

    public j0(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.f33572c = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j13, TimeUnit timeUnit) {
        m0 m0Var = new m0(callable);
        return new h0(m0Var, this.f33572c.schedule(m0Var, j13, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j13, long j14, TimeUnit timeUnit) {
        i0 i0Var = new i0(runnable);
        return new h0(i0Var, this.f33572c.scheduleAtFixedRate(i0Var, j13, j14, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j13, long j14, TimeUnit timeUnit) {
        i0 i0Var = new i0(runnable);
        return new h0(i0Var, this.f33572c.scheduleWithFixedDelay(i0Var, j13, j14, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j13, TimeUnit timeUnit) {
        m0 m0Var = new m0(Executors.callable(runnable, null));
        return new h0(m0Var, this.f33572c.schedule(m0Var, j13, timeUnit));
    }
}
