package ki2;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d extends ThreadPoolExecutor {
    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        if (!(runnable instanceof b)) {
            throw new IllegalArgumentException("Runnable must be PriorityCallable".toString());
        }
        RunnableFuture runnableFuture = super.newTaskFor(runnable, obj);
        Intrinsics.checkNotNullExpressionValue(runnableFuture, "runnableFuture");
        return new c(runnableFuture, ((b) runnable).f79805a);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        Intrinsics.checkNotNullParameter(callable, "callable");
        throw new IllegalArgumentException("Callable must be PriorityCallable".toString());
    }
}
