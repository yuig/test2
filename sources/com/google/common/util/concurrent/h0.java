package com.google.common.util.concurrent;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class h0 extends v implements ScheduledFuture {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f33563a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledFuture f33564b;

    public h0(b bVar, ScheduledFuture scheduledFuture) {
        this.f33563a = bVar;
        this.f33564b = scheduledFuture;
    }

    @Override // pk.p0
    public final Object a() {
        return this.f33563a;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z13) {
        boolean b13 = b(z13);
        if (b13) {
            this.f33564b.cancel(z13);
        }
        return b13;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f33564b.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f33564b.getDelay(timeUnit);
    }
}
