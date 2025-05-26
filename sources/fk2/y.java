package fk2;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class y extends AtomicReference implements uj2.d, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.d f62490a;

    /* renamed from: b, reason: collision with root package name */
    public final ak2.f f62491b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f62492c;

    public y(uj2.d dVar, ak2.f fVar) {
        this.f62490a = dVar;
        this.f62491b = fVar;
    }

    @Override // uj2.d
    public final void a() {
        this.f62490a.a();
    }

    @Override // uj2.d
    public final void b(xj2.c cVar) {
        bk2.c.replace(this, cVar);
    }

    @Override // xj2.c
    public final void dispose() {
        bk2.c.dispose(this);
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return bk2.c.isDisposed((xj2.c) get());
    }

    @Override // uj2.d
    public final void onError(Throwable th3) {
        boolean z13 = this.f62492c;
        uj2.d dVar = this.f62490a;
        if (z13) {
            dVar.onError(th3);
            return;
        }
        this.f62492c = true;
        try {
            Object apply = this.f62491b.apply(th3);
            ck2.i.b(apply, "The errorMapper returned a null CompletableSource");
            ((uj2.b) ((uj2.f) apply)).j(this);
        } catch (Throwable th4) {
            bp1.h.H(th4);
            dVar.onError(new CompositeException(th3, th4));
        }
    }
}
