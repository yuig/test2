package ads_mobile_sdk;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class jp extends com.google.common.util.concurrent.d {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f6904a;

    public jp(ThreadPoolExecutor delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f6904a = delegate;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j13, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f6904a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
