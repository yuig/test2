package okhttp3.internal.concurrent;

import a.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import uo2.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner;", "", "Backend", "Companion", "RealBackend", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class TaskRunner {

    /* renamed from: h, reason: collision with root package name */
    public static final Companion f95852h = new Companion(0);

    /* renamed from: i, reason: collision with root package name */
    public static final TaskRunner f95853i;

    /* renamed from: j, reason: collision with root package name */
    public static final Logger f95854j;

    /* renamed from: a, reason: collision with root package name */
    public final Backend f95855a;

    /* renamed from: b, reason: collision with root package name */
    public int f95856b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f95857c;

    /* renamed from: d, reason: collision with root package name */
    public long f95858d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f95859e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f95860f;

    /* renamed from: g, reason: collision with root package name */
    public final TaskRunner$runnable$1 f95861g;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner$Backend;", "", "okhttp"}, k = 1, mv = {1, 8, 0})
    public interface Backend {
        long a();

        void b(TaskRunner taskRunner);

        void c(TaskRunner taskRunner, long j13);

        void execute(Runnable runnable);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner$Companion;", "", "Lokhttp3/internal/concurrent/TaskRunner;", "INSTANCE", "Lokhttp3/internal/concurrent/TaskRunner;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i13) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner$RealBackend;", "Lokhttp3/internal/concurrent/TaskRunner$Backend;", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class RealBackend implements Backend {

        /* renamed from: a, reason: collision with root package name */
        public final ThreadPoolExecutor f95862a;

        public RealBackend(b threadFactory) {
            Intrinsics.checkNotNullParameter(threadFactory, "threadFactory");
            this.f95862a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public final long a() {
            return System.nanoTime();
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public final void b(TaskRunner taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public final void c(TaskRunner taskRunner, long j13) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            long j14 = j13 / 1000000;
            long j15 = j13 - (1000000 * j14);
            if (j14 > 0 || j13 > 0) {
                taskRunner.wait(j14, (int) j15);
            }
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public final void execute(Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.f95862a.execute(runnable);
        }
    }

    static {
        String name = Util.f95763g + " TaskRunner";
        Intrinsics.checkNotNullParameter(name, "name");
        f95853i = new TaskRunner(new RealBackend(new b(name, true)));
        Logger logger = Logger.getLogger(TaskRunner.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(TaskRunner::class.java.name)");
        f95854j = logger;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [okhttp3.internal.concurrent.TaskRunner$runnable$1] */
    public TaskRunner(RealBackend backend) {
        Intrinsics.checkNotNullParameter(backend, "backend");
        this.f95855a = backend;
        this.f95856b = 10000;
        this.f95859e = new ArrayList();
        this.f95860f = new ArrayList();
        this.f95861g = new Runnable() { // from class: okhttp3.internal.concurrent.TaskRunner$runnable$1
            @Override // java.lang.Runnable
            public final void run() {
                Task c13;
                long j13;
                while (true) {
                    TaskRunner taskRunner = TaskRunner.this;
                    synchronized (taskRunner) {
                        c13 = taskRunner.c();
                    }
                    if (c13 == null) {
                        return;
                    }
                    TaskQueue taskQueue = c13.f95842c;
                    Intrinsics.f(taskQueue);
                    TaskRunner taskRunner2 = TaskRunner.this;
                    TaskRunner.f95852h.getClass();
                    boolean isLoggable = TaskRunner.f95854j.isLoggable(Level.FINE);
                    if (isLoggable) {
                        j13 = taskQueue.getF95844a().f95855a.a();
                        TaskLoggerKt.a(c13, taskQueue, "starting");
                    } else {
                        j13 = -1;
                    }
                    try {
                        try {
                            TaskRunner.a(taskRunner2, c13);
                            Unit unit = Unit.f80348a;
                            if (isLoggable) {
                                TaskLoggerKt.a(c13, taskQueue, "finished run in ".concat(TaskLoggerKt.b(taskQueue.getF95844a().f95855a.a() - j13)));
                            }
                        } finally {
                        }
                    } catch (Throwable th3) {
                        if (isLoggable) {
                            TaskLoggerKt.a(c13, taskQueue, "failed a run in ".concat(TaskLoggerKt.b(taskQueue.getF95844a().f95855a.a() - j13)));
                        }
                        throw th3;
                    }
                }
            }
        };
    }

    public static final void a(TaskRunner taskRunner, Task task) {
        taskRunner.getClass();
        byte[] bArr = Util.f95757a;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(task.f95840a);
        try {
            long b13 = task.b();
            synchronized (taskRunner) {
                taskRunner.b(task, b13);
                Unit unit = Unit.f80348a;
            }
            currentThread.setName(name);
        } catch (Throwable th3) {
            synchronized (taskRunner) {
                taskRunner.b(task, -1L);
                Unit unit2 = Unit.f80348a;
                currentThread.setName(name);
                throw th3;
            }
        }
    }

    public final void b(Task task, long j13) {
        byte[] bArr = Util.f95757a;
        TaskQueue taskQueue = task.f95842c;
        Intrinsics.f(taskQueue);
        if (taskQueue.f95847d != task) {
            throw new IllegalStateException("Check failed.".toString());
        }
        boolean z13 = taskQueue.f95849f;
        taskQueue.f95849f = false;
        taskQueue.f95847d = null;
        this.f95859e.remove(taskQueue);
        if (j13 != -1 && !z13 && !taskQueue.f95846c) {
            taskQueue.f(task, j13, true);
        }
        if (!taskQueue.f95848e.isEmpty()) {
            this.f95860f.add(taskQueue);
        }
    }

    public final Task c() {
        long j13;
        boolean z13;
        byte[] bArr = Util.f95757a;
        while (true) {
            ArrayList arrayList = this.f95860f;
            if (arrayList.isEmpty()) {
                return null;
            }
            Backend backend = this.f95855a;
            long a13 = backend.a();
            Iterator it = arrayList.iterator();
            long j14 = Long.MAX_VALUE;
            Task task = null;
            while (true) {
                if (!it.hasNext()) {
                    j13 = a13;
                    z13 = false;
                    break;
                }
                Task task2 = (Task) ((TaskQueue) it.next()).f95848e.get(0);
                j13 = a13;
                long max = Math.max(0L, task2.f95843d - a13);
                if (max > 0) {
                    j14 = Math.min(max, j14);
                } else {
                    if (task != null) {
                        z13 = true;
                        break;
                    }
                    task = task2;
                }
                a13 = j13;
            }
            if (task != null) {
                byte[] bArr2 = Util.f95757a;
                task.f95843d = -1L;
                TaskQueue taskQueue = task.f95842c;
                Intrinsics.f(taskQueue);
                taskQueue.f95848e.remove(task);
                arrayList.remove(taskQueue);
                taskQueue.f95847d = task;
                this.f95859e.add(taskQueue);
                if (z13 || (!this.f95857c && (!arrayList.isEmpty()))) {
                    backend.execute(this.f95861g);
                }
                return task;
            }
            if (this.f95857c) {
                if (j14 >= this.f95858d - j13) {
                    return null;
                }
                backend.b(this);
                return null;
            }
            this.f95857c = true;
            this.f95858d = j13 + j14;
            try {
                try {
                    backend.c(this, j14);
                } catch (InterruptedException unused) {
                    d();
                }
            } finally {
                this.f95857c = false;
            }
        }
    }

    public final void d() {
        ArrayList arrayList = this.f95859e;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                ((TaskQueue) arrayList.get(size)).b();
            }
        }
        ArrayList arrayList2 = this.f95860f;
        for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
            TaskQueue taskQueue = (TaskQueue) arrayList2.get(size2);
            taskQueue.b();
            if (taskQueue.f95848e.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
    }

    public final void e(TaskQueue taskQueue) {
        Intrinsics.checkNotNullParameter(taskQueue, "taskQueue");
        byte[] bArr = Util.f95757a;
        if (taskQueue.f95847d == null) {
            boolean z13 = !taskQueue.f95848e.isEmpty();
            ArrayList arrayList = this.f95860f;
            if (z13) {
                Intrinsics.checkNotNullParameter(arrayList, "<this>");
                if (!arrayList.contains(taskQueue)) {
                    arrayList.add(taskQueue);
                }
            } else {
                arrayList.remove(taskQueue);
            }
        }
        boolean z14 = this.f95857c;
        Backend backend = this.f95855a;
        if (z14) {
            backend.b(this);
        } else {
            backend.execute(this.f95861g);
        }
    }

    public final TaskQueue f() {
        int i13;
        synchronized (this) {
            i13 = this.f95856b;
            this.f95856b = i13 + 1;
        }
        return new TaskQueue(this, a.d("Q", i13));
    }
}
