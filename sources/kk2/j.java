package kk2;

import lb.l0;

/* loaded from: classes2.dex */
public final class j implements uj2.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.d0 f79952a;

    /* renamed from: b, reason: collision with root package name */
    public final ak2.e f79953b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f79954c;

    public j(uj2.d0 d0Var, ak2.e eVar) {
        this.f79952a = d0Var;
        this.f79953b = eVar;
    }

    @Override // uj2.d0
    public final void b(xj2.c cVar) {
        uj2.d0 d0Var = this.f79952a;
        try {
            this.f79953b.accept(cVar);
            d0Var.b(cVar);
        } catch (Throwable th3) {
            bp1.h.H(th3);
            this.f79954c = true;
            cVar.dispose();
            bk2.d.error(th3, d0Var);
        }
    }

    @Override // uj2.d0
    public final void onError(Throwable th3) {
        if (this.f79954c) {
            l0.R0(th3);
        } else {
            this.f79952a.onError(th3);
        }
    }

    @Override // uj2.d0
    public final void onSuccess(Object obj) {
        if (this.f79954c) {
            return;
        }
        this.f79952a.onSuccess(obj);
    }
}
