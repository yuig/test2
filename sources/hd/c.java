package hd;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;
import kh2.g3;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f68787a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f68788b;

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorService f68789c;

    /* renamed from: d, reason: collision with root package name */
    public final ExecutorService f68790d;

    /* renamed from: e, reason: collision with root package name */
    public final ExecutorService f68791e;

    public c() {
        ThreadPoolExecutor L = g3.L("Bugsnag Error thread", n.ERROR_REQUEST, true);
        ThreadPoolExecutor L2 = g3.L("Bugsnag Session thread", n.SESSION_REQUEST, true);
        ThreadPoolExecutor L3 = g3.L("Bugsnag IO thread", n.IO, true);
        ThreadPoolExecutor L4 = g3.L("Bugsnag Internal Report thread", n.INTERNAL_REPORT, false);
        ThreadPoolExecutor L5 = g3.L("Bugsnag Default thread", n.DEFAULT, false);
        this.f68787a = L;
        this.f68788b = L2;
        this.f68789c = L3;
        this.f68790d = L4;
        this.f68791e = L5;
    }

    public final void a(n nVar, Runnable runnable) {
        int i13 = b.f68786a[nVar.ordinal()];
        if (i13 == 1) {
            this.f68787a.execute(runnable);
            return;
        }
        if (i13 == 2) {
            this.f68788b.execute(runnable);
            return;
        }
        if (i13 == 3) {
            this.f68789c.execute(runnable);
        } else if (i13 == 4) {
            this.f68790d.execute(runnable);
        } else {
            if (i13 != 5) {
                return;
            }
            this.f68791e.execute(runnable);
        }
    }

    public final a b(n nVar, Runnable runnable) {
        return c(nVar, Executors.callable(runnable));
    }

    public final a c(n nVar, Callable callable) {
        FutureTask futureTask = new FutureTask(callable);
        a(nVar, futureTask);
        return new a(futureTask, nVar);
    }
}
