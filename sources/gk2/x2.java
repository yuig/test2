package gk2;

/* loaded from: classes4.dex */
public final class x2 implements uj2.k, xp2.c {

    /* renamed from: a, reason: collision with root package name */
    public final xp2.b f65696a;

    /* renamed from: b, reason: collision with root package name */
    public final ak2.g f65697b;

    /* renamed from: c, reason: collision with root package name */
    public xp2.c f65698c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f65699d;

    public x2(xp2.b bVar, ak2.g gVar) {
        this.f65696a = bVar;
        this.f65697b = gVar;
    }

    @Override // xp2.b
    public final void a() {
        if (this.f65699d) {
            return;
        }
        this.f65699d = true;
        this.f65696a.a();
    }

    @Override // xp2.b
    public final void c(Object obj) {
        if (this.f65699d) {
            return;
        }
        xp2.b bVar = this.f65696a;
        bVar.c(obj);
        try {
            if (this.f65697b.test(obj)) {
                this.f65699d = true;
                this.f65698c.cancel();
                bVar.a();
            }
        } catch (Throwable th3) {
            bp1.h.H(th3);
            this.f65698c.cancel();
            onError(th3);
        }
    }

    @Override // xp2.c
    public final void cancel() {
        this.f65698c.cancel();
    }

    @Override // xp2.b
    public final void d(xp2.c cVar) {
        if (ok2.g.validate(this.f65698c, cVar)) {
            this.f65698c = cVar;
            this.f65696a.d(this);
        }
    }

    @Override // xp2.b
    public final void onError(Throwable th3) {
        if (this.f65699d) {
            lb.l0.R0(th3);
        } else {
            this.f65699d = true;
            this.f65696a.onError(th3);
        }
    }

    @Override // xp2.c
    public final void request(long j13) {
        this.f65698c.request(j13);
    }
}
