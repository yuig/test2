package kk2;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;
import lb.l0;

/* loaded from: classes4.dex */
public final class b0 extends AtomicReference implements uj2.d0, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.d0 f79915a;

    /* renamed from: b, reason: collision with root package name */
    public final ak2.e f79916b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f79917c;

    /* renamed from: d, reason: collision with root package name */
    public xj2.c f79918d;

    public b0(uj2.d0 d0Var, Object obj, boolean z13, ak2.e eVar) {
        super(obj);
        this.f79915a = d0Var;
        this.f79917c = z13;
        this.f79916b = eVar;
    }

    public final void a() {
        Object andSet = getAndSet(this);
        if (andSet != this) {
            try {
                this.f79916b.accept(andSet);
            } catch (Throwable th3) {
                bp1.h.H(th3);
                l0.R0(th3);
            }
        }
    }

    @Override // uj2.d0
    public final void b(xj2.c cVar) {
        if (bk2.c.validate(this.f79918d, cVar)) {
            this.f79918d = cVar;
            this.f79915a.b(this);
        }
    }

    @Override // xj2.c
    public final void dispose() {
        this.f79918d.dispose();
        this.f79918d = bk2.c.DISPOSED;
        a();
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f79918d.isDisposed();
    }

    @Override // uj2.d0
    public final void onError(Throwable th3) {
        this.f79918d = bk2.c.DISPOSED;
        boolean z13 = this.f79917c;
        if (z13) {
            Object andSet = getAndSet(this);
            if (andSet == this) {
                return;
            }
            try {
                this.f79916b.accept(andSet);
            } catch (Throwable th4) {
                bp1.h.H(th4);
                th3 = new CompositeException(th3, th4);
            }
        }
        this.f79915a.onError(th3);
        if (z13) {
            return;
        }
        a();
    }

    @Override // uj2.d0
    public final void onSuccess(Object obj) {
        this.f79918d = bk2.c.DISPOSED;
        uj2.d0 d0Var = this.f79915a;
        boolean z13 = this.f79917c;
        if (z13) {
            Object andSet = getAndSet(this);
            if (andSet == this) {
                return;
            }
            try {
                this.f79916b.accept(andSet);
            } catch (Throwable th3) {
                bp1.h.H(th3);
                d0Var.onError(th3);
                return;
            }
        }
        d0Var.onSuccess(obj);
        if (z13) {
            return;
        }
        a();
    }
}
