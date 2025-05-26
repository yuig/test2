package de;

import android.graphics.drawable.Drawable;
import android.os.Looper;
import com.bumptech.glide.load.engine.GlideException;
import he.n;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class f implements Future, ee.i, g {

    /* renamed from: a, reason: collision with root package name */
    public final int f54507a;

    /* renamed from: b, reason: collision with root package name */
    public final int f54508b;

    /* renamed from: c, reason: collision with root package name */
    public Object f54509c;

    /* renamed from: d, reason: collision with root package name */
    public c f54510d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f54511e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f54512f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f54513g;

    /* renamed from: h, reason: collision with root package name */
    public GlideException f54514h;

    public f(int i13, int i14) {
        this.f54507a = i13;
        this.f54508b = i14;
    }

    @Override // ee.i
    /* renamed from: K0 */
    public final synchronized c getF44637j() {
        return this.f54510d;
    }

    @Override // ee.i
    public final synchronized void Z(c cVar) {
        this.f54510d = cVar;
    }

    @Override // de.g
    public final synchronized void a(GlideException glideException, ee.i iVar) {
        this.f54513g = true;
        this.f54514h = glideException;
        notifyAll();
    }

    @Override // ae.i
    public final void b() {
    }

    @Override // de.g
    public final synchronized void c(Object obj, Object obj2, ee.i iVar, nd.a aVar, boolean z13) {
        this.f54512f = true;
        this.f54509c = obj;
        notifyAll();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z13) {
        synchronized (this) {
            try {
                if (isDone()) {
                    return false;
                }
                this.f54511e = true;
                notifyAll();
                c cVar = null;
                if (z13) {
                    c cVar2 = this.f54510d;
                    this.f54510d = null;
                    cVar = cVar2;
                }
                if (cVar != null) {
                    cVar.clear();
                }
                return true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final synchronized Object e(Long l13) {
        if (!isDone()) {
            char[] cArr = n.f68959a;
            if (!(!(Looper.myLooper() == Looper.getMainLooper()))) {
                throw new IllegalArgumentException("You must call this method on a background thread");
            }
        }
        if (this.f54511e) {
            throw new CancellationException();
        }
        if (this.f54513g) {
            throw new ExecutionException(this.f54514h);
        }
        if (this.f54512f) {
            return this.f54509c;
        }
        if (l13 == null) {
            wait(0L);
        } else if (l13.longValue() > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            long longValue = l13.longValue() + currentTimeMillis;
            while (!isDone() && currentTimeMillis < longValue) {
                wait(longValue - currentTimeMillis);
                currentTimeMillis = System.currentTimeMillis();
            }
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        if (this.f54513g) {
            throw new ExecutionException(this.f54514h);
        }
        if (this.f54511e) {
            throw new CancellationException();
        }
        if (this.f54512f) {
            return this.f54509c;
        }
        throw new TimeoutException();
    }

    @Override // ee.i
    public final void g(ee.h hVar) {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        try {
            return e(null);
        } catch (TimeoutException e13) {
            throw new AssertionError(e13);
        }
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isCancelled() {
        return this.f54511e;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        boolean z13;
        if (!this.f54511e && !this.f54512f) {
            z13 = this.f54513g;
        }
        return z13;
    }

    @Override // ee.i
    public final void j(Drawable drawable) {
    }

    @Override // ee.i
    public final void k(ee.h hVar) {
        ((k) hVar).p(this.f54507a, this.f54508b);
    }

    @Override // ee.i
    public final void m(Drawable drawable) {
    }

    @Override // ae.i
    public final void onDestroy() {
    }

    @Override // ee.i
    public final synchronized void s(Drawable drawable) {
    }

    public final String toString() {
        c cVar;
        String str;
        String p13 = a.a.p(new StringBuilder(), super.toString(), "[status=");
        synchronized (this) {
            try {
                cVar = null;
                if (this.f54511e) {
                    str = "CANCELLED";
                } else if (this.f54513g) {
                    str = "FAILURE";
                } else if (this.f54512f) {
                    str = "SUCCESS";
                } else {
                    str = "PENDING";
                    cVar = this.f54510d;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (cVar == null) {
            return a.a.D(p13, str, "]");
        }
        return p13 + str + ", request=[" + cVar + "]]";
    }

    @Override // ae.i
    public final void x() {
    }

    @Override // ee.i
    public final synchronized void z(Object obj, fe.d dVar) {
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j13, TimeUnit timeUnit) {
        return e(Long.valueOf(timeUnit.toMillis(j13)));
    }
}
