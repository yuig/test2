package jk2;

import io.reactivex.exceptions.CompositeException;

/* loaded from: classes2.dex */
public final class z implements uj2.v, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.v f76772a;

    /* renamed from: b, reason: collision with root package name */
    public final ak2.e f76773b;

    /* renamed from: c, reason: collision with root package name */
    public final ak2.e f76774c;

    /* renamed from: d, reason: collision with root package name */
    public final ak2.a f76775d;

    /* renamed from: e, reason: collision with root package name */
    public final ak2.a f76776e;

    /* renamed from: f, reason: collision with root package name */
    public xj2.c f76777f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f76778g;

    public z(uj2.v vVar, ak2.e eVar, ak2.e eVar2, ak2.a aVar, ak2.a aVar2) {
        this.f76772a = vVar;
        this.f76773b = eVar;
        this.f76774c = eVar2;
        this.f76775d = aVar;
        this.f76776e = aVar2;
    }

    @Override // uj2.v
    public final void a() {
        if (this.f76778g) {
            return;
        }
        try {
            this.f76775d.run();
            this.f76778g = true;
            this.f76772a.a();
            try {
                this.f76776e.run();
            } catch (Throwable th3) {
                bp1.h.H(th3);
                lb.l0.R0(th3);
            }
        } catch (Throwable th4) {
            bp1.h.H(th4);
            onError(th4);
        }
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        if (bk2.c.validate(this.f76777f, cVar)) {
            this.f76777f = cVar;
            this.f76772a.b(this);
        }
    }

    @Override // uj2.v
    public final void c(Object obj) {
        if (this.f76778g) {
            return;
        }
        try {
            this.f76773b.accept(obj);
            this.f76772a.c(obj);
        } catch (Throwable th3) {
            bp1.h.H(th3);
            this.f76777f.dispose();
            onError(th3);
        }
    }

    @Override // xj2.c
    public final void dispose() {
        this.f76777f.dispose();
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f76777f.isDisposed();
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        if (this.f76778g) {
            lb.l0.R0(th3);
            return;
        }
        this.f76778g = true;
        try {
            this.f76774c.accept(th3);
        } catch (Throwable th4) {
            bp1.h.H(th4);
            th3 = new CompositeException(th3, th4);
        }
        this.f76772a.onError(th3);
        try {
            this.f76776e.run();
        } catch (Throwable th5) {
            bp1.h.H(th5);
            lb.l0.R0(th5);
        }
    }
}
