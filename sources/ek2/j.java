package ek2;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;
import lb.l0;
import uj2.v;

/* loaded from: classes2.dex */
public final class j extends AtomicReference implements v, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final ak2.e f59432a;

    /* renamed from: b, reason: collision with root package name */
    public final ak2.e f59433b;

    /* renamed from: c, reason: collision with root package name */
    public final ak2.a f59434c;

    /* renamed from: d, reason: collision with root package name */
    public final ak2.e f59435d;

    public j(ak2.e eVar, ak2.e eVar2, ak2.a aVar, ak2.e eVar3) {
        this.f59432a = eVar;
        this.f59433b = eVar2;
        this.f59434c = aVar;
        this.f59435d = eVar3;
    }

    @Override // uj2.v
    public final void a() {
        if (isDisposed()) {
            return;
        }
        lazySet(bk2.c.DISPOSED);
        try {
            this.f59434c.run();
        } catch (Throwable th3) {
            bp1.h.H(th3);
            l0.R0(th3);
        }
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        if (bk2.c.setOnce(this, cVar)) {
            try {
                this.f59435d.accept(this);
            } catch (Throwable th3) {
                bp1.h.H(th3);
                cVar.dispose();
                onError(th3);
            }
        }
    }

    @Override // uj2.v
    public final void c(Object obj) {
        if (isDisposed()) {
            return;
        }
        try {
            this.f59432a.accept(obj);
        } catch (Throwable th3) {
            bp1.h.H(th3);
            ((xj2.c) get()).dispose();
            onError(th3);
        }
    }

    @Override // xj2.c
    public final void dispose() {
        bk2.c.dispose(this);
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return get() == bk2.c.DISPOSED;
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        if (isDisposed()) {
            l0.R0(th3);
            return;
        }
        lazySet(bk2.c.DISPOSED);
        try {
            this.f59433b.accept(th3);
        } catch (Throwable th4) {
            bp1.h.H(th4);
            l0.R0(new CompositeException(th3, th4));
        }
    }
}
