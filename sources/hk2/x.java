package hk2;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class x extends AtomicReference implements uj2.m, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.m f69446a;

    /* renamed from: b, reason: collision with root package name */
    public final ak2.f f69447b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f69448c;

    public x(uj2.m mVar, ak2.f fVar, boolean z13) {
        this.f69446a = mVar;
        this.f69447b = fVar;
        this.f69448c = z13;
    }

    @Override // uj2.m
    public final void a() {
        this.f69446a.a();
    }

    @Override // uj2.m
    public final void b(xj2.c cVar) {
        if (bk2.c.setOnce(this, cVar)) {
            this.f69446a.b(this);
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

    @Override // uj2.m
    public final void onError(Throwable th3) {
        boolean z13 = this.f69448c;
        uj2.m mVar = this.f69446a;
        if (!z13 && !(th3 instanceof Exception)) {
            mVar.onError(th3);
            return;
        }
        try {
            Object apply = this.f69447b.apply(th3);
            ck2.i.b(apply, "The resumeFunction returned a null MaybeSource");
            uj2.n nVar = (uj2.n) apply;
            bk2.c.replace(this, null);
            ((uj2.l) nVar).f(new d(mVar, this, 1));
        } catch (Throwable th4) {
            bp1.h.H(th4);
            mVar.onError(new CompositeException(th3, th4));
        }
    }

    @Override // uj2.m
    public final void onSuccess(Object obj) {
        this.f69446a.onSuccess(obj);
    }
}
