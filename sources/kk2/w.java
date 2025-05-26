package kk2;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import lb.l0;
import uj2.f0;

/* loaded from: classes4.dex */
public final class w extends AtomicReference implements uj2.d0, Runnable, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.d0 f79985a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f79986b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    public final v f79987c;

    /* renamed from: d, reason: collision with root package name */
    public f0 f79988d;

    /* renamed from: e, reason: collision with root package name */
    public final long f79989e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeUnit f79990f;

    public w(uj2.d0 d0Var, f0 f0Var, long j13, TimeUnit timeUnit) {
        this.f79985a = d0Var;
        this.f79988d = f0Var;
        this.f79989e = j13;
        this.f79990f = timeUnit;
        if (f0Var != null) {
            this.f79987c = new v(d0Var);
        } else {
            this.f79987c = null;
        }
    }

    @Override // uj2.d0
    public final void b(xj2.c cVar) {
        bk2.c.setOnce(this, cVar);
    }

    @Override // xj2.c
    public final void dispose() {
        bk2.c.dispose(this);
        bk2.c.dispose(this.f79986b);
        v vVar = this.f79987c;
        if (vVar != null) {
            bk2.c.dispose(vVar);
        }
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return bk2.c.isDisposed((xj2.c) get());
    }

    @Override // uj2.d0
    public final void onError(Throwable th3) {
        xj2.c cVar = (xj2.c) get();
        bk2.c cVar2 = bk2.c.DISPOSED;
        if (cVar == cVar2 || !compareAndSet(cVar, cVar2)) {
            l0.R0(th3);
        } else {
            bk2.c.dispose(this.f79986b);
            this.f79985a.onError(th3);
        }
    }

    @Override // uj2.d0
    public final void onSuccess(Object obj) {
        xj2.c cVar = (xj2.c) get();
        bk2.c cVar2 = bk2.c.DISPOSED;
        if (cVar == cVar2 || !compareAndSet(cVar, cVar2)) {
            return;
        }
        bk2.c.dispose(this.f79986b);
        this.f79985a.onSuccess(obj);
    }

    @Override // java.lang.Runnable
    public final void run() {
        xj2.c cVar = (xj2.c) get();
        bk2.c cVar2 = bk2.c.DISPOSED;
        if (cVar == cVar2 || !compareAndSet(cVar, cVar2)) {
            return;
        }
        if (cVar != null) {
            cVar.dispose();
        }
        f0 f0Var = this.f79988d;
        if (f0Var == null) {
            this.f79985a.onError(new TimeoutException(pk2.h.c(this.f79989e, this.f79990f)));
        } else {
            this.f79988d = null;
            ((uj2.b0) f0Var).p(this.f79987c);
        }
    }
}
