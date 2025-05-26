package nk2;

import bp1.h;
import gk2.x0;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;
import lb.l0;
import ok2.g;
import uj2.k;

/* loaded from: classes2.dex */
public final class d extends AtomicReference implements k, xp2.c, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final ak2.e f91194a;

    /* renamed from: b, reason: collision with root package name */
    public final ak2.e f91195b;

    /* renamed from: c, reason: collision with root package name */
    public final ak2.a f91196c;

    /* renamed from: d, reason: collision with root package name */
    public final ak2.e f91197d;

    public d(ak2.e eVar, ak2.e eVar2, ak2.a aVar, x0 x0Var) {
        this.f91194a = eVar;
        this.f91195b = eVar2;
        this.f91196c = aVar;
        this.f91197d = x0Var;
    }

    @Override // xp2.b
    public final void a() {
        Object obj = get();
        g gVar = g.CANCELLED;
        if (obj != gVar) {
            lazySet(gVar);
            try {
                this.f91196c.run();
            } catch (Throwable th3) {
                h.H(th3);
                l0.R0(th3);
            }
        }
    }

    @Override // xp2.b
    public final void c(Object obj) {
        if (isDisposed()) {
            return;
        }
        try {
            this.f91194a.accept(obj);
        } catch (Throwable th3) {
            h.H(th3);
            ((xp2.c) get()).cancel();
            onError(th3);
        }
    }

    @Override // xp2.c
    public final void cancel() {
        g.cancel(this);
    }

    @Override // xp2.b
    public final void d(xp2.c cVar) {
        if (g.setOnce(this, cVar)) {
            try {
                this.f91197d.accept(this);
            } catch (Throwable th3) {
                h.H(th3);
                cVar.cancel();
                onError(th3);
            }
        }
    }

    @Override // xj2.c
    public final void dispose() {
        g.cancel(this);
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return get() == g.CANCELLED;
    }

    @Override // xp2.b
    public final void onError(Throwable th3) {
        Object obj = get();
        g gVar = g.CANCELLED;
        if (obj == gVar) {
            l0.R0(th3);
            return;
        }
        lazySet(gVar);
        try {
            this.f91195b.accept(th3);
        } catch (Throwable th4) {
            h.H(th4);
            l0.R0(new CompositeException(th3, th4));
        }
    }

    @Override // xp2.c
    public final void request(long j13) {
        ((xp2.c) get()).request(j13);
    }
}
