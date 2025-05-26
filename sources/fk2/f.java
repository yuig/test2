package fk2;

import java.util.concurrent.atomic.AtomicReference;
import lb.l0;

/* loaded from: classes2.dex */
public final class f extends AtomicReference implements uj2.c, xj2.c, uj2.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f62432a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f62433b;

    public /* synthetic */ f(Object obj, int i13) {
        this.f62432a = i13;
        this.f62433b = obj;
    }

    public final boolean a(Throwable th3) {
        xj2.c cVar;
        int i13 = this.f62432a;
        Object obj = this.f62433b;
        switch (i13) {
            case 0:
                if (th3 == null) {
                    th3 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
                }
                Object obj2 = get();
                bk2.c cVar2 = bk2.c.DISPOSED;
                if (obj2 == cVar2 || (cVar = (xj2.c) getAndSet(cVar2)) == cVar2) {
                    return false;
                }
                try {
                    ((uj2.d) obj).onError(th3);
                    return true;
                } finally {
                    if (cVar != null) {
                        cVar.dispose();
                    }
                }
            default:
                if (th3 == null) {
                    th3 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
                }
                if (isDisposed()) {
                    return false;
                }
                try {
                    ((uj2.v) obj).onError(th3);
                    return true;
                } finally {
                    dispose();
                }
        }
    }

    public final void b() {
        xj2.c cVar;
        int i13 = this.f62432a;
        Object obj = this.f62433b;
        switch (i13) {
            case 0:
                Object obj2 = get();
                bk2.c cVar2 = bk2.c.DISPOSED;
                if (obj2 == cVar2 || (cVar = (xj2.c) getAndSet(cVar2)) == cVar2) {
                    return;
                }
                try {
                    ((uj2.d) obj).a();
                    if (cVar != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (cVar != null) {
                        cVar.dispose();
                    }
                }
            default:
                if (isDisposed()) {
                    return;
                }
                try {
                    ((uj2.v) obj).a();
                    return;
                } finally {
                    dispose();
                }
        }
    }

    @Override // uj2.g
    public final void c(Object obj) {
        if (obj == null) {
            d(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
        } else {
            if (isDisposed()) {
                return;
            }
            ((uj2.v) this.f62433b).c(obj);
        }
    }

    public final void d(Throwable th3) {
        switch (this.f62432a) {
            case 0:
                if (!a(th3)) {
                    l0.R0(th3);
                    break;
                }
                break;
            default:
                if (!a(th3)) {
                    l0.R0(th3);
                    break;
                }
                break;
        }
    }

    @Override // xj2.c
    public final void dispose() {
        switch (this.f62432a) {
            case 0:
                bk2.c.dispose(this);
                break;
            default:
                bk2.c.dispose(this);
                break;
        }
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        switch (this.f62432a) {
        }
        return bk2.c.isDisposed((xj2.c) get());
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        switch (this.f62432a) {
        }
        return a.a.l(f.class.getSimpleName(), "{", super.toString(), "}");
    }
}
