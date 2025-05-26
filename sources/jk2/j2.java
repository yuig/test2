package jk2;

/* loaded from: classes2.dex */
public final class j2 implements uj2.v, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.v f76539a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f76540b;

    /* renamed from: c, reason: collision with root package name */
    public xj2.c f76541c;

    /* renamed from: d, reason: collision with root package name */
    public long f76542d;

    public j2(uj2.v vVar, long j13) {
        this.f76539a = vVar;
        this.f76542d = j13;
    }

    @Override // uj2.v
    public final void a() {
        if (this.f76540b) {
            return;
        }
        this.f76540b = true;
        this.f76541c.dispose();
        this.f76539a.a();
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        if (bk2.c.validate(this.f76541c, cVar)) {
            this.f76541c = cVar;
            long j13 = this.f76542d;
            uj2.v vVar = this.f76539a;
            if (j13 != 0) {
                vVar.b(this);
                return;
            }
            this.f76540b = true;
            cVar.dispose();
            bk2.d.complete(vVar);
        }
    }

    @Override // uj2.v
    public final void c(Object obj) {
        if (this.f76540b) {
            return;
        }
        long j13 = this.f76542d;
        long j14 = j13 - 1;
        this.f76542d = j14;
        if (j13 > 0) {
            boolean z13 = j14 == 0;
            this.f76539a.c(obj);
            if (z13) {
                a();
            }
        }
    }

    @Override // xj2.c
    public final void dispose() {
        this.f76541c.dispose();
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f76541c.isDisposed();
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        if (this.f76540b) {
            lb.l0.R0(th3);
            return;
        }
        this.f76540b = true;
        this.f76541c.dispose();
        this.f76539a.onError(th3);
    }
}
