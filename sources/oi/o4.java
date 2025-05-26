package oi;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class o4 extends c5 {

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicLong f94985k = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: c, reason: collision with root package name */
    public r4 f94986c;

    /* renamed from: d, reason: collision with root package name */
    public r4 f94987d;

    /* renamed from: e, reason: collision with root package name */
    public final PriorityBlockingQueue f94988e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedBlockingQueue f94989f;

    /* renamed from: g, reason: collision with root package name */
    public final q4 f94990g;

    /* renamed from: h, reason: collision with root package name */
    public final q4 f94991h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f94992i;

    /* renamed from: j, reason: collision with root package name */
    public final Semaphore f94993j;

    public o4(u4 u4Var) {
        super(u4Var);
        this.f94992i = new Object();
        this.f94993j = new Semaphore(2);
        this.f94988e = new PriorityBlockingQueue();
        this.f94989f = new LinkedBlockingQueue();
        this.f94990g = new q4(this, "Thread death: Uncaught exception on worker thread");
        this.f94991h = new q4(this, "Thread death: Uncaught exception on network thread");
    }

    public final boolean A() {
        return Thread.currentThread() == this.f94986c;
    }

    public final void B() {
        if (Thread.currentThread() != this.f94987d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // c0.s0
    public final void p() {
        if (Thread.currentThread() != this.f94986c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // oi.c5
    public final boolean s() {
        return false;
    }

    public final Object t(AtomicReference atomicReference, long j13, String str, Runnable runnable) {
        synchronized (atomicReference) {
            zzl().y(runnable);
            try {
                atomicReference.wait(j13);
            } catch (InterruptedException unused) {
                zzj().f95271i.c("Interrupted waiting for ".concat(str));
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            zzj().f95271i.c("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final s4 u(Callable callable) {
        q();
        s4 s4Var = new s4(this, callable, false);
        if (Thread.currentThread() == this.f94986c) {
            if (!this.f94988e.isEmpty()) {
                zzj().f95271i.c("Callable skipped the worker queue.");
            }
            s4Var.run();
        } else {
            v(s4Var);
        }
        return s4Var;
    }

    public final void v(s4 s4Var) {
        synchronized (this.f94992i) {
            try {
                this.f94988e.add(s4Var);
                r4 r4Var = this.f94986c;
                if (r4Var == null) {
                    r4 r4Var2 = new r4(this, "Measurement Worker", this.f94988e);
                    this.f94986c = r4Var2;
                    r4Var2.setUncaughtExceptionHandler(this.f94990g);
                    this.f94986c.start();
                } else {
                    synchronized (r4Var.f95080a) {
                        r4Var.f95080a.notifyAll();
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void w(Runnable runnable) {
        q();
        s4 s4Var = new s4(this, runnable, false, "Task exception on network thread");
        synchronized (this.f94992i) {
            try {
                this.f94989f.add(s4Var);
                r4 r4Var = this.f94987d;
                if (r4Var == null) {
                    r4 r4Var2 = new r4(this, "Measurement Network", this.f94989f);
                    this.f94987d = r4Var2;
                    r4Var2.setUncaughtExceptionHandler(this.f94991h);
                    this.f94987d.start();
                } else {
                    synchronized (r4Var.f95080a) {
                        r4Var.f95080a.notifyAll();
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final s4 x(Callable callable) {
        q();
        s4 s4Var = new s4(this, callable, true);
        if (Thread.currentThread() == this.f94986c) {
            s4Var.run();
        } else {
            v(s4Var);
        }
        return s4Var;
    }

    public final void y(Runnable runnable) {
        q();
        com.bumptech.glide.d.t(runnable);
        v(new s4(this, runnable, false, "Task exception on worker thread"));
    }

    public final void z(Runnable runnable) {
        q();
        v(new s4(this, runnable, true, "Task exception on worker thread"));
    }
}
