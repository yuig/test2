package g0;

import com.google.common.util.concurrent.c0;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kh2.m0;

/* loaded from: classes2.dex */
public abstract class q implements c0 {
    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z13) {
        return false;
    }

    @Override // com.google.common.util.concurrent.c0
    public final void d(Runnable runnable, Executor executor) {
        executor.getClass();
        try {
            executor.execute(runnable);
        } catch (RuntimeException e13) {
            m0.t("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e13);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j13, TimeUnit timeUnit) {
        timeUnit.getClass();
        return get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }
}
