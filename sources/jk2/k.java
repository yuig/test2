package jk2;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class k extends AtomicReference implements uj2.v {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.v f76543a;

    /* renamed from: b, reason: collision with root package name */
    public final l f76544b;

    public k(rk2.d dVar, l lVar) {
        this.f76543a = dVar;
        this.f76544b = lVar;
    }

    @Override // uj2.v
    public final void a() {
        l lVar = this.f76544b;
        lVar.f76567g = false;
        lVar.d();
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        bk2.c.replace(this, cVar);
    }

    @Override // uj2.v
    public final void c(Object obj) {
        this.f76543a.c(obj);
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        this.f76544b.dispose();
        this.f76543a.onError(th3);
    }
}
