package ki2;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f79804a;

    public a(ScheduledExecutorService impl) {
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.f79804a = impl;
    }

    public final ScheduledFuture a(Runnable runnable, long j13, TimeUnit timeUnit) {
        ScheduledFuture<?> schedule = this.f79804a.schedule(runnable, j13, timeUnit);
        Intrinsics.g(schedule, "null cannot be cast to non-null type java.util.concurrent.ScheduledFuture<T of io.embrace.android.embracesdk.internal.worker.BackgroundWorker.schedule>");
        return schedule;
    }

    public final Future b(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Future<?> submit = this.f79804a.submit(runnable);
        Intrinsics.checkNotNullExpressionValue(submit, "impl.submit(runnable)");
        return submit;
    }

    public final Future c(Callable callable) {
        Intrinsics.checkNotNullParameter(callable, "callable");
        Future submit = this.f79804a.submit(callable);
        Intrinsics.checkNotNullExpressionValue(submit, "impl.submit(callable)");
        return submit;
    }
}
