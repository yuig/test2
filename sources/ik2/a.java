package ik2;

import java.util.concurrent.atomic.AtomicReference;
import uj2.t;
import uj2.v;

/* loaded from: classes4.dex */
public final class a extends AtomicReference implements v, uj2.d, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final v f72419a;

    /* renamed from: b, reason: collision with root package name */
    public t f72420b;

    public a(v vVar, t tVar) {
        this.f72420b = tVar;
        this.f72419a = vVar;
    }

    @Override // uj2.v
    public final void a() {
        t tVar = this.f72420b;
        if (tVar == null) {
            this.f72419a.a();
        } else {
            this.f72420b = null;
            tVar.d(this);
        }
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        bk2.c.replace(this, cVar);
    }

    @Override // uj2.v
    public final void c(Object obj) {
        this.f72419a.c(obj);
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
        this.f72419a.onError(th3);
    }
}
