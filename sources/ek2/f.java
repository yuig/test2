package ek2;

import io.reactivex.exceptions.OnErrorNotImplementedException;
import java.util.concurrent.atomic.AtomicReference;
import lb.l0;

/* loaded from: classes2.dex */
public final class f extends AtomicReference implements uj2.d, xj2.c, ak2.e {

    /* renamed from: a, reason: collision with root package name */
    public final ak2.e f59423a;

    /* renamed from: b, reason: collision with root package name */
    public final ak2.a f59424b;

    public f(ak2.a aVar, ak2.e eVar) {
        this.f59423a = eVar;
        this.f59424b = aVar;
    }

    @Override // uj2.d
    public final void a() {
        try {
            this.f59424b.run();
        } catch (Throwable th3) {
            bp1.h.H(th3);
            l0.R0(th3);
        }
        lazySet(bk2.c.DISPOSED);
    }

    @Override // ak2.e
    public final void accept(Object obj) {
        l0.R0(new OnErrorNotImplementedException((Throwable) obj));
    }

    @Override // uj2.d
    public final void b(xj2.c cVar) {
        bk2.c.setOnce(this, cVar);
    }

    @Override // xj2.c
    public final void dispose() {
        bk2.c.dispose(this);
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return get() == bk2.c.DISPOSED;
    }

    @Override // uj2.d
    public final void onError(Throwable th3) {
        try {
            this.f59423a.accept(th3);
        } catch (Throwable th4) {
            bp1.h.H(th4);
            l0.R0(th4);
        }
        lazySet(bk2.c.DISPOSED);
    }
}
