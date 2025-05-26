package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/appsflyer/internal/AFd1qSDK;", "Ljava/util/concurrent/ThreadPoolExecutor;", "", "p0", "p1", "", "p2", "Ljava/util/concurrent/TimeUnit;", "p3", "Ljava/util/concurrent/BlockingQueue;", "Ljava/lang/Runnable;", "p4", "Ljava/util/Queue;", "p5", "<init>", "(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/Queue;)V", "", "", "afterExecute", "(Ljava/lang/Runnable;Ljava/lang/Throwable;)V", "AFAdRevenueData", "Ljava/util/Queue;", "getCurrencyIso4217Code"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFd1qSDK extends ThreadPoolExecutor {

    /* renamed from: AFAdRevenueData, reason: from kotlin metadata */
    @NotNull
    private final Queue<Runnable> getCurrencyIso4217Code;

    public /* synthetic */ AFd1qSDK(int i13, int i14, long j13, TimeUnit timeUnit, BlockingQueue blockingQueue, Queue queue, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, i14, j13, timeUnit, blockingQueue, (i15 & 32) != 0 ? new LinkedList() : queue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(Queue queue, Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        Intrinsics.checkNotNullParameter(queue, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        Intrinsics.checkNotNullParameter(threadPoolExecutor, "");
        queue.add(runnable);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(@NotNull Runnable p03, Throwable p13) {
        Intrinsics.checkNotNullParameter(p03, "");
        super.afterExecute(p03, p13);
        Intrinsics.checkNotNullParameter(p03, "");
        if (p13 != null) {
            AFh1rSDK.e$default(AFLogger.INSTANCE, AFh1sSDK.AF_EXECUTOR, "Error while executing task: " + p03, p13, true, true, true, false, 64, null);
            return;
        }
        synchronized (this) {
            try {
                int size = this.getCurrencyIso4217Code.size();
                for (int i13 = 0; i13 < size; i13++) {
                    Runnable poll = this.getCurrencyIso4217Code.poll();
                    if (poll != null) {
                        execute(poll);
                    }
                }
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AFd1qSDK(int i13, int i14, long j13, @NotNull TimeUnit timeUnit, @NotNull BlockingQueue<Runnable> blockingQueue, @NotNull final Queue<Runnable> queue) {
        super(i13, i14, j13, timeUnit, blockingQueue, new RejectedExecutionHandler() { // from class: com.appsflyer.internal.j
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                AFd1qSDK.getMediationNetwork(queue, runnable, threadPoolExecutor);
            }
        });
        Intrinsics.checkNotNullParameter(timeUnit, "");
        Intrinsics.checkNotNullParameter(blockingQueue, "");
        Intrinsics.checkNotNullParameter(queue, "");
        this.getCurrencyIso4217Code = queue;
    }
}
