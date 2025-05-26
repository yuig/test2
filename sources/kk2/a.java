package kk2;

import java.util.concurrent.atomic.AtomicReference;
import lb.l0;

/* loaded from: classes2.dex */
public final class a extends AtomicReference implements uj2.c0, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.d0 f79911a;

    public a(uj2.d0 d0Var) {
        this.f79911a = d0Var;
    }

    public final void a(Throwable th3) {
        if (c(th3)) {
            return;
        }
        l0.R0(th3);
    }

    public final void b(Object obj) {
        xj2.c cVar;
        Object obj2 = get();
        bk2.c cVar2 = bk2.c.DISPOSED;
        if (obj2 == cVar2 || (cVar = (xj2.c) getAndSet(cVar2)) == cVar2) {
            return;
        }
        uj2.d0 d0Var = this.f79911a;
        try {
            if (obj == null) {
                d0Var.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                d0Var.onSuccess(obj);
            }
            if (cVar != null) {
                cVar.dispose();
            }
        } catch (Throwable th3) {
            if (cVar != null) {
                cVar.dispose();
            }
            throw th3;
        }
    }

    public final boolean c(Throwable th3) {
        xj2.c cVar;
        if (th3 == null) {
            th3 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        Object obj = get();
        bk2.c cVar2 = bk2.c.DISPOSED;
        if (obj == cVar2 || (cVar = (xj2.c) getAndSet(cVar2)) == cVar2) {
            return false;
        }
        try {
            this.f79911a.onError(th3);
        } finally {
            if (cVar != null) {
                cVar.dispose();
            }
        }
    }

    @Override // xj2.c
    public final void dispose() {
        bk2.c.dispose(this);
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return bk2.c.isDisposed((xj2.c) get());
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return a.a.l(a.class.getSimpleName(), "{", super.toString(), "}");
    }
}
