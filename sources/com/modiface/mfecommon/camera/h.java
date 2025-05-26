package com.modiface.mfecommon.camera;

import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    d f34222c;

    /* renamed from: a, reason: collision with root package name */
    AtomicReference<e> f34220a = new AtomicReference<>(e.stop);

    /* renamed from: b, reason: collision with root package name */
    LinkedList<x> f34221b = new LinkedList<>();

    /* renamed from: d, reason: collision with root package name */
    private ExecutorService f34223d = Executors.newSingleThreadExecutor();

    /* renamed from: e, reason: collision with root package name */
    public boolean f34224e = false;

    public interface d {
        void a();

        void b();
    }

    public enum e {
        start,
        stop
    }

    public h(d dVar) {
        this.f34222c = dVar;
    }

    private synchronized void b() {
        if (this.f34224e) {
            return;
        }
        this.f34224e = true;
        this.f34223d.execute(new v(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        boolean z13;
        x xVar = null;
        while (true) {
            synchronized (this) {
                if (xVar != null) {
                    try {
                        this.f34221b.pop();
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (this.f34221b.size() == 0) {
                    this.f34224e = false;
                    return;
                } else {
                    xVar = this.f34221b.getFirst();
                    z13 = this.f34221b.size() == 1;
                }
            }
            if (xVar.f34255a == e.stop) {
                a(xVar);
            }
            if (z13) {
                a(xVar);
            }
        }
    }

    public void d() {
        this.f34223d.shutdown();
    }

    public synchronized void e() {
        this.f34221b.add(new x(e.start));
        b();
    }

    public void f() {
        b(null);
    }

    public void g() {
        com.modiface.mfecommon.utils.h.a(this.f34223d.submit(com.modiface.mfecommon.utils.h.f34316b));
    }

    private void a(x xVar) {
        int i13 = w.f34254a[xVar.f34255a.ordinal()];
        if (i13 != 1) {
            if (i13 != 2) {
                return;
            }
            e eVar = this.f34220a.get();
            e eVar2 = e.start;
            if (eVar != eVar2) {
                this.f34222c.b();
                this.f34220a.set(eVar2);
                return;
            }
            return;
        }
        e eVar3 = this.f34220a.get();
        e eVar4 = e.stop;
        if (eVar3 != eVar4) {
            this.f34222c.a();
        }
        Runnable runnable = xVar.f34256b;
        if (runnable != null) {
            runnable.run();
        }
        this.f34220a.set(eVar4);
    }

    public synchronized void b(Runnable runnable) {
        this.f34221b.add(new x(e.stop, runnable));
        b();
    }

    public void a(Runnable runnable) {
        this.f34223d.execute(runnable);
    }

    public void a(long j13, TimeUnit timeUnit) {
        this.f34223d.awaitTermination(j13, timeUnit);
    }

    public synchronized e a() {
        if (this.f34221b.size() > 0) {
            return this.f34221b.getLast().f34255a;
        }
        return this.f34220a.get();
    }
}
