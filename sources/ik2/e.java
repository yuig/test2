package ik2;

import java.util.concurrent.atomic.AtomicReference;
import lb.l0;
import uj2.v;

/* loaded from: classes4.dex */
public final class e implements v, xj2.c {

    /* renamed from: g, reason: collision with root package name */
    public static final d f72427g = new d(null);

    /* renamed from: a, reason: collision with root package name */
    public final uj2.d f72428a;

    /* renamed from: b, reason: collision with root package name */
    public final ak2.f f72429b;

    /* renamed from: c, reason: collision with root package name */
    public final pk2.c f72430c = new pk2.c();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f72431d = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f72432e;

    /* renamed from: f, reason: collision with root package name */
    public xj2.c f72433f;

    public e(uj2.d dVar, ak2.f fVar) {
        this.f72428a = dVar;
        this.f72429b = fVar;
    }

    @Override // uj2.v
    public final void a() {
        this.f72432e = true;
        if (this.f72431d.get() == null) {
            pk2.c cVar = this.f72430c;
            cVar.getClass();
            Throwable b13 = pk2.h.b(cVar);
            if (b13 == null) {
                this.f72428a.a();
            } else {
                this.f72428a.onError(b13);
            }
        }
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        if (bk2.c.validate(this.f72433f, cVar)) {
            this.f72433f = cVar;
            this.f72428a.b(this);
        }
    }

    @Override // uj2.v
    public final void c(Object obj) {
        try {
            Object apply = this.f72429b.apply(obj);
            ck2.i.b(apply, "The mapper returned a null CompletableSource");
            uj2.f fVar = (uj2.f) apply;
            d dVar = new d(this);
            while (true) {
                AtomicReference atomicReference = this.f72431d;
                d dVar2 = (d) atomicReference.get();
                if (dVar2 == f72427g) {
                    return;
                }
                while (!atomicReference.compareAndSet(dVar2, dVar)) {
                    if (atomicReference.get() != dVar2) {
                        break;
                    }
                }
                if (dVar2 != null) {
                    bk2.c.dispose(dVar2);
                }
                ((uj2.b) fVar).j(dVar);
                return;
            }
        } catch (Throwable th3) {
            bp1.h.H(th3);
            this.f72433f.dispose();
            onError(th3);
        }
    }

    @Override // xj2.c
    public final void dispose() {
        this.f72433f.dispose();
        AtomicReference atomicReference = this.f72431d;
        d dVar = f72427g;
        d dVar2 = (d) atomicReference.getAndSet(dVar);
        if (dVar2 == null || dVar2 == dVar) {
            return;
        }
        bk2.c.dispose(dVar2);
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f72431d.get() == f72427g;
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        pk2.c cVar = this.f72430c;
        cVar.getClass();
        if (!pk2.h.a(cVar, th3)) {
            l0.R0(th3);
            return;
        }
        AtomicReference atomicReference = this.f72431d;
        d dVar = f72427g;
        d dVar2 = (d) atomicReference.getAndSet(dVar);
        if (dVar2 != null && dVar2 != dVar) {
            bk2.c.dispose(dVar2);
        }
        Throwable b13 = pk2.h.b(cVar);
        if (b13 != pk2.h.f100547a) {
            this.f72428a.onError(b13);
        }
    }
}
