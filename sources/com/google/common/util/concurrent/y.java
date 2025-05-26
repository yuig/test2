package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* loaded from: classes3.dex */
public final class y implements c0 {

    /* renamed from: b, reason: collision with root package name */
    public static final y f33586b = new y(null);

    /* renamed from: c, reason: collision with root package name */
    public static final b0 f33587c = new b0(y.class);

    /* renamed from: a, reason: collision with root package name */
    public final Object f33588a;

    public y(Object obj) {
        this.f33588a = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z13) {
        return false;
    }

    @Override // com.google.common.util.concurrent.c0
    public final void d(Runnable runnable, Executor executor) {
        bf.b.p(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e13) {
            f33587c.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e13);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f33588a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.f33588a + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j13, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f33588a;
    }
}
