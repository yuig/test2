package fk2;

import java.util.concurrent.atomic.AtomicInteger;
import lb.l0;

/* loaded from: classes4.dex */
public final class s implements uj2.d {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.d f62469a;

    /* renamed from: b, reason: collision with root package name */
    public final xj2.b f62470b;

    /* renamed from: c, reason: collision with root package name */
    public final pk2.c f62471c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicInteger f62472d;

    public s(uj2.d dVar, xj2.b bVar, pk2.c cVar, AtomicInteger atomicInteger) {
        this.f62469a = dVar;
        this.f62470b = bVar;
        this.f62471c = cVar;
        this.f62472d = atomicInteger;
    }

    @Override // uj2.d
    public final void a() {
        c();
    }

    @Override // uj2.d
    public final void b(xj2.c cVar) {
        this.f62470b.a(cVar);
    }

    public final void c() {
        if (this.f62472d.decrementAndGet() == 0) {
            pk2.c cVar = this.f62471c;
            cVar.getClass();
            Throwable b13 = pk2.h.b(cVar);
            uj2.d dVar = this.f62469a;
            if (b13 == null) {
                dVar.a();
            } else {
                dVar.onError(b13);
            }
        }
    }

    @Override // uj2.d
    public final void onError(Throwable th3) {
        pk2.c cVar = this.f62471c;
        cVar.getClass();
        if (pk2.h.a(cVar, th3)) {
            c();
        } else {
            l0.R0(th3);
        }
    }
}
