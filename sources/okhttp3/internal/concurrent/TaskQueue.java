package okhttp3.internal.concurrent;

import a.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/concurrent/TaskQueue;", "", "AwaitIdleTask", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class TaskQueue {

    /* renamed from: a */
    public final TaskRunner f95844a;

    /* renamed from: b */
    public final String f95845b;

    /* renamed from: c */
    public boolean f95846c;

    /* renamed from: d */
    public Task f95847d;

    /* renamed from: e */
    public final ArrayList f95848e;

    /* renamed from: f */
    public boolean f95849f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/concurrent/TaskQueue$AwaitIdleTask;", "Lokhttp3/internal/concurrent/Task;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class AwaitIdleTask extends Task {

        /* renamed from: e */
        public final CountDownLatch f95850e;

        public AwaitIdleTask() {
            super(a.p(new StringBuilder(), Util.f95763g, " awaitIdle"), false);
            this.f95850e = new CountDownLatch(1);
        }

        @Override // okhttp3.internal.concurrent.Task
        public final long b() {
            this.f95850e.countDown();
            return -1L;
        }
    }

    public TaskQueue(TaskRunner taskRunner, String name) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f95844a = taskRunner;
        this.f95845b = name;
        this.f95848e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = Util.f95757a;
        synchronized (this.f95844a) {
            try {
                if (b()) {
                    this.f95844a.e(this);
                }
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final boolean b() {
        Task task = this.f95847d;
        if (task != null && task.getF95841b()) {
            this.f95849f = true;
        }
        ArrayList arrayList = this.f95848e;
        boolean z13 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((Task) arrayList.get(size)).getF95841b()) {
                Task task2 = (Task) arrayList.get(size);
                TaskRunner.f95852h.getClass();
                if (TaskRunner.f95854j.isLoggable(Level.FINE)) {
                    TaskLoggerKt.a(task2, this, "canceled");
                }
                arrayList.remove(size);
                z13 = true;
            }
        }
        return z13;
    }

    /* renamed from: c, reason: from getter */
    public final TaskRunner getF95844a() {
        return this.f95844a;
    }

    public final void d(Task task, long j13) {
        Intrinsics.checkNotNullParameter(task, "task");
        synchronized (this.f95844a) {
            if (!this.f95846c) {
                if (f(task, j13, false)) {
                    this.f95844a.e(this);
                }
                Unit unit = Unit.f80348a;
            } else if (task.getF95841b()) {
                TaskRunner.f95852h.getClass();
                if (TaskRunner.f95854j.isLoggable(Level.FINE)) {
                    TaskLoggerKt.a(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                TaskRunner.f95852h.getClass();
                if (TaskRunner.f95854j.isLoggable(Level.FINE)) {
                    TaskLoggerKt.a(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean f(Task task, long j13, boolean z13) {
        Intrinsics.checkNotNullParameter(task, "task");
        task.getClass();
        Intrinsics.checkNotNullParameter(this, "queue");
        TaskQueue taskQueue = task.f95842c;
        if (taskQueue != this) {
            if (taskQueue != null) {
                throw new IllegalStateException("task is in multiple queues".toString());
            }
            task.f95842c = this;
        }
        long a13 = this.f95844a.f95855a.a();
        long j14 = a13 + j13;
        ArrayList arrayList = this.f95848e;
        int indexOf = arrayList.indexOf(task);
        if (indexOf != -1) {
            if (task.f95843d <= j14) {
                TaskRunner.f95852h.getClass();
                if (TaskRunner.f95854j.isLoggable(Level.FINE)) {
                    TaskLoggerKt.a(task, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(indexOf);
        }
        task.f95843d = j14;
        TaskRunner.f95852h.getClass();
        if (TaskRunner.f95854j.isLoggable(Level.FINE)) {
            TaskLoggerKt.a(task, this, z13 ? "run again after ".concat(TaskLoggerKt.b(j14 - a13)) : "scheduled after ".concat(TaskLoggerKt.b(j14 - a13)));
        }
        Iterator it = arrayList.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            if (((Task) it.next()).f95843d - a13 > j13) {
                break;
            }
            i13++;
        }
        if (i13 == -1) {
            i13 = arrayList.size();
        }
        arrayList.add(i13, task);
        return i13 == 0;
    }

    public final void g() {
        byte[] bArr = Util.f95757a;
        synchronized (this.f95844a) {
            try {
                this.f95846c = true;
                if (b()) {
                    this.f95844a.e(this);
                }
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* renamed from: toString, reason: from getter */
    public final String getF95845b() {
        return this.f95845b;
    }
}
