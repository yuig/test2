package jk2;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class z2 extends AtomicReference implements uj2.v, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.v f76784a;

    /* renamed from: b, reason: collision with root package name */
    public final ak2.c f76785b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f76786c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f76787d = new AtomicReference();

    public z2(rk2.d dVar, ak2.c cVar) {
        this.f76784a = dVar;
        this.f76785b = cVar;
    }

    @Override // uj2.v
    public final void a() {
        bk2.c.dispose(this.f76787d);
        this.f76784a.a();
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        bk2.c.setOnce(this.f76786c, cVar);
    }

    @Override // uj2.v
    public final void c(Object obj) {
        uj2.v vVar = this.f76784a;
        Object obj2 = get();
        if (obj2 != null) {
            try {
                Object apply = this.f76785b.apply(obj, obj2);
                ck2.i.b(apply, "The combiner returned a null value");
                vVar.c(apply);
            } catch (Throwable th3) {
                bp1.h.H(th3);
                dispose();
                vVar.onError(th3);
            }
        }
    }

    @Override // xj2.c
    public final void dispose() {
        bk2.c.dispose(this.f76786c);
        bk2.c.dispose(this.f76787d);
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return bk2.c.isDisposed((xj2.c) this.f76786c.get());
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        bk2.c.dispose(this.f76787d);
        this.f76784a.onError(th3);
    }
}
