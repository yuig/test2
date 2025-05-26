package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import pk.p0;

/* loaded from: classes3.dex */
public abstract class v extends p0 implements c0, Future {
    public final boolean b(boolean z13) {
        return ((h0) this).f33563a.cancel(z13);
    }

    @Override // java.util.concurrent.Future
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object get() {
        return ((h0) this).f33563a.get();
    }

    @Override // com.google.common.util.concurrent.c0
    public final void d(Runnable runnable, Executor executor) {
        ((h0) this).f33563a.d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object get(long j13, TimeUnit timeUnit) {
        return ((h0) this).f33563a.get(j13, timeUnit);
    }

    @Override // java.util.concurrent.Future
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final boolean isCancelled() {
        return ((h0) this).f33563a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final boolean isDone() {
        return ((h0) this).f33563a.isDone();
    }
}
