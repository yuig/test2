package com.google.common.util.concurrent;

import com.google.common.util.concurrent.b;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class s extends t implements b.h {
    @Override // com.google.common.util.concurrent.b, java.util.concurrent.Future
    public final boolean cancel(boolean z13) {
        return super.cancel(z13);
    }

    @Override // com.google.common.util.concurrent.b, com.google.common.util.concurrent.c0
    public final void d(Runnable runnable, Executor executor) {
        super.d(runnable, executor);
    }

    @Override // com.google.common.util.concurrent.b, java.util.concurrent.Future
    public final Object get() {
        return super.get();
    }

    @Override // com.google.common.util.concurrent.b, java.util.concurrent.Future
    public final boolean isCancelled() {
        return super.isCancelled();
    }

    @Override // com.google.common.util.concurrent.b, java.util.concurrent.Future
    public final boolean isDone() {
        return super.isDone();
    }

    @Override // com.google.common.util.concurrent.b, java.util.concurrent.Future
    public final Object get(long j13, TimeUnit timeUnit) {
        return super.get(j13, timeUnit);
    }
}
