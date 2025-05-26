package g0;

import com.google.common.util.concurrent.c0;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class b extends d implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public a f63183c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedBlockingQueue f63184d = new LinkedBlockingQueue(1);

    /* renamed from: e, reason: collision with root package name */
    public final CountDownLatch f63185e = new CountDownLatch(1);

    /* renamed from: f, reason: collision with root package name */
    public c0 f63186f;

    /* renamed from: g, reason: collision with root package name */
    public volatile c0 f63187g;

    public b(a aVar, c0 c0Var) {
        this.f63183c = aVar;
        c0Var.getClass();
        this.f63186f = c0Var;
    }

    public static Object b(LinkedBlockingQueue linkedBlockingQueue) {
        Object take;
        boolean z13 = false;
        while (true) {
            try {
                take = linkedBlockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z13 = true;
            } catch (Throwable th3) {
                if (z13) {
                    Thread.currentThread().interrupt();
                }
                throw th3;
            }
        }
        if (z13) {
            Thread.currentThread().interrupt();
        }
        return take;
    }

    @Override // g0.d, java.util.concurrent.Future
    public final boolean cancel(boolean z13) {
        boolean z14 = false;
        if (!this.f63188a.cancel(z13)) {
            return false;
        }
        while (true) {
            try {
                this.f63184d.put(Boolean.valueOf(z13));
                break;
            } catch (InterruptedException unused) {
                z14 = true;
            } catch (Throwable th3) {
                if (z14) {
                    Thread.currentThread().interrupt();
                }
                throw th3;
            }
        }
        if (z14) {
            Thread.currentThread().interrupt();
        }
        c0 c0Var = this.f63186f;
        if (c0Var != null) {
            c0Var.cancel(z13);
        }
        c0 c0Var2 = this.f63187g;
        if (c0Var2 != null) {
            c0Var2.cancel(z13);
        }
        return true;
    }

    @Override // g0.d, java.util.concurrent.Future
    public final Object get() {
        if (!this.f63188a.isDone()) {
            c0 c0Var = this.f63186f;
            if (c0Var != null) {
                c0Var.get();
            }
            this.f63185e.await();
            c0 c0Var2 = this.f63187g;
            if (c0Var2 != null) {
                c0Var2.get();
            }
        }
        return this.f63188a.get();
    }

    @Override // java.lang.Runnable
    public final void run() {
        c0 apply;
        try {
        } catch (UndeclaredThrowableException e13) {
            Throwable cause = e13.getCause();
            r4.i iVar = this.f63189b;
            if (iVar != null) {
                iVar.d(cause);
            }
        }
        try {
            try {
                try {
                    try {
                        apply = this.f63183c.apply(m.d(this.f63186f));
                        this.f63187g = apply;
                    } catch (CancellationException unused) {
                        cancel(false);
                    } catch (ExecutionException e14) {
                        Throwable cause2 = e14.getCause();
                        r4.i iVar2 = this.f63189b;
                        if (iVar2 != null) {
                            iVar2.d(cause2);
                        }
                    }
                } catch (Error e15) {
                    r4.i iVar3 = this.f63189b;
                    if (iVar3 != null) {
                        iVar3.d(e15);
                    }
                }
            } catch (Exception e16) {
                r4.i iVar4 = this.f63189b;
                if (iVar4 != null) {
                    iVar4.d(e16);
                }
            }
            if (!this.f63188a.isCancelled()) {
                apply.d(new androidx.appcompat.widget.j(2, this, apply), l3.c.s());
            } else {
                apply.cancel(((Boolean) b(this.f63184d)).booleanValue());
                this.f63187g = null;
            }
        } finally {
            this.f63183c = null;
            this.f63186f = null;
            this.f63185e.countDown();
        }
    }

    @Override // g0.d, java.util.concurrent.Future
    public final Object get(long j13, TimeUnit timeUnit) {
        if (!this.f63188a.isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j13 = timeUnit2.convert(j13, timeUnit);
                timeUnit = timeUnit2;
            }
            c0 c0Var = this.f63186f;
            if (c0Var != null) {
                long nanoTime = System.nanoTime();
                c0Var.get(j13, timeUnit);
                j13 -= Math.max(0L, System.nanoTime() - nanoTime);
            }
            long nanoTime2 = System.nanoTime();
            if (this.f63185e.await(j13, timeUnit)) {
                j13 -= Math.max(0L, System.nanoTime() - nanoTime2);
                c0 c0Var2 = this.f63187g;
                if (c0Var2 != null) {
                    c0Var2.get(j13, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return this.f63188a.get(j13, timeUnit);
    }
}
