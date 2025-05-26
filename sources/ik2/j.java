package ik2;

import java.util.concurrent.atomic.AtomicReference;
import uj2.d0;
import uj2.t;
import uj2.v;

/* loaded from: classes2.dex */
public final class j extends AtomicReference implements v, d0, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final v f72449a;

    /* renamed from: b, reason: collision with root package name */
    public final ak2.f f72450b;

    public j(v vVar, ak2.f fVar) {
        this.f72449a = vVar;
        this.f72450b = fVar;
    }

    @Override // uj2.v
    public final void a() {
        this.f72449a.a();
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        bk2.c.replace(this, cVar);
    }

    @Override // uj2.v
    public final void c(Object obj) {
        this.f72449a.c(obj);
    }

    @Override // xj2.c
    public final void dispose() {
        bk2.c.dispose(this);
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return bk2.c.isDisposed((xj2.c) get());
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        this.f72449a.onError(th3);
    }

    @Override // uj2.d0
    public final void onSuccess(Object obj) {
        try {
            Object apply = this.f72450b.apply(obj);
            ck2.i.b(apply, "The mapper returned a null Publisher");
            ((t) apply).d(this);
        } catch (Throwable th3) {
            bp1.h.H(th3);
            this.f72449a.onError(th3);
        }
    }
}
