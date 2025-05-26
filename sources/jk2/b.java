package jk2;

/* loaded from: classes4.dex */
public final class b implements uj2.v, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.v f76395a;

    /* renamed from: b, reason: collision with root package name */
    public final ak2.b f76396b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f76397c;

    /* renamed from: d, reason: collision with root package name */
    public xj2.c f76398d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f76399e;

    public b(uj2.v vVar, Object obj, ak2.b bVar) {
        this.f76395a = vVar;
        this.f76396b = bVar;
        this.f76397c = obj;
    }

    @Override // uj2.v
    public final void a() {
        if (this.f76399e) {
            return;
        }
        this.f76399e = true;
        Object obj = this.f76397c;
        uj2.v vVar = this.f76395a;
        vVar.c(obj);
        vVar.a();
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        if (bk2.c.validate(this.f76398d, cVar)) {
            this.f76398d = cVar;
            this.f76395a.b(this);
        }
    }

    @Override // uj2.v
    public final void c(Object obj) {
        if (this.f76399e) {
            return;
        }
        try {
            this.f76396b.accept(this.f76397c, obj);
        } catch (Throwable th3) {
            this.f76398d.dispose();
            onError(th3);
        }
    }

    @Override // xj2.c
    public final void dispose() {
        this.f76398d.dispose();
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f76398d.isDisposed();
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        if (this.f76399e) {
            lb.l0.R0(th3);
        } else {
            this.f76399e = true;
            this.f76395a.onError(th3);
        }
    }
}
