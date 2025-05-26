package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public abstract class a0 extends AtomicReference implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public static final h6.r f33526a = new h6.r();

    /* renamed from: b, reason: collision with root package name */
    public static final h6.r f33527b = new h6.r();

    public abstract void a(Throwable th3);

    public abstract void b(Object obj);

    public final void c() {
        h6.r rVar = f33527b;
        h6.r rVar2 = f33526a;
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            z zVar = new z(this);
            z.a(zVar, Thread.currentThread());
            if (compareAndSet(runnable, zVar)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (((Runnable) getAndSet(rVar2)) == rVar) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    public abstract boolean d();

    public abstract Object e();

    public abstract String f();

    public final void g(Thread thread) {
        Runnable runnable = (Runnable) get();
        z zVar = null;
        boolean z13 = false;
        int i13 = 0;
        while (true) {
            boolean z14 = runnable instanceof z;
            h6.r rVar = f33527b;
            if (!z14 && runnable != rVar) {
                break;
            }
            if (z14) {
                zVar = (z) runnable;
            }
            i13++;
            if (i13 <= 1000) {
                Thread.yield();
            } else if (runnable == rVar || compareAndSet(runnable, rVar)) {
                z13 = Thread.interrupted() || z13;
                LockSupport.park(zVar);
            }
            runnable = (Runnable) get();
        }
        if (z13) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet(null, currentThread)) {
            boolean z13 = !d();
            h6.r rVar = f33526a;
            if (z13) {
                try {
                    obj = e();
                } catch (Throwable th3) {
                    try {
                        if (th3 instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(currentThread, rVar)) {
                            g(currentThread);
                        }
                        if (z13) {
                            a(th3);
                            return;
                        }
                        return;
                    } finally {
                        if (!compareAndSet(currentThread, rVar)) {
                            g(currentThread);
                        }
                        if (z13) {
                            b(null);
                        }
                    }
                }
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f33526a) {
            str = "running=[DONE]";
        } else if (runnable instanceof z) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        StringBuilder D = ep.b.D(str, ", ");
        D.append(f());
        return D.toString();
    }
}
