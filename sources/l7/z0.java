package l7;

import androidx.media3.common.VideoFrameProcessingException;
import java.util.ArrayDeque;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import v.c2;

/* loaded from: classes3.dex */
public final class z0 {

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f81919b;

    /* renamed from: c, reason: collision with root package name */
    public final Future f81920c;

    /* renamed from: d, reason: collision with root package name */
    public final n f81921d;

    /* renamed from: g, reason: collision with root package name */
    public boolean f81924g;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f81918a = true;

    /* renamed from: e, reason: collision with root package name */
    public final Object f81922e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f81923f = new ArrayDeque();

    public z0(ExecutorService executorService, n nVar) {
        this.f81919b = executorService;
        this.f81920c = executorService.submit(new w0(0));
        this.f81921d = nVar;
    }

    public final void a() {
        synchronized (this.f81922e) {
            this.f81924g = true;
            this.f81923f.clear();
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f81919b.submit(new c2((Object) this, false, (Object) new d(5, this, countDownLatch), 2));
        countDownLatch.await();
    }

    public final void b(Exception exc) {
        synchronized (this.f81922e) {
            try {
                if (this.f81924g) {
                    return;
                }
                this.f81924g = true;
                this.f81921d.b(VideoFrameProcessingException.a(exc));
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final boolean c() {
        try {
            return Thread.currentThread() == ((Thread) this.f81920c.get(500L, TimeUnit.MILLISECONDS));
        } catch (InterruptedException e13) {
            throw e13;
        } catch (Exception e14) {
            b(e14);
            return false;
        }
    }

    public final void d(p pVar) {
        bf.b.t(!c());
        synchronized (this.f81922e) {
            this.f81924g = true;
            this.f81923f.clear();
        }
        this.f81919b.submit(new c2((Object) this, false, (Object) pVar, 2));
        if (this.f81918a) {
            this.f81919b.shutdown();
            if (this.f81919b.awaitTermination(500L, TimeUnit.MILLISECONDS)) {
                return;
            }
            this.f81921d.b(new VideoFrameProcessingException("Release timed out. OpenGL resources may not be cleaned up properly."));
        }
    }

    public final void e(y0 y0Var, boolean z13) {
        synchronized (this.f81922e) {
            if (this.f81924g && z13) {
                return;
            }
            try {
                this.f81919b.submit(new c2(this, z13, y0Var, 2));
                e = null;
            } catch (RejectedExecutionException e13) {
                e = e13;
            }
            if (e != null) {
                b(e);
            }
        }
    }

    public final void f(y0 y0Var) {
        synchronized (this.f81922e) {
            try {
                if (this.f81924g) {
                    return;
                }
                this.f81923f.add(y0Var);
                e(new x0(), true);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void g() {
        try {
            bf.b.t(c());
        } catch (InterruptedException e13) {
            Thread.currentThread().interrupt();
            b(e13);
        }
    }
}
