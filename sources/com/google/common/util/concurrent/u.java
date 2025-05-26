package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class u extends t {

    /* renamed from: e, reason: collision with root package name */
    public final c0 f33585e;

    public u(c0 c0Var) {
        c0Var.getClass();
        this.f33585e = c0Var;
    }

    @Override // com.google.common.util.concurrent.b, java.util.concurrent.Future
    public final boolean cancel(boolean z13) {
        return this.f33585e.cancel(z13);
    }

    @Override // com.google.common.util.concurrent.b, com.google.common.util.concurrent.c0
    public final void d(Runnable runnable, Executor executor) {
        this.f33585e.d(runnable, executor);
    }

    @Override // com.google.common.util.concurrent.b, java.util.concurrent.Future
    public final Object get() {
        return this.f33585e.get();
    }

    @Override // com.google.common.util.concurrent.b, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f33585e.isCancelled();
    }

    @Override // com.google.common.util.concurrent.b, java.util.concurrent.Future
    public final boolean isDone() {
        return this.f33585e.isDone();
    }

    @Override // com.google.common.util.concurrent.b
    public final String toString() {
        return this.f33585e.toString();
    }

    @Override // com.google.common.util.concurrent.b, java.util.concurrent.Future
    public final Object get(long j13, TimeUnit timeUnit) {
        return this.f33585e.get(j13, timeUnit);
    }
}
