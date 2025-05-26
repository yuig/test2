package kk2;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class o extends ek2.b implements uj2.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.v f79965a;

    /* renamed from: b, reason: collision with root package name */
    public final ak2.f f79966b;

    /* renamed from: c, reason: collision with root package name */
    public xj2.c f79967c;

    /* renamed from: d, reason: collision with root package name */
    public volatile Iterator f79968d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f79969e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f79970f;

    public o(uj2.v vVar, ak2.f fVar) {
        this.f79965a = vVar;
        this.f79966b = fVar;
    }

    @Override // uj2.d0
    public final void b(xj2.c cVar) {
        if (bk2.c.validate(this.f79967c, cVar)) {
            this.f79967c = cVar;
            this.f79965a.b(this);
        }
    }

    @Override // dk2.i
    public final void clear() {
        this.f79968d = null;
    }

    @Override // xj2.c
    public final void dispose() {
        this.f79969e = true;
        this.f79967c.dispose();
        this.f79967c = bk2.c.DISPOSED;
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f79969e;
    }

    @Override // dk2.i
    public final boolean isEmpty() {
        return this.f79968d == null;
    }

    @Override // uj2.d0
    public final void onError(Throwable th3) {
        this.f79967c = bk2.c.DISPOSED;
        this.f79965a.onError(th3);
    }

    @Override // uj2.d0
    public final void onSuccess(Object obj) {
        uj2.v vVar = this.f79965a;
        try {
            Iterator it = ((Iterable) this.f79966b.apply(obj)).iterator();
            if (!it.hasNext()) {
                vVar.a();
                return;
            }
            if (this.f79970f) {
                this.f79968d = it;
                vVar.c(null);
                vVar.a();
                return;
            }
            while (!this.f79969e) {
                try {
                    vVar.c(it.next());
                    if (this.f79969e) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            vVar.a();
                            return;
                        }
                    } catch (Throwable th3) {
                        bp1.h.H(th3);
                        vVar.onError(th3);
                        return;
                    }
                } catch (Throwable th4) {
                    bp1.h.H(th4);
                    vVar.onError(th4);
                    return;
                }
            }
        } catch (Throwable th5) {
            bp1.h.H(th5);
            this.f79965a.onError(th5);
        }
    }

    @Override // dk2.i
    public final Object poll() {
        Iterator it = this.f79968d;
        if (it == null) {
            return null;
        }
        Object next = it.next();
        ck2.i.b(next, "The iterator returned a null value");
        if (!it.hasNext()) {
            this.f79968d = null;
        }
        return next;
    }

    @Override // dk2.e
    public final int requestFusion(int i13) {
        this.f79970f = true;
        return 2;
    }
}
