package jk2;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class i extends AtomicReference implements uj2.v {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.v f76497a;

    /* renamed from: b, reason: collision with root package name */
    public final j f76498b;

    public i(uj2.v vVar, j jVar) {
        this.f76497a = vVar;
        this.f76498b = jVar;
    }

    @Override // uj2.v
    public final void a() {
        j jVar = this.f76498b;
        jVar.f76515i = false;
        jVar.d();
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        bk2.c.replace(this, cVar);
    }

    @Override // uj2.v
    public final void c(Object obj) {
        this.f76497a.c(obj);
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        j jVar = this.f76498b;
        pk2.c cVar = jVar.f76510d;
        cVar.getClass();
        if (!pk2.h.a(cVar, th3)) {
            lb.l0.R0(th3);
            return;
        }
        if (!jVar.f76512f) {
            jVar.f76514h.dispose();
        }
        jVar.f76515i = false;
        jVar.d();
    }
}
