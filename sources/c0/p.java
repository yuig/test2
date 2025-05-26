package c0;

import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class p implements Executor {

    /* renamed from: c, reason: collision with root package name */
    public static final o f24289c = new o(0);

    /* renamed from: a, reason: collision with root package name */
    public final Object f24290a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public ThreadPoolExecutor f24291b;

    public p() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f24289c);
        threadPoolExecutor.setRejectedExecutionHandler(new n());
        this.f24291b = threadPoolExecutor;
    }

    public final void a(v.o oVar) {
        ThreadPoolExecutor threadPoolExecutor;
        oVar.getClass();
        synchronized (this.f24290a) {
            try {
                if (this.f24291b.isShutdown()) {
                    ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f24289c);
                    threadPoolExecutor2.setRejectedExecutionHandler(new n());
                    this.f24291b = threadPoolExecutor2;
                }
                threadPoolExecutor = this.f24291b;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        int max = Math.max(1, new LinkedHashSet(oVar.f123583f).size());
        threadPoolExecutor.setMaximumPoolSize(max);
        threadPoolExecutor.setCorePoolSize(max);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.f24290a) {
            this.f24291b.execute(runnable);
        }
    }
}
