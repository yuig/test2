package kh2;

import java.util.Comparator;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m3 implements l3, RejectedExecutionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f79620a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f79621b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f79622c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f79623d = new AtomicReference();

    public final ki2.a a(ki2.h worker) {
        Intrinsics.checkNotNullParameter(worker, "worker");
        ConcurrentHashMap concurrentHashMap = this.f79622c;
        Object obj = concurrentHashMap.get(worker);
        if (obj == null) {
            obj = new ki2.a((ScheduledExecutorService) c(worker));
            concurrentHashMap.put(worker, obj);
        }
        return (ki2.a) obj;
    }

    public final ExecutorService c(gb2.d dVar) {
        Comparator comparator;
        ConcurrentHashMap concurrentHashMap = this.f79620a;
        Object obj = concurrentHashMap.get(dVar);
        if (obj == null) {
            hd.d threadFactory = new hd.d(1, dVar, this);
            if (dVar instanceof ki2.j) {
                ki2.j jVar = (ki2.j) dVar;
                if (Intrinsics.d(jVar, ki2.i.f79816b)) {
                    comparator = yg2.c.f139029a;
                } else if (Intrinsics.d(jVar, ki2.i.f79817c)) {
                    comparator = li2.b.f83583a;
                } else {
                    if (!Intrinsics.d(jVar, ki2.i.f79818d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    comparator = li2.b.f83584b;
                }
                Intrinsics.checkNotNullParameter(threadFactory, "threadFactory");
                Intrinsics.checkNotNullParameter(this, "handler");
                Intrinsics.checkNotNullParameter(comparator, "comparator");
                obj = new ki2.d(1, 1, 60L, TimeUnit.SECONDS, new PriorityBlockingQueue(100, comparator), threadFactory, this);
            } else {
                obj = new ScheduledThreadPoolExecutor(1, threadFactory, this);
            }
            concurrentHashMap.put(dVar, obj);
        }
        return (ExecutorService) obj;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.f79620a.values().iterator();
        while (it.hasNext()) {
            ((ExecutorService) it.next()).shutdown();
        }
    }

    public final ki2.e d(ki2.j worker) {
        Intrinsics.checkNotNullParameter(worker, "worker");
        ConcurrentHashMap concurrentHashMap = this.f79621b;
        Object obj = concurrentHashMap.get(worker);
        if (obj == null) {
            obj = new ki2.e(c(worker));
            concurrentHashMap.put(worker, obj);
        }
        return (ki2.e) obj;
    }

    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor executor) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Intrinsics.checkNotNullParameter(executor, "executor");
    }
}
