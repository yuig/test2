package d7;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public abstract class e0 implements RunnableFuture {

    /* renamed from: a, reason: collision with root package name */
    public final a7.o f53810a = new a7.o(1);

    /* renamed from: b, reason: collision with root package name */
    public final a7.o f53811b = new a7.o(1);

    /* renamed from: c, reason: collision with root package name */
    public final Object f53812c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public Exception f53813d;

    /* renamed from: e, reason: collision with root package name */
    public Object f53814e;

    /* renamed from: f, reason: collision with root package name */
    public Thread f53815f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f53816g;

    public final void a() {
        this.f53811b.d();
    }

    public void b() {
    }

    public abstract Object c();

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z13) {
        boolean z14;
        synchronized (this.f53812c) {
            try {
                if (!this.f53816g) {
                    a7.o oVar = this.f53811b;
                    synchronized (oVar) {
                        z14 = oVar.f1154a;
                    }
                    if (!z14) {
                        this.f53816g = true;
                        b();
                        Thread thread = this.f53815f;
                        if (thread == null) {
                            this.f53810a.h();
                            this.f53811b.h();
                        } else if (z13) {
                            thread.interrupt();
                        }
                        return true;
                    }
                }
                return false;
            } finally {
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        this.f53811b.b();
        if (this.f53816g) {
            throw new CancellationException();
        }
        if (this.f53813d == null) {
            return this.f53814e;
        }
        throw new ExecutionException(this.f53813d);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f53816g;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z13;
        a7.o oVar = this.f53811b;
        synchronized (oVar) {
            z13 = oVar.f1154a;
        }
        return z13;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.f53812c) {
            try {
                if (this.f53816g) {
                    return;
                }
                this.f53815f = Thread.currentThread();
                this.f53810a.h();
                try {
                    try {
                        this.f53814e = c();
                        synchronized (this.f53812c) {
                            this.f53811b.h();
                            this.f53815f = null;
                            Thread.interrupted();
                        }
                    } catch (Exception e13) {
                        this.f53813d = e13;
                        synchronized (this.f53812c) {
                            this.f53811b.h();
                            this.f53815f = null;
                            Thread.interrupted();
                        }
                    }
                } catch (Throwable th3) {
                    synchronized (this.f53812c) {
                        this.f53811b.h();
                        this.f53815f = null;
                        Thread.interrupted();
                        throw th3;
                    }
                }
            } finally {
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j13, TimeUnit timeUnit) {
        if (this.f53811b.c(TimeUnit.MILLISECONDS.convert(j13, timeUnit))) {
            if (!this.f53816g) {
                if (this.f53813d == null) {
                    return this.f53814e;
                }
                throw new ExecutionException(this.f53813d);
            }
            throw new CancellationException();
        }
        throw new TimeoutException();
    }
}
