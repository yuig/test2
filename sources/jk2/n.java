package jk2;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class n extends AtomicReference implements Runnable, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f76596a;

    /* renamed from: b, reason: collision with root package name */
    public final long f76597b;

    /* renamed from: c, reason: collision with root package name */
    public final o f76598c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f76599d = new AtomicBoolean();

    public n(Object obj, long j13, o oVar) {
        this.f76596a = obj;
        this.f76597b = j13;
        this.f76598c = oVar;
    }

    @Override // xj2.c
    public final void dispose() {
        bk2.c.dispose(this);
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return get() == bk2.c.DISPOSED;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f76599d.compareAndSet(false, true)) {
            o oVar = this.f76598c;
            long j13 = this.f76597b;
            Object obj = this.f76596a;
            if (j13 == oVar.f76616g) {
                oVar.f76610a.c(obj);
                bk2.c.dispose(this);
            }
        }
    }
}
