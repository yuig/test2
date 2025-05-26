package kk2;

import lb.l0;

/* loaded from: classes2.dex */
public final class f implements uj2.d0, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f79939a;

    /* renamed from: b, reason: collision with root package name */
    public final uj2.d0 f79940b;

    /* renamed from: c, reason: collision with root package name */
    public xj2.c f79941c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f79942d;

    public /* synthetic */ f(uj2.d0 d0Var, Object obj, int i13) {
        this.f79939a = i13;
        this.f79940b = d0Var;
        this.f79942d = obj;
    }

    @Override // uj2.d0
    public final void b(xj2.c cVar) {
        int i13 = this.f79939a;
        uj2.d0 d0Var = this.f79940b;
        switch (i13) {
            case 0:
                if (bk2.c.validate(this.f79941c, cVar)) {
                    this.f79941c = cVar;
                    d0Var.b(this);
                    break;
                }
                break;
            default:
                if (bk2.c.validate(this.f79941c, cVar)) {
                    this.f79941c = cVar;
                    d0Var.b(this);
                    break;
                }
                break;
        }
    }

    @Override // xj2.c
    public final void dispose() {
        switch (this.f79939a) {
            case 0:
                this.f79941c.dispose();
                break;
            default:
                this.f79941c.dispose();
                break;
        }
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        switch (this.f79939a) {
        }
        return this.f79941c.isDisposed();
    }

    @Override // uj2.d0
    public final void onError(Throwable th3) {
        int i13 = this.f79939a;
        uj2.d0 d0Var = this.f79940b;
        switch (i13) {
            case 0:
                d0Var.onError(th3);
                break;
            default:
                d0Var.onError(th3);
                try {
                    ((ak2.a) this.f79942d).run();
                    break;
                } catch (Throwable th4) {
                    bp1.h.H(th4);
                    l0.R0(th4);
                }
        }
    }

    @Override // uj2.d0
    public final void onSuccess(Object obj) {
        Object obj2 = this.f79942d;
        int i13 = this.f79939a;
        uj2.d0 d0Var = this.f79940b;
        switch (i13) {
            case 0:
                d0Var.onSuccess(obj);
                try {
                    ((ak2.e) obj2).accept(obj);
                    break;
                } catch (Throwable th3) {
                    bp1.h.H(th3);
                    l0.R0(th3);
                    return;
                }
            default:
                d0Var.onSuccess(obj);
                try {
                    ((ak2.a) obj2).run();
                    break;
                } catch (Throwable th4) {
                    bp1.h.H(th4);
                    l0.R0(th4);
                }
        }
    }
}
