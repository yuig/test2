package ik2;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import lb.l0;
import uj2.b0;
import uj2.f0;
import uj2.v;

/* loaded from: classes4.dex */
public final class h extends AtomicInteger implements v, xj2.c {

    /* renamed from: i, reason: collision with root package name */
    public static final g f72438i = new g(null);

    /* renamed from: a, reason: collision with root package name */
    public final v f72439a;

    /* renamed from: b, reason: collision with root package name */
    public final ak2.f f72440b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f72441c = false;

    /* renamed from: d, reason: collision with root package name */
    public final pk2.c f72442d = new pk2.c();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f72443e = new AtomicReference();

    /* renamed from: f, reason: collision with root package name */
    public xj2.c f72444f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f72445g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f72446h;

    public h(v vVar, ak2.f fVar) {
        this.f72439a = vVar;
        this.f72440b = fVar;
    }

    @Override // uj2.v
    public final void a() {
        this.f72445g = true;
        e();
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        if (bk2.c.validate(this.f72444f, cVar)) {
            this.f72444f = cVar;
            this.f72439a.b(this);
        }
    }

    @Override // uj2.v
    public final void c(Object obj) {
        g gVar = f72438i;
        AtomicReference atomicReference = this.f72443e;
        g gVar2 = (g) atomicReference.get();
        if (gVar2 != null) {
            bk2.c.dispose(gVar2);
        }
        try {
            Object apply = this.f72440b.apply(obj);
            ck2.i.b(apply, "The mapper returned a null SingleSource");
            f0 f0Var = (f0) apply;
            g gVar3 = new g(this);
            while (true) {
                g gVar4 = (g) atomicReference.get();
                if (gVar4 == gVar) {
                    return;
                }
                while (!atomicReference.compareAndSet(gVar4, gVar3)) {
                    if (atomicReference.get() != gVar4) {
                        break;
                    }
                }
                ((b0) f0Var).p(gVar3);
                return;
            }
        } catch (Throwable th3) {
            bp1.h.H(th3);
            this.f72444f.dispose();
            atomicReference.getAndSet(gVar);
            onError(th3);
        }
    }

    public final void d() {
        AtomicReference atomicReference = this.f72443e;
        g gVar = f72438i;
        g gVar2 = (g) atomicReference.getAndSet(gVar);
        if (gVar2 == null || gVar2 == gVar) {
            return;
        }
        bk2.c.dispose(gVar2);
    }

    @Override // xj2.c
    public final void dispose() {
        this.f72446h = true;
        this.f72444f.dispose();
        d();
    }

    public final void e() {
        if (getAndIncrement() != 0) {
            return;
        }
        v vVar = this.f72439a;
        pk2.c cVar = this.f72442d;
        AtomicReference atomicReference = this.f72443e;
        int i13 = 1;
        while (!this.f72446h) {
            if (cVar.get() != null && !this.f72441c) {
                vVar.onError(pk2.h.b(cVar));
                return;
            }
            boolean z13 = this.f72445g;
            g gVar = (g) atomicReference.get();
            boolean z14 = gVar == null;
            if (z13 && z14) {
                Throwable b13 = pk2.h.b(cVar);
                if (b13 != null) {
                    vVar.onError(b13);
                    return;
                } else {
                    vVar.a();
                    return;
                }
            }
            if (z14 || gVar.f72437b == null) {
                i13 = addAndGet(-i13);
                if (i13 == 0) {
                    return;
                }
            } else {
                while (!atomicReference.compareAndSet(gVar, null) && atomicReference.get() == gVar) {
                }
                vVar.c(gVar.f72437b);
            }
        }
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f72446h;
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        pk2.c cVar = this.f72442d;
        cVar.getClass();
        if (!pk2.h.a(cVar, th3)) {
            l0.R0(th3);
            return;
        }
        if (!this.f72441c) {
            d();
        }
        this.f72445g = true;
        e();
    }
}
