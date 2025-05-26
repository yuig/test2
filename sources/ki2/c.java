package ki2;

import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c implements RunnableFuture {

    /* renamed from: a, reason: collision with root package name */
    public final RunnableFuture f79807a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f79808b;

    public c(RunnableFuture impl, Object priorityInfo) {
        Intrinsics.checkNotNullParameter(impl, "impl");
        Intrinsics.checkNotNullParameter(priorityInfo, "priorityInfo");
        this.f79807a = impl;
        this.f79808b = priorityInfo;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z13) {
        return this.f79807a.cancel(z13);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f79807a.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f79807a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f79807a.isDone();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        this.f79807a.run();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j13, TimeUnit timeUnit) {
        return this.f79807a.get(j13, timeUnit);
    }
}
