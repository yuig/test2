package jk2;

/* loaded from: classes4.dex */
public final class f2 implements uj2.v, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76459a;

    /* renamed from: b, reason: collision with root package name */
    public final uj2.v f76460b;

    /* renamed from: c, reason: collision with root package name */
    public final ak2.g f76461c;

    /* renamed from: d, reason: collision with root package name */
    public xj2.c f76462d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f76463e;

    public /* synthetic */ f2(uj2.v vVar, ak2.g gVar, int i13) {
        this.f76459a = i13;
        this.f76460b = vVar;
        this.f76461c = gVar;
    }

    @Override // uj2.v
    public final void a() {
        int i13 = this.f76459a;
        uj2.v vVar = this.f76460b;
        switch (i13) {
            case 0:
                vVar.a();
                break;
            default:
                if (!this.f76463e) {
                    this.f76463e = true;
                    vVar.a();
                    break;
                }
                break;
        }
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        int i13 = this.f76459a;
        uj2.v vVar = this.f76460b;
        switch (i13) {
            case 0:
                if (bk2.c.validate(this.f76462d, cVar)) {
                    this.f76462d = cVar;
                    vVar.b(this);
                    break;
                }
                break;
            default:
                if (bk2.c.validate(this.f76462d, cVar)) {
                    this.f76462d = cVar;
                    vVar.b(this);
                    break;
                }
                break;
        }
    }

    @Override // uj2.v
    public final void c(Object obj) {
        int i13 = this.f76459a;
        ak2.g gVar = this.f76461c;
        uj2.v vVar = this.f76460b;
        switch (i13) {
            case 0:
                if (this.f76463e) {
                    vVar.c(obj);
                    break;
                } else {
                    try {
                        if (!gVar.test(obj)) {
                            this.f76463e = true;
                            vVar.c(obj);
                            break;
                        }
                    } catch (Throwable th3) {
                        bp1.h.H(th3);
                        this.f76462d.dispose();
                        vVar.onError(th3);
                        return;
                    }
                }
                break;
            default:
                if (!this.f76463e) {
                    vVar.c(obj);
                    try {
                        if (gVar.test(obj)) {
                            this.f76463e = true;
                            this.f76462d.dispose();
                            vVar.a();
                            break;
                        }
                    } catch (Throwable th4) {
                        bp1.h.H(th4);
                        this.f76462d.dispose();
                        onError(th4);
                    }
                }
                break;
        }
    }

    @Override // xj2.c
    public final void dispose() {
        switch (this.f76459a) {
            case 0:
                this.f76462d.dispose();
                break;
            default:
                this.f76462d.dispose();
                break;
        }
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        switch (this.f76459a) {
        }
        return this.f76462d.isDisposed();
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        int i13 = this.f76459a;
        uj2.v vVar = this.f76460b;
        switch (i13) {
            case 0:
                vVar.onError(th3);
                break;
            default:
                if (!this.f76463e) {
                    this.f76463e = true;
                    vVar.onError(th3);
                    break;
                } else {
                    lb.l0.R0(th3);
                    break;
                }
        }
    }
}
